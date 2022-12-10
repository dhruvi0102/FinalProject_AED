/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAdmin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhruv
 */
public class AdminDirectory {
    private ArrayList<Admin> admins = new ArrayList<>();
    private Admin admin;

    public AdminDirectory() {
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> policeDepts) {
        this.admins = policeDepts;
    }

    public Admin createAdmin(String name, String uname, String address) {
//        System.out.println("uname:::" + policeDepts.size());
        admin = new Admin(name, uname,address);
        admins.add(admin);
        return admin;
    }
    
    public void updateAdmin(String name, String uname,String address) {
        admin.setFullName(name);
        admin.setUserName(uname);
        admin.setAddress(address);    
    }

    public void deleteAdmin(String uname) {
        Admin currUser = null;
        for (Admin p : admins) {
            System.out.println("totiong" + p.toString());
            if (p.getUserName().equals(uname)) {
                currUser = p;
                break;
            }
        }

        admins.remove(currUser);
    }
    
}
