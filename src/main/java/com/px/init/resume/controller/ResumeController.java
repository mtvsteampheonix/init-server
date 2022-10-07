package com.px.init.resume.controller;

import com.px.init.common.dto.ResponseDTO;
import com.px.init.resume.model.dto.ResumeDTO;
import com.px.init.resume.model.dto.TotalResumeDTO;
import com.px.init.resume.model.service.ResumeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.List;

/**
 * The type Resume controller.
 */
@RestController
@RequestMapping("/resume")
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

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.CREATED, "통신 성공", resume));
    }

    /**
     * Test resume string.
     *
     * @return the string
     */
    @GetMapping("")
    public String testResume(){
        System.out.println("test 진행 중...");
        return null;
    }
}
