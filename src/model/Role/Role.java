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
        FireDeptDAdmin("FireDeptAdmin"),
        PoliceDeptAdmin("PoliceDeptAdmin"),
        HospitalAdmin("HospitalAdmin"),
        NGOAdmin("NGOAdmin"),
        SystemAdmin("SystemAdmin"),
        CityAdmin("CityAdmin"),
        LawyerAdmin("LawyerAdmin"),
        Admin("Admin");
       
        
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
