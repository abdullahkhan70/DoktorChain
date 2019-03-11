package com.example.abdullahkhan.doktorchain.userSearchGetterAndSetterRecyclerView;

public class search_hospital_getter_and_setter {
    private int doctor_profile_image;
    private String doctor_profile_name;
    private String doctor_profile_destination;
    private int facebook_profile,twitter_profile,linkedin_profile;

    public search_hospital_getter_and_setter(int doctor_profile_image, String doctor_profile_name, String doctor_profile_destination, int facebook_profile, int twitter_profile, int linkedin_profile) {
        this.doctor_profile_image = doctor_profile_image;
        this.doctor_profile_name = doctor_profile_name;
        this.doctor_profile_destination = doctor_profile_destination;
        this.facebook_profile = facebook_profile;
        this.twitter_profile = twitter_profile;
        this.linkedin_profile = linkedin_profile;
    }

    public int getDoctor_profile_image() {
        return doctor_profile_image;
    }

    public void setDoctor_profile_image(int doctor_profile_image) {
        this.doctor_profile_image = doctor_profile_image;
    }

    public String getDoctor_profile_name() {
        return doctor_profile_name;
    }

    public void setDoctor_profile_name(String doctor_profile_name) {
        this.doctor_profile_name = doctor_profile_name;
    }

    public String getDoctor_profile_destination() {
        return doctor_profile_destination;
    }

    public void setDoctor_profile_destination(String doctor_profile_destination) {
        this.doctor_profile_destination = doctor_profile_destination;
    }

    public int getFacebook_profile() {
        return facebook_profile;
    }

    public void setFacebook_profile(int facebook_profile) {
        this.facebook_profile = facebook_profile;
    }

    public int getTwitter_profile() {
        return twitter_profile;
    }

    public void setTwitter_profile(int twitter_profile) {
        this.twitter_profile = twitter_profile;
    }

    public int getLinkedin_profile() {
        return linkedin_profile;
    }

    public void setLinkedin_profile(int linkedin_profile) {
        this.linkedin_profile = linkedin_profile;
    }
}
