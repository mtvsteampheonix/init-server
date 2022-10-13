package com.px.init.match.model.dto;

/**
 * <pre>
 * Class : Sample
 * Comment : 기업 정보 viewDTO
 * History
 * 2022-10-13 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see 참고할 class나 외부 url
 */
public class CompanyInformationDTO {
    private int companyCode;
    private int numEmp;
    private String comAddress;
    private int avgSalary;
    private String benefits;
    private String comIntro;
    private String comName;
    private String repName;
    private int registNumber;
    private String comUrl;
    private String isDelete;
    private String isRevealed;
    private String isApproved;
    private String phone;

    public CompanyInformationDTO() {
    }

    public CompanyInformationDTO(int companyCode, int numEmp, String comAddress, int avgSalary, String benefits, String comIntro, String comName, String repName, int registNumber, String comUrl, String isDelete, String isRevealed, String isApproved, String phone) {
        this.companyCode = companyCode;
        this.numEmp = numEmp;
        this.comAddress = comAddress;
        this.avgSalary = avgSalary;
        this.benefits = benefits;
        this.comIntro = comIntro;
        this.comName = comName;
        this.repName = repName;
        this.registNumber = registNumber;
        this.comUrl = comUrl;
        this.isDelete = isDelete;
        this.isRevealed = isRevealed;
        this.isApproved = isApproved;
        this.phone = phone;
    }

    public int getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(int companyCode) {
        this.companyCode = companyCode;
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

    public int getAvgSalary() {
        return avgSalary;
    }

    public void setAvgSalary(int avgSalary) {
        this.avgSalary = avgSalary;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getComIntro() {
        return comIntro;
    }

    public void setComIntro(String comIntro) {
        this.comIntro = comIntro;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public int getRegistNumber() {
        return registNumber;
    }

    public void setRegistNumber(int registNumber) {
        this.registNumber = registNumber;
    }

    public String getComUrl() {
        return comUrl;
    }

    public void setComUrl(String comUrl) {
        this.comUrl = comUrl;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getIsRevealed() {
        return isRevealed;
    }

    public void setIsRevealed(String isRevealed) {
        this.isRevealed = isRevealed;
    }

    public String getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(String isApproved) {
        this.isApproved = isApproved;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CompanyInformationDTO{" +
                "companyCode=" + companyCode +
                ", numEmp=" + numEmp +
                ", comAddress='" + comAddress + '\'' +
                ", avgSalary=" + avgSalary +
                ", benefits='" + benefits + '\'' +
                ", comIntro='" + comIntro + '\'' +
                ", comName='" + comName + '\'' +
                ", repName='" + repName + '\'' +
                ", registNumber=" + registNumber +
                ", comUrl='" + comUrl + '\'' +
                ", isDelete='" + isDelete + '\'' +
                ", isRevealed='" + isRevealed + '\'' +
                ", isApproved='" + isApproved + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}