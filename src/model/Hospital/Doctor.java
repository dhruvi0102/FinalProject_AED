/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Hospital;

/**
 *
 * @author shreyansipatel
 */
public class Doctor {
    
    String doctor_FullName;
    String npi_Code;

    public String getDoctor_FullName() {
        return doctor_FullName;
    }

    public void setDoctor_FullName(String doctor_FullName) {
        this.doctor_FullName = doctor_FullName;
    }

    public String getNpi_Code() {
        return npi_Code;
    }

    public void setNpi_Code(String npi_Code) {
        this.npi_Code = npi_Code;
    }

    public Doctor(String doctor_FullName, String npi_Code) {
        this.doctor_FullName = doctor_FullName;
        this.npi_Code = npi_Code;
    }
    
}
