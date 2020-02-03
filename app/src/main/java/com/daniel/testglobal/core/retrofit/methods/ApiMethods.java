package com.daniel.testglobal.core.retrofit.methods;

import com.daniel.testglobal.core.models.HomeDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiMethods {

    @GET("/list")
    Call<List<HomeDTO>> getList();

}
