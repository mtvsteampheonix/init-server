package com.px.init.member.model.dto;

/**
 * <pre>
 * Class : PersonalFormData
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-09 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할class나 외부 url
 */
public class DefaultMemberDTO {
    private String memberId;
    private String memberPw;
    private String memberName;
    private String email;
    private String phone;

    public DefaultMemberDTO() {
    }

    public DefaultMemberDTO(String memberId, String memberPw, String memberName, String email, String phone) {
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberName = memberName;
        this.email = email;
        this.phone = phone;
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

    @Override
    public String toString() {
        return "PersonalFormDataDTO{" +
                "memberId='" + memberId + '\'' +
                ", memberPw='" + memberPw + '\'' +
                ", memberName='" + memberName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
