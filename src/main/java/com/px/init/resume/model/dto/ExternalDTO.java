package com.px.init.resume.model.dto;

import java.util.Date;

/**
 * <pre>
 * Class : ExternalDTO
 * Comment : ExternalDTO
 * History
 * 2022-10-06 (김주승) 처음 작성
 * </pre>
 *
 * @author 김주승
 * @version 1
 * @see
 */
public class ExternalDTO {

    private int experienceCode;
    private String division;
    private Date startDate;
    private Date endDate;
    private String nation;
    private String institution;
    private String content;
    private int resumeCode;

    public ExternalDTO(){}

    public ExternalDTO(int experienceCode, String division, Date startDate, Date endDate, String nation, String institution, String content, int resumeCode) {
        this.experienceCode = experienceCode;
        this.division = division;
        this.startDate = startDate;
        this.endDate = endDate;
        this.nation = nation;
        this.institution = institution;
        this.content = content;
        this.resumeCode = resumeCode;
    }

    public int getExperienceCode() {
        return experienceCode;
    }

    public void setExperienceCode(int experienceCode) {
        this.experienceCode = experienceCode;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getResumeCode() {
        return resumeCode;
    }

    public void setResumeCode(int resumeCode) {
        this.resumeCode = resumeCode;
    }

    @Override
    public String toString() {
        return "ExternalDTO{" +
                "experienceCode=" + experienceCode +
                ", division='" + division + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", nation='" + nation + '\'' +
                ", institution='" + institution + '\'' +
                ", content='" + content + '\'' +
                ", resumeCode=" + resumeCode +
                '}';
    }
}
