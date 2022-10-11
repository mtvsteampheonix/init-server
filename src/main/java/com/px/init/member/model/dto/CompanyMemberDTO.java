package com.px.init.member.model.dto;

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
    private String memberId;
    private String memberPw;
    private String memberName;
    private String email;
    private String phone;
    private String registNumber;
    private String comName;
    private String comUrl;

    /**
     * Instantiates a new Company member dto.
     */
    public CompanyMemberDTO() {
    }

    /**
     * Instantiates a new Company member dto.
     *
     * @param memberId     the member id
     * @param memberPw     the member pw
     * @param memberName   the member name
     * @param email        the email
     * @param phone        the phone
     * @param registNumber the regist number
     * @param comName      the com name
     * @param comUrl       the com url
     */
    public CompanyMemberDTO(String memberId, String memberPw, String memberName, String email, String phone, String registNumber, String comName, String comUrl) {
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberName = memberName;
        this.email = email;
        this.phone = phone;
        this.registNumber = registNumber;
        this.comName = comName;
        this.comUrl = comUrl;
    }

    /**
     * Gets member id.
     *
     * @return the member id
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * Sets member id.
     *
     * @param memberId the member id
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * Gets member pw.
     *
     * @return the member pw
     */
    public String getMemberPw() {
        return memberPw;
    }

    /**
     * Sets member pw.
     *
     * @param memberPw the member pw
     */
    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    /**
     * Gets member name.
     *
     * @return the member name
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * Sets member name.
     *
     * @param memberName the member name
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets regist number.
     *
     * @return the regist number
     */
    public String getRegistNumber() {
        return registNumber;
    }

    /**
     * Sets regist number.
     *
     * @param registNumber the regist number
     */
    public void setRegistNumber(String registNumber) {
        this.registNumber = registNumber;
    }

    /**
     * Gets com name.
     *
     * @return the com name
     */
    public String getComName() {
        return comName;
    }

    /**
     * Sets com name.
     *
     * @param comName the com name
     */
    public void setComName(String comName) {
        this.comName = comName;
    }

    /**
     * Gets com url.
     *
     * @return the com url
     */
    public String getComUrl() {
        return comUrl;
    }

    /**
     * Sets com url.
     *
     * @param comUrl the com url
     */
    public void setComUrl(String comUrl) {
        this.comUrl = comUrl;
    }

    @Override
    public String toString() {
        return "CompanyMemberDTO{" +
                "memberId='" + memberId + '\'' +
                ", memberPw='" + memberPw + '\'' +
                ", memberName='" + memberName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", registNumber=" + registNumber +
                ", comName='" + comName + '\'' +
                ", comUrl='" + comUrl + '\'' +
                '}';
    }
}
