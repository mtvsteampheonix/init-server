package com.px.init.resume.model.dto;

import java.util.Date;

/**
 * <pre>
 * Class : CoreActivityDTO
 * Comment : 주요 활동 데이터를 담는 DTO
 * History
 * 2022-10-06 (김주승) 처음 작성
 * </pre>
 *
 * @author 김주승
 * @version 1
 * @see
 */
public class CoreActivityDTO {

    private int activityCode;
    private String division;
    private Date startDate;
    private Date endDate;
    private String institutionName;
    private String activityName;
    private String coreActivity;
    private int resumeCode;

    public CoreActivityDTO() {
    }

    public CoreActivityDTO(int activityCode, String division, Date startDate, Date endDate, String institutionName, String activityName, String coreActivity, int resumeCode) {
        this.activityCode = activityCode;
        this.division = division;
        this.startDate = startDate;
        this.endDate = endDate;
        this.institutionName = institutionName;
        this.activityName = activityName;
        this.coreActivity = coreActivity;
        this.resumeCode = resumeCode;
    }

    public int getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(int activityCode) {
        this.activityCode = activityCode;
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

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getCoreActivity() {
        return coreActivity;
    }

    public void setCoreActivity(String coreActivity) {
        this.coreActivity = coreActivity;
    }

    public int getResumeCode() {
        return resumeCode;
    }

    public void setResumeCode(int resumeCode) {
        this.resumeCode = resumeCode;
    }

    @Override
    public String toString() {
        return "CoreActivityDTO{" +
                "activityCode=" + activityCode +
                ", division='" + division + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", institutionName='" + institutionName + '\'' +
                ", activityName='" + activityName + '\'' +
                ", coreActivity='" + coreActivity + '\'' +
                ", resumeCode=" + resumeCode +
                '}';
    }
}
