package com.px.init.member.controller;

import com.px.init.common.dto.ResponseDTO;
import com.px.init.member.model.dto.request.PasswordRequestDTO;
import com.px.init.member.model.dto.request.UpdatePersonalRequestDTO;
import com.px.init.member.model.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 * Class : MemberController
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-09 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할class나외부 url
 */
@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    /**
     * Instantiates a new Member controller.
     *
     * @param memberService the member service
     */
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    /**
     * Find personal member response entity.
     *
     * @return the response entity
     */
    @GetMapping("/personal")
    public ResponseEntity<ResponseDTO> findPersonalMember() {
        System.out.println("SecurityContextHolder.getContext().getAuthentication().getAuthorities() = " + SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "회원정보 조회 완료", memberService.findMember()));
    }

    /**
     * Update member response entity.
     *
     * @param updatePersonal the update personal
     * @return the response entity
     */
    @PutMapping("/personal")
    public ResponseEntity<ResponseDTO> updateMember(@RequestBody UpdatePersonalRequestDTO updatePersonal) {
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "회원정보 수정 완료", memberService.updateMember(updatePersonal)));
    }

    /**
     * Patch member password response entity.
     *
     * @param passwordPatchInfo the password patch info
     * @return the response entity
     */
    @PatchMapping("/password")
    public ResponseEntity<ResponseDTO> patchMemberPassword(@RequestBody PasswordRequestDTO passwordPatchInfo) {
//        System.out.println("passwordPatchInfo = " + passwordPatchInfo);
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "비밀번호 수정 완료", memberService.patchPassword(passwordPatchInfo)));

    }
}
