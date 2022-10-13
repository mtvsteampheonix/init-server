package com.px.init.resume.model.dto;

/**
 * <pre>
 * Class : SkillStackDTO
 * Comment : SkillStackDTO
 * History
 * 2022-10-11 (김주승) 처음 작성
 * </pre>
 *
 * @author 김주승(최초 작성자 명)
 * @version 1
 * @see
 */
public class SkillStackDTO {

    private int techDivCode;
    private String techValue;

    public SkillStackDTO() {
    }

    public SkillStackDTO(int techDivCode, String techValue) {
        this.techDivCode = techDivCode;
        this.techValue = techValue;
    }

    public int getTechDivCode() {
        return techDivCode;
    }

    public void setTechDivCode(int techDivCode) {
        this.techDivCode = techDivCode;
    }

    public String getTechValue() {
        return techValue;
    }

    public void setTechValue(String techValue) {
        this.techValue = techValue;
    }

    @Override
    public String toString() {
        return "SkillStackDTO{" +
                "techDivCode=" + techDivCode +
                ", techValue='" + techValue + '\'' +
                '}';
    }
}
