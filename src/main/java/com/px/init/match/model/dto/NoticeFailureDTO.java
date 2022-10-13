package com.px.init.match.model.dto;

import java.util.List;

/**
 * <pre>
 * Class : Sample
 * Comment : 개인회원 불합격처리할 jsonbody를 받는 DTO
 * History
 * 2022-10-12 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see 참고할 class나 외부 url
 */
public class NoticeFailureDTO {
    private int noticeCode;
    private List<Integer> applicationCodeList;

    public NoticeFailureDTO() {
    }

    public NoticeFailureDTO(int noticeCode, List<Integer> applicationCodeList) {
        this.noticeCode = noticeCode;
        this.applicationCodeList = applicationCodeList;
    }

    public int getNoticeCode() {
        return noticeCode;
    }

    public void setNoticeCode(int noticeCode) {
        this.noticeCode = noticeCode;
    }

    public List<Integer> getApplicationCodeList() {
        return applicationCodeList;
    }

    public void setApplicationCodeList(List<Integer> applicationCodeList) {
        this.applicationCodeList = applicationCodeList;
    }

    @Override
    public String toString() {
        return "NoticeFailureDTO{" +
                "noticeCode=" + noticeCode +
                ", applicationCodeList=" + applicationCodeList +
                '}';
    }
}
