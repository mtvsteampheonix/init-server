package com.px.init.match.model.dto;

import java.util.Date;

/**
 * <pre>
 * Class : Sample
 * Comment : 면접제안 추가 DTO
 * History
 * 2022-10-13 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see 참고할 class나 외부 url
 */
public class InterviewSuggestionDTO {
    private int memberCode;
    private int companyCode;
    private int applicationCode;
    private String description;
    private String division;
    private java.util.Date interviewDate;

    public InterviewSuggestionDTO() {
    }

    public InterviewSuggestionDTO(int memberCode, int companyCode, int applicationCode, String description, String division, Date interviewDate) {
        this.memberCode = memberCode;
        this.companyCode = companyCode;
        this.applicationCode = applicationCode;
        this.description = description;
        this.division = division;
        this.interviewDate = interviewDate;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public int getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(int companyCode) {
        this.companyCode = companyCode;
    }

    public int getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(int applicationCode) {
        this.applicationCode = applicationCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    @Override
    public String toString() {
        return "InterviewSuggestionDTO{" +
                "memberCode=" + memberCode +
                ", companyCode=" + companyCode +
                ", applicationCode=" + applicationCode +
                ", description='" + description + '\'' +
                ", division='" + division + '\'' +
                ", interviewDate=" + interviewDate +
                '}';
    }
}
