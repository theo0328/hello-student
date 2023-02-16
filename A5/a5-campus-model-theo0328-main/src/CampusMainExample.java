/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import Campus.*;

/**
 *
 * @author kal bugrara
 */
public class CampusMainExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Address northeastern = new Address(0, "Terry Ave N", "98109", "northeastern");

        Campus seattle = new Campus(northeastern);

        Building lectureHall = new Building(401, northeastern);
        Building mainHall = new Building(225, northeastern);

        seattle.buildings.add(lectureHall);
        seattle.buildings.add(mainHall);

        Floor firstFloor401 = lectureHall.addNewFloor(1);
        Floor thirdFloor401 = lectureHall.addNewFloor(3);
        Floor fourthFloor401 = lectureHall.addNewFloor(4);
  
        Floor firstFloor225 = mainHall.addNewFloor(1);


        firstFloor401.newRoom(1);
        thirdFloor401.newRoom(1);
        thirdFloor401.newRoom(2);
        fourthFloor401.newRoom(1);
        
        firstFloor225.newRoom(1);

        firstFloor401.rooms.get(0).setSprinkler("asdf", "asdfa");
        thirdFloor401.rooms.get(0).setSprinkler("asdfafd","asdf");
        thirdFloor401.rooms.get(1).setSprinkler("sdf","asdf");
        fourthFloor401.rooms.get(0).setSprinkler("asdasd","asd");

        firstFloor225.rooms.get(0).setSprinkler("asdasd","asdasd");

        northeastern.isCampusSafe();
        









        // TODO code application logic here
        /*
         * 0. Create Address object
         * 1. create campus object
         * 2. Create and add buildings
         * 3. Create and floors
         * 4. Create and add rooms
         * 5. Assign sprinkers.
         * 6. Write methods to determine is campus safe => are builinds safe etc.
         */

                 

    }

}
