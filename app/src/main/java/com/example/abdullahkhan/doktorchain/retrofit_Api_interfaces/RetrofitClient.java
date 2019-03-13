package com.example.abdullahkhan.doktorchain.retrofit_Api_interfaces;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    public static String BASE_URL = "http://doctortest.quellxcode.com/doctor-api/index.php/api/";
    private static RetrofitClient mInstance;
    private Retrofit retrofit;

    private RetrofitClient (){
        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitClient getInstance(){
        if(mInstance == null){
            mInstance = new RetrofitClient();
        }
        return mInstance;
    }

    public dataFromDatabase getDataFromDatabase(){
        return retrofit.create(dataFromDatabase.class);
    }


}
