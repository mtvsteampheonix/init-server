package com.px.init.member.model.dto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

public class MemberDTO implements UserDetails {
    private int memberCodePk;
    private String memberId;
    private String memberPw;
    private String pwIsTemp;
    private Date pwChangedDate;
    private Date pwExpirationDate;
    private String memberName;
    private Date signupDate;
    private Date expirationDate;
    private char isExpiration;
    private Date withdrawalDate;
    private char isWithdrawal;
    private int phone;
    private String email;
    private char isEntMember;
    private List<MemberRoleDTO> memberRole;

    public MemberDTO() {
    }

    public MemberDTO(int memberCodePk, String memberId, String memberPw, String pwIsTemp, Date pwChangedDate, Date pwExpirationDate, String memberName, Date signupDate, Date expirationDate, char isExpiration, Date withdrawalDate, char isWithdrawal, int phone, String email, char isEntMember, List<MemberRoleDTO> memberRole, Collection<? extends GrantedAuthority> authorities) {
        this.memberCodePk = memberCodePk;
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.pwIsTemp = pwIsTemp;
        this.pwChangedDate = pwChangedDate;
        this.pwExpirationDate = pwExpirationDate;
        this.memberName = memberName;
        this.signupDate = signupDate;
        this.expirationDate = expirationDate;
        this.isExpiration = isExpiration;
        this.withdrawalDate = withdrawalDate;
        this.isWithdrawal = isWithdrawal;
        this.phone = phone;
        this.email = email;
        this.isEntMember = isEntMember;
        this.memberRole = memberRole;
        this.authorities = authorities;
    }

    public int getMemberCodePk() {
        return memberCodePk;
    }

    public void setMemberCodePk(int memberCodePk) {
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

    public String getPwIsTemp() {
        return pwIsTemp;
    }

    public void setPwIsTemp(String pwIsTemp) {
        this.pwIsTemp = pwIsTemp;
    }

    public Date getPwChangedDate() {
        return pwChangedDate;
    }

    public void setPwChangedDate(Date pwChangedDate) {
        this.pwChangedDate = pwChangedDate;
    }

    public Date getPwExpirationDate() {
        return pwExpirationDate;
    }

    public void setPwExpirationDate(Date pwExpirationDate) {
        this.pwExpirationDate = pwExpirationDate;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Date getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public char getIsExpiration() {
        return isExpiration;
    }

    public void setIsExpiration(char isExpiration) {
        this.isExpiration = isExpiration;
    }

    public Date getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(Date withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }

    public char getIsWithdrawal() {
        return isWithdrawal;
    }

    public void setIsWithdrawal(char isWithdrawal) {
        this.isWithdrawal = isWithdrawal;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getIsEntMember() {
        return isEntMember;
    }

    public void setIsEntMember(char isEntMember) {
        this.isEntMember = isEntMember;
    }
    public List<MemberRoleDTO> getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(List<MemberRoleDTO> memberRole) {
        this.memberRole = memberRole;
    }
    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberCodePk=" + memberCodePk +
                ", memberId='" + memberId + '\'' +
                ", memberPw='" + memberPw + '\'' +
                ", pwIsTemp='" + pwIsTemp + '\'' +
                ", pwChangedDate=" + pwChangedDate +
                ", pwExpirationDate=" + pwExpirationDate +
                ", memberName='" + memberName + '\'' +
                ", signupDate=" + signupDate +
                ", expirationDate=" + expirationDate +
                ", isExpiration=" + isExpiration +
                ", withdrawalDate=" + withdrawalDate +
                ", isWithdrawal=" + isWithdrawal +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", isEntMember=" + isEntMember +
                '}';
    }

    // security를 위한 설정

    private Collection<? extends GrantedAuthority> authorities;

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.memberPw;
    }

    @Override
    public String getUsername() {
        return this.memberId;
    }

    @Override
    public boolean isAccountNonExpired() {
        if(isExpiration == 'Y'){
            return false;
        }
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
