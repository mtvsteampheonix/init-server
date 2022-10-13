package com.px.init.resume.controller;

import com.px.init.common.dto.ResponseDTO;
import com.px.init.member.model.dto.MemberDTO;
import com.px.init.resume.model.dto.*;
import com.px.init.resume.model.service.ResumeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * The type Resume controller.
 */
@RestController
@RequestMapping("/resumes")
public class ResumeController {

    private final ResumeService resumeService;

    /**
     * Instantiates a new Resume controller.
     *
     * @param resumeService the resume service
     */
    public ResumeController(ResumeService resumeService){
        this.resumeService = resumeService;
    }

    /**
     * Regist resume response entity.
     *
     * @param resume the resume
     * @return the response entity
     * @throws Exception the exception
     */
    @PostMapping("")
    public ResponseEntity<ResponseDTO> registResume(@RequestBody TotalResumeDTO resume) throws Exception {

        System.out.println(resume);

        int result = resumeService.registResume(resume);
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.CREATED, "데이터 저장 성공", resume));
    }

    @GetMapping("")
    public ResponseEntity<ResponseDTO> findResumeCode(@AuthenticationPrincipal MemberDTO member){
        System.out.println("member = " + member);
        int memberCode = member.getMemberCodePk();

        List<ResumeCodeAndTitleDTO> resumeCodeList = resumeService.findResumeCode(memberCode);

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.CREATED, "이력서 코드 및 제목 조회 성공", resumeCodeList));
    }
    @GetMapping("/{resumeCode}")
    public ResponseEntity<ResponseDTO> findResumeDetail(@PathVariable("resumeCode") int resumeCode){

        System.out.println("resumeCode = " + resumeCode);
        TotalResumeDTO resume = resumeService.findResumeDetail(resumeCode);
        System.out.println("resume = " + resume);

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.CREATED, "이력서 세부 조회 성공", resume));
    }

    /**
     * Test resume string.
     *
     * @return the string
     */
    @GetMapping("/skillList")
    public ResponseEntity<ResponseDTO> findSkillList(){

        List<SkillStackDTO> skillList = resumeService.findSkillList();
        System.out.println("skillList = " + skillList);

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "스킬 스택 조회 성공", skillList));
    }

    @GetMapping("/desiredJob")
    public ResponseEntity<ResponseDTO> findDesiredJobList(){

        List<DesiredJobDTO> desiredJobList = resumeService.findDesiredJobList();
        System.out.println("desiredJobList = " + desiredJobList);

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "희망 직무 조회 성공", desiredJobList));
    }

    @GetMapping("/foreign-test")
    public ResponseEntity<ResponseDTO> findForiegnLanguageTest() {
        List<ForeignLanguageTestDTO> foreignTestList = resumeService.findForeignTestList();
        System.out.println("foreignTestList = " + foreignTestList);

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "외국어 시험 조회 성공", foreignTestList));
    }

    @GetMapping("/qualification-list")
    public ResponseEntity<ResponseDTO> findQualificationList(){
        List<QualificationDivDTO> qualificationDivList = resumeService.findQualificationList();
        System.out.println("qualificationDivList = " + qualificationDivList);

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "자격명 조회 성공", qualificationDivList));
    }

    @DeleteMapping("/{resumeCode}")
    public ResponseEntity<ResponseDTO> deleteResume(@PathVariable("resumeCode") int resumeCode){

        System.out.println("resumeCode = " + resumeCode);
        int result = resumeService.deleteResume(resumeCode);

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "이력서 삭제 성공", result));
    }

}
