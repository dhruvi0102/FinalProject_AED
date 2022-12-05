/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shelter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tanya Shah
 */
public class ShelterDirectory {

    private ArrayList<Shelter> shelters = new ArrayList<>();
    private Shelter shelter;

    public ShelterDirectory() {
    }

    public List<Shelter> getShelters() {
        return shelters;
    }

    public void setShelters(ArrayList<Shelter> shelters) {
        this.shelters = shelters;
    }

    public Shelter createShelter(String userName, String name, String location, Boolean status) {
        System.out.println("uname:::" + shelters.size());
        shelter = new Shelter(userName, name, location, status);
        shelters.add(shelter);
        return shelter;
    }

    public void deleteShelter(String userName) {
        System.out.println("size insed del:::" + shelters.size());
        Shelter currShelter = null;
        for (Shelter s : shelters) {
            System.out.println("totiong" + s.toString());
            if (s.getName().equals(userName)) {
//                shelters.remove(s);
                currShelter = s;
                break;
            }
        }

        shelters.remove(currShelter);
    }

}
