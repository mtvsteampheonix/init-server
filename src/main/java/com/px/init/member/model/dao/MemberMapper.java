package com.px.init.member.model.dao;

import com.px.init.member.model.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

@Mapper
public interface MemberMapper {
    MemberDTO selectMemberByEmail(String email);
    int insertMember(MemberDTO memberDTO);
    MemberDTO selectMemberByMemberId(String memberId);
}
