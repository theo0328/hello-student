package model;

public class Phone {

    /*
     * Part 1.2
     *
     * Add the following properties:
     * - String country code
     * - String area code
     * - String phone number
     */

    // Add getter and setter methods for EVERY attribute

 
    String countryCode;
    String areaCode;
    String phoneNumber;

    public static void main(String args[]){

    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
