package com.px.init.resume.model.dto;

import java.util.Date;

public class ResumeDTO {

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

    public ResumeDTO() {
    }

    public ResumeDTO(int resumeCode, String title, String name, String gender, Date birthday, String zipCode, String address, String housePhone, String mobilePhone, String email, String isOpenedPicture, int imageCode, int memberCode) {
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

    @Override
    public String toString() {
        return "ResumeDTO{" +
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
                '}';
    }
}
