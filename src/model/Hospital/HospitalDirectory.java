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
    
    public ArrayList<Hospital> getHospitalDirectoryList() {
        return hospitalList;
    }

    public void setHospitalDirectoryList(ArrayList<Hospital> HospitalDirectoryList) {
        this.hospitalList = HospitalDirectoryList;
    }
    
    public Hospital createHospital(String name, String uname, String address, boolean status) {
        hospital = new Hospital(name, uname, address, status);
        hospitalList.add(hospital);
        return hospital;
    }
    
    public void updateHospital(String name, String uname,String address, Boolean status){
        hospital.setHospitalName(name);
        hospital.setUserName(uname);
        hospital.setHospitalAddress(address);
        hospital.setHospitalStatus(status);
    }

  

    public void deleteHospitalDirectory(String username) {
        System.out.println("size insed del:::" + hospitalList.size());
        Hospital currentDeptartment = null;
        for (Hospital h : hospitalList) {
            System.out.println("totiong" + h.toString());
            if (h.getHospitalName().equals(username)) {
                currentDeptartment = h;
                break;
            }
        }
        hospitalList.remove(currentDeptartment);
    }
    
}
