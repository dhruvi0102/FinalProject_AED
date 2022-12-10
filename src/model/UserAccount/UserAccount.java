package model.UserAccount;

import model.Role.Role;
import model.WorkRequest.WorkRequestDirectory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dhruv
 */
public class UserAccount {
    
    private String fullName;
    private String userName;
    private String password;
    private String address;
    private String contact;
    private String email;
    private Boolean status;

   
    //private Worker worker;
    private Role role;
    private WorkRequestDirectory workRequestDir;
    
    public UserAccount() {
        workRequestDir = new WorkRequestDirectory();
    }
      
     public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   /* public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }*/

    public WorkRequestDirectory getWorkRequestDir() {
        return workRequestDir;
    }

    public void setWorkRequestDir(WorkRequestDirectory workRequestDir) {
        this.workRequestDir = workRequestDir;
    }
      
    @Override
    public String toString() {
        return userName;
    }
}
