package com.px.init.match.model.dto;

/**
 * <pre>
 * Class : Sample
 * Comment : PositionDiv 테이블
 * History
 * 2022-10-11 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see 참고할 class나 외부 url
 */
public class PositionDivDTO {
    private int posDivCode;
    private String rsmValue;

    public PositionDivDTO() {
    }

    public PositionDivDTO(int posDivCode, String rsmValue) {
        posDivCode = posDivCode;
        this.rsmValue = rsmValue;
    }

    public int getPosDivCode() {
        return posDivCode;
    }

    public void setPosDivCode(int posDivCode) {
        posDivCode = posDivCode;
    }

    public String getRsmValue() {
        return rsmValue;
    }

    public void setRsmValue(String rsmValue) {
        this.rsmValue = rsmValue;
    }

    @Override
    public String toString() {
        return "PositionDivDTO{" +
                "PosDivCode=" + posDivCode +
                ", rsmValue='" + rsmValue + '\'' +
                '}';
    }
}
