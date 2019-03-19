
package com.example.abdullahkhan.doktorchain.modelClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Doctor {

    @SerializedName("doctor_name")
    @Expose
    private String doctorName;
    @SerializedName("doctor_specialization")
    @Expose
    private String doctorSpecialization;
    @SerializedName("doctor_pmdc")
    @Expose
    private String doctorPmdc;

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(String doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }

    public String getDoctorPmdc() {
        return doctorPmdc;
    }

    public void setDoctorPmdc(String doctorPmdc) {
        this.doctorPmdc = doctorPmdc;
    }

}
