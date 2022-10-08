package com.px.init.member.controller;

import com.px.init.common.dto.ResponseDTO;
import com.px.init.exception.EmailException;
import com.px.init.member.model.dto.MemberDTO;
import com.px.init.member.model.service.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * <pre>
 * Class : AuthController
 * Comment : 인증에 관련된 요청들을 관리할 컨트롤러
 * History
 * 2022-10-05 (손창우) 처음 작성
 * 2022-10-08 (손창우) 회원가입에 필요한 관련 API 추가(이메일 인증번호 요청 / 검사)
 * </pre>
 *
 * @author 손창우
 * @version 1.1
 */
@RestController
@RequestMapping("/auths")
public class AuthController {
    private final AuthServiceImpl authService;

    /**
     * AuthService DI 생성자
     *
     * @param authService the auth service
     */
    @Autowired
    public AuthController(AuthServiceImpl authService) {
        this.authService = authService;
    }

    /**
     * 개인 회원 회원가입을 위한 컨트롤러 메소드
     *
     * @param memberDTO 가입자가 입력한 회원가입 정보
     * @return the response entity
     * @throws LoginException 로그인 실패시 익셉션 발생
     */
    @PostMapping("/signup/personal")
    public ResponseEntity<ResponseDTO> signup(@RequestBody MemberDTO memberDTO) throws LoginException {
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.CREATED, "회원가입 성공", authService.signup(memberDTO)));
    }

    /**
     * 어드민 + 개인회원 + 기업회원 통합 로그인을 위한 컨트롤러 메소드
     *
     * @param memberDTO 로그인할 회원 memberId, memberPw 저장
     * @return the response entity
     * @throws LoginException the login exception
     */
    @PostMapping("/login")
    public ResponseEntity<ResponseDTO> login(@RequestBody MemberDTO memberDTO) throws LoginException {
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "로그인 성공", authService.login(memberDTO)));
    }


    @PutMapping("/verify-code/send")
    public ResponseEntity<ResponseDTO> sendEmailVerifyCode(@RequestBody MemberDTO memberDTO, HttpSession httpSession) {
        authService.sendVerifyCode(memberDTO, httpSession);
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "이메일 전송 성공", null));
    }

    @PutMapping("/verify-code/verify")
    public ResponseEntity<ResponseDTO> verifyEmailVerifyCode(@RequestBody Map<String, String> bodyMap, HttpServletRequest httpRequest) {
//        System.out.println("bodyMap = " + bodyMap.get("verifyCode"));
//        System.out.println(Integer.parseInt("12344566435"));
        String inputVerifyCode = bodyMap.get("verifyCode");
        System.out.println("inputVerifyCode = " + inputVerifyCode);
        HttpSession session = httpRequest.getSession(false);
        if (session == null) {
            throw new EmailException("인증번호가 존재하지 않습니다.");
        }
        authService.verifyEmailVerifyCode(inputVerifyCode, session);
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "이메일 인증 성공", null));
    }

}
