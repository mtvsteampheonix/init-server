package com.px.init.member.model.dto.request;

/**
 * <pre>
 * Class : PasswordRequestDTO
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-10 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할class나 외부 url
 */
public class PasswordRequestDTO {
    private String memberPw;
    private String changeMemberPw;

    /**
     * Instantiates a new Password request dto.
     */
    public PasswordRequestDTO() {
    }

    /**
     * Instantiates a new Password request dto.
     *
     * @param memberPw       the member pw
     * @param changeMemberPw the change member pw
     */
    public PasswordRequestDTO(String memberPw, String changeMemberPw) {
        this.memberPw = memberPw;
        this.changeMemberPw = changeMemberPw;
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
     * Gets change member pw.
     *
     * @return the change member pw
     */
    public String getChangeMemberPw() {
        return changeMemberPw;
    }

    /**
     * Sets change member pw.
     *
     * @param changeMemberPw the change member pw
     */
    public void setChangeMemberPw(String changeMemberPw) {
        this.changeMemberPw = changeMemberPw;
    }

    @Override
    public String toString() {
        return "PasswordRequestDTO{" +
                "memberPw='" + memberPw + '\'' +
                ", changeMemberPw='" + changeMemberPw + '\'' +
                '}';
    }
}
