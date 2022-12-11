/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.FireDepartment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author siddhant
 */
public class FireDepartmentDirectory {
    private ArrayList<FireDepartment> fireSquad = new ArrayList<>();
    private FireDepartment fired;

    public FireDepartmentDirectory() {
    }

    public List<FireDepartment> getfireSquad() {
        return fireSquad;
    }

    public void setfireSquad(ArrayList<FireDepartment> fireDepts) {
        this.fireSquad = fireDepts;
    }

    public FireDepartment createfireSquad(String fullName, String userName, String Location, Boolean availability) {

        fired = new FireDepartment(fullName, userName, Location, availability);
        fireSquad.add(fired);
        return fired;
    }

    public void updateFireSquad(String name, String uname,String address, Boolean status) {
        fired.setFullName(name);
        fired.setEmail(uname);   
        fired.setAdress(address);
        fired.setAvailability(status);
    }
    
    public void deleteDepartment(String uname) {
        FireDepartment currentDepartment = null;
        for (FireDepartment fd : fireSquad) {
            if (!fd.getFullName().equals(uname)) {
                continue;
            }
            currentDepartment = fd;
            break;
        }

        fireSquad.remove(currentDepartment);
    }
     public void updatefireDepartment(String name, String uname,String address, Boolean status) {
        fired.setFullName(name);
        fired.setEmail(uname);   
        fired.setAddress(address);
        fired.setAvailability(status);
    }
}
