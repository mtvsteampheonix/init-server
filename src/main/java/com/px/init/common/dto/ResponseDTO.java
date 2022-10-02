package com.px.init.common.dto;

import org.springframework.http.HttpStatus;

public class ResponseDTO {

    private int status;
    private String messgae;
    private Object data;

    public ResponseDTO(HttpStatus status, String messgae, Object data) {
        this.status = status.value();
        this.messgae = messgae;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessgae() {
        return messgae;
    }

    public void setMessgae(String messgae) {
        this.messgae = messgae;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "status=" + status +
                ", messgae='" + messgae + '\'' +
                ", data=" + data +
                '}';
    }
}
