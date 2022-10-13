package com.px.init.match.controller;

import com.px.init.common.dto.ResponseDTO;
import com.px.init.email.controller.EmailController;
import com.px.init.email.model.dto.EmailDTO;
import com.px.init.match.model.dto.*;
import com.px.init.match.model.service.MatchService;

import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * <pre>
 * Class : Sample
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022/10/05 (노재원) 처음 작성
 * </pre>
 *
 * @author 노재원
 * @version 1.0
 * @see
 */
@RestController
@RequestMapping("/matches")
public class MatchController {

    /**
     * The Match service.
     */
    MatchService matchService;
    EmailController emailController;

    /**
     * Instantiates a new Match controller.
     *
     * @param matchService the match service
     */
    @Autowired
    public MatchController(MatchService matchService, EmailController emailController){
        this.matchService = matchService;
        this.emailController = emailController;
    }

    /**
     * Select personal apply list response entity.
     *
     * @param offset 번호, 검색 타이틀, 검색 내용, 멤버 번호를 담는 DTO 파일
     * @return the response entity
     */
    @GetMapping("/personal/apply-list")
    public ResponseEntity<ResponseDTO> selectPersonalApplyList(@ModelAttribute PersonalRequestApplyListDTO personalRequestApplyListDTO){
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "지원내역조회", matchService.selectPersonalApplyList(personalRequestApplyListDTO)));
    }

    /**
     * Select personal apply detail response entity.
     *
     * @param noticeCode the notice code
     * @param memberCode the member code
     * @return the response entity
     */
    @GetMapping("/personal/apply-detail")
    public ResponseEntity<ResponseDTO> selectPersonalApplyDetail(@RequestParam int noticeCode, @RequestParam int memberCode){
        Map<String, Integer> map = new HashMap<>();
        map.put("noticeCode", noticeCode);
        map.put("memberCode", memberCode);

        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "지원내역상세조회", matchService.selectPersonalApplyDetail(map)));
    }

    @GetMapping("/personal/suggestion-list")
    public ResponseEntity<ResponseDTO> selectPersonalSuggestionList(@ModelAttribute PersonalRequestApplyListDTO personalRequestApplyListDTO){
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "면접제안목록조회", matchService.selectPersonalSuggestionList(personalRequestApplyListDTO)));
    }

    @GetMapping("/personal/suggestion-detail")
    public ResponseEntity<ResponseDTO> selectPersonalSuggestionDetail(@RequestParam int interviewSuggestionCode){
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "면접제안목록조회", matchService.selectPersonalSuggestionListDetail(interviewSuggestionCode)));
    }

    @PutMapping("/personal/suggestion-response")
    public ResponseEntity<ResponseDTO> updatePersonalInterviewSuggestionResponse(@RequestBody RequestUpdateInterviewSuggestionDTO requestUpdateInterviewSuggestionDTO) throws Exception {
        return ResponseEntity.ok().body((new ResponseDTO(HttpStatus.OK, "면접제안응답수정", matchService.updatePersonalInterviewSuggestionResponse(requestUpdateInterviewSuggestionDTO))));
    }

    @GetMapping("/company/apply-list")
    public ResponseEntity<ResponseDTO> selectCompanyApplyList(@ModelAttribute CompanyRequestApplyListDTO companyRequestApplyListDTO,@RequestParam(required = false) String career) {
        if (career != null) {
            String[] list = career.split(",");
            companyRequestApplyListDTO.setCareer(List.of(list));
        }
        return ResponseEntity.ok().body((new ResponseDTO(HttpStatus.OK, "지원자목록조회", matchService.selectCompanyApplyList(companyRequestApplyListDTO))));
    }


    @PutMapping("/company/failure")
    public ResponseEntity<ResponseDTO> updateCompanyNoticeFailure(@RequestBody NoticeFailureDTO noticeFailureDTO) throws Exception {
        System.out.println("noticeFailureDTO = " + noticeFailureDTO);
        if(noticeFailureDTO.getApplicationCodeList() != null){
            String comName = matchService.getComName(noticeFailureDTO.getNoticeCode());
            List<String> failureEmail = matchService.failureEmailList(noticeFailureDTO);
            for(String email : failureEmail) {
                String title = comName + " 회사 면접 결과 입니다.";
                String message = "<h1>" + comName + "회사에 불합격 하셨습니다</h1>";
                EmailDTO emailDTO = new EmailDTO(email, title, message);
                boolean result = emailController.sendEmail(emailDTO);
            }
            String message = matchService.updateAccepted(noticeFailureDTO);
        }
        return ResponseEntity.ok().body((new ResponseDTO(HttpStatus.OK, "개인회원불합격처리", "전송이 완료되었습니다.")));
    }

    @GetMapping("/company/apply-detail")
    public ResponseEntity<ResponseDTO> selectCompanyApplyDetail(@RequestParam int applicationCode){
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "지원자상세조회", matchService.selectCompanyApplyDetail(applicationCode)));
    }

    @GetMapping("/company/information")
    public ResponseEntity<ResponseDTO> selectCompanyInformation(@RequestParam int noticeCode){
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "기업정보조회", matchService.selectCompanyInformation(noticeCode)));
    }

    @PostMapping("/company/interview-suggestion")
    public ResponseEntity<ResponseDTO> insertCompanyInterviewSuggestion(@RequestBody InterviewSuggestionDTO interviewSuggestionDTO) throws Exception {
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "개인회원합격처리", matchService.insertCompanyInterviewSuggestion(interviewSuggestionDTO)));
    }
}
