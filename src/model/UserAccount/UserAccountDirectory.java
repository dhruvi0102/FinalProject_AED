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
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount addUserAccount(String name, String username, String password,String address,Boolean status, Worker worker, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setFullName(name);
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setAddress(address);
        userAccount.setStatus(status);
        userAccount.setWorker(worker);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void updateUserAccount(UserAccount account, String name, String uname, String password, String address,Boolean status) {
        account.setFullName(name);
        account.setUserName(uname);
        account.setPassword(password); 
        account.setAddress(address);
        account.setStatus(status);
    }
    public void deleteUserAccount(UserAccount user) {
        userAccountList.remove(user);
    }
    
    public boolean IsUsernameUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUserName().equals(username))
                return false;
        }
        return true;
    }
}
