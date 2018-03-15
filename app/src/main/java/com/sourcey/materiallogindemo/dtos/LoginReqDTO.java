package com.sourcey.materiallogindemo.dtos;

/**
 * Created by jilanis on 3/15/2018.
 */

public class LoginReqDTO {
    private String uname;
    private String password;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
