package com.px.init.match.model.dto;

/**
 * <pre>
 * Class : Sample
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-07 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see
 */
public class SelfIntroductionDTO {
    private int selfIntroductionCode;
    private int noticeCode;
    private String selfIntroductionCategory;

    public SelfIntroductionDTO() {
    }

    public SelfIntroductionDTO(int selfIntroductionCode, int noticeCode, String selfIntroductionCategory) {
        this.selfIntroductionCode = selfIntroductionCode;
        this.noticeCode = noticeCode;
        this.selfIntroductionCategory = selfIntroductionCategory;
    }

    public int getSelfIntroductionCode() {
        return selfIntroductionCode;
    }

    public void setSelfIntroductionCode(int selfIntroductionCode) {
        this.selfIntroductionCode = selfIntroductionCode;
    }

    public int getNoticeCode() {
        return noticeCode;
    }

    public void setNoticeCode(int noticeCode) {
        this.noticeCode = noticeCode;
    }

    public String getSelfIntroductionCategory() {
        return selfIntroductionCategory;
    }

    public void setSelfIntroductionCategory(String selfIntroductionCategory) {
        this.selfIntroductionCategory = selfIntroductionCategory;
    }

    @Override
    public String toString() {
        return "SelfIntroductionDTO{" +
                "selfIntroductionCode=" + selfIntroductionCode +
                ", noticeCode=" + noticeCode +
                ", selfIntroductionCategory='" + selfIntroductionCategory + '\'' +
                '}';
    }
}
