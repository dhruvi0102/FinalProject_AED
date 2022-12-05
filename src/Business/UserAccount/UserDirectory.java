/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAccount;

import model.Worker.Worker;
import java.util.ArrayList;
import model.Role.Role;

/**
 *
 * @author dhruv
 */
public class UserDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount addUserAccount(String name, String username, String password, Worker worker, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setName(name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setWorker(worker);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void updateUserAccount(UserAccount account, String name, String uname, String password) {
        account.setName(name);
        account.setUsername(uname);
        account.setPassword(password);    
    }
    
    public void deleteUserAccount(UserAccount user) {
        userAccountList.remove(user);
    }
    
    public boolean IsUsernameUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
