package com.px.init.member.model.service;

import com.px.init.member.model.dto.MemberDTO;
import com.px.init.member.model.dto.PersonalFormDataDTO;
import com.px.init.member.model.dto.TokenDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <pre>
 * Class : AuthService
 * Comment : 인증 관련 서비스 인터페이스
 * History
 * 2022-10-05 (손창우) 처음 작성
 * 2022-10-08 (손창우) 이메일 인증 번호 요청 / 검사 기능 추가
 * 2022-10-08 (손창우) 이메일 인증 번호 기능 비동기처리
 * </pre>
 *
 * @author 손창우
 * @version 1.2
 */
public interface AuthService {
    /**
     * 회원가입 서비스
     *
     * @param personalFormData the personal form data
     * @return the member dto
     * @throws Exception the exception
     */
    PersonalFormDataDTO signup(PersonalFormDataDTO personalFormData) throws Exception;

    /**
     * 로그인 서비스
     *
     * @param memberDTO the member dto
     * @return the token dto
     * @throws Exception the exception
     */
    TokenDTO login(MemberDTO memberDTO) throws Exception;

    /**
     * 이메일 인증 번호 전송요청 서비스 메소드
     *
     * @param memberDTO   the member dto
     * @param httpRequest the http request
     * @throws Exception the exception
     */
    void sendVerifyCode(MemberDTO memberDTO, HttpServletRequest httpRequest) throws Exception;

    /**
     * 이메일 인증 번호 검사요청 서비스 메소드
     *
     * @param inputVerifyCode the input verify code
     * @param session         the session
     */
    void verifyEmailVerifyCode(String inputVerifyCode, HttpSession session);

    /**
     * Check id boolean.
     *
     * @param inputId the input id
     * @return the boolean
     * @throws Exception the exception
     */
    boolean checkId(String inputId) throws Exception;
}
