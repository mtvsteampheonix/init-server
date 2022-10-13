package com.px.init.jobsearch.model.dto;/*
 * <pre>
 * Class : QuestionDTO
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-13(최재혁) 처음 작성
 * </pre>
 * @version 1.0
 * @author 최재혁
 * @see 참고할 class나 외부 url
 *
 */

public class QuestionDTO {
    private int selfIntroductionCodePk;
    private int noticeCodeFk;
    private String selfIntroductionCategory;

    public QuestionDTO() {
    }

    public QuestionDTO(int selfIntroductionCodePk, int noticeCodeFk, String selfIntroductionCategory) {
        this.selfIntroductionCodePk = selfIntroductionCodePk;
        this.noticeCodeFk = noticeCodeFk;
        this.selfIntroductionCategory = selfIntroductionCategory;
    }

    public int getSelfIntroductionCodePk() {
        return selfIntroductionCodePk;
    }

    public void setSelfIntroductionCodePk(int selfIntroductionCodePk) {
        this.selfIntroductionCodePk = selfIntroductionCodePk;
    }

    public int getNoticeCodeFk() {
        return noticeCodeFk;
    }

    public void setNoticeCodeFk(int noticeCodeFk) {
        this.noticeCodeFk = noticeCodeFk;
    }

    public String getSelfIntroductionCategory() {
        return selfIntroductionCategory;
    }

    public void setSelfIntroductionCategory(String selfIntroductionCategory) {
        this.selfIntroductionCategory = selfIntroductionCategory;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "selfIntroductionCodePk=" + selfIntroductionCodePk +
                ", noticeCodeFk=" + noticeCodeFk +
                ", selfIntroductionCategory='" + selfIntroductionCategory + '\'' +
                '}';
    }
}
