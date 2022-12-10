/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import model.Areas.AreaAdminDirectory;
import model.Areas.AreaDirectory;
import model.PoliceDepartment.ControlUnitDirectory;
import model.PoliceDepartment.PoliceDepartmentDirectory;
import model.Requests.RequestDirectory;
import model.Role.Role;
import model.Role.SystemAdmin;
import model.UserAccount.UserAccountDirectory;
import model.UserAdmin.AdminDirectory;
import model.UserAdmin.UserDirectory;


/**
 *
 * @author dhruv
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private RequestDirectory requestDirectory;
    private ControlUnitDirectory controlUnitDirectory;
    private PoliceDepartmentDirectory policeDeptDirectory;
    private UserDirectory userAdminDirectory;
    private AdminDirectory adminDirectory;
    private AreaAdminDirectory areaAdminDirectory;
    private AreaDirectory areaDirectory;
    
    public EcoSystem(PoliceDepartmentDirectory policeDeptDirectory,ControlUnitDirectory controlUnitDirectory, RequestDirectory requestDirectory,UserDirectory userAdminDirectory,AdminDirectory adminDirectory,AreaAdminDirectory areaAdminDirectory,AreaDirectory areaDirectory) {
        super(null);
        this.policeDeptDirectory = policeDeptDirectory;
        this.controlUnitDirectory = controlUnitDirectory;
        this.requestDirectory = requestDirectory;
        this.userAdminDirectory = userAdminDirectory;
        this.adminDirectory = adminDirectory;
        this.areaAdminDirectory = areaAdminDirectory;
        this.areaDirectory = areaDirectory;
    }
    
    private EcoSystem() {
        super(null);
    }

    public boolean checkIfUserIsUnique(String userName) {
        //     
        return false;
    }
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public PoliceDepartmentDirectory getPoliceDeptDirectory() {
        if (policeDeptDirectory == null) {
            policeDeptDirectory = new PoliceDepartmentDirectory();
        }

        return policeDeptDirectory;
    }

    public void setPoliceDeptDirectory(PoliceDepartmentDirectory policeDeptDirectory) {
        this.policeDeptDirectory = policeDeptDirectory;
    }
    
    public ControlUnitDirectory getControlUnitDirectory() {
         if (controlUnitDirectory == null){
             controlUnitDirectory = new ControlUnitDirectory();
         }
        return controlUnitDirectory;
    }

    public void setControlUnitDirectory(ControlUnitDirectory controlUnitDirectory) {
        this.controlUnitDirectory = controlUnitDirectory;
    }

    public RequestDirectory getRequestDirectory() {
        if (requestDirectory == null) {
            requestDirectory = new RequestDirectory();
        }
        return requestDirectory;
    }

    public void setRequestDirectory(RequestDirectory requestDirectory) {
        this.requestDirectory = requestDirectory;
    }
    
    public UserDirectory getUserAdminDirectory() {
         if(userAdminDirectory == null){
             userAdminDirectory = new UserDirectory();
         }
        return userAdminDirectory;
    }

    public void setUserAdminDirectory(UserDirectory userAdminDirectory) {
        this.userAdminDirectory = userAdminDirectory;
    }
    
    public AdminDirectory getAdminDirectory() {
         if(adminDirectory == null){
             adminDirectory = new AdminDirectory();
         }
        return adminDirectory;
    }

    public void setAdminDirectory(AdminDirectory adminDirectory) {
        this.adminDirectory = adminDirectory;
    }
    
     public AreaAdminDirectory getAreaAdminDirectory() {
         if(areaAdminDirectory == null){
             areaAdminDirectory = new AreaAdminDirectory();
         }
        return areaAdminDirectory;
    }

    public void setAreaAdminDirectory(AreaAdminDirectory areaAdminDirectory) {
        this.areaAdminDirectory = areaAdminDirectory;
    }
    
    public AreaDirectory getAreaDirectory() {
        if (areaDirectory == null) {
            areaDirectory = new AreaDirectory();
        }

        return areaDirectory;
    }

    public void setAreaDirectory(AreaDirectory areaDirectory) {
        this.areaDirectory = areaDirectory;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdmin());
        return roleList;
    }

}
