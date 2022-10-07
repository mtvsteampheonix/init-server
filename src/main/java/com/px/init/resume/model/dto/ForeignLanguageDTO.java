package com.px.init.resume.model.dto;

import java.util.Date;

public class ForeignLanguageDTO {

    private int abilityCode;
    private String grade;
    private Date examDate;
    private int resumeCode;
    private int testDivCode;

    public ForeignLanguageDTO() {
    }

    public ForeignLanguageDTO(int abilityCode, String grade, Date examDate, int resumeCode, int testDivCode) {
        this.abilityCode = abilityCode;
        this.grade = grade;
        this.examDate = examDate;
        this.resumeCode = resumeCode;
        this.testDivCode = testDivCode;
    }

    public int getAbilityCode() {
        return abilityCode;
    }

    public void setAbilityCode(int abilityCode) {
        this.abilityCode = abilityCode;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public int getResumeCode() {
        return resumeCode;
    }

    public void setResumeCode(int resumeCode) {
        this.resumeCode = resumeCode;
    }

    public int getTestDivCode() {
        return testDivCode;
    }

    public void setTestDivCode(int testDivCode) {
        this.testDivCode = testDivCode;
    }

    @Override
    public String toString() {
        return "ForeignLanguageDTO{" +
                "abilityCode=" + abilityCode +
                ", grade='" + grade + '\'' +
                ", examDate=" + examDate +
                ", resumeCode=" + resumeCode +
                ", testDivCode=" + testDivCode +
                '}';
    }
}
