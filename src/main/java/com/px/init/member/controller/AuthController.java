package com.px.init.member.controller;

import com.px.init.common.dto.ResponseDTO;
import com.px.init.exception.EmailException;
import com.px.init.exception.SignupException;
import com.px.init.member.model.dto.CompanyMemberDTO;
import com.px.init.member.model.dto.MemberDTO;
import com.px.init.member.model.dto.DefaultMemberDTO;
import com.px.init.member.model.service.AuthServiceImpl;
import org.apache.ibatis.javassist.bytecode.DuplicateMemberException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
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
     * @param personalFormData the personal form data
     * @param httpRequest      the http request
     * @return the response entity
     */
    @PostMapping("/signup/personal")
    public ResponseEntity<ResponseDTO> signup(@RequestBody DefaultMemberDTO personalFormData, HttpServletRequest httpRequest) {
        HttpSession session = httpRequest.getSession(false);
        if (session == null) {
            throw new SignupException("잘못된 접근입니다.");
        } else if (session.getAttribute("isEmailVerify") == null) {
            throw new SignupException("이메일인증");
        }
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.CREATED, "개인 회원 회원가입 성공", authService.signup(personalFormData)));
    }

    /**
     * Signup response entity.
     *
     * @param companyFormData the company form data
     * @param httpRequest     the http request
     * @return the response entity
     */
    @PostMapping("/signup/company")
    public ResponseEntity<ResponseDTO> signup(@RequestBody CompanyMemberDTO companyFormData, HttpServletRequest httpRequest){
        HttpSession session = httpRequest.getSession(false);
        if (session == null) {
            throw new SignupException("잘못된 접근입니다.");
        } else if (session.getAttribute("isEmailVerify") == null) {
            throw new SignupException("이메일인증");
        }
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.CREATED, "기업 회원 회원가입", authService.signup(companyFormData)));
    }

    /**
     * 어드민 + 개인회원 + 기업회원 통합 로그인을 위한 컨트롤러 메소드
     *
     * @param memberDTO 로그인할 회원 memberId, memberPw 저장
     * @return the response entity
     * @throws LoginException the login exception
     */
    @PostMapping("/login")
    public ResponseEntity<ResponseDTO> login(@RequestBody MemberDTO memberDTO, HttpServletResponse response) throws LoginException, IOException {
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "로그인 성공", authService.login(memberDTO, response)));
    }


    /**
     * Send email verify code response entity.
     *
     * @param memberDTO   the member dto
     * @param httpRequest the http request
     * @return the response entity
     */
    @PutMapping("/verify-code/send")
    public ResponseEntity<ResponseDTO> sendEmailVerifyCode(@RequestBody MemberDTO memberDTO, HttpServletRequest httpRequest) {
        authService.sendVerifyCode(memberDTO, httpRequest);
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "이메일 전송 성공", null));
    }

    /**
     * Verify email verify code response entity.
     *
     * @param bodyMap     the body map
     * @param httpRequest the http request
     * @return the response entity
     */
    @PutMapping("/verify-code/verify")
    public ResponseEntity<ResponseDTO> verifyEmailVerifyCode(@RequestBody Map<String, String> bodyMap, HttpServletRequest httpRequest) {
//        System.out.println("bodyMap = " + bodyMap.get("verifyCode"));
//        System.out.println(Integer.parseInt("12344566435"));
        String inputVerifyCode = bodyMap.get("verifyCode");
        HttpSession session = httpRequest.getSession(false);
        if (session == null) {
            throw new EmailException("인증번호가 존재하지 않습니다.");
        }
        authService.verifyEmailVerifyCode(inputVerifyCode, session);
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "이메일 인증 성공", null));
    }

    /**
     * Check id response entity.
     *
     * @param inputId the input id
     * @return the response entity
     * @throws DuplicateMemberException the duplicate member exception
     */
    @GetMapping("/duplicated-id")
    public ResponseEntity<ResponseDTO> checkId(@RequestParam(name = "memberId") String inputId) throws DuplicateMemberException {
        System.out.println("inputId = " + inputId);
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "중복되지 않는 이메일", authService.checkId(inputId)));
    }

    @PutMapping("/reset-password")
    public ResponseEntity<ResponseDTO> resetPassword(@RequestBody MemberDTO member){
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "비밀번호 재발급 완료", authService.resetPassword(member)));
    }
}
