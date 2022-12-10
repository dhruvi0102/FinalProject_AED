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
public class UserDirectory {
    private ArrayList<User> userAdmin = new ArrayList<>();
    private User userAdm;

    public UserDirectory() {
    }

    public List<User> getUserAdmin() {
        return userAdmin;
    }

    public void setUserAdmin(ArrayList<User> policeDepts) {
        this.userAdmin = policeDepts;
    }

    public User createUserAdmin(String name, String uname) {
//        System.out.println("uname:::" + policeDepts.size());
        userAdm = new User(name, uname);
        userAdmin.add(userAdm);
        return userAdm;
    }

    public void updateUser(String name, String uname) {
        userAdm.setFullName(name);
        userAdm.setUserName(uname);
    }
    
    public void deleteUser(String uname) {
        User currUser = null;
        for (User p : userAdmin) {
            System.out.println("totiong" + p.toString());
            if (p.getUserName().equals(uname)) {
                currUser = p;
                break;
            }
        }

        userAdmin.remove(currUser);
    }
}
