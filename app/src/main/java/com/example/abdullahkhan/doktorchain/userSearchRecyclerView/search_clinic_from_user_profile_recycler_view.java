package com.example.abdullahkhan.doktorchain.userSearchRecyclerView;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
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
import com.example.abdullahkhan.doktorchain.modelClass.ClinicsModelJson;
import com.example.abdullahkhan.doktorchain.modelClass.ReadHospitals;
import com.example.abdullahkhan.doktorchain.userSearchGetterAndSetterRecyclerView.search_clinic_for_user_getter_setter;

import java.util.ArrayList;
import java.util.List;


public class search_clinic_from_user_profile_recycler_view extends RecyclerView.Adapter<search_clinic_from_user_profile_recycler_view.myViewHolder> {

    private LayoutInflater layoutInflater;
    private Context c;
    private List<ClinicsModelJson> list_of_doctor_profiles;
    private List<ClinicsModelJson> searchItems;

    String image_URL = "http://doctortest.quellxcode.com/doctor-api/images/";

    public search_clinic_from_user_profile_recycler_view(List<ClinicsModelJson> list_of_doctor_profiles, Context c) {
        this.list_of_doctor_profiles = list_of_doctor_profiles;
        this.c = c;
        searchItems = new ArrayList<>(list_of_doctor_profiles);
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.clinic_search_for_user, parent, false);
        return new myViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        ClinicsModelJson doctor_profiles = list_of_doctor_profiles.get(position);
        //holder.user_profile_doctor.setImageResource(doctor_profiles.getDoctor_profile_image());
        Glide.with(c).load(image_URL + doctor_profiles.getClinicImgName()).into(holder.user_profile_doctor);
        holder.doctor_name.setText(doctor_profiles.getClinicNames());
        try {
            String facebook_url = (String) doctor_profiles.getFacebook();
            String twitter_url = (String) doctor_profiles.getTwitter();
            String linkedin_url = (String) doctor_profiles.getLinkedin();

            final Uri facebook_URL = Uri.parse(facebook_url);
            final Uri twitter_URL = Uri.parse(twitter_url);
            final Uri linkedin_URL = Uri.parse(linkedin_url);

            holder.facebook_user_doctor_social_media.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, facebook_URL));
                }
            });

            holder.twitter_user_doctor_social_media.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, twitter_URL));
                }
            });

            holder.linkedin_user_doctor_social_media.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, linkedin_URL));
                }
            });

        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }


    @Override
    public int getItemCount() {
        return list_of_doctor_profiles.size();
    }


    public void filteredListing(ArrayList<ClinicsModelJson> filteredList) {

        list_of_doctor_profiles = filteredList;
        notifyDataSetChanged();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {


        public ImageView facebook_user_doctor_social_media, user_profile_doctor, linkedin_user_doctor_social_media, twitter_user_doctor_social_media;
        public TextView doctor_name, doctor_occupation;
        public Button user_profile_view_profile;

        public myViewHolder(View itemView) {
            super(itemView);
            user_profile_doctor = itemView.findViewById(R.id.user_clinic_name);
            doctor_name = itemView.findViewById(R.id.clinic_name);
            doctor_occupation = itemView.findViewById(R.id.clinic_specialist);
            facebook_user_doctor_social_media = itemView.findViewById(R.id.facebook_user_clinic_social_media);
            twitter_user_doctor_social_media = itemView.findViewById(R.id.twitter_user_clinic_social_media);
            linkedin_user_doctor_social_media = itemView.findViewById(R.id.linkedin_user_clinic_social_media);
            user_profile_view_profile = itemView.findViewById(R.id.clinic_profile_view_profile);

            user_profile_view_profile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    if (pos != RecyclerView.NO_POSITION) {
                        final ClinicsModelJson clinicsModelJson = list_of_doctor_profiles.get(pos);
                        //Toast.makeText(c, "The Click item is: " + readHospitals.getHospitalName(), Toast.LENGTH_SHORT).show();
                        Dialog dialog = new Dialog(c);
                        dialog.setContentView(R.layout.clinics_user_for_profile_details);

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

                        profile_name.setText(clinicsModelJson.getClinicNames());
                        profile_specialization.setText(clinicsModelJson.getClinicSpecialization());
                        profile_address.setText(clinicsModelJson.getDoctorAddress());
                        profile_city.setText(clinicsModelJson.getCity());
                        profile_phone_no.setText(clinicsModelJson.getDoctorContactNum());
                        // profile_phone.setText(readHospitals.getHospitalContactNum());
                        profile_Email.setText(clinicsModelJson.getClinicEmail());
                        profile_Working_Time.setText(clinicsModelJson.getVoluntaryWorkingtime());
//                        profile_Special_Available.setText(readDoctor.getIncaseEmergency());
//                        profile_Voluntary_Hours.setText(readDoctor.getVoluntaryWorkingtime());

                        Glide.with(c).load(image_URL + clinicsModelJson.getClinicImgName()).placeholder(R.drawable.dummy_picture).into(profileImage);
//                        TextView profile_hospital_affiliation = dialog.findViewById(R.id.profile_hospital_affiliation);
//                        profile_hospital_affiliation.setText(readHospitals.getWebsiteLink());
//
//                        TextView profile_medical_area = dialog.findViewById(R.id.profile_medical_area);
//                        profile_medical_area.setText(readHospitals.getHospitalWards());

                        TextView profile_residency = dialog.findViewById(R.id.profile_residency);
                        profile_residency.setText(clinicsModelJson.getClinicSpecialization());

//                        TextView profile_Designation = user_doctor.findViewById(R.id.profile_Designation);
//                        profile_Designation.setText(readDoctor.getDesignation());
//
//                        TextView profile_experience_year = user_doctor.findViewById(R.id.profile_experience_year);
//                        profile_experience_year.setText(readDoctor.getExperienceYear());
                        try {
                            ImageButton facebook_user_ID = dialog.findViewById(R.id.facebook_user_ID);

                            final String facebook_ID = clinicsModelJson.getFacebook().toString();
                            final Uri facebook_ID_URI = Uri.parse(facebook_ID);


                            facebook_user_ID.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, facebook_ID_URI));
                                }
                            });

                            ImageButton twitter_user_ID = dialog.findViewById(R.id.twitter_user_ID);

                            final String twitter_ID = clinicsModelJson.getTwitter().toString();
                            final Uri twitter_ID_URI = Uri.parse(twitter_ID);


                            facebook_user_ID.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, twitter_ID_URI));
                                }
                            });

                            ImageButton google_plus_user_ID = dialog.findViewById(R.id.googlw_plus_user_ID);

                            final String google_plus_ID = clinicsModelJson.getGoogleplus().toString();
                            final Uri google_plus_ID_URI = Uri.parse(google_plus_ID);


                            facebook_user_ID.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, google_plus_ID_URI));
                                }
                            });


                            ImageButton linkedin_user_ID = dialog.findViewById(R.id.linkedin_user_ID);

                            final String linkedin_ID = clinicsModelJson.getLinkedin().toString();
                            final Uri linkedin_ID_URI = Uri.parse(twitter_ID);


                            facebook_user_ID.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, linkedin_ID_URI));
                                }
                            });
                        } catch (NullPointerException e) {
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