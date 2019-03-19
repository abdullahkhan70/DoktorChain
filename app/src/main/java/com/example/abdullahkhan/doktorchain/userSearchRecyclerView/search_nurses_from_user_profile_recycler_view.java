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
import com.example.abdullahkhan.doktorchain.modelClass.NursesModelJson;

import java.util.ArrayList;
import java.util.List;


public class search_nurses_from_user_profile_recycler_view extends RecyclerView.Adapter<search_nurses_from_user_profile_recycler_view.myViewHolder>
{

    private LayoutInflater layoutInflater;
    private Context c;
    private List<NursesModelJson> list_of_nurse_profiles;
    private List<NursesModelJson> searchItems;

    String image_URL ="http://doctortest.quellxcode.com/doctor-api/images/";


    public search_nurses_from_user_profile_recycler_view(List<NursesModelJson> list_of_nurse_profiles,Context c){
        this.list_of_nurse_profiles = list_of_nurse_profiles;
        this.c = c;
        searchItems = new ArrayList<>(list_of_nurse_profiles);
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.nurses_search_for_user,parent,false);
        return new myViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        NursesModelJson nurses_profiles = list_of_nurse_profiles.get(position);
        //holder.user_profile_doctor.setImageResource(doctor_profiles.getDoctor_profile_image());
        Glide.with(c).load(image_URL + nurses_profiles.getNurseImgName()).into(holder.user_profile_nurses);
        holder.nurses_name.setText(nurses_profiles.getNurseName());
        holder.nurses_occupation.setText(nurses_profiles.getNurseSpec());
        try {
            String facebook_url = (String) nurses_profiles.getFacebook();
            String twitter_url = (String) nurses_profiles.getTwitter();
            String linkedin_url = (String) nurses_profiles.getLinkedin();

            final Uri facebook_URL = Uri.parse("http://" + facebook_url);
            final Uri twitter_URL = Uri.parse("http://" + twitter_url);
            final Uri linkedin_URL = Uri.parse("http://" + linkedin_url);

            holder.facebook_user_nurses_social_media.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, facebook_URL));
                }
            });

            holder.twitter_user_nurses_social_media.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(Intent.ACTION_VIEW, twitter_URL));
                }
            });

            holder.linkedin_user_nurses_social_media.setOnClickListener(new View.OnClickListener() {
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
        return list_of_nurse_profiles.size();
    }



    public void filteredListing(ArrayList<NursesModelJson> filteredList) {

        list_of_nurse_profiles = filteredList;
        notifyDataSetChanged();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{


        public ImageView facebook_user_nurses_social_media,user_profile_nurses,linkedin_user_nurses_social_media,twitter_user_nurses_social_media;
        public TextView nurses_name,nurses_occupation;
        public Button user_profile_view_profile;

        public myViewHolder(View itemView) {
            super(itemView);
            user_profile_nurses = itemView.findViewById(R.id.user_nurses_name);
            nurses_name = itemView.findViewById(R.id.nurses_name);
            nurses_occupation = itemView.findViewById(R.id.nurses_specialist);
            facebook_user_nurses_social_media = itemView.findViewById(R.id.facebook_user_nurses_social_media);
            twitter_user_nurses_social_media = itemView.findViewById(R.id.twitter_user_nurses_social_media);
            linkedin_user_nurses_social_media = itemView.findViewById(R.id.linkedin_user_nurses_social_media);
            user_profile_view_profile = itemView.findViewById(R.id.nurses_profile_view_profile);

        }

    }
}