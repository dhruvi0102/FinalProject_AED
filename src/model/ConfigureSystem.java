package model;

import model.UserAccount.UserAccount;
import model.Worker.Worker;
import model.Role.SystemAdmin;

/**
 *
 * @author dhruv
 */
public class ConfigureSystem {
    
    public static EcoSystem configure(){
        
        EcoSystem ecosystem = EcoSystem.getInstance();
        Worker employee = ecosystem.getWorkerDirectory().createEmployee("RRH");        
        UserAccount ua = ecosystem.getUserAccountDirectory().addUserAccount("admin" ,"sysadmin", "sysadmin", employee, new SystemAdmin());
        
        return ecosystem;
    }
    
}
