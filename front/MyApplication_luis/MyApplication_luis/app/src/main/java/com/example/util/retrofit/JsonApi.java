package com.example.util.retrofit;

import com.example.dto.LocationCoordinate;
import com.example.dto.TimeRoute;
import com.example.dto.request.LoginRequest;
import com.example.dto.response.ServerResponse;
import com.example.dto.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import java.util.List;

public interface JsonApi {

    @POST("/api/route")
    Call<ServerResponse<List<TimeRoute>>> getTimeRoute(@Body LocationCoordinate lc);

    @GET("/api/test")
    Call<ServerResponse<List<TimeRoute>>> getDefaultRoutes();

    @GET("/")
    Call<String> getHome(@Header("my_token") String str);

    @GET("/test")
    Call<ServerResponse<String>> getMyInfo(@Header("Authorization") String token);

    @POST("/login")
    Call<ServerResponse<String>> login(@Body LoginRequest loginRequest);
}
