package com.px.init.jobsearch.model.dto;/*
 * <pre>
 * Class : PostiDTO
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-14(최재혁) 처음 작성
 * </pre>
 * @version 1.0
 * @author 최재혁
 * @see 참고할 class나 외부 url
 *
 */

import java.util.Date;

public class PostDTO {
    private int noticeCode;
    private java.util.Date postStartDate;
    private java.util.Date postEndDate;


    public PostDTO() {
    }

    public PostDTO(int noticeCode, Date postStartDate, Date postEndDate) {
        this.noticeCode = noticeCode;
        this.postStartDate = postStartDate;
        this.postEndDate = postEndDate;
    }

    public int getNoticeCode() {
        return noticeCode;
    }

    public void setNoticeCode(int noticeCode) {
        this.noticeCode = noticeCode;
    }

    public Date getPostStartDate() {
        return postStartDate;
    }

    public void setPostStartDate(Date postStartDate) {
        this.postStartDate = postStartDate;
    }

    public Date getPostEndDate() {
        return postEndDate;
    }

    public void setPostEndDate(Date postEndDate) {
        this.postEndDate = postEndDate;
    }

    @Override
    public String toString() {
        return "PostDTO{" +
                "noticeCode=" + noticeCode +
                ", postStartDate=" + postStartDate +
                ", postEndDate=" + postEndDate +
                '}';
    }
}
