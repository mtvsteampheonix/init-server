package com.px.init.jobsearch.model.dto;/*
 * <pre>
 * Class : SelfIntroDTO
 * Comment : 자기소개서 항목을 가지고 있는 DTO
 * History
 * 2022-10-10(최재혁) 처음 작성
 * </pre>
 * @version 1.0
 * @author 최재혁
 * @see 참고할 class나 외부 url
 *
 */

public  class SelfIntroDTO {
    private int noticeCodeFk;
    private String selfIntroductionCategory;


    public SelfIntroDTO() {
    }

    public SelfIntroDTO(int noticeCodeFk, String selfIntroductionCategory) {
        this.noticeCodeFk = noticeCodeFk;
        this.selfIntroductionCategory = selfIntroductionCategory;
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
        return "SelfIntroDTO{" +
                "noticeCodeFk=" + noticeCodeFk +
                ", selfIntroductionCategory='" + selfIntroductionCategory + '\'' +
                '}';
    }
}
