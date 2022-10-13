package com.px.init.match.model.service;


import com.px.init.match.model.dto.*;

import java.util.List;
import java.util.Map;

public interface MatchService {
    List<PersonalApplyListDTO> selectPersonalApplyList(PersonalRequestApplyListDTO personalRequestApplyListDTO);

    PersonalApplyDetailDTO selectPersonalApplyDetail(Map<String, Integer> map);

    List<PersonalSuggestionListDTO> selectPersonalSuggestionList(PersonalRequestApplyListDTO personalRequestApplyListDTO);

    PersonalSuggestionListDetailDTO selectPersonalSuggestionListDetail(int interviewSuggestionCode);

    String updatePersonalInterviewSuggestionResponse(RequestUpdateInterviewSuggestionDTO requestUpdateInterviewSuggestionDTO) throws Exception;

    List<CompanyApplyListDTO> selectCompanyApplyList(CompanyRequestApplyListDTO companyRequestApplyListDTO);

    String getComName(int noticeCode);

    List<String> failureEmailList(NoticeFailureDTO noticeFailureDTO);

    String updateAccepted(NoticeFailureDTO noticeFailureDTO) throws Exception;
}
