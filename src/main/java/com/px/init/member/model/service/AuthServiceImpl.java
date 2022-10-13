package com.px.init.member.model.service;

import com.px.init.company.model.dao.CompanyMapper;
import com.px.init.company.model.dto.CompanyDTO;
import com.px.init.email.controller.EmailController;
import com.px.init.email.model.dto.EmailDTO;
import com.px.init.exception.DuplicateMemberEmailException;
import com.px.init.exception.EmailException;
import com.px.init.exception.SignupException;
import com.px.init.exception.updateException;
import com.px.init.jwt.JwtTokenProvider;
import com.px.init.member.model.dao.MemberMapper;
import com.px.init.member.model.dto.*;
import com.px.init.util.SecureUtils;
import org.apache.ibatis.javassist.bytecode.DuplicateMemberException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;


/**
 * <pre>
 * Class : AuthServiceImpl
 * Comment : 인증 서비스 인터페이스의 구현체, mybatis 사용
 * History
 * 2022/10/05 (손창우) 처음 작성
 * 2022/10/08 (손창우) 인증번호 요청, 검사 서비스 구현체 추가
 * </pre>
 *
 * @author 손창우
 * @version 1.1
 * @see AuthService
 */
@Service
public class AuthServiceImpl implements AuthService {

    private static final Logger log = LoggerFactory.getLogger(AuthServiceImpl.class);
    private final MemberMapper mapper;
    private final CompanyMapper companyMapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider tokenProvider;
    private final EmailController emailController;

    private final SecureUtils secureUtils;

    /**
     * DI 주입을 위한 생성자
     *
     * @param mapper          the mapper
     * @param companyMapper   the company mapper
     * @param passwordEncoder the password encoder
     * @param tokenProvider   the token provider
     * @param emailController the email controller
     * @param secureUtils     the secure utils
     */
    @Autowired
    public AuthServiceImpl(MemberMapper mapper, CompanyMapper companyMapper, PasswordEncoder passwordEncoder, JwtTokenProvider tokenProvider, EmailController emailController, SecureUtils secureUtils) {
        this.mapper = mapper;
        this.companyMapper = companyMapper;
        this.passwordEncoder = passwordEncoder;
        this.tokenProvider = tokenProvider;
        this.emailController = emailController;
        this.secureUtils = secureUtils;
    }

    /**
     * 회원가입 서비스 구현체 메소드
     *
     * @param personalFormData the member dto
     * @return the member dto
     * @throws DuplicateMemberEmailException the login exception
     */
    @Transactional
    @Override
    public DefaultMemberDTO signup(DefaultMemberDTO personalFormData) throws DuplicateMemberEmailException {
        log.info("[AuthService] signup(PersonalMemberDTO) START ===================================");
        log.info("[AuthService] personalFormData {}", personalFormData);
        if (mapper.selectMemberByEmail(personalFormData.getEmail()) != null) {
            log.info("[AuthService] 이메일이 중복됩니다.");
            throw new DuplicateMemberEmailException("이메일이 중복됩니다.");
        }
        personalFormData.setMemberPw(passwordEncoder.encode(personalFormData.getMemberPw()));
        log.info("[AuthService] Member {}", personalFormData);
        int result = mapper.insertPersonalMember(personalFormData);
        log.info("[AuthService] Member Insert Result {}", result == 1 ? "회원 가입 성공" : "회원 가입 실패");
        if (result <= 0) {
            throw new SignupException("회원가입에 실패했습니다.");
        }
        log.info("[AuthService] signup(PersonalMemberDTO) End ==============================");
        return personalFormData;


    }

    @Override
    @Transactional
    public CompanyMemberDTO signup(CompanyMemberDTO companyFormData) throws DuplicateMemberEmailException {
        log.info("[AuthService] signup(CompanyMemberDTO) START ===================================");
        if (mapper.selectMemberByEmail(companyFormData.getEmail()) != null) {
            log.info("[AuthService] 이메일이 중복됩니다.");
            throw new DuplicateMemberEmailException("이메일이 중복됩니다.");
        }
        companyFormData.setMemberPw(passwordEncoder.encode(companyFormData.getMemberPw()));
        int seqNo = mapper.getMemberNextSeq();
        log.info("[AuthService] seqNo {}", seqNo);
        companyFormData.setMemberCodePk(seqNo);
        log.info("[AuthService] companyFormData {}", companyFormData);
        int result = mapper.insertCompanyMember(companyFormData);
        if (result <= 0) {
            log.info("[AuthService] Member Insert 회원 가입 실패했습니다.");
            throw new SignupException("회원가입에 실패했습니다.");
        }
        CompanyDTO foundCompany = companyMapper.selectCompanyByRegsitNumber(companyFormData.getRegistNumber());
        log.info("[AuthService] company {}", foundCompany);
        EntMemberDTO entMember = new EntMemberDTO();
        if (foundCompany == null) {
            log.info("[AuthService] 이미 가입된 기업정보가 없습니다. 기업 정보를 새로 생성합니다.");
            int comSeq = companyMapper.getCompanyNextSeq();
            log.info("[AuthService] comSeq {}", comSeq);
            CompanyDTO insertCompany = new CompanyDTO();
            insertCompany.setCompanyCodePk(comSeq);
            insertCompany.setComName(companyFormData.getComName());
            insertCompany.setRegistNumber(companyFormData.getRegistNumber());
            insertCompany.setComUrl(companyFormData.getComUrl());
            log.info("[AuthService] insertCompany {}", insertCompany);
            int insertCompanyResult = companyMapper.insertCompany(insertCompany);
            log.info("[AuthService] insertCompanyResult {}", insertCompanyResult);
            if (insertCompanyResult < 0) {
                log.info("[AuthService] 회사 레코드 생성에 실패했습니다.");
                throw new SignupException("회원가입에 실패했습니다.");
            }
            log.info("[AuthService] 기업코드 관계 형성");
            entMember.setMemberCodeFk(seqNo);
            entMember.setCompanyCodeFk(insertCompany.getCompanyCodePk());
        } else {
            log.info("[AuthService] 기업코드 관계 형성");
            entMember.setMemberCodeFk(seqNo);
            entMember.setCompanyCodeFk(foundCompany.getCompanyCodePk());
        }
        log.info("[AuthService] entMember {}", entMember);
        int putCompanyResult = mapper.putCompanyMember(entMember);
        log.info("[AuthService] result {}", putCompanyResult);
        if (putCompanyResult < 0) {
            log.info("[AuthService] 회원가입에 실패했습니다.");
            throw new SignupException("회원가입에 실패했습니다.");
        }
        log.info("[AuthService] signup(CompanyMemberDTO) End ==============================");
        return null;
    }

    /**
     * 로그인 서비스 구현체 서비스
     *
     * @param memberDTO the member dto
     * @return the token dto
     */
    @Override
    public TokenDTO login(MemberDTO memberDTO, HttpServletResponse response) throws LoginException, IOException {
        log.info("[AuthService] Login Start ===================================");
        log.info("[AuthService] {}", memberDTO);

        // 아이디 조회
        MemberDTO member = mapper.selectMemberByMemberId(memberDTO.getMemberId());
        System.out.println("member = " + member);
        if (member == null) {
            throw new LoginException("없는 아이디입니다.");
        }
        // 비밀번호 매칭
        if (!passwordEncoder.matches(memberDTO.getMemberPw(), member.getMemberPw())) {
            log.info("[AuthService] Password Match Fail");
            response.sendError(400, "잘못된 아이디 또는 비밀번호 입니다.");
//            throw new LoginException("잘못된 아이디 또는 비밀번호 입니다.");
        }
        if (member.getMemberRole().get(0).getAuthority().getAuthorityName().equals("ROLE_COMPANY")) {
            log.info("[AuthService] companyMember ");
            EntMemberDTO memberCompanyInfo = mapper.selectEntMemberByMemberCodeFk(member.getMemberCodePk());
            log.info("[AuthService] memberCompanyInfo {}", memberCompanyInfo);
            if (memberCompanyInfo.getIsActive() == 'N') {
                log.info("[AuthService] 승인받지 않은 회원입니다. ");
//                throw new NotAcceptMemberException("승인을 받지 않은 회원입니다.");
                response.sendError(403, "승인받지 않은 회원입니다.");
            }
        }

        // 토큰 발급
        TokenDTO token = tokenProvider.generateTokenDTO(member);
        log.info("[AuthService] tokenDto {}", token);
        log.info("[AuthService] Login End ===================================");
        return token;
    }

    @Override
    public void sendVerifyCode(MemberDTO memberDTO, HttpServletRequest httpRequest) throws DuplicateMemberEmailException {
        log.info("[AuthService] sendVerifyCode Start ===================================");
        HttpSession session = httpRequest.getSession(true);
        String email = memberDTO.getEmail();
        log.info("[AuthService] memberDTO {}", email);
        // 인증을 원하는 이메일 주소
        MemberDTO selectMemberByEmail = mapper.selectMemberByEmail(email);
        if (selectMemberByEmail != null) {
            log.info("[AuthService] {}", selectMemberByEmail);
            log.info("[AuthService] 이메일이 중복됩니다.");
            throw new DuplicateMemberEmailException("이미 가입한 이메일 입니다.");
        }
        String verifyCode = createVerifyCode();
        String title = "INIT 서비스 가입을 위한 이메일 인증번호 입니다.";
        String content = "<div align='center'>" +
                "<h1>회원가입 이메일 인증 번호입니다.</h1>" +
                "<h3>아래의 인증번호를 입력해주세요</h3>" +
                "<div><p><bold>CODE :<bold><span>" + verifyCode + "</span> </p></div>";
        EmailDTO emailDTO = new EmailDTO(email, title, content);

        // 세션 유효 시간 = 5분
        session.setMaxInactiveInterval(60 * 5);
        session.setAttribute("verifyCode", verifyCode);
        emailController.sendEmail(emailDTO);
        log.info("[AuthService] sendVerifyCode End ===================================");

//        new EmailDTO("email", "")
//        emailController.sendEmail();
    }

    @Override
    public void verifyEmailVerifyCode(String inputVerifyCode, HttpSession session) throws EmailException {
        log.info("[AuthService] verifyEmailVerifyCode START ===========================");
        log.info("[AuthService] inputVerifyCode {}", inputVerifyCode);
        String verifyCode = session.getAttribute("verifyCode").toString();
        log.info("[AuthService] verifyCode {}", verifyCode);
        if (inputVerifyCode.equals(verifyCode)) {
            log.info("[AuthService] 이메일 인증 성공, 1시간 이내로 가입해주세요.");
            session.setAttribute("isEmailVerify", true);
            session.setMaxInactiveInterval(60 * 60);
            log.info("[AuthService] verifyEmailVerifyCode End ===================================");
            return;
        }
        log.info("[AuthService] 이메일 인증 실패");

        throw new EmailException("이메일 인증에 실패하였습니다.");
    }

    @Override
    public boolean checkId(String inputId) throws DuplicateMemberException {
        log.info("[AuthService] checkId START ===========================");
        log.info("[AuthService] checkId {}", inputId);
        if (mapper.selectMemberByMemberId(inputId) != null) {
            log.info("[AuthService] 이미 가입된 아이디! ");
            throw new DuplicateMemberException("이미 가입된 아이디 입니다!");
        }
        log.info("[AuthService] checkId End ===================================");
        return true;
    }

    @Override
    @Transactional
    public boolean resetPassword(MemberDTO member) {
        log.info("[AuthService] resetPassword START ===========================");
        MemberDTO foundMember = mapper.selectMemberByEmail(member.getEmail());
        if (foundMember == null) {
            log.info("[AuthService] 이메일이 존재하지 않습니다.");
            throw new DuplicateMemberEmailException("이메일이 존재하지 않습니다.");
        }
        if (!foundMember.getMemberName().equals(member.getMemberName())) {
            log.info("[AuthService] 이름이 일치하지 않습니다.");
            throw new DuplicateMemberEmailException("이름이 일치하지 않습니다.");
        }
        if (!foundMember.getMemberId().equals(member.getMemberId())) {
            log.info("[AuthService] 아이디가 일치하지 않습니다.");
            throw new DuplicateMemberEmailException("아이디가 일치하지 않습니다.");
        }
        String tempPassword = secureUtils.getRamdomPassword(10);
        foundMember.setMemberPw(passwordEncoder.encode(tempPassword));
        log.info("[AuthService] foundMember {}", foundMember);
        int result = mapper.setMemberPwTemp(foundMember);
        if(result <= 0 ) {
            log.info("[AuthService] setMeberPwTemp 매퍼 오류");
            throw new updateException("임시비밀번호 발급 실패");
        }

        log.info("[AuthService] 임시비밀번호 이메일 전송 시작");
        String title = "INIT 서비스 임시비밀번호 발급 안내입니다.";
        String content = "<div align='center'>" +
                "<h1>임시 비밀번호 발급 안내입니다.</h1>" +
                "<h3>임시 비밀번호로 로그인해주세요</h3>" +
                "<div><p><bold>CODE :<bold><span>" + tempPassword + "</span> </p></div>";
        emailController.sendEmail(new EmailDTO(foundMember.getEmail(), title, content));
        log.info("[AuthService] 임시비밀번호 이메일 전송 완료");
        log.info("[AuthService] resetPassword END ===========================");
        return true;
    }

    private String createVerifyCode() {
        StringBuilder verifyCode = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(3);
            switch (index) {
                case 0:
                    verifyCode.append((char) (random.nextInt(26) + 97));
                    break;
                case 1:
                    verifyCode.append((char) (random.nextInt(26) + 65));
                    break;
                case 2:
                    verifyCode.append(random.nextInt(10));
                    break;
            }
        }
        return verifyCode.toString();
    }


}
