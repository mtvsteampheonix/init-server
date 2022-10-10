package com.px.init.match.model.dao;

import com.px.init.match.model.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MatchMapper {
    List<PersonalApplyListDTO> selectPersonalApplyList(RequestListDTO requestListDTO);

    PersonalApplyDetailDTO selectPersonalApplyDetail(Map<String, Integer> map);

    List<PersonalSuggestionListDTO> selectPersonalSuggestionList(RequestListDTO requestListDTO);

    PersonalSuggestionListDetailDTO selectPersonalSuggestionListDetail(int interviewSuggestionCode);

    int updateInterviewSuggestionResponse(RequestUpdateInterviewSuggestionDTO requestUpdateInterviewSuggestionDTO);
}
