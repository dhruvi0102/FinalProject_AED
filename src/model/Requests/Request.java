/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Requests;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author dhruv
 */
public class Request {
    private String requestId;
    private String personName;
    private String personLocation;
    private String area;
    private String typeOfEmergency;
    private String comments;
    private String date;
    private String selectedHospital;
    private String selectedFireDept;
    private String selectedPoliceDept;
    private String selectedShelter;
    private String status;
    private String entityDesc;

    public Request(String personName, String personLocation, String area, String typeOfEmergency, String comments, String date, String selectedHospital, String selectedFireDept, String selectedPoliceDept, String selectedShelter, String status) {
        int randomInt = ThreadLocalRandom.current().nextInt(1,128);
        this.requestId = String.valueOf(randomInt);
        this.personName = personName;
        this.personLocation = personLocation;
        this.area = area;
        this.typeOfEmergency = typeOfEmergency;
        this.comments = comments;
        this.date = date;
        this.selectedHospital = selectedHospital;
        this.selectedFireDept = selectedFireDept;
        this.selectedPoliceDept = selectedPoliceDept;
        this.selectedShelter = selectedShelter;
        this.status = status;
    }

    public String getSelectedHospital() {
        return selectedHospital;
    }

    public void setSelectedHospital(String selectedHospital) {
        this.selectedHospital = selectedHospital;
    }

    public String getSelectedFireDept() {
        return selectedFireDept;
    }

    public void setSelectedFireDept(String selectedFireDept) {
        this.selectedFireDept = selectedFireDept;
    }

    public String getSelectedPoliceDept() {
        return selectedPoliceDept;
    }

    public void setSelectedPoliceDept(String selectedPoliceDept) {
        this.selectedPoliceDept = selectedPoliceDept;
    }

    public String getSelectedShelter() {
        return selectedShelter;
    }

    public void setSelectedShelter(String selectedShelter) {
        this.selectedShelter = selectedShelter;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        int randomInt = ThreadLocalRandom.current().nextInt(1,128);
        requestId = String.valueOf(randomInt);
        this.requestId = requestId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonLocation() {
        return personLocation;
    }

    public void setPersonLocation(String personLocation) {
        this.personLocation = personLocation;
    }

    public String getTypeOfEmergency() {
        return typeOfEmergency;
    }

    public void setTypeOfEmergency(String typeOfEmergency) {
        this.typeOfEmergency = typeOfEmergency;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEntityDesc() {
        return entityDesc;
    }

    public void setEntityDesc(String entityDesc) {
        this.entityDesc = entityDesc;
    }
 
}
