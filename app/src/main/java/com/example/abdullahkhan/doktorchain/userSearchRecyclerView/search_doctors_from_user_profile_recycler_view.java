package com.example.abdullahkhan.doktorchain.userSearchRecyclerView;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.abdullahkhan.doktorchain.R;
import com.example.abdullahkhan.doktorchain.modelClass.ReadDoctor;
import com.example.abdullahkhan.doktorchain.userSearchGetterAndSetterRecyclerView.search_doctor_for_user_getter_setter;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import retrofit2.http.Url;

public class search_doctors_from_user_profile_recycler_view extends RecyclerView.Adapter<search_doctors_from_user_profile_recycler_view.myViewHolder>

{
    private TextView profile_name,profile_specialization,profile_address,profile_city,profile_fee_range,profile_phone,profile_Email,profile_Working_Time,profile_Special_Available,profile_Voluntary_Hours;
    private ImageView profileImage;
    private LayoutInflater layoutInflater;
    private Context c;
    private List<ReadDoctor> list_of_doctor_profiles;
    private List<ReadDoctor> searchItems;
    private List<ReadDoctor> readDoctors;
    Dialog user_doctor;

    String image_url = "http://doctortest.quellxcode.com/doctor-api/images/";


    public search_doctors_from_user_profile_recycler_view(List<ReadDoctor> readDoctors,Context c){
        this.readDoctors = readDoctors;
        this.c = c;
        searchItems = new ArrayList<>(readDoctors);
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



       View view = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.doctor_search_for_user,parent,false);

       return new myViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        final ReadDoctor readDoctor = readDoctors.get(position);

        holder.doctor_name.setText(readDoctor.getDoctorName());
        holder.doctor_occupation.setText(readDoctor.getDesignation());
        holder.doctor_fee.setText(readDoctor.getFee());
        holder.doctor_city.setText(readDoctor.getCity());
        Glide.with(c).load(image_url + readDoctor.getDoctorImgName()).placeholder(R.drawable.dummy_picture).into(holder.user_profile_doctor);
        try {
        String uriString = readDoctor.getFacebook();
        final Uri facebookProfileLink = Uri.parse("http://" + uriString);

        //Glide.with(c).load(facebookProfileLink).placeholder(R.drawable.facebook_icon).into(holder.facebook_user_doctor_social_media);

        holder.facebook_user_doctor_social_media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(Intent.ACTION_VIEW,facebookProfileLink));
            }
        });


    String uriTwitterProfileLink = (String) readDoctor.getTwitter();
    final Uri twitterProfileLink = Uri.parse("http://" + uriTwitterProfileLink);


    //Glide.with(c).load(twitterProfileLink).placeholder(R.drawable.twitter_icon).into(holder.twitter_user_doctor_social_media);

    holder.twitter_user_doctor_social_media.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, twitterProfileLink));
        }
    });

    String uriLinkedinmProfileLink = readDoctor.getLinkedin();
    final Uri linkedinProfileLink = Uri.parse("http://" + uriLinkedinmProfileLink);

    //Glide.with(c).load(linkedinProfileLink).placeholder(R.drawable.linkedin_icon).into(holder.linkedin_user_doctor_social_media);

    holder.linkedin_user_doctor_social_media.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, linkedinProfileLink));
        }
    });

}

catch (Exception e){
    e.printStackTrace();
}

    }


    @Override
    public int getItemCount() {
        return readDoctors.size();
    }


    public void filteredListing(ArrayList<ReadDoctor> filteredList) {

        readDoctors = filteredList;
        notifyDataSetChanged();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{


        public ImageView user_profile_doctor;
        public TextView doctor_name,doctor_occupation,doctor_city,doctor_fee;
        public ImageButton facebook_user_doctor_social_media,linkedin_user_doctor_social_media,twitter_user_doctor_social_media;
        public Button user_profile_view_profile;

        public myViewHolder(View itemView) {
            super(itemView);
            user_profile_doctor = itemView.findViewById(R.id.user_doctor_name);
            doctor_name = itemView.findViewById(R.id.doctor_name);
            doctor_city = itemView.findViewById(R.id.doctor_city);
            doctor_fee = itemView.findViewById(R.id.doctor_fee);
            doctor_occupation = itemView.findViewById(R.id.doctor_specialist);
            facebook_user_doctor_social_media = itemView.findViewById(R.id.facebook_user_doctor_social_media);
            twitter_user_doctor_social_media = itemView.findViewById(R.id.twitter_user_doctor_social_media);
            linkedin_user_doctor_social_media = itemView.findViewById(R.id.linkedin_user_doctor_social_media);
            user_profile_view_profile = itemView.findViewById(R.id.user_profile_view_profile);

            user_profile_view_profile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if(position != RecyclerView.NO_POSITION){
                        ReadDoctor readDoctor = readDoctors.get(position);
                        user_doctor = new Dialog(c);
                        user_doctor.setContentView(R.layout.fragment_doctor_profile_details);

                        profile_name = user_doctor.findViewById(R.id.profile_name);
                        profile_specialization = user_doctor.findViewById(R.id.profile_specialization);
                        profile_address = user_doctor.findViewById(R.id.profile_address);
                        profile_city = user_doctor.findViewById(R.id.profile_city);
                        profile_fee_range = user_doctor.findViewById(R.id.profile_fee_range);
                        profile_phone = user_doctor.findViewById(R.id.profile_phone);
                        profile_Email = user_doctor.findViewById(R.id.profile_Email);
                        profile_Working_Time = user_doctor.findViewById(R.id.profile_Working_Time);
                        profile_Special_Available = user_doctor.findViewById(R.id.profile_Special_Available);
                        profile_Voluntary_Hours = user_doctor.findViewById(R.id.profile_Voluntary_Hours);
                        profileImage = user_doctor.findViewById(R.id.profile_image);

                        profile_name.setText(readDoctor.getDoctorName());
                        profile_specialization.setText(readDoctor.getDesignation());
                        profile_address.setText(readDoctor.getDoctorAddress());
                        profile_city.setText(readDoctor.getCity());
                        profile_fee_range.setText(readDoctor.getFee());
                        profile_phone.setText(readDoctor.getDoctorContactNum());
                        profile_Email.setText(readDoctor.getEmail());
                        profile_Working_Time.setText(readDoctor.getWorkingDays());
                        profile_Special_Available.setText(readDoctor.getIncaseEmergency());
                        profile_Voluntary_Hours.setText(readDoctor.getVoluntaryWorkingtime());

                        Glide.with(c).load(image_url + readDoctor.getDoctorImgName()).placeholder(R.drawable.dummy_picture).into(profileImage);
                        TextView profile_hospital_affiliation = user_doctor.findViewById(R.id.profile_hospital_affiliation);
                        profile_hospital_affiliation.setText(readDoctor.getJobInstitute());

                        TextView profile_medical_area = user_doctor.findViewById(R.id.profile_medical_area);
                        profile_medical_area.setText(readDoctor.getMedicalArea());

                        TextView profile_residency = user_doctor.findViewById(R.id.profile_residency);
                        profile_residency.setText(readDoctor.getAppoinmentProcedure());

                        TextView profile_Designation = user_doctor.findViewById(R.id.profile_Designation);
                        profile_Designation.setText(readDoctor.getDesignation());

                        TextView profile_experience_year = user_doctor.findViewById(R.id.profile_experience_year);
                        profile_experience_year.setText(readDoctor.getExperienceYear());

                        Window window = user_doctor.getWindow();
                        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                        user_doctor.show();





                    }
                }
            });

        }

//        public void updateList(List<String> searchItem){
//            searchItems = new ArrayList<>();
//            searchItems.addAll(searchItem);
//            notifyDataSetChanged();
//        }
    }
}
