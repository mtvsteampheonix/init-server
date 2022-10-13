package com.px.init.match.model.dto;

import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * Class : Sample
 * Comment : 기업회원의 지원자 목록 조회에 필요한 RequestDTO
 * History
 * 2022-10-11 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see
 */
public class CompanyRequestApplyListDTO {
    private int noticeCode;
    private int page;
    private String criteria;
    private String content;
    private String isAccepted;
    private List<String> career;

    public CompanyRequestApplyListDTO() {
    }

    public CompanyRequestApplyListDTO(int noticeCode, int page, String criteria, String content, String isAccepted, List<String> career) {
        this.noticeCode = noticeCode;
        this.page = page;
        this.criteria = criteria;
        this.content = content;
        this.isAccepted = isAccepted;
        this.career = career;
    }

    public int getNoticeCode() {
        return noticeCode;
    }

    public void setNoticeCode(int noticeCode) {
        this.noticeCode = noticeCode;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(String isAccepted) {
        this.isAccepted = isAccepted;
    }

    public List<String> getCareer() {
        return career;
    }

    public void setCareer(List<String> career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "CompanyRequestApplyListDTO{" +
                "noticeCode=" + noticeCode +
                ", page=" + page +
                ", criteria='" + criteria + '\'' +
                ", content='" + content + '\'' +
                ", isAccepted='" + isAccepted + '\'' +
                ", career=" + career +
                '}';
    }
}