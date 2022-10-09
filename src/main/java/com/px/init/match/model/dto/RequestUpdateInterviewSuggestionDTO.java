package com.px.init.match.model.dto;

public class RequestUpdateInterviewSuggestionDTO {
    private int interviewSuggestionCode;
    private String response;

    public RequestUpdateInterviewSuggestionDTO() {
    }

    public RequestUpdateInterviewSuggestionDTO(int interviewSuggestionCode, String response) {
        this.interviewSuggestionCode = interviewSuggestionCode;
        this.response = response;
    }

    public int getInterviewSuggestionCode() {
        return interviewSuggestionCode;
    }

    public void setInterviewSuggestionCode(int interviewSuggestionCode) {
        this.interviewSuggestionCode = interviewSuggestionCode;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "RequestUpdateInterviewSuggestion{" +
                "interviewSuggestionCode=" + interviewSuggestionCode +
                ", response='" + response + '\'' +
                '}';
    }
}
