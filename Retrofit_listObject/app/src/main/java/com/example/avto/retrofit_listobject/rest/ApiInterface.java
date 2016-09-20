package com.example.avto.retrofit_listobject.rest;

import com.example.avto.retrofit_listobject.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by avto on 9/19/2016.
 */
public interface ApiInterface {
    @GET("posts")
    Call<List<User>> getUser();
}
