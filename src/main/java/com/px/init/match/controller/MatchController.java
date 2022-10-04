package com.px.init.match.controller;

import com.px.init.common.dto.ResponseDTO;
import com.px.init.match.model.service.MatchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MatchController {

    MatchService matchService;

    @Autowired
    public MatchController(MatchService matchService){
        this.matchService = matchService;
    }

    @GetMapping("/personal/apply-list/{memberCode}")
    public ResponseEntity<ResponseDTO> selectPersonalApplyList(@PathVariable("memberCode") int memberCode){
        System.out.println("memberCode = " + memberCode);
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "지원내역조회", matchService.selectPersonalApplyList(memberCode)));
    }
}
