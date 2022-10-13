package com.px.init.company.model.dto;

/**
 * <pre>
 * Class : CompanyDTO
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-12 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할 class나 외부 url
 */
public class CompanyDTO {
    private int companyCodePk;
    private Integer numEmp;
    private String comAddress;
    private Integer avgSalary;
    private String benefits;
    private String comIntro;
    private String comName;
    private String RepName;
    private int registNumber;
    private char isApproved;
    private char isRevealed;
    private String comUrl;

    public CompanyDTO() {
    }

    public CompanyDTO(int companyCodePk, Integer numEmp, String comAddress, Integer avgSalary, String benefits, String comIntro, String comName, String repName, int registNumber, char isApproved, char isRevealed, String comUrl) {
        this.companyCodePk = companyCodePk;
        this.numEmp = numEmp;
        this.comAddress = comAddress;
        this.avgSalary = avgSalary;
        this.benefits = benefits;
        this.comIntro = comIntro;
        this.comName = comName;
        RepName = repName;
        this.registNumber = registNumber;
        this.isApproved = isApproved;
        this.isRevealed = isRevealed;
        this.comUrl = comUrl;
    }

    public int getCompanyCodePk() {
        return companyCodePk;
    }

    public void setCompanyCodePk(int companyCodePk) {
        this.companyCodePk = companyCodePk;
    }

    public Integer getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(Integer numEmp) {
        this.numEmp = numEmp;
    }

    public String getComAddress() {
        return comAddress;
    }

    public void setComAddress(String comAddress) {
        this.comAddress = comAddress;
    }

    public Integer getAvgSalary() {
        return avgSalary;
    }

    public void setAvgSalary(Integer avgSalary) {
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
        return RepName;
    }

    public void setRepName(String repName) {
        RepName = repName;
    }

    public int getRegistNumber() {
        return registNumber;
    }

    public void setRegistNumber(int registNumber) {
        this.registNumber = registNumber;
    }

    public char getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(char isApproved) {
        this.isApproved = isApproved;
    }

    public char getIsRevealed() {
        return isRevealed;
    }

    public void setIsRevealed(char isRevealed) {
        this.isRevealed = isRevealed;
    }

    public String getComUrl() {
        return comUrl;
    }

    public void setComUrl(String comUrl) {
        this.comUrl = comUrl;
    }

    @Override
    public String toString() {
        return "CompanyDTO{" +
                "companyCodePk=" + companyCodePk +
                ", numEmp=" + numEmp +
                ", comAddress='" + comAddress + '\'' +
                ", avgSalary=" + avgSalary +
                ", benefits='" + benefits + '\'' +
                ", comIntro='" + comIntro + '\'' +
                ", comName='" + comName + '\'' +
                ", RepName='" + RepName + '\'' +
                ", registNumber=" + registNumber +
                ", isApproved=" + isApproved +
                ", isRevealed=" + isRevealed +
                ", comUrl='" + comUrl + '\'' +
                '}';
    }
}
