/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Worker;

import java.util.ArrayList;

/**
 *
 * @author dhruv
 */
public class WorkerDirectory {
    
    private ArrayList<Worker> workerList;

    public WorkerDirectory() {
        workerList = new ArrayList();
    }

    public ArrayList<Worker> getEmployeeList() {
        return workerList;
    }
    
    public Worker createEmployee(String name){
        Worker employee = new Worker();
        employee.setFullName(name);
        workerList.add(employee);
        return employee;
    }
}
