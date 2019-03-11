package com.example.abdullahkhan.doktorchain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class loginScreen extends AppCompatActivity {

    EditText loginEmail,loginpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        loginEmail = findViewById(R.id.login_email);
        loginpassword = findViewById(R.id.login_password);


        Retrofit login_retrofit = new Retrofit.Builder()
                .baseUrl("http://doctortest.quellxcode.com/doctor-api/index.php/api/User_api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


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
        Intent intent = new Intent(this,registrationScreen.class);
        startActivity(intent);
        return false;

    }

    public void login(View view) {
        if ( !(checkingTheStatusOfLogin()) ){
            Toast.makeText(this, "Successfully Login!", Toast.LENGTH_SHORT).show();
        }
    }
}
