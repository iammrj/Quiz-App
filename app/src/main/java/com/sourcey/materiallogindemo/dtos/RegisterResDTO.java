package com.sourcey.materiallogindemo.dtos;

/**
 * Created by jilanis on 3/15/2018.
 */

public class RegisterResDTO {
    private Integer status;
    private String message;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
