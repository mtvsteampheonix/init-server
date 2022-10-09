package com.px.init.member.model.dto.request;

/**
 * <pre>
 * Class : updatePersonalDTO
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-10 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할class나 외부 url
 */
public class UpdatePersonalRequestDTO {
    private String memberPw;
    private String memberName;
    private String phone;

    /**
     * Instantiates a new Update personal request dto.
     */
    public UpdatePersonalRequestDTO() {
    }

    /**
     * Instantiates a new Update personal request dto.
     *
     * @param memberPw   the member pw
     * @param memberName the member name
     * @param phone      the phone
     */
    public UpdatePersonalRequestDTO(String memberPw, String memberName, String phone) {
        this.memberPw = memberPw;
        this.memberName = memberName;
        this.phone = phone;
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

    @Override
    public String toString() {
        return "updatePersonalDTO{" +
                "memberPw='" + memberPw + '\'' +
                ", memberName='" + memberName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
