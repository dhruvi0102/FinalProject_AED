/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Hospital;

import java.util.ArrayList;

/**
 *
 * @author shreyansipatel
 */
public class AmbulanceServiceDirectory {
    private ArrayList<AmbulanceService> ambulanceList = new ArrayList<>();
    private AmbulanceService ambulance;

    public ArrayList<AmbulanceService> getAmbulanceList() {
        return ambulanceList;
    }

    public void setAmbulanceList(ArrayList<AmbulanceService> ambulanceList) {
        this.ambulanceList = ambulanceList;
    }
    
    public AmbulanceService getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(AmbulanceService ambulance) {
        this.ambulance = ambulance;
    }
   
    public AmbulanceService createAmbulance(String ambulanceNumber) {
        ambulance = new AmbulanceService(ambulanceNumber);
        ambulanceList.add(ambulance);
        return ambulance;
    }
    
}
