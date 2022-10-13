package com.px.init.resume.model.dto;

/**
 * <pre>
 * Class : ForeignLanguageTestDTO
 * Comment : ForeignLanguageTestDTO
 * History
 * 2022-10-11 (김주승) 처음 작성
 * </pre>
 *
 * @author 김주승(최초 작성자 명)
 * @version 1
 * @see
 */
public class ForeignLanguageTestDTO {

    private int testCode;
    private String language;
    private String testTitle;

    public ForeignLanguageTestDTO(){}

    public ForeignLanguageTestDTO(int testCode, String language, String testTitle) {
        this.testCode = testCode;
        this.language = language;
        this.testTitle = testTitle;
    }

    public int getTestCode() {
        return testCode;
    }

    public void setTestCode(int testCode) {
        this.testCode = testCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTestTitle() {
        return testTitle;
    }

    public void setTestTitle(String testTitle) {
        this.testTitle = testTitle;
    }

    @Override
    public String toString() {
        return "ForeignLanguageTestDTO{" +
                "testCode=" + testCode +
                ", language='" + language + '\'' +
                ", testTitle='" + testTitle + '\'' +
                '}';
    }
}
