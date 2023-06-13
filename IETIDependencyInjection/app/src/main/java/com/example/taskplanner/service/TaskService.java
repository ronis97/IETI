package com.example.taskplanner.service;

import com.example.taskplanner.Dto.TaskDto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface TaskService {
    @GET("/V1/tasks")
    Call<List<TaskDto>> getAll();

    @GET("/V1/tasks/{id}")
    Call<TaskDto> getById(@Path("id") String id);

    @POST("/V1/tasks")
    Call<TaskDto> createTask(@Body TaskDto taskDto);

    @FormUrlEncoded
    @PUT("/V1/tasks/{id}")
    Call<TaskDto> updateTask(@Path("id") String id, @Body TaskDto taskDto);

    @DELETE("/V1/tasks/{id}")
    Call<TaskDto> deleteTask(@Path("id") String id);
}
