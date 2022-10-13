package com.px.init.match.model.dto;

import java.util.List;

/**
 * <pre>
 * Class : Sample
 * Comment : chosePosition 기능 테이블
 * History
 * 2022-10-11 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see 참고할 class나 외부 url
 */
public class ChosePositionDTO {
    private int resumeCode;
    private int posDivCode;

    public ChosePositionDTO() {
    }

    public ChosePositionDTO(int resumeCode, int posDivCode) {
        this.resumeCode = resumeCode;
        this.posDivCode = posDivCode;
    }

    public int getResumeCode() {
        return resumeCode;
    }

    public void setResumeCode(int resumeCode) {
        this.resumeCode = resumeCode;
    }

    public int getPosDivCode() {
        return posDivCode;
    }

    public void setPosDivCode(int posDivCode) {
        this.posDivCode = posDivCode;
    }

    @Override
    public String toString() {
        return "ChosePositionDTO{" +
                "resumeCode=" + resumeCode +
                ", posDivCode=" + posDivCode +
                '}';
    }
}