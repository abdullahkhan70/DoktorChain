package com.example.abdullahkhan.doktorchain.retrofit_Api_interfaces;


import com.example.abdullahkhan.doktorchain.modelClass.ClinicsModelJson;
import com.example.abdullahkhan.doktorchain.modelClass.LabModelJson;
import com.example.abdullahkhan.doktorchain.modelClass.LoginReponse;
import com.example.abdullahkhan.doktorchain.modelClass.NursesModelJson;
import com.example.abdullahkhan.doktorchain.modelClass.ReadDoctor;
import com.example.abdullahkhan.doktorchain.modelClass.ReadHospitals;
import com.example.abdullahkhan.doktorchain.modelClass.loginRequest;

import java.util.List;

import javax.annotation.PostConstruct;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface dataFromDatabase {


    @Headers("content-type: application/json")
    @FormUrlEncoded
    @POST("Auth/login")
    Call<LoginReponse> userLogin(@Field("email") String email, @Field("password") String password);


    @FormUrlEncoded
    @POST("User_api/userRegister")
    Call<ResponseBody> userRegister(
            @Field("user_email") String email,
            @Field("user_password") String password,
            @Field("role") String role,
            @Field("user_name") String userName,
            @Field("user_address") String userAddress,
            @Field("user_contact_no") String userContactNo,
            @Field("user_cnic") String userCNIC,
            @Field("user_blood_group") String userBloodGroup,
            @Field("city") String city
    );

    @GET("doctor_api/doctorView")
    Call<List<ReadDoctor>> readDoctors();

    @GET("Hospital_api/hospitalView")
    Call<List<ReadHospitals>> readHospitals();

    @GET("Lab_api/labView")
    Call<List<LabModelJson>> readLabs();

    @GET("nurse_api/nurseView")
    Call<List<NursesModelJson>> readNurses();

    @GET("Clinic_api/clinicView")
    Call<List<ClinicsModelJson>> readClinics();


}
