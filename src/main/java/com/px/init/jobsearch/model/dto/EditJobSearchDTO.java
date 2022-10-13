package com.px.init.jobsearch.model.dto;/*
 * <pre>
 * Class : RegistJobSearchDTO
 * Comment : 기업회원이, 마이페이지에서 구직공고를 등록할 때 사용하는 DTO
 * History
 * 2022-10-10(최재혁) 처음 작성
 * </pre>
 * @version 1.0
 * @author 최재혁
 * @see 참고할 class나 외부 url
 *
 */
import java.util.Date;
import java.util.List;

public class EditJobSearchDTO {
    private int noticeCodePk; //구직공고코드
    private String title;//구직공고제목
    private String content;// 구직공고 내용
    private String education; //학력
    private String career;//경력
    private String preference;//우대사항
    //skill_sortation_code
    //job_sortation_code
    private int annualIncome;//연봉
    private String entLocation;//근무지위치
    private Date recruitStartDate; //모집시작일
    private Date recruitEndDate; //모집종료일
    private int companyCodeFk; //기업코드 이거 어떻게 넣어줘야해 따로??
    private List<QuestionDTO> selfIntroList; //자기소개서 등록할 dto
    private int employees;
    private String benefits;

    public EditJobSearchDTO() {
    }

    public EditJobSearchDTO(int noticeCodePk, String title, String content, String education, String career, String preference, int annualIncome, String entLocation, Date recruitStartDate, Date recruitEndDate, int companyCodeFk, List<QuestionDTO> selfIntroList, int employees, String benefits) {

        this.noticeCodePk = noticeCodePk;
        this.title = title;
        this.content = content;
        this.education = education;
        this.career = career;
        this.preference = preference;
        this.annualIncome = annualIncome;
        this.entLocation = entLocation;
        this.recruitStartDate = recruitStartDate;
        this.recruitEndDate = recruitEndDate;
        this.companyCodeFk = companyCodeFk;
        this.selfIntroList = selfIntroList;
        this.employees = employees;
        this.benefits = benefits;
    }

    public int getNoticeCodePk() {
        return noticeCodePk;
    }

    public void setNoticeCodePk(int noticeCodePk) {
        this.noticeCodePk = noticeCodePk;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getEntLocation() {
        return entLocation;
    }

    public void setEntLocation(String entLocation) {
        this.entLocation = entLocation;
    }

    public Date getRecruitStartDate() {
        return recruitStartDate;
    }

    public void setRecruitStartDate(Date recruitStartDate) {
        this.recruitStartDate = recruitStartDate;
    }

    public Date getRecruitEndDate() {
        return recruitEndDate;
    }

    public void setRecruitEndDate(Date recruitEndDate) {
        this.recruitEndDate = recruitEndDate;
    }

    public int getCompanyCodeFk() {
        return companyCodeFk;
    }

    public void setCompanyCodeFk(int companyCodeFk) {
        this.companyCodeFk = companyCodeFk;
    }

    public List<QuestionDTO> getSelfIntroList() {
        return selfIntroList;
    }

    public void setSelfIntroList(List<QuestionDTO> selfIntroList) {
        this.selfIntroList = selfIntroList;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    @Override
    public String toString() {
        return "EditJobSearchDTO{" +
                "noticeCodePk=" + noticeCodePk +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", education='" + education + '\'' +
                ", career='" + career + '\'' +
                ", preference='" + preference + '\'' +
                ", annualIncome=" + annualIncome +
                ", entLocation='" + entLocation + '\'' +
                ", recruitStartDate=" + recruitStartDate +
                ", recruitEndDate=" + recruitEndDate +
                ", companyCodeFk=" + companyCodeFk +
                ", selfIntroList=" + selfIntroList +
                ", employees=" + employees +
                ", benefits='" + benefits + '\'' +
                '}';
    }
}