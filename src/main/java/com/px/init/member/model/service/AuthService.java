package com.px.init.member.model.service;

import com.px.init.exception.DuplicateMemberEmailException;
import com.px.init.jwt.JwtTokenProvider;
import com.px.init.member.model.dao.MemberMapper;
import com.px.init.member.model.dto.MemberDTO;
import com.px.init.member.model.dto.TokenDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.security.auth.login.LoginException;
import java.sql.Date;

@Service
public class AuthService {

    private static final Logger log = LoggerFactory.getLogger(AuthService.class);
    private final MemberMapper mapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider tokenProvider;

    @Autowired
    public AuthService(MemberMapper mapper, PasswordEncoder passwordEncoder, JwtTokenProvider tokenProvider) {
        this.mapper = mapper;
        this.passwordEncoder = passwordEncoder;
        this.tokenProvider = tokenProvider;
    }

    @Transactional
    public MemberDTO signup(MemberDTO memberDTO) throws LoginException {
        log.info("[AuthService] Login START ===================================");
        log.info("[AuthService] {}", memberDTO);
        if (mapper.selectMemberByEmail(memberDTO.getEmail()) != null) {
            log.info("[AuthService] 이메일이 중복됩니다.");
            throw new DuplicateMemberEmailException("이메일이 중복됩니다.");
        }
        log.info("[AuthService] Member Signup Start ==============================");
        memberDTO.setMemberPw(passwordEncoder.encode(memberDTO.getMemberPw()));
        log.info("[AuthService] Member {}", memberDTO);
        int result = mapper.insertMember(memberDTO);
        log.info("[AuthService] Member Insert Result {}", result > 0 ? "회원 가입 성공" : "회원 가입 실패");
        log.info("[AuthService] Signup End ==============================");
        return memberDTO;


    }

    @Transactional
    public TokenDTO login(MemberDTO memberDTO) throws LoginException {
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
            throw new LoginException("잘못된 아이디 또는 비밀번호 입니다.");
        }

        // 토큰 발급
        TokenDTO token = tokenProvider.generateTokenDTO(member);
        log.info("[AuthService] tokenDto {}", token);

        log.info("[AuthService] Login End ===================================");
        return token;

    }
}
