package com.px.init.admin.model.dto;

/**
 * <pre>
 * Class : isActiveDTO
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-13 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할 class나 외부 url
 */
public class IsActiveDTO {
    private int memberCodePk;
    private char isActive;

    public IsActiveDTO() {
    }

    public IsActiveDTO(int memberCodePk, char isActive) {
        this.memberCodePk = memberCodePk;
        this.isActive = isActive;
    }

    public int getMemberCodePk() {
        return memberCodePk;
    }

    public void setMemberCodePk(int memberCodePk) {
        this.memberCodePk = memberCodePk;
    }

    public char getIsActive() {
        return isActive;
    }

    public void setIsActive(char isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "IsActiveDTO{" +
                "memberCodePk=" + memberCodePk +
                ", isActive=" + isActive +
                '}';
    }
}
