package com.example.abdullahkhan.doktorchain.userSearchRecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.abdullahkhan.doktorchain.R;
import com.example.abdullahkhan.doktorchain.modelClass.ReadDoctor;
import com.example.abdullahkhan.doktorchain.userSearchGetterAndSetterRecyclerView.search_doctor_for_user_getter_setter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.http.Url;

public class search_doctors_from_user_profile_recycler_view extends RecyclerView.Adapter<search_doctors_from_user_profile_recycler_view.myViewHolder>
{

    private LayoutInflater layoutInflater;
    private Context c;
    private List<ReadDoctor> list_of_doctor_profiles;
    private List<ReadDoctor> searchItems;
    private List<ReadDoctor> readDoctors;


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
        String uriString = readDoctor.getFacebook();
        final Uri facebookProfileLink = Uri.parse(uriString);

        //Glide.with(c).load(facebookProfileLink).placeholder(R.drawable.facebook_icon).into(holder.facebook_user_doctor_social_media);

        holder.facebook_user_doctor_social_media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(Intent.ACTION_VIEW,facebookProfileLink));
            }
        });

        Glide.with(c).load(readDoctor.getDoctorImgPath()).into(holder.user_profile_doctor);

        //holder.user_profile_doctor.setImageURI(Uri.parse(readDoctor.getDoctorImgId().toString()));

        String uriTwitterProfileLink = readDoctor.getTwitter();
        final Uri twitterProfileLink = Uri.parse(uriTwitterProfileLink);


        //Glide.with(c).load(twitterProfileLink).placeholder(R.drawable.twitter_icon).into(holder.twitter_user_doctor_social_media);

        holder.twitter_user_doctor_social_media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(Intent.ACTION_VIEW,twitterProfileLink));
            }
        });

        String uriInstragramProfileLink = readDoctor.getLinkedin();
        final Uri linkedinProfileLink = Uri.parse(uriInstragramProfileLink);

        //Glide.with(c).load(linkedinProfileLink).placeholder(R.drawable.linkedin_icon).into(holder.linkedin_user_doctor_social_media);

        holder.linkedin_user_doctor_social_media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(Intent.ACTION_VIEW,linkedinProfileLink));
            }
        });



        //search_doctor_for_user_getter_setter doctor_profiles = list_of_doctor_profiles.get(position);

        //holder.user_profile_doctor.setImageResource(doctor_profiles.getDoctor_profile_image());
//        Glide.with(c).load(doctor_profiles.getDoctor_profile_image()).into(holder.user_profile_doctor);
//        holder.doctor_name.setText(doctor_profiles.getDoctor_profile_name());
//        holder.doctor_occupation.setText(doctor_profiles.getDoctor_profile_destination());
//    holder.facebook_user_doctor_social_media.setImageResource(doctor_profiles.getFacebook_profile());
//        holder.twitter_user_doctor_social_media.setImageResource(doctor_profiles.getTwitter_profile());
//        holder.linkedin_user_doctor_social_media.setImageResource(doctor_profiles.getLinkedin_profile());
//



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
        public TextView doctor_name,doctor_occupation;
        public ImageButton facebook_user_doctor_social_media,linkedin_user_doctor_social_media,twitter_user_doctor_social_media;
        public Button user_profile_view_profile;

        public myViewHolder(View itemView) {
            super(itemView);
            user_profile_doctor = itemView.findViewById(R.id.user_doctor_name);
            doctor_name = itemView.findViewById(R.id.doctor_name);
            doctor_occupation = itemView.findViewById(R.id.doctor_specialist);
            facebook_user_doctor_social_media = itemView.findViewById(R.id.facebook_user_doctor_social_media);
            twitter_user_doctor_social_media = itemView.findViewById(R.id.twitter_user_doctor_social_media);
            linkedin_user_doctor_social_media = itemView.findViewById(R.id.linkedin_user_doctor_social_media);
            user_profile_view_profile = itemView.findViewById(R.id.user_profile_view_profile);

        }

//        public void updateList(List<String> searchItem){
//            searchItems = new ArrayList<>();
//            searchItems.addAll(searchItem);
//            notifyDataSetChanged();
//        }
    }
}
