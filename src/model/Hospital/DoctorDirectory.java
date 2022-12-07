/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Hospital;

import java.util.ArrayList;

/**
 *
 * @author shreyansipatel
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorList = new ArrayList<>();
    private Doctor doctor;

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    public Doctor createDoctor(String doctor_Name, String npi_Code) {
        doctor = new Doctor(doctor_Name, npi_Code);
        doctorList.add(doctor);
        return doctor;
    }
    
}
