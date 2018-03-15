package com.sourcey.materiallogindemo.API;

import com.sourcey.materiallogindemo.dtos.LoginReqDTO;
import com.sourcey.materiallogindemo.dtos.LoginResDTO;
import com.sourcey.materiallogindemo.dtos.RegisterReqDTO;
import com.sourcey.materiallogindemo.dtos.RegisterResDTO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by jilanis on 3/15/2018.
 */

public interface EndPoints {
    @POST("login")
    Call<LoginResDTO> loginUser(@Body LoginReqDTO loginData);
    @POST("register")
    Call<RegisterResDTO> registerUser(@Body RegisterReqDTO personData);
}

