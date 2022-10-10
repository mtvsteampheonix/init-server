package com.px.init.match.model.service;


import com.px.init.match.model.dto.*;

import java.util.List;
import java.util.Map;

public interface MatchService {
    List<PersonalApplyListDTO> selectPersonalApplyList(RequestListDTO requestListDTO);

    PersonalApplyDetailDTO selectPersonalApplyDetail(Map<String, Integer> map);

    List<PersonalSuggestionListDTO> selectPersonalSuggestionList(RequestListDTO requestListDTO);

    PersonalSuggestionListDetailDTO selectPersonalSuggestionListDetail(int interviewSuggestionCode);

    String updateInterviewSuggestionResponse(RequestUpdateInterviewSuggestionDTO requestUpdateInterviewSuggestionDTO) throws Exception;
}
