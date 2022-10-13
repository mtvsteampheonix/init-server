package com.px.init.resume.model.dto;

/**
 * <pre>
 * Class : DesiredJobDTO
 * Comment : DesiredJobDTO
 * History
 * 2022-10-11 (김주승) 처음 작성
 * </pre>
 *
 * @author 김주승(최초 작성자 명)
 * @version 1
 * @see
 */
public class DesiredJobDTO {

    private int posDivCode;
    private String posValue;

    public DesiredJobDTO() {
    }

    public DesiredJobDTO(int posDivCode, String posValue) {
        this.posDivCode = posDivCode;
        this.posValue = posValue;
    }

    public int getPosDivCode() {
        return posDivCode;
    }

    public void setPosDivCode(int posDivCode) {
        this.posDivCode = posDivCode;
    }

    public String getPosValue() {
        return posValue;
    }

    public void setPosValue(String posValue) {
        this.posValue = posValue;
    }

    @Override
    public String toString() {
        return "DesiredJobDTO{" +
                "posDivCode=" + posDivCode +
                ", posValue='" + posValue + '\'' +
                '}';
    }
}
