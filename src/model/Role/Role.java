/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import model.EcoSystem;

/**
 *
 * @author dhruv
 */
public abstract class Role {
    
    public enum RoleType{
        FireDepartmentAdmin("FireDepartmentAdmin"),
        PoliceDepartmentAdmin("PoliceDepartmentAdmin"),
        HospitalAdmin("HospitalAdmin"),
        ShelterAdmin("ShelterAdmin"),
        SystemAdmin("SystemAdmin"),
        CityAdmin("CityAdmin"),
        UserRole("UserRole"),
        AdminRole("AdminRole");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
