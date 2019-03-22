
package com.example.abdullahkhan.doktorchain.modelClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddClinicModelJson {

    @SerializedName("doctor_reg_id_fk")
    @Expose
    private String doctorRegIdFk;
    @SerializedName("clinic_name")
    @Expose
    private String clinicName;
    @SerializedName("clinic_email")
    @Expose
    private String clinicEmail;
    @SerializedName("clinic_locations")
    @Expose
    private String clinicLocations;
    @SerializedName("clinic_start_time")
    @Expose
    private String clinicStartTime;
    @SerializedName("clinic_end_time")
    @Expose
    private String clinicEndTime;
    @SerializedName("working_days")
    @Expose
    private String workingDays;
    @SerializedName("clinic_city")
    @Expose
    private String clinicCity;
    @SerializedName("clinic_specialization")
    @Expose
    private String clinicSpecialization;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("clinic_fee")
    @Expose
    private String clinicFee;
    @SerializedName("clinic_phone")
    @Expose
    private String clinicPhone;
    @SerializedName("facebook")
    @Expose
    private String facebook;
    @SerializedName("twitter")
    @Expose
    private String twitter;
    @SerializedName("linkedin")
    @Expose
    private String linkedin;
    @SerializedName("googleplus")
    @Expose
    private String googleplus;
    @SerializedName("files")
    @Expose
    private String files;

    public String getDoctorRegIdFk() {
        return doctorRegIdFk;
    }

    public void setDoctorRegIdFk(String doctorRegIdFk) {
        this.doctorRegIdFk = doctorRegIdFk;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getClinicEmail() {
        return clinicEmail;
    }

    public void setClinicEmail(String clinicEmail) {
        this.clinicEmail = clinicEmail;
    }

    public String getClinicLocations() {
        return clinicLocations;
    }

    public void setClinicLocations(String clinicLocations) {
        this.clinicLocations = clinicLocations;
    }

    public String getClinicStartTime() {
        return clinicStartTime;
    }

    public void setClinicStartTime(String clinicStartTime) {
        this.clinicStartTime = clinicStartTime;
    }

    public String getClinicEndTime() {
        return clinicEndTime;
    }

    public void setClinicEndTime(String clinicEndTime) {
        this.clinicEndTime = clinicEndTime;
    }

    public String getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    public String getClinicCity() {
        return clinicCity;
    }

    public void setClinicCity(String clinicCity) {
        this.clinicCity = clinicCity;
    }

    public String getClinicSpecialization() {
        return clinicSpecialization;
    }

    public void setClinicSpecialization(String clinicSpecialization) {
        this.clinicSpecialization = clinicSpecialization;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClinicFee() {
        return clinicFee;
    }

    public void setClinicFee(String clinicFee) {
        this.clinicFee = clinicFee;
    }

    public String getClinicPhone() {
        return clinicPhone;
    }

    public void setClinicPhone(String clinicPhone) {
        this.clinicPhone = clinicPhone;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGoogleplus() {
        return googleplus;
    }

    public void setGoogleplus(String googleplus) {
        this.googleplus = googleplus;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

}
