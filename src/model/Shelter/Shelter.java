/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shelter;

import Business.Request.Request;
import java.util.ArrayList;

/**
 *
 * @author Tanya Shah
 */
public class Shelter {

    String name;
    String userName;
    String location;
    Boolean status;
    private ArrayList<Request> requests = new ArrayList<>();

//    @Override
//    public String toString() {
//        return "Shelter{" + "name=" + name + ", userName=" + userName + ", location=" + location + '}';
//    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }
    
    
    public Shelter(String userName, String name, String location, Boolean status) {
        this.name = name;
        this.userName = userName;
        this.location = location;
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    

    @Override
    public String toString() {
        return userName;
    }
}
