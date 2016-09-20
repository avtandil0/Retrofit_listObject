package com.example.avto.retrofit_listobject.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by avto on 9/19/2016.
 */
public class ApiClient {
    public static final String BASE_URL="https://jsonplaceholder.typicode.com/";
    public static Retrofit retrofit=null;

    public static Retrofit getRetrofit() {
        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
