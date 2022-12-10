/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import model.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import model.Role.Role;
import model.WorkRequest.WorkRequestDirectory;

/**
 *
 * @author dhruv
 */
public abstract class Organization {

    private String fullName;
    private WorkRequestDirectory workRequestDir;
    private UserAccountDirectory userAccountDir;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        FireDeptDAdmin("FireDeptAdmin"),
        PoliceDeptAdmin("PoliceDeptAdmin"),
        HospitalAdmin("HospitalAdmin"),
        NGOAdmin("NGOAdmin"),
        SystemAdmin("SystemAdmin"),
        CityAdmin("CityAdmin"),
        LawyerAdmin("LawyerAdmin"),
        Admin("Admin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String fullName) {
        this.fullName = fullName;
        workRequestDir = new WorkRequestDirectory();
        userAccountDir = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
     public WorkRequestDirectory getWorkRequestDir() {
        return workRequestDir;
    }

    public void setWorkRequestDir(WorkRequestDirectory workRequestDir) {
        this.workRequestDir = workRequestDir;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDir;
    }

    public int getOrganizationID() {
        return organizationID;
    }
    
    @Override
    public String toString() {
        return fullName;
    }

   
}
