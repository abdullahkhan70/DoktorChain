package com.example.abdullahkhan.doktorchain;

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

import org.w3c.dom.Text;

import java.util.List;

public class search_doctors_from_user_profile_recycler_view extends RecyclerView.Adapter<search_doctors_from_user_profile_recycler_view.myViewHolder>{
    LayoutInflater layoutInflater;
    Context c;

    List<search_doctor_for_user_getter_setter> list_of_doctor_profiles;
    public search_doctors_from_user_profile_recycler_view(List<search_doctor_for_user_getter_setter> list_of_doctor_profiles,Context c){
        this.list_of_doctor_profiles = list_of_doctor_profiles;
        this.c = c;
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
        search_doctor_for_user_getter_setter doctor_profiles = list_of_doctor_profiles.get(position);
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

    public class myViewHolder extends RecyclerView.ViewHolder{


        public ImageView facebook_user_doctor_social_media,user_profile_doctor,linkedin_user_doctor_social_media,twitter_user_doctor_social_media;
        public TextView doctor_name,doctor_occupation;
        public Button user_profile_view_profile;

        public myViewHolder(View itemView) {
            super(itemView);
            user_profile_doctor = itemView.findViewById(R.id.user_profile_doctor);
            doctor_name = itemView.findViewById(R.id.doctor_name);
            doctor_occupation = itemView.findViewById(R.id.doctor_occupation);
            facebook_user_doctor_social_media = itemView.findViewById(R.id.facebook_user_doctor_social_media);
            twitter_user_doctor_social_media = itemView.findViewById(R.id.twitter_user_doctor_social_media);
            linkedin_user_doctor_social_media = itemView.findViewById(R.id.linkedin_user_doctor_social_media);
            user_profile_view_profile = itemView.findViewById(R.id.user_profile_view_profile);

        }
    }
}
