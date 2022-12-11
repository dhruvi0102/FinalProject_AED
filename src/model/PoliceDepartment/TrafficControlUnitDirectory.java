/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PoliceDepartment;

import java.util.ArrayList;

/**
 *
 * @author dhruv
 */
public class TrafficControlUnitDirectory {
    private ArrayList<TrafficControlUnit> tcontrolUnit = new ArrayList<>();
    private TrafficControlUnit tcntrlunit;
    
    public ArrayList<TrafficControlUnit> getTrafficControlUnit() {
        return tcontrolUnit;
    }
    
    public void setTrafficControlUnit(ArrayList<TrafficControlUnit> controlunit) {
        this.tcontrolUnit = controlunit;
    }

    public TrafficControlUnit getTCntrlunit() {
        return tcntrlunit;
    }

    public void setTCntrlunit(TrafficControlUnit cntrlunit) {
        this.tcntrlunit = cntrlunit;
    }

    public TrafficControlUnit createTUDirectory(String trafficControlUnit) {
        tcntrlunit = new TrafficControlUnit(trafficControlUnit);
        tcontrolUnit.add(tcntrlunit);
        return tcntrlunit;
    }
}
