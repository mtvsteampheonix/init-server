package com.px.init.resume.model.dto;

import java.util.Date;

/**
 * <pre>
 * Class : QualificationDTO
 * Comment : QualificationDTO
 * History
 * 2022-10-06 (김주승) 처음 작성
 * </pre>
 *
 * @author 김주승(최초 작성자 명)
 * @version 1
 * @see
 */
public class QualificationDTO {
    private int certificateCode;
    private String institution;
    private Date acquisitionDate;
    private int resumeCode;
    private int certificateDivCode;

    public QualificationDTO(){}

    public QualificationDTO(int certificateCode, String institution, Date acquisitionDate, int resumeCode, int certificateDivCode) {
        this.certificateCode = certificateCode;
        this.institution = institution;
        this.acquisitionDate = acquisitionDate;
        this.resumeCode = resumeCode;
        this.certificateDivCode = certificateDivCode;
    }

    public int getCertificateCode() {
        return certificateCode;
    }

    public void setCertificateCode(int certificateCode) {
        this.certificateCode = certificateCode;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public int getResumeCode() {
        return resumeCode;
    }

    public void setResumeCode(int resumeCode) {
        this.resumeCode = resumeCode;
    }

    public int getCertificateDivCode() {
        return certificateDivCode;
    }

    public void setCertificateDivCode(int certificateDivCode) {
        this.certificateDivCode = certificateDivCode;
    }

    @Override
    public String toString() {
        return "QualificationDTO{" +
                "certificateCode=" + certificateCode +
                ", institution='" + institution + '\'' +
                ", acquisitionDate=" + acquisitionDate +
                ", resumeCode=" + resumeCode +
                ", certificateDivCode=" + certificateDivCode +
                '}';
    }
}
