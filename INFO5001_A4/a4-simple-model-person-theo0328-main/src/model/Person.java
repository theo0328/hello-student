package model;

public class Person {
    String firstName;
    String lastName;
    String HomeAdd;
    String workAdd;
    int cellNum;
    int homeNum; 

    giveInfo();

    
    public static void main(String [] args) {

        /*
     * Part 1.3
     * 
     * Add the following properties:
     * - First name
     * - Last name
     * - Home address
     * - Work address
     * - Cell phone number
     * - Home phone number
     */

    // Add getter and setter methods for EVERY attribute

    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getHomeAdd() {
        return HomeAdd;
    }


    public void setHomeAdd(String homeAdd) {
        HomeAdd = homeAdd;
    }


    public String getWorkAdd() {
        return workAdd;
    }


    public void setWorkAdd(String workAdd) {
        this.workAdd = workAdd;
    }


    public int getCellNum() {
        return cellNum;
    }


    public void setCellNum(int cellNum) {
        this.cellNum = cellNum;
    }


    public int getHomeNum() {
        return homeNum;
    }


    public void setHomeNum(int homeNum) {
        this.homeNum = homeNum;
    }

    public String giveInfo(String firstame, String lastName, String cellNum){
        return (firstname + lastName + cellNum).toString();

    }
 

 
  
}
