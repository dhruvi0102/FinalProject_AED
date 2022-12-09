/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAdmin;

import java.util.ArrayList;
import model.Requests.Request;

/**
 *
 * @author dhruv
 */
public class User {
    private String fullName;
    private String userName;
    private String category;
    private String Address;
    private String Contact;

    private ArrayList<Request> requests = new ArrayList<>();
    
    public User() {
    }

    public User(String fullName, String uname) {
        this.fullName = fullName;
        this.userName = uname;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }
    
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }
    
    @Override
    public String toString() {
        return userName;
    }
}
