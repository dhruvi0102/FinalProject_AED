/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.FireDepartment;


import java.util.ArrayList;
import model.Requests.Request;

/**
 *
 * @author siddh
 */
public class FireDepartment {

    private String fullName;
    private String email;
    private String location;
    Boolean availability;
    private ArrayList<Request> requests = new ArrayList<>();
    
    

    public FireDepartment() {
    }

    public FireDepartment(String name, String uname, String address, Boolean status) {
        this.fullName = name;
        this.email = uname;
        this.location = address;
        this.availability = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLocation() {
        return location;
    }

    public void setAdress(String address) {
        this.location = address;
    }
    
    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }

    @Override
    public String toString() {
        return email;
    }

}
