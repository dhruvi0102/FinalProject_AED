/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import model.Role.Role;


/**
 *
 * @author dhruv
 */
public class EcoSystem extends Organization{

    public EcoSystem() {
        super(null);
        // networkList=new ArrayList<Network>();
    }

    public boolean checkIfUserIsUnique(String userName) {
        //
        return false;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
