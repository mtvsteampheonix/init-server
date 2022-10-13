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
    public List<PersonalApplyListDTO> selectPersonalApplyList(PersonalRequestApplyListDTO personalRequestApplyListDTO) {
        return mapper.selectPersonalApplyList(personalRequestApplyListDTO);
    }

    @Override
    public PersonalApplyDetailDTO selectPersonalApplyDetail(Map<String, Integer> map) {
        return mapper.selectPersonalApplyDetail(map);
    }

    @Override
    public List<PersonalSuggestionListDTO> selectPersonalSuggestionList(PersonalRequestApplyListDTO personalRequestApplyListDTO) {
        return mapper.selectPersonalSuggestionList(personalRequestApplyListDTO);
    }

    @Override
    public PersonalSuggestionListDetailDTO selectPersonalSuggestionListDetail(int interviewSuggestionCode) {
        return mapper.selectPersonalSuggestionListDetail(interviewSuggestionCode);
    }

    @Override
    @Transactional
    public String updatePersonalInterviewSuggestionResponse(RequestUpdateInterviewSuggestionDTO requestUpdateInterviewSuggestionDTO) throws Exception {

        int result = mapper.updatePersonalInterviewSuggestionResponse(requestUpdateInterviewSuggestionDTO);

        String message = "";
        if(result ==1){
            message = "success";
        }else{
            message = "fail";
            throw new Exception("수정실패");
        }
        return message;
    }

    @Override
    public List<CompanyApplyListDTO> selectCompanyApplyList(CompanyRequestApplyListDTO companyRequestApplyListDTO) {
        return mapper.selectCompanyApplyList(companyRequestApplyListDTO);
    }

    @Override
    public String getComName(int noticeCode) {
        return mapper.getComName(noticeCode);
    }

    @Override
    public List<String> failureEmailList(NoticeFailureDTO noticeFailureDTO) {
        System.out.println("noticeFailureDTO.getNoticeCode() = " + noticeFailureDTO.getNoticeCode());
        System.out.println("noticeFailureDTO.getNoticeCode() = " + noticeFailureDTO.getApplicationCodeList());
        return mapper.failureEmailList(noticeFailureDTO);
    }

    @Override
    @Transactional
    public String updateAccepted(NoticeFailureDTO noticeFailureDTO) throws Exception {
        int result = mapper.updateAccepted(noticeFailureDTO);
        String message = "";
        if(result>0){
            message="success";
        }else{
            message="failed";
            throw new Exception("삐용삐용");
        }
        return message;
    }

    @Override
    public CompanyApplyListDetailDTO selectCompanyApplyDetail(int applicationCode) {
        return mapper.selectCompanyApplyDetail(applicationCode);
    }

    @Override
    public CompanyInformationDTO selectCompanyInformation(int noticeCode) {
        return mapper.selectCompanyInformation(noticeCode);
    }


    @Override
    @Transactional
    public String insertCompanyInterviewSuggestion(InterviewSuggestionDTO interviewSuggestionDTO) throws Exception {
        int companyCode = mapper.getCompanyCode(interviewSuggestionDTO.getApplicationCode());
        interviewSuggestionDTO.setCompanyCode(companyCode);
        System.out.println(interviewSuggestionDTO);
        int result = mapper.insertCompanyInterviewSuggestion(interviewSuggestionDTO);
        System.out.println("result = " + result);
        String message = "";
        if(result>0){
            message="success";
            mapper.successAccepted(interviewSuggestionDTO.getApplicationCode());
        }else{
            message="failed";
            throw new Exception("삐용삐용");
        }
        return message;
    }


}
