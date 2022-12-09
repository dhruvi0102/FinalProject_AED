/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import model.EcoSystem;
import UI.SystemAdmin.SystemAdminWorkAreaJPanel;

/**
 *
 * @author dhruv
 */
public class SystemAdmin extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
