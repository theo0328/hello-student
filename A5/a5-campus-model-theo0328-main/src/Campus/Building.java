/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Campus;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Building {
    int number;
    public ArrayList<Floor> floors;
    Address address;

    /**
     * @param n
     * @param ad
     */
    public Building(int n, Address ad) {
        this.number = n;
        this.address = ad;
        this.floors = new ArrayList();
    }

    public Floor addNewFloor(int n) {
        Floor f = new Floor(n, this); // reference back to building;
        floors.add(f);
        return f;
    }

    public Boolean isBuildingSafe() {
        
        // Building is safe if all floors are safe

        for(Floor f : floors) {
            if(f.isFloorSafe() == false) {
                return false;
            }
        }
        return true;

        // Building is safe if all floors are safe
    }

}
