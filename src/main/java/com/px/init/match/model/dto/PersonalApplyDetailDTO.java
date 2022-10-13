package com.px.init.match.model.dto;

import java.sql.Date;
import java.util.List;
/**
 * <pre>
 * Class : Sample
 * Comment : 개인회원 지원 상세보기 view DTO
 * History
 * 2022-10-12 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see 참고할 class나 외부 url
 */
public class PersonalApplyDetailDTO {
    private String comName;
    private String title;
    private String comUrl;
    private List<SelfIntroductionDTO> selfIntroductionDTOList;
    private String resumeTitle;
    private String portfolioTitle;
    private java.sql.Date applicationDate;
    private String isAccepted;

    public PersonalApplyDetailDTO() {
    }

    public PersonalApplyDetailDTO(String comName, String title, String comUrl, List<SelfIntroductionDTO> selfIntroductionDTOList, String resumeTitle, String portfolioTitle, Date applicationDate, String isAccepted) {
        this.comName = comName;
        this.title = title;
        this.comUrl = comUrl;
        this.selfIntroductionDTOList = selfIntroductionDTOList;
        this.resumeTitle = resumeTitle;
        this.portfolioTitle = portfolioTitle;
        this.applicationDate = applicationDate;
        this.isAccepted = isAccepted;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComUrl() {
        return comUrl;
    }

    public void setComUrl(String comUrl) {
        this.comUrl = comUrl;
    }

    public List<SelfIntroductionDTO> getSelfIntroductionDTOList() {
        return selfIntroductionDTOList;
    }

    public void setSelfIntroductionDTOList(List<SelfIntroductionDTO> selfIntroductionDTOList) {
        this.selfIntroductionDTOList = selfIntroductionDTOList;
    }

    public String getResumeTitle() {
        return resumeTitle;
    }

    public void setResumeTitle(String resumeTitle) {
        this.resumeTitle = resumeTitle;
    }

    public String getPortfolioTitle() {
        return portfolioTitle;
    }

    public void setPortfolioTitle(String portfolioTitle) {
        this.portfolioTitle = portfolioTitle;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(String isAccepted) {
        this.isAccepted = isAccepted;
    }

    @Override
    public String toString() {
        return "PersonalApplyDetailDTO{" +
                "comName='" + comName + '\'' +
                ", title='" + title + '\'' +
                ", comUrl='" + comUrl + '\'' +
                ", selfIntroductionDTOList=" + selfIntroductionDTOList +
                ", resumeTitle='" + resumeTitle + '\'' +
                ", portfolioTitle='" + portfolioTitle + '\'' +
                ", applicationDate=" + applicationDate +
                ", isAccepted='" + isAccepted + '\'' +
                '}';
    }
}
