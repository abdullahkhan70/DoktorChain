package com.example.abdullahkhan.doktorchain.userSearchRecyclerView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.abdullahkhan.doktorchain.R;
import com.example.abdullahkhan.doktorchain.userSearchGetterAndSetterRecyclerView.search_clinic_for_user_getter_setter;

import java.util.ArrayList;
import java.util.List;


public class search_clinic_from_user_profile_recycler_view extends RecyclerView.Adapter<search_clinic_from_user_profile_recycler_view.myViewHolder>
{

    private LayoutInflater layoutInflater;
    private Context c;
    private List<search_clinic_for_user_getter_setter> list_of_doctor_profiles;
    private List<search_clinic_for_user_getter_setter> searchItems;


    public search_clinic_from_user_profile_recycler_view(List<search_clinic_for_user_getter_setter> list_of_doctor_profiles,Context c){
        this.list_of_doctor_profiles = list_of_doctor_profiles;
        this.c = c;
        searchItems = new ArrayList<>(list_of_doctor_profiles);
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.clinic_search_for_user,parent,false);
        return new myViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        search_clinic_for_user_getter_setter doctor_profiles = list_of_doctor_profiles.get(position);
        //holder.user_profile_doctor.setImageResource(doctor_profiles.getDoctor_profile_image());
        Glide.with(c).load(doctor_profiles.getDoctor_profile_image()).into(holder.user_profile_doctor);
        holder.doctor_name.setText(doctor_profiles.getDoctor_profile_name());
        holder.doctor_occupation.setText(doctor_profiles.getDoctor_profile_destination());
        holder.facebook_user_doctor_social_media.setImageResource(doctor_profiles.getFacebook_profile());
        holder.twitter_user_doctor_social_media.setImageResource(doctor_profiles.getTwitter_profile());
        holder.linkedin_user_doctor_social_media.setImageResource(doctor_profiles.getLinkedin_profile());
        holder.user_profile_view_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public int getItemCount() {
        return list_of_doctor_profiles.size();
    }


    public void filteredListing(ArrayList<search_clinic_for_user_getter_setter> filteredList) {

        list_of_doctor_profiles = filteredList;
        notifyDataSetChanged();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{


        public ImageView facebook_user_doctor_social_media,user_profile_doctor,linkedin_user_doctor_social_media,twitter_user_doctor_social_media;
        public TextView doctor_name,doctor_occupation;
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

        }

    }
}
