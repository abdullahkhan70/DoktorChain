
package com.example.abdullahkhan.doktorchain.modelClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReadDoctor {

    @SerializedName("doctor_reg_id")
    @Expose
    private String doctorRegId;
    @SerializedName("doctor_name")
    @Expose
    private String doctorName;
    @SerializedName("registration_num")
    @Expose
    private String registrationNum;
    @SerializedName("field_of_specialization")
    @Expose
    private String fieldOfSpecialization;
    @SerializedName("medical_area")
    @Expose
    private String medicalArea;
    @SerializedName("degree")
    @Expose
    private String degree;
    @SerializedName("job_institute")
    @Expose
    private String jobInstitute;
    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("experience_year")
    @Expose
    private String experienceYear;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("doc_password")
    @Expose
    private String docPassword;
    @SerializedName("appoinment_procedure")
    @Expose
    private String appoinmentProcedure;
    @SerializedName("fee")
    @Expose
    private String fee;
    @SerializedName("available_status")
    @Expose
    private String availableStatus;
    @SerializedName("appoinment_contact_num")
    @Expose
    private String appoinmentContactNum;
    @SerializedName("incase_emergency")
    @Expose
    private String incaseEmergency;
    @SerializedName("doctor_contact_num")
    @Expose
    private String doctorContactNum;
    @SerializedName("doctor_address")
    @Expose
    private String doctorAddress;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("major_achievement")
    @Expose
    private String majorAchievement;
    @SerializedName("major_success")
    @Expose
    private String majorSuccess;
    @SerializedName("ice_contact_no")
    @Expose
    private String iceContactNo;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("deserving_patient_status")
    @Expose
    private String deservingPatientStatus;
    @SerializedName("deserving_contact_no")
    @Expose
    private String deservingContactNo;
    @SerializedName("deserving_account_no")
    @Expose
    private String deservingAccountNo;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("end_time")
    @Expose
    private String endTime;
    @SerializedName("voluntary_workingtime")
    @Expose
    private String voluntaryWorkingtime;
    @SerializedName("working_days")
    @Expose
    private String workingDays;
    @SerializedName("user_id_fk")
    @Expose
    private String userIdFk;
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
    @SerializedName("doctor_img_id")
    @Expose
    private Object doctorImgId;
    @SerializedName("doctor_img_name")
    @Expose
    private Object doctorImgName;
    @SerializedName("doctor_img_path")
    @Expose
    private Object doctorImgPath;
    @SerializedName("doctor_reg_id_fk")
    @Expose
    private Object doctorRegIdFk;

    public String getDoctorRegId() {
        return doctorRegId;
    }

    public void setDoctorRegId(String doctorRegId) {
        this.doctorRegId = doctorRegId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    public String getFieldOfSpecialization() {
        return fieldOfSpecialization;
    }

    public void setFieldOfSpecialization(String fieldOfSpecialization) {
        this.fieldOfSpecialization = fieldOfSpecialization;
    }

    public String getMedicalArea() {
        return medicalArea;
    }

    public void setMedicalArea(String medicalArea) {
        this.medicalArea = medicalArea;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getJobInstitute() {
        return jobInstitute;
    }

    public void setJobInstitute(String jobInstitute) {
        this.jobInstitute = jobInstitute;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(String experienceYear) {
        this.experienceYear = experienceYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocPassword() {
        return docPassword;
    }

    public void setDocPassword(String docPassword) {
        this.docPassword = docPassword;
    }

    public String getAppoinmentProcedure() {
        return appoinmentProcedure;
    }

    public void setAppoinmentProcedure(String appoinmentProcedure) {
        this.appoinmentProcedure = appoinmentProcedure;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getAvailableStatus() {
        return availableStatus;
    }

    public void setAvailableStatus(String availableStatus) {
        this.availableStatus = availableStatus;
    }

    public String getAppoinmentContactNum() {
        return appoinmentContactNum;
    }

    public void setAppoinmentContactNum(String appoinmentContactNum) {
        this.appoinmentContactNum = appoinmentContactNum;
    }

    public String getIncaseEmergency() {
        return incaseEmergency;
    }

    public void setIncaseEmergency(String incaseEmergency) {
        this.incaseEmergency = incaseEmergency;
    }

    public String getDoctorContactNum() {
        return doctorContactNum;
    }

    public void setDoctorContactNum(String doctorContactNum) {
        this.doctorContactNum = doctorContactNum;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMajorAchievement() {
        return majorAchievement;
    }

    public void setMajorAchievement(String majorAchievement) {
        this.majorAchievement = majorAchievement;
    }

    public String getMajorSuccess() {
        return majorSuccess;
    }

    public void setMajorSuccess(String majorSuccess) {
        this.majorSuccess = majorSuccess;
    }

    public String getIceContactNo() {
        return iceContactNo;
    }

    public void setIceContactNo(String iceContactNo) {
        this.iceContactNo = iceContactNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeservingPatientStatus() {
        return deservingPatientStatus;
    }

    public void setDeservingPatientStatus(String deservingPatientStatus) {
        this.deservingPatientStatus = deservingPatientStatus;
    }

    public String getDeservingContactNo() {
        return deservingContactNo;
    }

    public void setDeservingContactNo(String deservingContactNo) {
        this.deservingContactNo = deservingContactNo;
    }

    public String getDeservingAccountNo() {
        return deservingAccountNo;
    }

    public void setDeservingAccountNo(String deservingAccountNo) {
        this.deservingAccountNo = deservingAccountNo;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getVoluntaryWorkingtime() {
        return voluntaryWorkingtime;
    }

    public void setVoluntaryWorkingtime(String voluntaryWorkingtime) {
        this.voluntaryWorkingtime = voluntaryWorkingtime;
    }

    public String getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    public String getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(String userIdFk) {
        this.userIdFk = userIdFk;
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

    public Object getDoctorImgId() {
        return doctorImgId;
    }

    public void setDoctorImgId(Object doctorImgId) {
        this.doctorImgId = doctorImgId;
    }

    public Object getDoctorImgName() {
        return doctorImgName;
    }

    public void setDoctorImgName(Object doctorImgName) {
        this.doctorImgName = doctorImgName;
    }

    public Object getDoctorImgPath() {
        return doctorImgPath;
    }

    public void setDoctorImgPath(Object doctorImgPath) {
        this.doctorImgPath = doctorImgPath;
    }

    public Object getDoctorRegIdFk() {
        return doctorRegIdFk;
    }

    public void setDoctorRegIdFk(Object doctorRegIdFk) {
        this.doctorRegIdFk = doctorRegIdFk;
    }

}
