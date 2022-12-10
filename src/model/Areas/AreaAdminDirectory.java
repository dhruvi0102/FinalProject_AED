/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Areas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhruv
 */
public class AreaAdminDirectory {
     private ArrayList<AreaAdmin> areaAdmin = new ArrayList<>();
    private AreaAdmin area;

    public AreaAdminDirectory() {
    }

    public List<AreaAdmin> getAdmins() {
        return areaAdmin;
    }

    public void setAdmins(ArrayList<AreaAdmin> policeDepts) {
        this.areaAdmin = policeDepts;
    }

    public AreaAdmin createAdmin(String name, String uname) {
        area = new AreaAdmin(name, uname);
        areaAdmin.add(area);
        return area;
    }
    
    public void updateAdmin(String name, String uname) {
        area.setFullName(name);
        area.setUserName(uname);          
    }

    public void deleteAdmin(String uname) {
        AreaAdmin currUser = null;
        for (AreaAdmin p : areaAdmin) {
            System.out.println("totiong" + p.toString());
            if (p.getUserName().equals(uname)) {
                currUser = p;
                break;
            }
        }

        areaAdmin.remove(currUser);
    }
    
}
