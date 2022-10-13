package com.px.init.member.model.dto;

import com.px.init.company.model.dto.CompanyDTO;

/**
 * <pre>
 * Class : EntMemberDTO
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-12 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할 class나 외부 url
 */
public class EntMemberDTO {
    private int remainingPost;
    private int remainingInquire;
    private Integer companyCodeFk;
    private char isActive;
    private int memberCodeFk;
    private CompanyDTO company;
    public EntMemberDTO() {
    }

    public EntMemberDTO(int remainingPost, int remainingInquire, Integer companyCodeFk, char isActive, int memberCodeFk, CompanyDTO company) {
        this.remainingPost = remainingPost;
        this.remainingInquire = remainingInquire;
        this.companyCodeFk = companyCodeFk;
        this.isActive = isActive;
        this.memberCodeFk = memberCodeFk;
        this.company = company;
    }

    public int getRemainingPost() {
        return remainingPost;
    }

    public void setRemainingPost(int remainingPost) {
        this.remainingPost = remainingPost;
    }

    public int getRemainingInquire() {
        return remainingInquire;
    }

    public void setRemainingInquire(int remainingInquire) {
        this.remainingInquire = remainingInquire;
    }

    public Integer getCompanyCodeFk() {
        return companyCodeFk;
    }

    public void setCompanyCodeFk(Integer companyCodeFk) {
        this.companyCodeFk = companyCodeFk;
    }

    public char getIsActive() {
        return isActive;
    }

    public void setIsActive(char isActive) {
        this.isActive = isActive;
    }

    public int getMemberCodeFk() {
        return memberCodeFk;
    }

    public void setMemberCodeFk(int memberCodeFk) {
        this.memberCodeFk = memberCodeFk;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "EntMemberDTO{" +
                "remainingPost=" + remainingPost +
                ", remainingInquire=" + remainingInquire +
                ", companyCodeFk=" + companyCodeFk +
                ", isActive=" + isActive +
                ", memberCodeFk=" + memberCodeFk +
                ", company=" + company +
                '}';
    }
}
