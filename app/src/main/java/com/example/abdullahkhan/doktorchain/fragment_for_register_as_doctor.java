package com.example.abdullahkhan.doktorchain;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.gpu.ContrastFilterTransformation;


public class fragment_for_register_as_doctor extends Fragment
        implements SearchView.OnQueryTextListener {
    Spinner doctorCity,doctorSpecilization;
    ImageView doctor_background_image;
    Context c;
    private SearchView searchView = null;
    private SearchView.OnQueryTextListener queryTextListener;

//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setHasOptionsMenu(true);
//    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        setHasOptionsMenu(true);
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
//        MultiTransformation<Bitmap> multiTransformation = new MultiTransformation<>(new BlurTransformation(1,15),
//                new ContrastFilterTransformation(0.5f));
        Glide
                .with(this)
                .load(R.drawable.doctor_background_for_registration)
                .apply(RequestOptions.bitmapTransform(new BlurTransformation(1,15)))
                .into(doctor_background_image);


        // Inflate the layout for this fragment

        Button btn = view.findViewById(R.id.doctorRegisterButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(c,user_profile_navigation_bar.class);
                startActivity(intent);
            }
        });

    }

//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        inflater.inflate(R.menu.toolbar_search_bar,menu);
//        MenuItem menuItem = menu.findItem(R.id.action_search_bar);
//        SearchView searchView = (SearchView) menuItem.getActionView();
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                return false;
//            }
//        });
//
//
//        super.onCreateOptionsMenu(menu, inflater);
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search_bar:
                // Not implemented here
                return false;
            default:
                break;
        }
        searchView.setOnQueryTextListener(queryTextListener);
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}
