package com.px.init.resume.model.dto;

/**
 * <pre>
 * Class : QualificationDivDTO
 * Comment : QualificationDivDTO
 * History
 * 2022-10-11 (김주승) 처음 작성
 * </pre>
 *
 * @author 김주승(최초 작성자 명)
 * @version 1
 * @see
 */
public class QualificationDivDTO {

    private int certificateDivCode;
    private String certificateType;
    private String certificateName;

    public QualificationDivDTO() {
    }

    public QualificationDivDTO(int certificateDivCode, String certificateType, String certificateName) {
        this.certificateDivCode = certificateDivCode;
        this.certificateType = certificateType;
        this.certificateName = certificateName;
    }

    public int getCertificateDivCode() {
        return certificateDivCode;
    }

    public void setCertificateDivCode(int certificateDivCode) {
        this.certificateDivCode = certificateDivCode;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    @Override
    public String toString() {
        return "QualificationDivDTO{" +
                "certificateDivCode=" + certificateDivCode +
                ", certificateType='" + certificateType + '\'' +
                ", certificateName='" + certificateName + '\'' +
                '}';
    }
}
