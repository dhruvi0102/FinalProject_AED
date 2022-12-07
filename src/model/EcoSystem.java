/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import model.PoliceDepartment.ControlUnitDirectory;
import model.PoliceDepartment.PoliceDepartmentDirectory;
import model.Requests.RequestDirectory;
import model.Role.Role;
import model.Role.SystemAdmin;


/**
 *
 * @author dhruv
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private RequestDirectory requestDirectory;
    private ControlUnitDirectory controlUnitDirectory;
    private PoliceDepartmentDirectory policeDeptDirectory;

    public EcoSystem(PoliceDepartmentDirectory policeDeptDirectory,ControlUnitDirectory controlUnitDirectory, RequestDirectory requestDirectory) {
        super(null);
        this.policeDeptDirectory = policeDeptDirectory;
        this.controlUnitDirectory = controlUnitDirectory;
        this.requestDirectory = requestDirectory;
    }
    
    private EcoSystem() {
        super(null);
        // networkList=new ArrayList<Network>();
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
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdmin());
        return roleList;
    }

}
