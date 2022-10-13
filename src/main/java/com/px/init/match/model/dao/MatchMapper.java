package com.px.init.match.model.dao;

import com.px.init.match.model.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MatchMapper {
    List<PersonalApplyListDTO> selectPersonalApplyList(PersonalRequestApplyListDTO personalRequestApplyListDTO);

    PersonalApplyDetailDTO selectPersonalApplyDetail(Map<String, Integer> map);

    List<PersonalSuggestionListDTO> selectPersonalSuggestionList(PersonalRequestApplyListDTO personalRequestApplyListDTO);

    PersonalSuggestionListDetailDTO selectPersonalSuggestionListDetail(int interviewSuggestionCode);

    int updatePersonalInterviewSuggestionResponse(RequestUpdateInterviewSuggestionDTO requestUpdateInterviewSuggestionDTO);

    List<CompanyApplyListDTO> selectCompanyApplyList(CompanyRequestApplyListDTO companyRequestApplyListDTO);

    String getComName(int noticeCode);

    List<String> failureEmailList(NoticeFailureDTO noticeFailureDTO);

    int updateAccepted(NoticeFailureDTO noticeFailureDTO);

    CompanyApplyListDetailDTO selectCompanyApplyDetail(int applicationCode);
}
