package com.px.init.admin.controller;

import com.px.init.admin.model.dto.IsActiveDTO;
import com.px.init.admin.model.service.AdminService;
import com.px.init.common.dto.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 * Class : AdminController
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-12 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할 class나 외부 url
 */
@Controller
@RequestMapping("/admins")
public class AdminController {
    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/signup-plzs")
    public ResponseEntity<ResponseDTO> findSignupPlzList() {
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "기업회원 가입 요청 목록 조회 완료", adminService.findSignupPlzList()));
    }

    @GetMapping("/signup-plzs/{memberCodeFk}")
    public ResponseEntity<ResponseDTO> findSignupPlzListByMemberCodeFk(@PathVariable int memberCodeFk){
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "기업회원 가입 요청 상세보기 조회 완료", adminService.findSignupPlzListByMemberCodePk(memberCodeFk)));
    }

    @PutMapping("/member/company/is-active")
    public ResponseEntity<ResponseDTO> putCompanyMemberIsActive(@RequestBody IsActiveDTO isActive) {
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "기업회원 가입 요청 승인 완료", adminService.putCompanyMemberIsActive(isActive)));
    }

}
