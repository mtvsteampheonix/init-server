package com.px.init.match.controller;

import com.px.init.common.dto.ResponseDTO;
import com.px.init.match.model.dto.RequestListDTO;
import com.px.init.match.model.service.MatchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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

    /**
     * Instantiates a new Match controller.
     *
     * @param matchService the match service
     */
    @Autowired
    public MatchController(MatchService matchService){
        this.matchService = matchService;
    }

    /**
     * Select personal apply list response entity.
     *
     * @param offset 번호, 검색 타이틀, 검색 내용, 멤버 번호를 담는 DTO 파일
     * @return the response entity
     */
    @GetMapping("/personal/apply-list")
    public ResponseEntity<ResponseDTO> selectPersonalApplyList(@ModelAttribute RequestListDTO requestListDTO){
        System.out.println("requestPersonalApplyListDTO = " + requestListDTO);
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "지원내역조회", matchService.selectPersonalApplyList(requestListDTO)));
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
    public ResponseEntity<ResponseDTO> selectPersonalSuggestionList(@ModelAttribute RequestListDTO requestListDTO){
        return ResponseEntity.ok().body(new ResponseDTO(HttpStatus.OK, "면접제안목록조회", matchService.selectSuggestionList(requestListDTO)));
    }

}
