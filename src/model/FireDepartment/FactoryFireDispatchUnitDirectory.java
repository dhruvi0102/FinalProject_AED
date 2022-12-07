/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.FireDepartment;

import java.util.ArrayList;

/**
 *
 * @author siddh
 */
public class FactoryFireDispatchUnitDirectory {
            private ArrayList<FactoryFireDispatchUnit> FactoryFireDispatchUnits = new ArrayList<>();
            private FactoryFireDispatchUnit FactoryFireDispatchUnit;

    public ArrayList<FactoryFireDispatchUnit> getFactoryFireDispatchUnits() {
        return FactoryFireDispatchUnits;
    }

    public void setFactoryFireDispatchUnits(ArrayList<FactoryFireDispatchUnit> FactoryFireDispatchUnits) {
        this.FactoryFireDispatchUnits = FactoryFireDispatchUnits;
    }

    public FactoryFireDispatchUnit getFactoryFireDispatchUnit() {
        return FactoryFireDispatchUnit;
    }

    public void setFactoryFireDispatchUnit(FactoryFireDispatchUnit FactoryFireDispatchUnit) {
        this.FactoryFireDispatchUnit = FactoryFireDispatchUnit;
    }

    public FactoryFireDispatchUnit createIndustrialFireDispatchUnit(String industrialFireUnit) {
        FactoryFireDispatchUnit = new FactoryFireDispatchUnit(industrialFireUnit);
                FactoryFireDispatchUnits.add(FactoryFireDispatchUnit);
                return FactoryFireDispatchUnit;
    } 
}
