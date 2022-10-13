package com.px.init.resume.model.dto;

/**
 * <pre>
 * Class : ResumeCodeAndTitleDTO
 * Comment : 이력서 코드와 이력서 값을 가져오기 위한 DTO
 * History
 * 2022-10-12 (김주승) 처음 작성
 * </pre>
 *
 * @author 김주승(최초 작성자 명)
 * @version 1
 * @see
 */
public class ResumeCodeAndTitleDTO {

    private int resumeCode;
    private String title;

    public ResumeCodeAndTitleDTO(){}

    public ResumeCodeAndTitleDTO(int resumeCode, String title) {
        this.resumeCode = resumeCode;
        this.title = title;
    }

    public int getResumeCode() {
        return resumeCode;
    }

    public void setResumeCode(int resumeCode) {
        this.resumeCode = resumeCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ResumeCodeAndTitleDTO{" +
                "resumeCode=" + resumeCode +
                ", title='" + title + '\'' +
                '}';
    }
}
