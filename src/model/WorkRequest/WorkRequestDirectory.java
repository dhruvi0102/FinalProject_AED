/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkRequest;

import java.util.ArrayList;

/**
 *
 * @author dhruv
 */
public class WorkRequestDirectory {
    
    private ArrayList<WorkRequest> workRequestsList;

    public WorkRequestDirectory() {
        workRequestsList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestsList;
    }
}
