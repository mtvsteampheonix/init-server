package com.px.init.resume.model.dto;

import java.util.Date;

public class SchoolDTO {

    private String schoolDivision;
    private String schoolName;
    private Date schoolStartDate;
    private Date schoolEndDate;
    private String major;
    private String totalScore;
    private String recordedScore;
    private String schoolStatus;

    private int resumeCode;

    public SchoolDTO() {
    }

    public SchoolDTO(String schoolDivision, String schoolName, Date schoolStartDate, Date schoolEndDate, String major, String totalScore, String recordedScore, String schoolStatus, int resumeCode) {
        this.schoolDivision = schoolDivision;
        this.schoolName = schoolName;
        this.schoolStartDate = schoolStartDate;
        this.schoolEndDate = schoolEndDate;
        this.major = major;
        this.totalScore = totalScore;
        this.recordedScore = recordedScore;
        this.schoolStatus = schoolStatus;
        this.resumeCode = resumeCode;
    }

    public String getSchoolDivision() {
        return schoolDivision;
    }

    public void setSchoolDivision(String schoolDivision) {
        this.schoolDivision = schoolDivision;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Date getSchoolStartDate() {
        return schoolStartDate;
    }

    public void setSchoolStartDate(Date schoolStartDate) {
        this.schoolStartDate = schoolStartDate;
    }

    public Date getSchoolEndDate() {
        return schoolEndDate;
    }

    public void setSchoolEndDate(Date schoolEndDate) {
        this.schoolEndDate = schoolEndDate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }

    public String getRecordedScore() {
        return recordedScore;
    }

    public void setRecordedScore(String recordedScore) {
        this.recordedScore = recordedScore;
    }

    public String getSchoolStatus() {
        return schoolStatus;
    }

    public void setSchoolStatus(String schoolStatus) {
        this.schoolStatus = schoolStatus;
    }

    public int getResumeCode() {
        return resumeCode;
    }

    public void setResumeCode(int resumeCode) {
        this.resumeCode = resumeCode;
    }

    @Override
    public String toString() {
        return "SchoolDTO{" +
                "schoolDivision='" + schoolDivision + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", schoolStartDate=" + schoolStartDate +
                ", schoolEndDate=" + schoolEndDate +
                ", major='" + major + '\'' +
                ", totalScore='" + totalScore + '\'' +
                ", recordedScore='" + recordedScore + '\'' +
                ", schoolStatus='" + schoolStatus + '\'' +
                ", resumeCode=" + resumeCode +
                '}';
    }
}
