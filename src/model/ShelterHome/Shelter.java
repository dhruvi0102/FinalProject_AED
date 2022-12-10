/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ShelterHome;

import model.Requests.Request;
import java.util.ArrayList;

/**
 *
 * @author shreyansipatel
 */
public class Shelter {
    
    private String shelterName;
    private String userName;
    private String location;
    private Boolean availability;
    
    private ArrayList<Request> requests = new ArrayList<>();

    public String getShelterName() {
        return shelterName;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
    
    
    public Shelter(String userName, String shelterName, String location, Boolean availability) {
        this.shelterName = shelterName;
        this.userName = userName;
        this.location = location;
        this.availability = availability;
    }
    

    @Override
    public String toString() {
        return userName;
    }
}

    

