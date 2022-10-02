package com.px.init.member.model.dto;

public class MemberRoleDTO {
    private int memberCode;
    private int authorityCode;

    private AuthorityDTO authority;

    public MemberRoleDTO() {
    }

    public MemberRoleDTO(int memberCode, int authorityCode, AuthorityDTO authority) {
        this.memberCode = memberCode;
        this.authorityCode = authorityCode;
        this.authority = authority;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public int getAuthorityCode() {
        return authorityCode;
    }

    public void setAuthorityCode(int authorityCode) {
        this.authorityCode = authorityCode;
    }

    public AuthorityDTO getAuthority() {
        return authority;
    }

    public void setAuthority(AuthorityDTO authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "MemberRoleDTO{" +
                "memberCode=" + memberCode +
                ", authorityCode=" + authorityCode +
                ", authority=" + authority +
                '}';
    }
}
