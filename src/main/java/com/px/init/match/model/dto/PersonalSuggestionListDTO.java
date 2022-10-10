package com.px.init.match.model.dto;

import java.sql.Date;

public class PersonalSuggestionListDTO {
    private int interviewSuggestionCode;
    private String division;
    private String comName;
    private String comUrl;
    private java.sql.Date interviewDate;
    private String suggestionResponse;

    public PersonalSuggestionListDTO() {
    }

    public PersonalSuggestionListDTO(int interviewSuggestionCode, String division, String comName, String comUrl, Date interviewDate, String suggestionResponse) {
        this.interviewSuggestionCode = interviewSuggestionCode;
        this.division = division;
        this.comName = comName;
        this.comUrl = comUrl;
        this.interviewDate = interviewDate;
        this.suggestionResponse = suggestionResponse;
    }

    public int getInterviewSuggestionCode() {
        return interviewSuggestionCode;
    }

    public void setInterviewSuggestionCode(int interviewSuggestionCode) {
        this.interviewSuggestionCode = interviewSuggestionCode;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComUrl() {
        return comUrl;
    }

    public void setComUrl(String comUrl) {
        this.comUrl = comUrl;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getSuggestionResponse() {
        return suggestionResponse;
    }

    public void setSuggestionResponse(String suggestionResponse) {
        this.suggestionResponse = suggestionResponse;
    }

    @Override
    public String toString() {
        return "PersonalSuggestionListDTO{" +
                "interviewSuggestionCode=" + interviewSuggestionCode +
                ", division='" + division + '\'' +
                ", comName='" + comName + '\'' +
                ", comUrl='" + comUrl + '\'' +
                ", interviewDate=" + interviewDate +
                ", suggestionResponse='" + suggestionResponse + '\'' +
                '}';
    }
}
