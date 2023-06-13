package com.example.taskplanner.service;

import com.example.taskplanner.Dto.LoginDto;
import com.example.taskplanner.Dto.TokenDto;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthService {
    @POST("/V1/auth")
    Call<TokenDto> createTask(@Body LoginDto loginDto);
}
