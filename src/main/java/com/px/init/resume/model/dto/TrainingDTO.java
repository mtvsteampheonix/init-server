package com.px.init.resume.model.dto;

import java.util.Date;

/**
 * <pre>
 * Class : TrainingDTO
 * Comment : TrainingDTO
 * History
 * 2022-10-06 (김주승) 처음 작성
 * </pre>
 *
 * @author 김주승(최초 작성자 명)
 * @version 1
 * @see
 */
public class TrainingDTO {
    private int trainingCode;
    private Date startDate;
    private Date endDate;
    private String institution;
    private String course;
    private String content;
    private int resumeCode;

    public TrainingDTO(){}

    public TrainingDTO(int trainingCode, Date startDate, Date endDate, String institution, String course, String content, int resumeCode) {
        this.trainingCode = trainingCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.institution = institution;
        this.course = course;
        this.content = content;
        this.resumeCode = resumeCode;
    }

    public int getTrainingCode() {
        return trainingCode;
    }

    public void setTrainingCode(int trainingCode) {
        this.trainingCode = trainingCode;
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

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
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
        return "TrainingDTO{" +
                "trainingCode=" + trainingCode +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", institution='" + institution + '\'' +
                ", course='" + course + '\'' +
                ", content='" + content + '\'' +
                ", resumeCode=" + resumeCode +
                '}';
    }
}

