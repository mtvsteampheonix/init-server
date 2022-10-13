package com.px.init.match.model.dto;

import java.sql.Date;
import java.util.List;

/**
 * <pre>
 * Class : Sample
 * Comment : 기업회원 지원자 목록 조회 ViewDTO
 * History
 * 2022-10-11 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see
 */
public class CompanyApplyListDTO {
    private int applicationCode;
    private String isAccepted;
    private java.sql.Date applicationDate;
    private String resumeTitle;
    private String noticeTitle;
    private String personalName;

    public CompanyApplyListDTO() {
    }

    public CompanyApplyListDTO(int applicationCode, String isAccepted, Date applicationDate, String resumeTitle, String noticeTitle, String personalName) {
        this.applicationCode = applicationCode;
        this.isAccepted = isAccepted;
        this.applicationDate = applicationDate;
        this.resumeTitle = resumeTitle;
        this.noticeTitle = noticeTitle;
        this.personalName = personalName;
    }

    public int getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(int applicationCode) {
        this.applicationCode = applicationCode;
    }

    public String getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(String isAccepted) {
        this.isAccepted = isAccepted;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getResumeTitle() {
        return resumeTitle;
    }

    public void setResumeTitle(String resumeTitle) {
        this.resumeTitle = resumeTitle;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    @Override
    public String toString() {
        return "CompanyApplyListDTO{" +
                "applicationCode=" + applicationCode +
                ", isAccepted='" + isAccepted + '\'' +
                ", applicationDate=" + applicationDate +
                ", resumeTitle='" + resumeTitle + '\'' +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", personalName='" + personalName + '\'' +
                '}';
    }
}