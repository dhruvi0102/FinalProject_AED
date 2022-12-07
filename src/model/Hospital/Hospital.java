/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Hospital;
import model.Requests.Request ;
import java.util.ArrayList;

/**
 *
 * @author shreyansipatel
 */
public class Hospital {
        private String hospitalName;
        private String hospitalAddress;
        private String userName;
        boolean hospitalStatus;
        private ArrayList<Request> requests = new ArrayList<>();
          
        
        public Hospital() {
            
        }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public boolean isHospitalStatus() {
        return hospitalStatus;
    }

    public void setHospitalStatus(boolean hospitalStatus) {
        this.hospitalStatus = hospitalStatus;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
        
    
    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }
    

    public Hospital(String userName){
        this.userName=userName;
    }
    

       
    @Override
    public String toString() {
        return hospitalName;
    }
    
    public Hospital(String hospitalName, String userName, String hospitalAddress, boolean hospitalStatus) {
//        System.out.println("busi" + Name + address + UserName);
        System.out.println("Hospital{" + "name=" + hospitalName + ", userName=" + userName + ", location=" + hospitalAddress + '}');
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.userName = userName;
        this.hospitalStatus = hospitalStatus;
    }

    
}
