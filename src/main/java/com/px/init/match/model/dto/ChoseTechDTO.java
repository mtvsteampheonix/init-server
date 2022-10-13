package com.px.init.match.model.dto;

/**
 * <pre>
 * Class : Sample
 * Comment : 기업회원 지원자 상세 조회 viewDTO (보유 기술 답안)
 * History
 * 2022-10-13 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see 참고할 class나 외부 url
 */
public class ChoseTechDTO {
    private String techValue;

    public ChoseTechDTO() {
    }

    public ChoseTechDTO(String techValue) {
        this.techValue = techValue;
    }

    public String getTechValue() {
        return techValue;
    }

    public void setTechValue(String techValue) {
        this.techValue = techValue;
    }

    @Override
    public String toString() {
        return "ChoseTech{" +
                "techValue='" + techValue + '\'' +
                '}';
    }
}
