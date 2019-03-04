package com.example.abdullahkhan.doktorchain;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.gpu.ContrastFilterTransformation;


public class fragment_for_register_as_doctor extends Fragment {
    Spinner doctorCity,doctorSpecilization;
    ImageView doctor_background_image;
    Context c;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_fragment_for_register_as_doctor, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Select City");
        cities.add("Abbottabad");
        cities.add("Islamabad");
        cities.add("Rawalpindi");

        doctorCity = view.findViewById(R.id.doctorCity);
        c = view.getContext();
        ArrayAdapter<String> arrayForCities = new ArrayAdapter<String>(c,android.R.layout.select_dialog_item,cities);

        doctorCity.setAdapter(arrayForCities);

//        String[] speciziliation = {"Select Specialization",
//                "Cardiologist",
//                "Islamabad",
//                "Rawalpindi"};

        doctorSpecilization = view.findViewById(R.id.doctorSpecilization);
        ArrayAdapter<String> arrayspeciziliation = new ArrayAdapter<String>(c,android.R.layout.select_dialog_item,cities);

        doctorSpecilization.setAdapter(arrayspeciziliation);

        doctor_background_image = view.findViewById(R.id.doctor_background_image);
        MultiTransformation<Bitmap> multiTransformation = new MultiTransformation<>(new BlurTransformation(1,15),
                new ContrastFilterTransformation(0.5f));
        Glide
                .with(this)
                .load(R.drawable.doctor_background_for_registration)
                .apply(RequestOptions.bitmapTransform(multiTransformation))
                .into(doctor_background_image);


        // Inflate the layout for this fragment

    }
}
