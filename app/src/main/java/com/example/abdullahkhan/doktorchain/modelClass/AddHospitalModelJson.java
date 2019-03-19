
package com.example.abdullahkhan.doktorchain.modelClass;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddHospitalModelJson {

    @SerializedName("hospital_name")
    @Expose
    private String hospitalName;
    @SerializedName("hospital_address")
    @Expose
    private String hospitalAddress;
    @SerializedName("hospital_city")
    @Expose
    private String hospitalCity;
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
    private String facebook;
    @SerializedName("files")
    @Expose
    private String files;
    @SerializedName("doctors")
    @Expose
    private List<Doctor> doctors = null;

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

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
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

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

}
