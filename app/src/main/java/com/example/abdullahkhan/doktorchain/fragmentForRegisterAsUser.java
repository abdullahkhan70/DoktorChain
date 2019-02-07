package com.example.abdullahkhan.doktorchain;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;


public class fragmentForRegisterAsUser extends Fragment {

    Spinner userCity,userBloodGroup;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_for_register_as_user, container, false);
        String[] cities = {"Select City",
                            "Abbottabad",
                            "Islamabad",
                            "Rawalpindi"};
        userCity = view.findViewById(R.id.userCity);
       ArrayAdapter<String> arrayForCities = new ArrayAdapter<String>(getActivity(),android.R.layout.select_dialog_item,cities);

       userCity.setAdapter(arrayForCities);

        String[] bloodGroup = {"Select Blood Group",
                "A+",
                "A-",
                "B+",
                "B-",
                "AB+",
                "AB-",
                "O+",
                "O-"};
        userBloodGroup = view.findViewById(R.id.userBloodGroup);
        ArrayAdapter<String> arrayForBloodGroup = new ArrayAdapter<String>(getActivity(),android.R.layout.select_dialog_item,bloodGroup);

        userBloodGroup.setAdapter(arrayForBloodGroup);

       Button userRegisterButton = view.findViewById(R.id.userRegisterButton);
       userRegisterButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });

        // Inflate the layout for this fragment
        return view;


    }






}
