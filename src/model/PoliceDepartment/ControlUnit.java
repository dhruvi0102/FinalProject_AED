/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.PoliceDepartment;

/**
 *
 * @author dhruv
 */
public class ControlUnit {
    private String criticalcontrolUnit;
    private String trafficcontrolUnit;
    
    public ControlUnit(String criticalcontrolUnit,String trafficcontrolUnit ){
        this.criticalcontrolUnit = criticalcontrolUnit;
        this.trafficcontrolUnit = trafficcontrolUnit;
    }

    public String getCriticalcontrolUnit() {
        return criticalcontrolUnit;
    }

    public void setCriticalcontrolUnit(String criticalcontrolUnit) {
        this.criticalcontrolUnit = criticalcontrolUnit;
    }

    public String getTrafficcontrolUnit() {
        return trafficcontrolUnit;
    }

    public void setTrafficcontrolUnit(String trafficcontrolUnit) {
        this.trafficcontrolUnit = trafficcontrolUnit;
    }

    
}
