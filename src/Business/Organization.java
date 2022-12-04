/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import java.util.ArrayList;

/**
 *
 * @author dhruv
 */
public abstract class Organization {

    private String name;
    private int organizationID;
    private static int counter=0;
    
    public Organization(){
    }
      
    public String getName() {
        return name;
    }

   
}
