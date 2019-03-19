package com.example.abdullahkhan.doktorchain.userSearchRecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import com.example.abdullahkhan.doktorchain.modelClass.LabModelJson;
import com.example.abdullahkhan.doktorchain.userSearchGetterAndSetterRecyclerView.search_laboratory_getter_and_setter;

import java.util.ArrayList;
import java.util.List;


public class search_laboratory_from_user_profile_recycler_view extends RecyclerView.Adapter<search_laboratory_from_user_profile_recycler_view.myViewHolder>
{

    private LayoutInflater layoutInflater;
    private Context c;
    private List<LabModelJson> list_of_lab_profiles;
    private List<LabModelJson> searchItems;

    String image_URL ="http://doctortest.quellxcode.com/doctor-api/images/";


    public search_laboratory_from_user_profile_recycler_view(List<LabModelJson> list_of_lab_profiles,Context c){
        this.list_of_lab_profiles = list_of_lab_profiles;
        this.c = c;
        searchItems = new ArrayList<>(list_of_lab_profiles);
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.laboratories_search_for_user,parent,false);
        return new myViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        LabModelJson lab_profiles = list_of_lab_profiles.get(position);
        //holder.user_profile_doctor.setImageResource(doctor_profiles.getDoctor_profile_image());
        Glide.with(c).load(image_URL + lab_profiles.getLabImgName()).into(holder.user_profile_doctor);
        holder.doctor_name.setText(lab_profiles.getLabName());
        holder.doctor_occupation.setText(lab_profiles.getLabAddress());
        try {
        String facebook_url = (String) lab_profiles.getFacebook();
        String twitter_url = (String) lab_profiles.getTwitter();
        String linkedin_url = (String) lab_profiles.getLinkedin();

        final Uri facebook_URL = Uri.parse("http://" + facebook_url);
        final Uri twitter_URL = Uri.parse("http://" + twitter_url);
        final Uri linkedin_URL = Uri.parse("http://" + linkedin_url);

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

}
        catch (NullPointerException e){
            e.printStackTrace();
        }
    }


    @Override
    public int getItemCount() {
        return list_of_lab_profiles.size();
    }



    public void filteredListing(ArrayList<LabModelJson> filteredList) {

        list_of_lab_profiles = filteredList;
        notifyDataSetChanged();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{


        public ImageView facebook_user_doctor_social_media,user_profile_doctor,linkedin_user_doctor_social_media,twitter_user_doctor_social_media;
        public TextView doctor_name,doctor_occupation;
        public Button user_profile_view_profile;

        public myViewHolder(View itemView) {
            super(itemView);
            user_profile_doctor = itemView.findViewById(R.id.user_laboratory_name);
            doctor_name = itemView.findViewById(R.id.laboratory_name);
            doctor_occupation = itemView.findViewById(R.id.laboratory_specialist);
            facebook_user_doctor_social_media = itemView.findViewById(R.id.facebook_user_laboratory_social_media);
            twitter_user_doctor_social_media = itemView.findViewById(R.id.twitter_user_laboratory_social_media);
            linkedin_user_doctor_social_media = itemView.findViewById(R.id.linkedin_user_laboratory_social_media);
            user_profile_view_profile = itemView.findViewById(R.id.laboratory_profile_view_profile);

        }

    }
}