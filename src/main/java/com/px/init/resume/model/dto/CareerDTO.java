package com.px.init.resume.model.dto;

import java.util.Date;

/**
 * <pre>
 * Class : CareerDTO
 * Comment : Career 자료를 담을 DTO
 * History
 * 2022-10-06 (김주승) 처음 작성
 * </pre>
 *
 * @author 김주승
 * @version 1
 * @see
 */
public class CareerDTO {

    private Date startDate;
    private Date endDate;
    private String companyName;
    private String nameIsOpened;
    private String position;
    private String status;
    private String task;
    private String etc;
    private String certificate;
    private int resumeCode;
    private int careerCode;

    public CareerDTO() {
    }

    public CareerDTO(Date startDate, Date endDate, String companyName, String nameIsOpened, String position, String status, String task, String etc, String certificate, int resumeCode, int careerCode) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.companyName = companyName;
        this.nameIsOpened = nameIsOpened;
        this.position = position;
        this.status = status;
        this.task = task;
        this.etc = etc;
        this.certificate = certificate;
        this.resumeCode = resumeCode;
        this.careerCode = careerCode;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNameIsOpened() {
        return nameIsOpened;
    }

    public void setNameIsOpened(String nameIsOpened) {
        this.nameIsOpened = nameIsOpened;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public int getResumeCode() {
        return resumeCode;
    }

    public void setResumeCode(int resumeCode) {
        this.resumeCode = resumeCode;
    }

    public int getCareerCode() {
        return careerCode;
    }

    public void setCareerCode(int careerCode) {
        this.careerCode = careerCode;
    }

    @Override
    public String toString() {
        return "CareerDTO{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", companyName='" + companyName + '\'' +
                ", nameIsOpened='" + nameIsOpened + '\'' +
                ", position='" + position + '\'' +
                ", status='" + status + '\'' +
                ", task='" + task + '\'' +
                ", etc='" + etc + '\'' +
                ", certificate='" + certificate + '\'' +
                ", resumeCode=" + resumeCode +
                ", careerCode=" + careerCode +
                '}';
    }
}
