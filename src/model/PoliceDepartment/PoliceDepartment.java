/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PoliceDepartment;

import java.util.ArrayList;
import model.Requests.Request;

/**
 *
 * @author dhruv
 */
public class PoliceDepartment {
    private String fullName;
    private String userName;
    private String address;
    private Boolean availability;
    private ArrayList<Request> requests = new ArrayList<>();
    

    public PoliceDepartment(String fullName, String userName, String address, Boolean availability) {
        this.fullName = fullName;
        this.userName = userName;
        this.address = address;
        this.availability = availability;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    
    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }
    
    @Override
    public String toString() {
        return userName;
    }
}
