package com.px.init.match.model.dto;

import java.sql.Date;
/**
 * <pre>
 * Class : Sample
 * Comment : 개인회원 지원 목록 조회 viewDTO
 * History
 * 2022-10-12 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see 참고할 class나 외부 url
 */
public class PersonalApplyListDTO {
    private int noticeCode;
    private String title;
    private String career;
    private String education;
    private String entLocation;
    private java.sql.Date postStartDate;
    private String comName;
    private String isAccepted;

    public PersonalApplyListDTO() {
    }

    public PersonalApplyListDTO(int noticeCode, String title, String career, String education, String entLocation, Date postStartDate, String comName, String isAccepted) {
        this.noticeCode = noticeCode;
        this.title = title;
        this.career = career;
        this.education = education;
        this.entLocation = entLocation;
        this.postStartDate = postStartDate;
        this.comName = comName;
        this.isAccepted = isAccepted;
    }

    public int getNoticeCode() {
        return noticeCode;
    }

    public void setNoticeCode(int noticeCode) {
        this.noticeCode = noticeCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEntLocation() {
        return entLocation;
    }

    public void setEntLocation(String entLocation) {
        this.entLocation = entLocation;
    }

    public Date getPostStartDate() {
        return postStartDate;
    }

    public void setPostStartDate(Date postStartDate) {
        this.postStartDate = postStartDate;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(String isAccepted) {
        this.isAccepted = isAccepted;
    }

    @Override
    public String toString() {
        return "PersonalApplyList{" +
                "noticeCode=" + noticeCode +
                ", title='" + title + '\'' +
                ", career='" + career + '\'' +
                ", education='" + education + '\'' +
                ", entLocation='" + entLocation + '\'' +
                ", postStartDate=" + postStartDate +
                ", comName='" + comName + '\'' +
                ", isAccepted='" + isAccepted + '\'' +
                '}';
    }
}
