package com.px.init.member.model.service;

import com.px.init.exception.PasswordException;
import com.px.init.exception.patchException;
import com.px.init.exception.updateException;
import com.px.init.jwt.JwtTokenProvider;
import com.px.init.member.model.dao.MemberMapper;
import com.px.init.member.model.dto.MemberDTO;
import com.px.init.member.model.dto.PersonalMemberDTO;
import com.px.init.member.model.dto.TokenDTO;
import com.px.init.member.model.dto.request.PasswordRequestDTO;
import com.px.init.member.model.dto.request.UpdatePersonalRequestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <pre>
 * Class : MemberServiceImpl
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-09 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 */
@Service
public class MemberServiceImpl implements MemberService {
    private static final Logger log = LoggerFactory.getLogger(MemberServiceImpl.class);

    private MemberMapper mapper;
    private PasswordEncoder encoder;
    private JwtTokenProvider tokenProvider;
    @Autowired
    public MemberServiceImpl(MemberMapper mapper, PasswordEncoder encoder, JwtTokenProvider tokenProvider) {
        this.mapper = mapper;
        this.encoder = encoder;
        this.tokenProvider = tokenProvider;
    }

    @Override
    public PersonalMemberDTO findMember() {
        log.info("[MemberService] findMember START ==========================");
        MemberDTO loginMember = (MemberDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        log.info("[MemberService] loginMember {}", loginMember);
        PersonalMemberDTO member = new PersonalMemberDTO();
        member.setMemberName(loginMember.getMemberName());
        member.setMemberId(loginMember.getMemberId());
        member.setMemberPw("");
        member.setEmail(loginMember.getEmail());
        member.setPhone(loginMember.getPhone());
        log.info("[MemberService] member {}", member);
        log.info("[MemberService] findMember END ==========================");
        return member;
    }

    @Override
    @Transactional
    public TokenDTO updateMember(UpdatePersonalRequestDTO updateMemberInfo) {
        log.info("[MemberService] updateMember START ==========================");
        log.info("[MemberService] updateMember {}", updateMemberInfo);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        MemberDTO loginedMember = (MemberDTO) authentication.getPrincipal();
        log.info("[MemberService] loginedMember {}", loginedMember);
        if(!encoder.matches(updateMemberInfo.getMemberPw(), loginedMember.getPassword())){
            log.info("[MemberService] 비밀번호가 일치하지 않습니다!");
            throw new PasswordException("비밀번호가 일치하지 않습니다.");
        }
        PersonalMemberDTO updateMember = new PersonalMemberDTO();
        updateMember.setMemberName(updateMemberInfo.getMemberName());
        updateMember.setPhone(updateMemberInfo.getPhone());
        updateMember.setMemberId(loginedMember.getMemberId());
        int result = mapper.updatePersonalMember(updateMember);
        log.info("[MemberService] updateMember {}, result {}", updateMember, result);
        if(result != 1){
            log.info("[MemberService] 회원정보 수정 실패");
            throw new updateException("회원정보 수정에 실패하였습니다.");
        }
//        mapper.updatePersonalMember()
        // 토큰 발급
        TokenDTO token = tokenProvider.generateTokenDTO(loginedMember);
        log.info("[MemberService] tokenDto {}", token);

        log.info("[MemberService] updateMember END ==========================");
        return token;
    }

    @Override
    public boolean patchPassword(PasswordRequestDTO passwordPatchInfo) {
        log.info("[MemberService] patchPassword START =========================== ");
        log.info("[MemberService] passwordPatchInfo {}", passwordPatchInfo);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        MemberDTO loginedMember = (MemberDTO) authentication.getPrincipal();
        log.info("[MemberService] loginedMember {}", loginedMember);
        if(!encoder.matches(passwordPatchInfo.getMemberPw(), loginedMember.getPassword())){
            log.info("[MemberService] 비밀번호가 일치하지 않습니다!");
            throw new PasswordException("비밀번호가 일치하지 않습니다.");
        }
        PersonalMemberDTO patchMember = new PersonalMemberDTO();
        patchMember.setMemberId(loginedMember.getMemberId());
        patchMember.setMemberPw(encoder.encode(passwordPatchInfo.getChangeMemberPw()));
        int result = mapper.updatePassword(patchMember);
        if(result != 1){
            log.info("[MemberService] 비밀번호 수정 실패");
            throw new patchException("비밀번호 변경에 실패했습니다.");
        }
        log.info("[MemberService] patchPassword END =========================== ");
        return true;
    }

    @Override
    @Transactional
    public boolean deleteMember(String memberPw) {
        log.info("[MemberService] deleteMember START =========================== ");
        log.info("[MemberService] memberPw {}", memberPw);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        MemberDTO loginedMember = (MemberDTO) authentication.getPrincipal();
        log.info("[MemberService] loginedMember {}", loginedMember);
        if(!encoder.matches(memberPw, loginedMember.getPassword())){
            log.info("[MemberService] 비밀번호가 일치하지 않습니다!");
            throw new PasswordException("비밀번호가 일치하지 않습니다.");
        }
        mapper.deleteMember(loginedMember.getMemberCodePk());

        log.info("[MemberService] deleteMember END =========================== ");
        return false;
    }
}
