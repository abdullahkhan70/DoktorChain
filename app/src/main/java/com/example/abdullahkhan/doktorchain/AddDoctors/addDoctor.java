package com.example.abdullahkhan.doktorchain.AddDoctors;

import android.app.Activity;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.abdullahkhan.doktorchain.R;
import com.example.abdullahkhan.doktorchain.modelClass.AddClinicModelJson;
import com.example.abdullahkhan.doktorchain.modelClass.AddHospitalModelJson;
import com.example.abdullahkhan.doktorchain.retrofit_Api_interfaces.RetrofitClient;
import com.example.abdullahkhan.doktorchain.userFragments.fragment_for_user_feature;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import org.w3c.dom.Text;

import java.io.DataOutputStream;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class addDoctor extends Fragment {

    Context c;
    AppCompatActivity Activity;
    EditText complete_name,complete_address,add_phone_no_hospital,add_email_address,add_hospital_website_link,hospital_description;
    TextView file_path;
    AppCompatButton upload_hospital_pic,add_doctors_hospital,connect_facebook,connect_linkedin,connect_twitters;
    SearchableSpinner add_hospital_into_database;

    public addDoctor() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_doctor, null);

        fragment_for_user_feature ff;
        //ff =  getActivity().getFragmentManager().findFragmentByTag("themainfragment");
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        complete_name = view.findViewById(R.id.complete_name);
        complete_address = (EditText) view.findViewById(R.id.complete_address);
        add_hospital_into_database = view.findViewById(R.id.add_hospital_into_database);
        add_phone_no_hospital = view.findViewById(R.id.add_phone_no_hospital);
        add_email_address = view.findViewById(R.id.add_email_address);
        add_hospital_website_link = view.findViewById(R.id.add_hospital_website_link);
        upload_hospital_pic = view.findViewById(R.id.upload_hospital_pic);
        file_path = (TextView) view.findViewById(R.id.file_path);
        hospital_description = (EditText) view.findViewById(R.id.hospital_description);
        add_doctors_hospital = view.findViewById(R.id.add_doctors_hospital);
        connect_facebook = view.findViewById(R.id.connect_facebook);
        connect_linkedin = view.findViewById(R.id.connect_linkedin);
        connect_twitters = view.findViewById(R.id.connect_twitters);

        setRetrofit(c);
    }

    private void setRetrofit(final Context c) {
       RetrofitClient.getInstance().getDataFromDatabase().createClinic().enqueue(new Callback<List<AddClinicModelJson>>() {
           @Override
           public void onResponse(Call<List<AddClinicModelJson>> call, Response<List<AddClinicModelJson>> response) {
               List<AddClinicModelJson> addClinicModelJsonsList = response.body();
               Log.i("The Clinic","Is Fundamental!!!!");
           }

           @Override
           public void onFailure(Call<List<AddClinicModelJson>> call, Throwable t) {

           }
       });
    }


}
