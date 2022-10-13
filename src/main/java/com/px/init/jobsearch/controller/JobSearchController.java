package com.px.init.jobsearch.controller;/*
 * <pre>
 * Class : JobSearchController
 * Comment : 구직공고관련처리 컨트롤러
 * History
 * 2022-10-05(최재혁) 처음 작성
 * </pre>
 * @version 1.0
 * @author 최재혁
 * @see 참고할 class나 외부 url
 *
 */

import com.px.init.common.dto.ResponseDTO;
import com.px.init.jobsearch.model.dto.JobSearchDetailsDTO;
import com.px.init.jobsearch.model.dto.RegistJobSearchDTO;
import com.px.init.jobsearch.model.service.JobSearchService;
import com.px.init.member.model.dto.MemberDTO;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Job search controller.
 */
@RestController
@RequestMapping("/jobsearchs")
public class JobSearchController {


    private final JobSearchService jobSearchService;

    /**
     * Instantiates a new Job search controller.
     *
     * @param jobSearchService 구직공고서비스
     */
    @Autowired
    public JobSearchController(JobSearchService jobSearchService) {
        this.jobSearchService = jobSearchService;
    }

    /**
     * 구직공고 목록조회하는 메소드(비회원, 개인회원, 기업회원 ).
     *
     * @return 구직공고목록
     */
    @GetMapping("")
    public ResponseEntity<ResponseDTO> selectJobSearchList(@RequestParam(name = "search", defaultValue = "") String search) {

        System.out.println("요청이 들어오고 있긴합니다.");
      return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "조회성공", jobSearchService.selectJobSearchList(search)));

    }

    @GetMapping("/my")
    public ResponseEntity<ResponseDTO> selectMyJobSearchList() {
        System.out.println(SecurityContextHolder.getContext());
        MemberDTO loginedMember = (MemberDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        int  memberCodePk = loginedMember.getMemberCodePk();

        System.out.println("my요청이 들어오고 있긴합니다.");
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "조회성공", jobSearchService.selectMyJobSearchList(memberCodePk)));

    }


    @GetMapping("/{noticecode}")
    public ResponseEntity<ResponseDTO> selectJobSearchDetailsByCode(@PathVariable int noticecode){

//
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "조회성공", jobSearchService.selectJobSearchDetailsByCode(noticecode)));

    }

    @PostMapping("")
    public ResponseEntity<ResponseDTO> insertJobSearch(@RequestBody RegistJobSearchDTO registJobSearchDTO){

        System.out.println(SecurityContextHolder.getContext());
        MemberDTO loginedMember = (MemberDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        int  memberCodePk = loginedMember.getMemberCodePk();
        System.out.println("memberId: "+memberCodePk);
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "구직공고생성",  jobSearchService.insertJobSearch(registJobSearchDTO,memberCodePk)));
    }


    @DeleteMapping("/{noticeCode}")//게시
    public ResponseEntity<ResponseDTO> deleteJobSearch(@PathVariable int noticeCode){
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "구직공고삭제성공", jobSearchService.deleteJobSearch(noticeCode)));
    }
}
