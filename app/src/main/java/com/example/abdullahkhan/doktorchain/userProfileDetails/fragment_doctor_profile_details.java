package com.example.abdullahkhan.doktorchain.userProfileDetails;;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abdullahkhan.doktorchain.R;

public class fragment_doctor_profile_details extends Fragment {
    TextView profile_name,profile_specialization,profile_address,profile_city,profile_fee_range,profile_phone,profile_Email,profile_Working_Time,profile_Special_Available,profile_Voluntary_Hours;
    Context context;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_doctor_profile_details,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        profile_name = view.findViewById(R.id.profile_name);
        profile_specialization = view.findViewById(R.id.profile_specialization);
        profile_address = view.findViewById(R.id.profile_address);
        profile_city = view.findViewById(R.id.profile_city);
        profile_fee_range = view.findViewById(R.id.profile_fee_range);
        profile_phone = view.findViewById(R.id.profile_phone);
        profile_Email = view.findViewById(R.id.profile_Email);
        profile_Working_Time = view.findViewById(R.id.profile_Working_Time);
        profile_Special_Available = view.findViewById(R.id.profile_Special_Available);
        profile_Voluntary_Hours = view.findViewById(R.id.profile_Voluntary_Hours);


    }


}
