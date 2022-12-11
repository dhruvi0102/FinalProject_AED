package model;

import model.UserAccount.UserAccount;
import model.Role.SystemAdmin;

/**
 *
 * @author dhruv
 */
public class ConfigureSystem {
    
    public static EcoSystem configure(){
        
        EcoSystem ecosystem = EcoSystem.getInstance();       
        UserAccount ua = ecosystem.getUserAccountDirectory().addUserAccount("admin" ,"sysadmin", "sysadmin",null,null, new SystemAdmin());
        
        return ecosystem;
    }
    
}
