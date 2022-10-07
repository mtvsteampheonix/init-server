package com.px.init.resume.model.dto;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.List;

public class TotalResumeDTO {

    private int resumeCode;
    private String title;
    private String name;
    private String gender;
    private Date birthday;
    private String zipCode;
    private String address;
    private String housePhone;
    private String mobilePhone;
    private String email;
    private String isOpenedPicture;
    private int imageCode;
    private int memberCode;

    // skill stack code
    private int techCode;

    // 희망 직무 코드
    private int hopePosCode;

    // 가져올 리스트
    private List<SchoolDTO> schoolInfoList;
    private List<CareerDTO> careerInfoList;
    private List<CoreActivityDTO> coreActivityInfoList;
    private List<ExternalDTO> externalInfoList;
    private List<ForeignLanguageDTO> foreignLanguageInfoList;
    private List<TrainingDTO> trainingInfoList;
    private List<QualificationDTO> qualificationInfoList;

    public TotalResumeDTO() {
    }

    public TotalResumeDTO(int resumeCode, String title, String name, String gender, Date birthday, String zipCode, String address, String housePhone, String mobilePhone, String email, String isOpenedPicture, int imageCode, int memberCode, int techCode, int hopePosCode, List<SchoolDTO> schoolInfoList, List<CareerDTO> careerInfoList, List<CoreActivityDTO> coreActivityInfoList, List<ExternalDTO> externalInfoList, List<ForeignLanguageDTO> foreignLanguageInfoList, List<TrainingDTO> trainingInfoList, List<QualificationDTO> qualificationInfoList) {
        this.resumeCode = resumeCode;
        this.title = title;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.zipCode = zipCode;
        this.address = address;
        this.housePhone = housePhone;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.isOpenedPicture = isOpenedPicture;
        this.imageCode = imageCode;
        this.memberCode = memberCode;
        this.techCode = techCode;
        this.hopePosCode = hopePosCode;
        this.schoolInfoList = schoolInfoList;
        this.careerInfoList = careerInfoList;
        this.coreActivityInfoList = coreActivityInfoList;
        this.externalInfoList = externalInfoList;
        this.foreignLanguageInfoList = foreignLanguageInfoList;
        this.trainingInfoList = trainingInfoList;
        this.qualificationInfoList = qualificationInfoList;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHousePhone() {
        return housePhone;
    }

    public void setHousePhone(String housePhone) {
        this.housePhone = housePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIsOpenedPicture() {
        return isOpenedPicture;
    }

    public void setIsOpenedPicture(String isOpenedPicture) {
        this.isOpenedPicture = isOpenedPicture;
    }

    public int getImageCode() {
        return imageCode;
    }

    public void setImageCode(int imageCode) {
        this.imageCode = imageCode;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public int getTechCode() {
        return techCode;
    }

    public void setTechCode(int techCode) {
        this.techCode = techCode;
    }

    public int getHopePosCode() {
        return hopePosCode;
    }

    public void setHopePosCode(int hopePosCode) {
        this.hopePosCode = hopePosCode;
    }

    public List<SchoolDTO> getSchoolInfoList() {
        return schoolInfoList;
    }

    public void setSchoolInfoList(List<SchoolDTO> schoolInfoList) {
        this.schoolInfoList = schoolInfoList;
    }

    public List<CareerDTO> getCareerInfoList() {
        return careerInfoList;
    }

    public void setCareerInfoList(List<CareerDTO> careerInfoList) {
        this.careerInfoList = careerInfoList;
    }

    public List<CoreActivityDTO> getCoreActivityInfoList() {
        return coreActivityInfoList;
    }

    public void setCoreActivityInfoList(List<CoreActivityDTO> coreActivityInfoList) {
        this.coreActivityInfoList = coreActivityInfoList;
    }

    public List<ExternalDTO> getExternalInfoList() {
        return externalInfoList;
    }

    public void setExternalInfoList(List<ExternalDTO> externalInfoList) {
        this.externalInfoList = externalInfoList;
    }

    public List<ForeignLanguageDTO> getForeignLanguageInfoList() {
        return foreignLanguageInfoList;
    }

    public void setForeignLanguageInfoList(List<ForeignLanguageDTO> foreignLanguageInfoList) {
        this.foreignLanguageInfoList = foreignLanguageInfoList;
    }

    public List<TrainingDTO> getTrainingInfoList() {
        return trainingInfoList;
    }

    public void setTrainingInfoList(List<TrainingDTO> trainingInfoList) {
        this.trainingInfoList = trainingInfoList;
    }

    public List<QualificationDTO> getQualificationInfoList() {
        return qualificationInfoList;
    }

    public void setQualificationInfoList(List<QualificationDTO> qualificationInfoList) {
        this.qualificationInfoList = qualificationInfoList;
    }

    @Override
    public String toString() {
        return "TotalResumeDTO{" +
                "resumeCode=" + resumeCode +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", zipCode='" + zipCode + '\'' +
                ", address='" + address + '\'' +
                ", housePhone='" + housePhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", email='" + email + '\'' +
                ", isOpenedPicture='" + isOpenedPicture + '\'' +
                ", imageCode=" + imageCode +
                ", memberCode=" + memberCode +
                ", techCode=" + techCode +
                ", hopePosCode=" + hopePosCode +
                ", schoolInfoList=" + schoolInfoList +
                ", careerInfoList=" + careerInfoList +
                ", coreActivityInfoList=" + coreActivityInfoList +
                ", externalInfoList=" + externalInfoList +
                ", foreignLanguageInfoList=" + foreignLanguageInfoList +
                ", trainingInfoList=" + trainingInfoList +
                ", qualificationInfoList=" + qualificationInfoList +
                '}';
    }
}
