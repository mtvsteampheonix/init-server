package com.px.init.match.model.dto;

/**
 * <pre>
 * Class : Sample
 * Comment : 기업회원 지원자 상세 조회 viewDTO (자기소개서 항목,답안)
 * History
 * 2022-10-13 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see 참고할 class나 외부 url
 */
public class SelfIntroductionAnsweredDTO {
    private String introductionCategory;
    private String answerContent;

    public SelfIntroductionAnsweredDTO() {
    }

    public SelfIntroductionAnsweredDTO(String introductionCategory, String answerContent) {
        this.introductionCategory = introductionCategory;
        this.answerContent = answerContent;
    }

    public String getIntroductionCategory() {
        return introductionCategory;
    }

    public void setIntroductionCategory(String introductionCategory) {
        this.introductionCategory = introductionCategory;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    @Override
    public String toString() {
        return "SelfIntroductionAnsweredDTO{" +
                "introductionCategory='" + introductionCategory + '\'' +
                ", answerContent='" + answerContent + '\'' +
                '}';
    }
}
