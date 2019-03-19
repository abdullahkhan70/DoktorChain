
package com.example.abdullahkhan.doktorchain.modelClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReadHospitals {

    @SerializedName("hospital_id")
    @Expose
    private String hospitalId;
    @SerializedName("hospital_name")
    @Expose
    private String hospitalName;
    @SerializedName("hospital_address")
    @Expose
    private String hospitalAddress;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("hospital_contact_num")
    @Expose
    private String hospitalContactNum;
    @SerializedName("hospital_emails")
    @Expose
    private String hospitalEmails;
    @SerializedName("website_link")
    @Expose
    private String websiteLink;
    @SerializedName("hospital_info")
    @Expose
    private String hospitalInfo;
    @SerializedName("emergency_available")
    @Expose
    private String emergencyAvailable;
    @SerializedName("hosp_register_account_no")
    @Expose
    private String hospRegisterAccountNo;
    @SerializedName("hospital_wards")
    @Expose
    private String hospitalWards;
    @SerializedName("hospital_specialization")
    @Expose
    private String hospitalSpecialization;
    @SerializedName("facebook")
    @Expose
    private Object facebook;
    @SerializedName("twitter")
    @Expose
    private Object twitter;
    @SerializedName("linkedin")
    @Expose
    private Object linkedin;
    @SerializedName("googleplus")
    @Expose
    private Object googleplus;
    @SerializedName("hospital_status")
    @Expose
    private String hospitalStatus;
    @SerializedName("slider_status")
    @Expose
    private String sliderStatus;
    @SerializedName("hospital_img_id")
    @Expose
    private Object hospitalImgId;
    @SerializedName("hospital_img_name")
    @Expose
    private Object hospitalImgName;
    @SerializedName("hospital_img_path")
    @Expose
    private Object hospitalImgPath;
    @SerializedName("hospital_id_fk")
    @Expose
    private Object hospitalIdFk;

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHospitalContactNum() {
        return hospitalContactNum;
    }

    public void setHospitalContactNum(String hospitalContactNum) {
        this.hospitalContactNum = hospitalContactNum;
    }

    public String getHospitalEmails() {
        return hospitalEmails;
    }

    public void setHospitalEmails(String hospitalEmails) {
        this.hospitalEmails = hospitalEmails;
    }

    public String getWebsiteLink() {
        return websiteLink;
    }

    public void setWebsiteLink(String websiteLink) {
        this.websiteLink = websiteLink;
    }

    public String getHospitalInfo() {
        return hospitalInfo;
    }

    public void setHospitalInfo(String hospitalInfo) {
        this.hospitalInfo = hospitalInfo;
    }

    public String getEmergencyAvailable() {
        return emergencyAvailable;
    }

    public void setEmergencyAvailable(String emergencyAvailable) {
        this.emergencyAvailable = emergencyAvailable;
    }

    public String getHospRegisterAccountNo() {
        return hospRegisterAccountNo;
    }

    public void setHospRegisterAccountNo(String hospRegisterAccountNo) {
        this.hospRegisterAccountNo = hospRegisterAccountNo;
    }

    public String getHospitalWards() {
        return hospitalWards;
    }

    public void setHospitalWards(String hospitalWards) {
        this.hospitalWards = hospitalWards;
    }

    public String getHospitalSpecialization() {
        return hospitalSpecialization;
    }

    public void setHospitalSpecialization(String hospitalSpecialization) {
        this.hospitalSpecialization = hospitalSpecialization;
    }

    public Object getFacebook() {
        return facebook;
    }

    public void setFacebook(Object facebook) {
        this.facebook = facebook;
    }

    public Object getTwitter() {
        return twitter;
    }

    public void setTwitter(Object twitter) {
        this.twitter = twitter;
    }

    public Object getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(Object linkedin) {
        this.linkedin = linkedin;
    }

    public Object getGoogleplus() {
        return googleplus;
    }

    public void setGoogleplus(Object googleplus) {
        this.googleplus = googleplus;
    }

    public String getHospitalStatus() {
        return hospitalStatus;
    }

    public void setHospitalStatus(String hospitalStatus) {
        this.hospitalStatus = hospitalStatus;
    }

    public String getSliderStatus() {
        return sliderStatus;
    }

    public void setSliderStatus(String sliderStatus) {
        this.sliderStatus = sliderStatus;
    }

    public Object getHospitalImgId() {
        return hospitalImgId;
    }

    public void setHospitalImgId(Object hospitalImgId) {
        this.hospitalImgId = hospitalImgId;
    }

    public Object getHospitalImgName() {
        return hospitalImgName;
    }

    public void setHospitalImgName(Object hospitalImgName) {
        this.hospitalImgName = hospitalImgName;
    }

    public Object getHospitalImgPath() {
        return hospitalImgPath;
    }

    public void setHospitalImgPath(Object hospitalImgPath) {
        this.hospitalImgPath = hospitalImgPath;
    }

    public Object getHospitalIdFk() {
        return hospitalIdFk;
    }

    public void setHospitalIdFk(Object hospitalIdFk) {
        this.hospitalIdFk = hospitalIdFk;
    }

}
