package com.px.init.jobsearch.model.dto;/*
 * <pre>
 * Class : JobSearchDetailsDTO
 * Comment : 구직공고 상세 페이지 조회시 사용하는 DTO
 * History
 * 2022-10-06(최재혁) 처음 작성
 * </pre>
 * @version 1.0
 * @author 최재혁
 * @see 참고할 class나 외부 url
 *
 */

import java.util.Date;
import java.util.List;

public  class JobSearchDetailsDTO {

    private String comName;//기업명
    private int noticeCodePk;//구직공고코드
    private String title; // 구직공고제목
    private java.util.Date recruitStartDate; //모집시작일
    private java.util.Date recruitEndDate;//모집종료일
    private String career;//경력
    private String education; //학력
    private int skillSortationCode; //기술구분코드
//    private List<String> skillNames;
    private int jobSortationCode; //직무구분코드
//    private List<String> jobNames;
    private int annualIncome; //연봉
    private String entLocation; //근무위치
    private int numEmp;//사원수
    private String comAddress;//기업주소
    private String comUrl;//홈페이지
    private String preference; //우대사항
    private String benefits;//복지사항
    private String content; // 구직공고내용
    private String isClose;//마감여부
    private java.util.Date postStartDate; //게시일
    private java.util.Date postEndDate; //게시종료일
    private int postingTime;//게시시간
    private int companyCodeFk;//기업코드

    public JobSearchDetailsDTO() {
    }

    public JobSearchDetailsDTO(String comName, int noticeCodePk, String title, Date recruitStartDate, Date recruitEndDate, String career, String education, int skillSortationCode, int jobSortationCode, int annualIncome, String entLocation, int numEmp, String comAddress, String comUrl, String preference, String benefits, String content, String isClose, Date postStartDate, Date postEndDate, int postingTime, int companyCodeFk) {
        this.comName = comName;
        this.noticeCodePk = noticeCodePk;
        this.title = title;
        this.recruitStartDate = recruitStartDate;
        this.recruitEndDate = recruitEndDate;
        this.career = career;
        this.education = education;
        this.skillSortationCode = skillSortationCode;
        this.jobSortationCode = jobSortationCode;
        this.annualIncome = annualIncome;
        this.entLocation = entLocation;
        this.numEmp = numEmp;
        this.comAddress = comAddress;
        this.comUrl = comUrl;
        this.preference = preference;
        this.benefits = benefits;
        this.content = content;
        this.isClose = isClose;
        this.postStartDate = postStartDate;
        this.postEndDate = postEndDate;
        this.postingTime = postingTime;
        this.companyCodeFk = companyCodeFk;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public int getNoticeCodePk() {
        return noticeCodePk;
    }

    public void setNoticeCodePk(int noticeCodePk) {
        this.noticeCodePk = noticeCodePk;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
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

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    @Override
    public String toString() {
        return "JobSearchDetailsDTO{" +
                "comName='" + comName + '\'' +
                ", noticeCodePk=" + noticeCodePk +
                ", title='" + title + '\'' +
                ", recruitStartDate=" + recruitStartDate +
                ", recruitEndDate=" + recruitEndDate +
                ", career='" + career + '\'' +
                ", education='" + education + '\'' +
                ", skillSortationCode=" + skillSortationCode +
                ", jobSortationCode=" + jobSortationCode +
                ", annualIncome=" + annualIncome +
                ", entLocation='" + entLocation + '\'' +
                ", numEmp=" + numEmp +
                ", comAddress='" + comAddress + '\'' +
                ", comUrl='" + comUrl + '\'' +
                ", preference='" + preference + '\'' +
                ", benefits='" + benefits + '\'' +
                ", content='" + content + '\'' +
                ", isClose='" + isClose + '\'' +
                ", postStartDate=" + postStartDate +
                ", postEndDate=" + postEndDate +
                ", postingTime=" + postingTime +
                ", companyCodeFk=" + companyCodeFk +
                '}';
    }
}

