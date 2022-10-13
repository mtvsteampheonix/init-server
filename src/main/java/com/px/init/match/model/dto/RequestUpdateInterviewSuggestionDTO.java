package com.px.init.match.model.dto;

/**
 * <pre>
 * Class : Sample
 * Comment : 개인회원의 면접 제안서 응답 DTO
 * History
 * 2022-10-12 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see 참고할 class나 외부 url
 */
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
