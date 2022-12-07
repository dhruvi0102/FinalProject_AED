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
    private ArrayList<ControlUnit> controlunit = new ArrayList<>();
    private ControlUnit cntrlunit;

    public ArrayList<ControlUnit> getCcunits() {
        return controlunit;
    }

    public void setCcunits(ArrayList<ControlUnit> controlunit) {
        this.controlunit = controlunit;
    }

    public ControlUnit getCntrlunit() {
        return cntrlunit;
    }

    public void setCntrlunit(ControlUnit cntrlunit) {
        this.cntrlunit = cntrlunit;
    }

    public ControlUnit createCCUDirectory(String controlUnitNum) {
        cntrlunit = new ControlUnit(controlUnitNum);
        controlunit.add(cntrlunit);
        return cntrlunit;
    }
}
