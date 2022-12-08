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
public class ControlUnitDirectory {
    private ArrayList<ControlUnit> controlUnit = new ArrayList<>();
    private ControlUnit cntrlunit;

    public ArrayList<ControlUnit> getControlUnit() {
        return controlUnit;
    }

    public void setControlUnit(ArrayList<ControlUnit> controlunit) {
        this.controlUnit = controlunit;
    }

    public ControlUnit getCntrlunit() {
        return cntrlunit;
    }

    public void setCntrlunit(ControlUnit cntrlunit) {
        this.cntrlunit = cntrlunit;
    }

    public ControlUnit createCUDirectory(String criticalControlUnitNum, String trafficControlUnit) {
        cntrlunit = new ControlUnit(criticalControlUnitNum,trafficControlUnit);
        controlUnit.add(cntrlunit);
        return cntrlunit;
    }
}
