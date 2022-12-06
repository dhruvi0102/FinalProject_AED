/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Requests;

import java.util.ArrayList;

/**
 *
 * @author dhruv
 */
public class RequestDirectory {
    private ArrayList<Request> requests = new ArrayList<>();
    private Request request;

    public RequestDirectory(Request request) {
        this.request = request;
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }

    public RequestDirectory() {
    }

    public Request createRequest(String personName, String personLocation, String area, String typeOfEmergency, String comments, String date, String selectedHospital, String selectedFireDept, String selectedPoliceDept, String selectedShelter, String status) {
        System.out.println("createRequest:::" + requests.size());
        request = new Request(personName, personLocation, area, typeOfEmergency, comments, date, selectedHospital, selectedFireDept, selectedPoliceDept, selectedShelter, status);
        requests.add(request);
        return request;
    }

    public void deleteRequest(String reqID) {
        System.out.println("size insed del:::" + requests.size());
        Request currReq = null;
        for (Request req : requests) {
            System.out.println("totiong" + req.toString());
            if (req.getRequestId().equals(reqID)) {
                currReq = req;
                break;
            }
        }

        requests.remove(currReq);
    } 
}
