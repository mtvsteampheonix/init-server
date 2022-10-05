package com.px.init.member.model.service;

import com.px.init.exception.DuplicateMemberEmailException;
import com.px.init.member.model.dto.MemberDTO;
import com.px.init.member.model.dto.TokenDTO;

import javax.security.auth.login.LoginException;

/**
 * <pre>
 * Class : AuthService
 * Comment : 인증 관련 서비스 인터페이스
 * History
 * 2022-10-05 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 */
public interface AuthService {
    /**
     * Signup member dto.
     *
     * @param memberDTO the member dto
     * @return the member dto
     * @throws Exception the exception
     */
    MemberDTO signup(MemberDTO memberDTO) throws Exception;

    /**
     * Login token dto.
     *
     * @param memberDTO the member dto
     * @return the token dto
     * @throws Exception the exception
     */
    TokenDTO login(MemberDTO memberDTO) throws Exception;

    }
