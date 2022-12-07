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
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalList = new ArrayList<>();

    private Hospital hospital;

    public HospitalDirectory() {
    }
    
    
    public Hospital createHospital(String hospitalName, String userName, String password, boolean hospitalStatus) {


        System.out.println("createHospital:::" + hospitalName + userName + password);
        hospital = new Hospital(hospitalName, userName, password, hospitalStatus);
        hospitalList.add(hospital);
        System.out.println("uname:::" + hospitalList.size());
        return hospital;
    }

    public ArrayList<Hospital> getHospitalDirectoryList() {
        return hospitalList;
    }

    public void setHospitalDirectoryDirectoryList(ArrayList<Hospital> HospitalDirectoryList) {
        this.hospitalList = HospitalDirectoryList;
    }

    public void deleteHospitalDirectory(String username) {
        for (int i = 0; i < hospitalList.size(); i++) {
            if (hospitalList.get(i).getUserName().equals(username)) {
                hospitalList.remove(i);
            }
        }
    }
    
}
