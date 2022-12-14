package com.px.init.match.model.dto;

import java.sql.Date;
/**
 * <pre>
 * Class : Sample
 * Comment : 개인회원 면접제안서 viewDTO
 * History
 * 2022-10-12 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see 참고할 class나 외부 url
 */
public class PersonalSuggestionListDetailDTO {
    private String comName;
    private String comAddress;
    private String comUrl;
    private int numEmp;
    private java.sql.Date interviewDate;
    private String description;

    public PersonalSuggestionListDetailDTO() {
    }

    public PersonalSuggestionListDetailDTO(String comName, String comAddress, String comUrl, int numEmp, Date interviewDate, String description) {
        this.comName = comName;
        this.comAddress = comAddress;
        this.comUrl = comUrl;
        this.numEmp = numEmp;
        this.interviewDate = interviewDate;
        this.description = description;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComAddress() {
        return comAddress;
    }

    public void setComAddress(String comAddress) {
        this.comAddress = comAddress;
    }

    public String getComUrl() {
        return comUrl;
    }

    public void setComUrl(String comUrl) {
        this.comUrl = comUrl;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PersonalSuggestionListDetailDTO{" +
                "comName='" + comName + '\'' +
                ", comAddress='" + comAddress + '\'' +
                ", comUrl='" + comUrl + '\'' +
                ", numEmp=" + numEmp +
                ", interviewDate=" + interviewDate +
                ", description='" + description + '\'' +
                '}';
    }
}