/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import UI.FireDepartment.FireLandingJPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;



/**
 *
 * @author dhruv
 */
public class FireDepartmentAdmin extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new FireLandingJPanel(userProcessContainer, account, business);
    }
    
}
