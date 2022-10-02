package com.px.init.member.model.service;

import com.px.init.member.model.dao.MemberMapper;
import com.px.init.member.model.dto.MemberDTO;
import com.px.init.member.model.dto.MemberRoleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private static final Logger log = LoggerFactory.getLogger(CustomUserDetailsService.class);
    private final MemberMapper mapper;

    public CustomUserDetailsService(MemberMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public UserDetails loadUserByUsername(String memberId) throws UsernameNotFoundException {
        log.info("[CustomUserDetailsService] ===================================");
        log.info("[CustomUserDetailsService] loadUserByUsername {}", memberId);

        MemberDTO member = mapper.selectMemberByMemberId(memberId);

        if(member == null) {
            throw new UsernameNotFoundException(memberId + "> 회원 정보가 존재하지 않습니다.");
        }
        List<MemberRoleDTO> memberRoleList = member.getMemberRole();
        List<GrantedAuthority> authorities = new ArrayList<>();

        memberRoleList.forEach(memberRole -> authorities.add(new SimpleGrantedAuthority(memberRole.getAuthority().getAuthorityName())));

        return member;
    }


}
