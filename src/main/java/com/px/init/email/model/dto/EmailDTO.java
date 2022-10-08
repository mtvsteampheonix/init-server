package com.px.init.email.model.dto;

/**
 * <pre>
 * Class : MailDTO
 * Comment : 메일에 관련된 정보를 담을 DTO
 * History
 * 2022-10-07 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 */
public class EmailDTO {
    private String address;
    private String title;
    private String message;

    public EmailDTO(String address, String title, String message) {
        this.address = address;
        this.title = title;
        this.message = message;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "EmailDTO{" +
                "address='" + address + '\'' +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
