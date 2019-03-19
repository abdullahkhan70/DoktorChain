package com.example.abdullahkhan.doktorchain.userSearchRecyclerView;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.abdullahkhan.doktorchain.R;
import com.example.abdullahkhan.doktorchain.modelClass.ReadHospitals;
import com.example.abdullahkhan.doktorchain.userProfileDetails.fragment_doctor_profile_details;
import com.example.abdullahkhan.doktorchain.userSearchGetterAndSetterRecyclerView.search_hospital_getter_and_setter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class search_hopital_from_user_profile_recycler_view extends RecyclerView.Adapter<search_hopital_from_user_profile_recycler_view.myViewHolder>

{

    private LayoutInflater layoutInflater;
    private Context c;
    private List<ReadHospitals> list_of_doctor_profiles;
    private List<ReadHospitals> searchItems;
    String image_url = "http://doctortest.quellxcode.com/doctor-api/images/";



    public search_hopital_from_user_profile_recycler_view(List<ReadHospitals> list_of_doctor_profiles,Context c){
        this.list_of_doctor_profiles = list_of_doctor_profiles;
        this.c = c;
        searchItems = new ArrayList<>(list_of_doctor_profiles);
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hospital_search_for_user,parent,false);
        return new myViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        ReadHospitals hospital_profiles = list_of_doctor_profiles.get(position);
        //holder.user_profile_doctor.setImageResource(doctor_profiles.getDoctor_profile_image());
        Glide.with(c).load(hospital_profiles.getHospitalImgPath()).placeholder(R.drawable.dummy_picture).into(holder.user_profile_hospital);
        holder.hospital_name.setText(hospital_profiles.getHospitalName());
        holder.hospital_occupation.setText(hospital_profiles.getHospitalSpecialization());
        holder.hospital_city.setText(hospital_profiles.getCity());

        String facebook_hospital_link,twitter_hospital_link,linkedin_hospital_link;
        final Uri facebook_hospital,twitter_hospital,linkedin_hospital;

        facebook_hospital_link = (String) hospital_profiles.getFacebook();
        twitter_hospital_link = (String) hospital_profiles.getTwitter();
        linkedin_hospital_link = (String) hospital_profiles.getLinkedin();

        try {
            facebook_hospital = Uri.parse("http://" + facebook_hospital_link);
            twitter_hospital = Uri.parse("http://" + twitter_hospital_link);
            linkedin_hospital = Uri.parse("http://" + linkedin_hospital_link);

            holder.facebook_user_hospital_social_media.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW,facebook_hospital));
                }
            });

            holder.twitter_user_hospital_social_media.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW,twitter_hospital));
                }
            });

            holder.linkedin_user_hospital_social_media.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, linkedin_hospital));
                }
            });

        }
        catch (NullPointerException e){
            System.out.println(e);
        }


    }


    @Override
    public int getItemCount() {
        return list_of_doctor_profiles.size();
    }



    public void filteredListing(ArrayList<ReadHospitals> filteredList) {

        list_of_doctor_profiles = filteredList;
        notifyDataSetChanged();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{


        public ImageView facebook_user_hospital_social_media,user_profile_hospital,linkedin_user_hospital_social_media,twitter_user_hospital_social_media;
        public TextView hospital_name,hospital_occupation,hospital_city;
        public Button hospital_profile_view_profile;

        public myViewHolder(View itemView) {
            super(itemView);
            user_profile_hospital = itemView.findViewById(R.id.user_hospital_name);
            hospital_name = itemView.findViewById(R.id.hospital_name);
            hospital_occupation = itemView.findViewById(R.id.hospital_specialist);
            hospital_city = itemView.findViewById(R.id.hospital_city);
            facebook_user_hospital_social_media = itemView.findViewById(R.id.facebook_user_hospital_social_media);
            twitter_user_hospital_social_media = itemView.findViewById(R.id.twitter_user_hospital_social_media);
            linkedin_user_hospital_social_media = itemView.findViewById(R.id.linkedin_user_hospital_social_media);
            hospital_profile_view_profile = itemView.findViewById(R.id.hospital_profile_view_profile);
            hospital_profile_view_profile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int pos = getAdapterPosition();
                    if(pos != RecyclerView.NO_POSITION){
                        final ReadHospitals readHospitals = list_of_doctor_profiles.get(pos);
                        Toast.makeText(c, "The Click item is: " + readHospitals.getHospitalName(), Toast.LENGTH_SHORT).show();
                        Dialog dialog = new Dialog(c);
                        dialog.setContentView(R.layout.fragment_hospital_profile_details);

                        TextView profile_name = dialog.findViewById(R.id.profile_name);
                        TextView profile_specialization = dialog.findViewById(R.id.profile_specialization);
                        TextView profile_address = dialog.findViewById(R.id.profile_address);
                        TextView profile_city = dialog.findViewById(R.id.profile_city);
                        TextView profile_phone_no = dialog.findViewById(R.id.profile_fee_range);
                        TextView profile_phone = dialog.findViewById(R.id.profile_phone);
                        TextView profile_Email = dialog.findViewById(R.id.profile_Email);
                        TextView profile_Working_Time = dialog.findViewById(R.id.profile_Working_Time);
                        TextView profile_Special_Available = dialog.findViewById(R.id.profile_Special_Available);
                        TextView profile_Voluntary_Hours = dialog.findViewById(R.id.profile_Voluntary_Hours);
                        ImageView profileImage = dialog.findViewById(R.id.profile_image);

                        profile_name.setText(readHospitals.getHospitalName());
                        profile_specialization.setText(readHospitals.getHospitalSpecialization());
                        profile_address.setText(readHospitals.getHospitalAddress());
                        profile_city.setText(readHospitals.getCity());
                        profile_phone_no.setText(readHospitals.getHospitalContactNum());
                        profile_phone.setText(readHospitals.getHospitalContactNum());
                        profile_Email.setText(readHospitals.getHospitalEmails());
                        profile_Working_Time.setText(readHospitals.getHospitalAddress());
//                        profile_Special_Available.setText(readDoctor.getIncaseEmergency());
//                        profile_Voluntary_Hours.setText(readDoctor.getVoluntaryWorkingtime());

                        Glide.with(c).load(image_url + readHospitals.getHospitalImgName()).placeholder(R.drawable.dummy_picture).into(profileImage);
                        TextView profile_hospital_affiliation = dialog.findViewById(R.id.profile_hospital_affiliation);
                        profile_hospital_affiliation.setText(readHospitals.getWebsiteLink());

                        TextView profile_medical_area = dialog.findViewById(R.id.profile_medical_area);
                        profile_medical_area.setText(readHospitals.getHospitalWards());

                        TextView profile_residency = dialog.findViewById(R.id.profile_residency);
                        profile_residency.setText(readHospitals.getHospitalSpecialization());

//                        TextView profile_Designation = user_doctor.findViewById(R.id.profile_Designation);
//                        profile_Designation.setText(readDoctor.getDesignation());
//
//                        TextView profile_experience_year = user_doctor.findViewById(R.id.profile_experience_year);
//                        profile_experience_year.setText(readDoctor.getExperienceYear());
                        try {
                            ImageButton facebook_user_ID = dialog.findViewById(R.id.facebook_user_ID);

                            final String facebook_ID = readHospitals.getFacebook().toString();
                            final Uri facebook_ID_URI = Uri.parse("http://" + facebook_ID);


                            facebook_user_ID.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, facebook_ID_URI));
                                }
                            });

                            ImageButton twitter_user_ID = dialog.findViewById(R.id.twitter_user_ID);

                            final String twitter_ID = readHospitals.getTwitter().toString();
                            final Uri twitter_ID_URI = Uri.parse("http://" + twitter_ID);


                            facebook_user_ID.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, twitter_ID_URI));
                                }
                            });

                            ImageButton google_plus_user_ID = dialog.findViewById(R.id.googlw_plus_user_ID);

                            final String google_plus_ID = readHospitals.getTwitter().toString();
                            final Uri google_plus_ID_URI = Uri.parse("http://" + google_plus_ID);


                            facebook_user_ID.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, google_plus_ID_URI));
                                }
                            });


                            ImageButton linkedin_user_ID = dialog.findViewById(R.id.linkedin_user_ID);

                            final String linkedin_ID = readHospitals.getTwitter().toString();
                            final Uri linkedin_ID_URI = Uri.parse("http://" + twitter_ID);


                            facebook_user_ID.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, linkedin_ID_URI));
                                }
                            });
                        }
                        catch (NullPointerException e){
                            e.printStackTrace();
                        }

                        Window window = dialog.getWindow();
                        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                        dialog.show();
                    }
                }
            });
        }

    }
}
