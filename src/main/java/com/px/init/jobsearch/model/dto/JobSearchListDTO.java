package com.px.init.jobsearch.model.dto;/*
 * <pre>
 * Class : NoticeListDTO
 * Comment : 구직공고목록을 조회하는 DTO
 * History
 * 2022-10-05(최재혁) 처음 작성
 * </pre>
 * @version 1.0
 * @author 최재혁
 * @see 참고할 class나 외부 url
 *
 */

import org.springframework.http.HttpStatus;

import java.util.Date;
import java.util.List;

public class JobSearchListDTO {
    private String title; // 구직공고제목
    private String content; // 구직공고내용
    private String education; //학력
    private String career;//경력
    private String preference; //우대사항
    private int skillSortationCode; //기술구분코드
    private int jobSortationCode; //직무구분코드
    private int annualIncome; //연봉
    private String entLocation; //근무위치
    private java.util.Date recruitStartDate; //모집시작일
    private java.util.Date recruitEndDate;//모집종료일
    private int applicant;//지원자수
    private String isClose;//마감여부
    private java.util.Date postStartDate; //게시일
    private java.util.Date postEndDate; //게시종료일
    private int postingTime;//게시시간
    private int companyCodeFk;//기업코드
    private int noticeCodePk;//구직공고코드

    private String comName;

    public JobSearchListDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public int getSkillSortationCode() {
        return skillSortationCode;
    }

    public void setSkillSortationCode(int skillSortationCode) {
        this.skillSortationCode = skillSortationCode;
    }

    public int getJobSortationCode() {
        return jobSortationCode;
    }

    public void setJobSortationCode(int jobSortationCode) {
        this.jobSortationCode = jobSortationCode;
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getEntLocation() {
        return entLocation;
    }

    public void setEntLocation(String entLocation) {
        this.entLocation = entLocation;
    }

    public Date getRecruitStartDate() {
        return recruitStartDate;
    }

    public void setRecruitStartDate(Date recruitStartDate) {
        this.recruitStartDate = recruitStartDate;
    }

    public Date getRecruitEndDate() {
        return recruitEndDate;
    }

    public void setRecruitEndDate(Date recruitEndDate) {
        this.recruitEndDate = recruitEndDate;
    }

    public int getApplicant() {
        return applicant;
    }

    public void setApplicant(int applicant) {
        this.applicant = applicant;
    }

    public String getIsClose() {
        return isClose;
    }

    public void setIsClose(String isClose) {
        this.isClose = isClose;
    }

    public Date getPostStartDate() {
        return postStartDate;
    }

    public void setPostStartDate(Date postStartDate) {
        this.postStartDate = postStartDate;
    }

    public Date getPostEndDate() {
        return postEndDate;
    }

    public void setPostEndDate(Date postEndDate) {
        this.postEndDate = postEndDate;
    }

    public int getPostingTime() {
        return postingTime;
    }

    public void setPostingTime(int postingTime) {
        this.postingTime = postingTime;
    }

    public int getCompanyCodeFk() {
        return companyCodeFk;
    }

    public void setCompanyCodeFk(int companyCodeFk) {
        this.companyCodeFk = companyCodeFk;
    }

    public int getNoticeCodePk() {
        return noticeCodePk;
    }

    public void setNoticeCodePk(int noticeCodePk) {
        this.noticeCodePk = noticeCodePk;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    @Override
    public String toString() {
        return "JobSearchListDTO{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", education='" + education + '\'' +
                ", career='" + career + '\'' +
                ", preference='" + preference + '\'' +
                ", skillSortationCode=" + skillSortationCode +
                ", jobSortationCode=" + jobSortationCode +
                ", annualIncome=" + annualIncome +
                ", entLocation='" + entLocation + '\'' +
                ", recruitStartDate=" + recruitStartDate +
                ", recruitEndDate=" + recruitEndDate +
                ", applicant=" + applicant +
                ", isClose='" + isClose + '\'' +
                ", postStartDate=" + postStartDate +
                ", postEndDate=" + postEndDate +
                ", postingTime=" + postingTime +
                ", companyCodeFk=" + companyCodeFk +
                ", noticeCodePk=" + noticeCodePk +
                ", comName='" + comName + '\'' +
                '}';
    }
}
