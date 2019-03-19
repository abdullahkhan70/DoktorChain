package com.example.abdullahkhan.doktorchain;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.abdullahkhan.doktorchain.mainContext.Utils;
import com.example.abdullahkhan.doktorchain.modelClass.LoginReponse;
import com.example.abdullahkhan.doktorchain.modelClass.loginRequest;
import com.example.abdullahkhan.doktorchain.retrofit_Api_interfaces.RetrofitClient;
import com.example.abdullahkhan.doktorchain.retrofit_Api_interfaces.dataFromDatabase;

import okhttp3.internal.Util;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class loginScreen extends AppCompatActivity {

    EditText loginEmail,loginpassword;
    Retrofit login_retrofit;
    Utils utils;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        loginEmail = findViewById(R.id.login_email);
        loginpassword = findViewById(R.id.login_password);

        // TODO Rrmaining https://www.youtube.com/watch?v=j0wH0m_xYLs
        utils = new Utils(getApplicationContext());

    }

    private Boolean checkingTheStatusOfLogin() {

        if(loginEmail.getText().toString().trim().length() <= 0 ){
            loginEmail.setError("You Should Enter Proper Email Address!");
            return true;
        }
        else {
            loginEmail.setError(null);
        }

         if(loginpassword.getText().toString().trim().length() <=0){
            loginpassword.setError("The Password Should be Between 4 To 16!");
            return true;
        }
        else{
             loginpassword.setError(null);
         }

        return false;

    }

    public void login(View view) {
        if ( !(checkingTheStatusOfLogin()) ){

            loginRequest LoginRequest = new loginRequest(loginEmail.getText().toString().trim(),loginpassword.getText().toString().trim());

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(RetrofitClient.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            dataFromDatabase DataFromDatabase = retrofit.create(dataFromDatabase.class);
            Call<LoginReponse> call = DataFromDatabase.userLogin(loginEmail.getText().toString().trim(),loginpassword.getText().toString().trim());

            call.enqueue(new Callback<LoginReponse>() {
                @Override
                public void onResponse(Call<LoginReponse> call, Response<LoginReponse> response) {
                    if(response.isSuccessful()) {
                        LoginReponse loginReponse = response.body();

                        Log.i("The Check Here: ", response.message());

                        if (response.code() == 200) {
                            Utils.saveSharedPerference(loginScreen.this, "id", loginReponse.data.getId());
                            Utils.saveSharedPerference(loginScreen.this, "userName", loginReponse.data.getUsername());
                            Utils.saveSharedPerference(loginScreen.this, "password", loginReponse.data.getPassword());
                            Utils.saveSharedPerference(loginScreen.this, "role", loginReponse.data.getRole());
                            Utils.saveSharedPerference(loginScreen.this, "doctorRegId", loginReponse.data.getDoctorRegId());
                            Utils.saveSharedPerference(loginScreen.this, "doctorName", loginReponse.data.getDoctorName());
                            Utils.saveSharedPerference(loginScreen.this, "registrationNum", loginReponse.data.getRegistrationNum());
                            Utils.saveSharedPerference(loginScreen.this, "fieldOfSpecialization", loginReponse.data.getFieldOfSpecialization());
                            Utils.saveSharedPerference(loginScreen.this, "medicalArea", loginReponse.data.getMedicalArea());
                            Utils.saveSharedPerference(loginScreen.this, "degree", loginReponse.data.getDegree());
                            Utils.saveSharedPerference(loginScreen.this, "jobInstitute", loginReponse.data.getJobInstitute());
                            Utils.saveSharedPerference(loginScreen.this, "designation", loginReponse.data.getDesignation());
                            Utils.saveSharedPerference(loginScreen.this, "experienceYear", loginReponse.data.getExperienceYear());
                            Utils.saveSharedPerference(loginScreen.this, "email", loginReponse.data.getEmail());
                            Utils.saveSharedPerference(loginScreen.this, "docPassword", loginReponse.data.getDocPassword());
                            Utils.saveSharedPerference(loginScreen.this, "appoinmentProcedure", loginReponse.data.getAppoinmentProcedure());
                            Utils.saveSharedPerference(loginScreen.this, "fee", loginReponse.data.getFee());
                            Utils.saveSharedPerference(loginScreen.this, "availableStatus", loginReponse.data.getAvailableStatus());
                            Utils.saveSharedPerference(loginScreen.this, "appoinmentContactNum", loginReponse.data.getAppoinmentContactNum());
                            Utils.saveSharedPerference(loginScreen.this, "incaseEmergency", loginReponse.data.getIncaseEmergency());
                            Utils.saveSharedPerference(loginScreen.this, "doctorContactNum", loginReponse.data.getDoctorContactNum());
                            Utils.saveSharedPerference(loginScreen.this, "doctorAddress", loginReponse.data.getDoctorAddress());
                            Utils.saveSharedPerference(loginScreen.this, "city", loginReponse.data.getCity());
                            Utils.saveSharedPerference(loginScreen.this, "majorAchievement", loginReponse.data.getMajorAchievement());
                            Utils.saveSharedPerference(loginScreen.this, "majorSuccess", loginReponse.data.getMajorSuccess());
                            Utils.saveSharedPerference(loginScreen.this, "iceContactNo", loginReponse.data.getIceContactNo());
                            Utils.saveSharedPerference(loginScreen.this, "description", loginReponse.data.getDescription());
                            Utils.saveSharedPerference(loginScreen.this, "deservingPatientStatus", loginReponse.data.getDeservingPatientStatus());
                            Utils.saveSharedPerference(loginScreen.this, "deservingContactNo", loginReponse.data.getDeservingContactNo());
                            Utils.saveSharedPerference(loginScreen.this, "deservingAccountNo", loginReponse.data.getDeservingAccountNo());
                            Utils.saveSharedPerference(loginScreen.this, "startTime", loginReponse.data.getStartTime());
                            Utils.saveSharedPerference(loginScreen.this, "endTime", loginReponse.data.getEndTime());
                            Utils.saveSharedPerference(loginScreen.this, "voluntaryWorkingtime", loginReponse.data.getVoluntaryWorkingtime());
                            Utils.saveSharedPerference(loginScreen.this, "workingDays", loginReponse.data.getWorkingDays());
                            Utils.saveSharedPerference(loginScreen.this, "userIdFk", loginReponse.data.getUserIdFk());
                            Utils.saveSharedPerference(loginScreen.this, "facebook", loginReponse.data.getFacebook());
                            Utils.saveSharedPerference(loginScreen.this, "twitter", loginReponse.data.getTwitter());
                            Utils.saveSharedPerference(loginScreen.this, "linkedin", loginReponse.data.getLinkedin());
                            Utils.saveSharedPerference(loginScreen.this, "googleplus", loginReponse.data.getGoogleplus());
                            Utils.saveSharedPerference(loginScreen.this, "createdAt", loginReponse.data.getCreatedAt());
                            Utils.saveSharedPerference(loginScreen.this, "createdBy", loginReponse.data.getCreatedBy());
                            Utils.saveSharedPerference(loginScreen.this, "updatedAt", loginReponse.data.getUpdatedAt());
                            Utils.saveSharedPerference(loginScreen.this, "updatedBy", loginReponse.data.getUpdatedBy());
                            Utils.saveSharedPerference(loginScreen.this, "doctorImgId", loginReponse.data.getDoctorImgId());
                            Utils.saveSharedPerference(loginScreen.this, "doctorImgName", loginReponse.data.getDoctorImgName());
                            Utils.saveSharedPerference(loginScreen.this, "doctorImgPath", loginReponse.data.getDoctorImgPath());
                            Utils.saveSharedPerference(loginScreen.this, "doctorRegIdFk", loginReponse.data.getDoctorRegIdFk());

                            if (loginReponse.data.getRole().equals("User")) {
                                utils.writeLoginPerference(true);
                                if(utils.readLoginPreference()){
                                    startActivity(new Intent(loginScreen.this, user_profile_navigation_bar.class));
                                }

                            }
                            else{
                                Toast.makeText(loginScreen.this,"The Login is not successful!",Toast.LENGTH_LONG).show();
                            }

                        }

                    }
                }

                @Override
                public void onFailure(Call<LoginReponse> call, Throwable t) {

                }
            });

        }
    }
}
