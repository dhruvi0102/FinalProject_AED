/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ShelterHome;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author shreyansipatel
 */
public class ShelterDirectory {
    private ArrayList<Shelter> shelterList = new ArrayList<>();
    private Shelter shelter;

    public ShelterDirectory() {
    }

    public ArrayList<Shelter> getShelterList() {
        return shelterList;
    }

    public void setShelterList(ArrayList<Shelter> shelterList) {
        this.shelterList = shelterList;
    }

    public Shelter createShelter(String name, String uname, String address, Boolean status) {
        shelter = new Shelter(name, uname, address, status);
        shelterList.add(shelter);
        return shelter;
    }
    
    public void updateShelter(String name, String uname, String address, Boolean status){
        shelter.setShelterName(name);
        shelter.setUserName(uname);   
        shelter.setAddress(address);
        shelter.setAvailability(status);
    }
    

    public void deleteShelter(String userName) {
        System.out.println("size insed del:::" + shelterList.size());
        Shelter currentShelter = null;
        for (Shelter s : shelterList) {
            System.out.println("totiong" + s.toString());
            if (s.getShelterName().equals(userName)) {
                currentShelter = s;
                break;
            }
        }

        shelterList.remove(currentShelter);
    }   
}
