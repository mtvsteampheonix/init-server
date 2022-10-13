package com.px.init.member.model.dto;

import java.sql.Date;

/**
 * <pre>
 * Class : CompanyMemberDTO
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-11 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할class나외부 url
 */
public class CompanyMemberDTO {
    private Integer memberCodePk;
    private String memberId;
    private String memberPw;
    private String memberName;
    private String email;
    private String phone;
    private int registNumber;
    private String comName;
    private String comUrl;
    private java.sql.Date signupDate;
    private EntMemberDTO entMember;

    public CompanyMemberDTO() {
    }

    public CompanyMemberDTO(Integer memberCodePk, String memberId, String memberPw, String memberName, String email, String phone, int registNumber, String comName, String comUrl, Date signupDate, EntMemberDTO entMember) {
        this.memberCodePk = memberCodePk;
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberName = memberName;
        this.email = email;
        this.phone = phone;
        this.registNumber = registNumber;
        this.comName = comName;
        this.comUrl = comUrl;
        this.signupDate = signupDate;
        this.entMember = entMember;
    }

    public Integer getMemberCodePk() {
        return memberCodePk;
    }

    public void setMemberCodePk(Integer memberCodePk) {
        this.memberCodePk = memberCodePk;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRegistNumber() {
        return registNumber;
    }

    public void setRegistNumber(int registNumber) {
        this.registNumber = registNumber;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComUrl() {
        return comUrl;
    }

    public void setComUrl(String comUrl) {
        this.comUrl = comUrl;
    }

    public Date getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }

    public EntMemberDTO getEntMember() {
        return entMember;
    }

    public void setEntMember(EntMemberDTO entMember) {
        this.entMember = entMember;
    }

    @Override
    public String toString() {
        return "CompanyMemberDTO{" +
                "memberCodePk='" + memberCodePk + '\'' +
                ", memberId='" + memberId + '\'' +
                ", memberPw='" + memberPw + '\'' +
                ", memberName='" + memberName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", registNumber='" + registNumber + '\'' +
                ", comName='" + comName + '\'' +
                ", comUrl='" + comUrl + '\'' +
                ", signupDate=" + signupDate +
                ", entMember=" + entMember +
                '}';
    }
}
