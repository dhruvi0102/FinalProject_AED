/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import UI.SystemAdmin.SystemAdminWorkAreaJPanel;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import model.EcoSystem;

/**
 *
 * @author dhruv
 */
public class SystemAdmin extends Role{
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel();
    }
    
}
