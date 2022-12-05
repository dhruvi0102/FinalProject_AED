/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Worker to edit this template
 */
package model.Worker;

/**
 *
 * @author dhruv
 */
public class Worker {
    
    private String fullName;
    private int ID;
    private static int count = 1;
    
    public Worker(){
        ID = count;
        count++;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
