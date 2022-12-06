/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.FireDepartment;


import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class FireDepartment {

    private String fullName;
    private String email;
    private String location;
    Boolean availability;
    
    

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



    @Override
    public String toString() {
        return email;
    }

}
