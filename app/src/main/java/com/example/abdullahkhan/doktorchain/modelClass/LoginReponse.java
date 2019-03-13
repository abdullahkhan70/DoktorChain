
package com.example.abdullahkhan.doktorchain.modelClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginReponse {

    @SerializedName("data")
    @Expose
    public Data data;

    public class Data {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("role")
        @Expose
        private String role;
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
        private String doctorImgId;
        @SerializedName("doctor_img_name")
        @Expose
        private String doctorImgName;
        @SerializedName("doctor_img_path")
        @Expose
        private String doctorImgPath;
        @SerializedName("doctor_reg_id_fk")
        @Expose
        private String doctorRegIdFk;

        public String getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public String getRole() {
            return role;
        }

        public String getDoctorRegId() {
            return doctorRegId;
        }

        public String getDoctorName() {
            return doctorName;
        }

        public String getRegistrationNum() {
            return registrationNum;
        }

        public String getFieldOfSpecialization() {
            return fieldOfSpecialization;
        }

        public String getMedicalArea() {
            return medicalArea;
        }

        public String getDegree() {
            return degree;
        }

        public String getJobInstitute() {
            return jobInstitute;
        }

        public String getDesignation() {
            return designation;
        }

        public String getExperienceYear() {
            return experienceYear;
        }

        public String getEmail() {
            return email;
        }

        public String getDocPassword() {
            return docPassword;
        }

        public String getAppoinmentProcedure() {
            return appoinmentProcedure;
        }

        public String getFee() {
            return fee;
        }

        public String getAvailableStatus() {
            return availableStatus;
        }

        public String getAppoinmentContactNum() {
            return appoinmentContactNum;
        }

        public String getIncaseEmergency() {
            return incaseEmergency;
        }

        public String getDoctorContactNum() {
            return doctorContactNum;
        }

        public String getDoctorAddress() {
            return doctorAddress;
        }

        public String getCity() {
            return city;
        }

        public String getMajorAchievement() {
            return majorAchievement;
        }

        public String getMajorSuccess() {
            return majorSuccess;
        }

        public String getIceContactNo() {
            return iceContactNo;
        }

        public String getDescription() {
            return description;
        }

        public String getDeservingPatientStatus() {
            return deservingPatientStatus;
        }

        public String getDeservingContactNo() {
            return deservingContactNo;
        }

        public String getDeservingAccountNo() {
            return deservingAccountNo;
        }

        public String getStartTime() {
            return startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public String getVoluntaryWorkingtime() {
            return voluntaryWorkingtime;
        }

        public String getWorkingDays() {
            return workingDays;
        }

        public String getUserIdFk() {
            return userIdFk;
        }

        public String getFacebook() {
            return facebook;
        }

        public String getTwitter() {
            return twitter;
        }

        public String getLinkedin() {
            return linkedin;
        }

        public String getGoogleplus() {
            return googleplus;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public String getUpdatedBy() {
            return updatedBy;
        }

        public String getDoctorImgId() {
            return doctorImgId;
        }

        public String getDoctorImgName() {
            return doctorImgName;
        }

        public String getDoctorImgPath() {
            return doctorImgPath;
        }

        public String getDoctorRegIdFk() {
            return doctorRegIdFk;
        }
    }


    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("role")
    @Expose
    private String role;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
