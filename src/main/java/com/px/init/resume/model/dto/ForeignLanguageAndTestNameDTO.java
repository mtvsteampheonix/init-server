package com.px.init.resume.model.dto;

import java.util.Date;

/**
 * <pre>
 * Class : ForeignLanguageAndTestNameDTO
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-13 (김주승) 처음 작성
 * </pre>
 *
 * @author 김주승(최초 작성자 명)
 * @version 2(클래스의 버전)
 * @see 참고할 class나 외부 url
 */
public class ForeignLanguageAndTestNameDTO {

    private int abilityCode;
    private String grade;
    private Date examDate;
    private int resumeCode;
    private int testDivCode;
    private String testName;

    public ForeignLanguageAndTestNameDTO(){}

    public ForeignLanguageAndTestNameDTO(int abilityCode, String grade, Date examDate, int resumeCode, int testDivCode, String testName) {
        this.abilityCode = abilityCode;
        this.grade = grade;
        this.examDate = examDate;
        this.resumeCode = resumeCode;
        this.testDivCode = testDivCode;
        this.testName = testName;
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

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    @Override
    public String toString() {
        return "ForeignLanguageAndTestNameDTO{" +
                "abilityCode=" + abilityCode +
                ", grade='" + grade + '\'' +
                ", examDate=" + examDate +
                ", resumeCode=" + resumeCode +
                ", testDivCode=" + testDivCode +
                ", testName='" + testName + '\'' +
                '}';
    }
}
