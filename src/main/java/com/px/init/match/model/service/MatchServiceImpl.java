package com.px.init.match.model.service;

import com.px.init.match.model.dao.MatchMapper;
import com.px.init.match.model.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class MatchServiceImpl implements MatchService {

    private MatchMapper mapper;

    @Autowired
    public MatchServiceImpl(MatchMapper mapper){
        this.mapper = mapper;
    }

    @Override
    public List<PersonalApplyListDTO> selectPersonalApplyList(RequestListDTO requestListDTO) {
        return mapper.selectPersonalApplyList(requestListDTO);
    }

    @Override
    public PersonalApplyDetailDTO selectPersonalApplyDetail(Map<String, Integer> map) {
        return mapper.selectPersonalApplyDetail(map);
    }

    @Override
    public List<PersonalSuggestionListDTO> selectPersonalSuggestionList(RequestListDTO requestListDTO) {
        return mapper.selectPersonalSuggestionList(requestListDTO);
    }

    @Override
    public PersonalSuggestionListDetailDTO selectPersonalSuggestionListDetail(int interviewSuggestionCode) {
        return mapper.selectPersonalSuggestionListDetail(interviewSuggestionCode);
    }

    @Override
    @Transactional
    public String updateInterviewSuggestionResponse(RequestUpdateInterviewSuggestionDTO requestUpdateInterviewSuggestionDTO) throws Exception {

        int result = mapper.updateInterviewSuggestionResponse(requestUpdateInterviewSuggestionDTO);

        String message = "";
        if(result ==1){
            message = "success";
        }else{
            message = "fail";
            throw new Exception("수정실패");
        }
        return message;
    }
}
