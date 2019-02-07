package com.example.abdullahkhan.doktorchain;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.request.RequestOptions;

import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.gpu.ContrastFilterTransformation;


public class fragment_for_register_as_doctor extends Fragment {
    Spinner doctorCity,doctorSpecilization;
    ImageView doctor_background_image;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_for_register_as_doctor, container, false);
        String[] cities = {"Select City",
                "Abbottabad",
                "Islamabad",
                "Rawalpindi"};
        doctorCity = view.findViewById(R.id.doctorCity);
        ArrayAdapter<String> arrayForCities = new ArrayAdapter<String>(getActivity(),android.R.layout.select_dialog_item,cities);

        doctorCity.setAdapter(arrayForCities);

        String[] speciziliation = {"Select Specialization",
                "Cardiologist",
                "Islamabad",
                "Rawalpindi"};
        doctorSpecilization = view.findViewById(R.id.doctorSpecilization);
        ArrayAdapter<String> arrayspeciziliation = new ArrayAdapter<String>(getActivity(),android.R.layout.select_dialog_item,speciziliation);

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
        return view;
    }


}
