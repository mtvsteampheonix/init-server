package com.px.init.match.model.dto;

import java.util.List;

/**
 * <pre>
 * Class : Sample
 * Comment : 기업회원 지원자 상세 조회 viewDTO
 * History
 * 2022-10-13 노재원 처음 작성
 * </pre>
 *
 * @author 노재원(최초 작성자 명)
 * @version 1.0(클래스의 버전)
 * @see 참고할 class나 외부 url
 */
public class CompanyApplyListDetailDTO {
    private int companyCode;
    private String resumeTitle;
    private String personalName;
    private List<PositionDivDTO> positionDivDTO;
    private List<ChoseTechDTO> choseTechDTO;
    private List<SelfIntroductionAnsweredDTO> selfIntroductionAnsweredDTO;

    public CompanyApplyListDetailDTO() {
    }

    public CompanyApplyListDetailDTO(int companyCode, String resumeTitle, String personalName, List<PositionDivDTO> positionDivDTO, List<ChoseTechDTO> choseTechDTO, List<SelfIntroductionAnsweredDTO> selfIntroductionAnsweredDTO) {
        this.companyCode = companyCode;
        this.resumeTitle = resumeTitle;
        this.personalName = personalName;
        this.positionDivDTO = positionDivDTO;
        this.choseTechDTO = choseTechDTO;
        this.selfIntroductionAnsweredDTO = selfIntroductionAnsweredDTO;
    }

    public int getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(int companyCode) {
        this.companyCode = companyCode;
    }

    public String getResumeTitle() {
        return resumeTitle;
    }

    public void setResumeTitle(String resumeTitle) {
        this.resumeTitle = resumeTitle;
    }

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public List<PositionDivDTO> getPositionDivDTO() {
        return positionDivDTO;
    }

    public void setPositionDivDTO(List<PositionDivDTO> positionDivDTO) {
        this.positionDivDTO = positionDivDTO;
    }

    public List<ChoseTechDTO> getChoseTechDTO() {
        return choseTechDTO;
    }

    public void setChoseTechDTO(List<ChoseTechDTO> choseTechDTO) {
        this.choseTechDTO = choseTechDTO;
    }

    public List<SelfIntroductionAnsweredDTO> getSelfIntroductionAnsweredDTO() {
        return selfIntroductionAnsweredDTO;
    }

    public void setSelfIntroductionAnsweredDTO(List<SelfIntroductionAnsweredDTO> selfIntroductionAnsweredDTO) {
        this.selfIntroductionAnsweredDTO = selfIntroductionAnsweredDTO;
    }

    @Override
    public String toString() {
        return "CompanyApplyListDetailDTO{" +
                "companyCode=" + companyCode +
                ", resumeTitle='" + resumeTitle + '\'' +
                ", personalName='" + personalName + '\'' +
                ", positionDivDTO=" + positionDivDTO +
                ", choseTechDTO=" + choseTechDTO +
                ", selfIntroductionAnsweredDTO=" + selfIntroductionAnsweredDTO +
                '}';
    }
}