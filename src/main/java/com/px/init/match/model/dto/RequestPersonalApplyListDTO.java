package com.px.init.match.model.dto;

/**
 * <pre>
 * Class : Sample
 * Comment : 지원 내역 조회 요청에 필요한 값들을 담는 DTO  클래스
 * History
 * 2022-10-06 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see
 */
public class RequestPersonalApplyListDTO {
    private int memberCode;
    private int page;
    private String criteria;
    private String content;

    public RequestPersonalApplyListDTO() {
    }

    public RequestPersonalApplyListDTO(int memberCode, int page, String criteria, String content) {
        this.memberCode = memberCode;
        this.page = page;
        this.criteria = criteria;
        this.content = content;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
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

    @Override
    public String toString() {
        return "RequestPersonalApplyListDTO{" +
                "memberCode=" + memberCode +
                ", page=" + page +
                ", criteria='" + criteria + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
