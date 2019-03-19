
package com.example.abdullahkhan.doktorchain.modelClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LabModelJson {

    @SerializedName("lab_id")
    @Expose
    private String labId;
    @SerializedName("lab_name")
    @Expose
    private String labName;
    @SerializedName("lab_address")
    @Expose
    private String labAddress;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("lab_contact_num")
    @Expose
    private String labContactNum;
    @SerializedName("lab_email")
    @Expose
    private String labEmail;
    @SerializedName("lab_website_url")
    @Expose
    private String labWebsiteUrl;
    @SerializedName("lab_info")
    @Expose
    private String labInfo;
    @SerializedName("lab_start_time")
    @Expose
    private String labStartTime;
    @SerializedName("lab_end_time")
    @Expose
    private String labEndTime;
    @SerializedName("working_days")
    @Expose
    private String workingDays;
    @SerializedName("lab_logo_img")
    @Expose
    private String labLogoImg;
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
    @SerializedName("lab_status")
    @Expose
    private String labStatus;
    @SerializedName("slider_status")
    @Expose
    private String sliderStatus;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("created_by")
    @Expose
    private String createdBy;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("updated_by")
    @Expose
    private String updatedBy;
    @SerializedName("lab_test_id")
    @Expose
    private Object labTestId;
    @SerializedName("lab_test_name")
    @Expose
    private Object labTestName;
    @SerializedName("lab_test_desc")
    @Expose
    private Object labTestDesc;
    @SerializedName("lab_test_timing")
    @Expose
    private Object labTestTiming;
    @SerializedName("lab_test_fee")
    @Expose
    private Object labTestFee;
    @SerializedName("lab_test_info")
    @Expose
    private Object labTestInfo;
    @SerializedName("incase_of_emergency")
    @Expose
    private Object incaseOfEmergency;
    @SerializedName("lab_id_fk")
    @Expose
    private String labIdFk;
    @SerializedName("lab_img_id")
    @Expose
    private String labImgId;
    @SerializedName("lab_img_name")
    @Expose
    private String labImgName;
    @SerializedName("lab_img_path")
    @Expose
    private String labImgPath;

    public String getLabId() {
        return labId;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabAddress() {
        return labAddress;
    }

    public void setLabAddress(String labAddress) {
        this.labAddress = labAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLabContactNum() {
        return labContactNum;
    }

    public void setLabContactNum(String labContactNum) {
        this.labContactNum = labContactNum;
    }

    public String getLabEmail() {
        return labEmail;
    }

    public void setLabEmail(String labEmail) {
        this.labEmail = labEmail;
    }

    public String getLabWebsiteUrl() {
        return labWebsiteUrl;
    }

    public void setLabWebsiteUrl(String labWebsiteUrl) {
        this.labWebsiteUrl = labWebsiteUrl;
    }

    public String getLabInfo() {
        return labInfo;
    }

    public void setLabInfo(String labInfo) {
        this.labInfo = labInfo;
    }

    public String getLabStartTime() {
        return labStartTime;
    }

    public void setLabStartTime(String labStartTime) {
        this.labStartTime = labStartTime;
    }

    public String getLabEndTime() {
        return labEndTime;
    }

    public void setLabEndTime(String labEndTime) {
        this.labEndTime = labEndTime;
    }

    public String getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    public String getLabLogoImg() {
        return labLogoImg;
    }

    public void setLabLogoImg(String labLogoImg) {
        this.labLogoImg = labLogoImg;
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

    public String getLabStatus() {
        return labStatus;
    }

    public void setLabStatus(String labStatus) {
        this.labStatus = labStatus;
    }

    public String getSliderStatus() {
        return sliderStatus;
    }

    public void setSliderStatus(String sliderStatus) {
        this.sliderStatus = sliderStatus;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Object getLabTestId() {
        return labTestId;
    }

    public void setLabTestId(Object labTestId) {
        this.labTestId = labTestId;
    }

    public Object getLabTestName() {
        return labTestName;
    }

    public void setLabTestName(Object labTestName) {
        this.labTestName = labTestName;
    }

    public Object getLabTestDesc() {
        return labTestDesc;
    }

    public void setLabTestDesc(Object labTestDesc) {
        this.labTestDesc = labTestDesc;
    }

    public Object getLabTestTiming() {
        return labTestTiming;
    }

    public void setLabTestTiming(Object labTestTiming) {
        this.labTestTiming = labTestTiming;
    }

    public Object getLabTestFee() {
        return labTestFee;
    }

    public void setLabTestFee(Object labTestFee) {
        this.labTestFee = labTestFee;
    }

    public Object getLabTestInfo() {
        return labTestInfo;
    }

    public void setLabTestInfo(Object labTestInfo) {
        this.labTestInfo = labTestInfo;
    }

    public Object getIncaseOfEmergency() {
        return incaseOfEmergency;
    }

    public void setIncaseOfEmergency(Object incaseOfEmergency) {
        this.incaseOfEmergency = incaseOfEmergency;
    }

    public String getLabIdFk() {
        return labIdFk;
    }

    public void setLabIdFk(String labIdFk) {
        this.labIdFk = labIdFk;
    }

    public String getLabImgId() {
        return labImgId;
    }

    public void setLabImgId(String labImgId) {
        this.labImgId = labImgId;
    }

    public String getLabImgName() {
        return labImgName;
    }

    public void setLabImgName(String labImgName) {
        this.labImgName = labImgName;
    }

    public String getLabImgPath() {
        return labImgPath;
    }

    public void setLabImgPath(String labImgPath) {
        this.labImgPath = labImgPath;
    }

}
