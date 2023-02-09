package model;

public class Address {


    String lineOne;
    String lineTwo;
    int zip;
    String city;
    String state;
    String country;

    giveAddress(String lineOne, String city, String state, int zip, String country);

    
    /**
     * @param args
     */
    public static void main(String []args) {
 
        /*
     * Part 1.1
     * 
     * Add the following properties:
     * 
    
     * - Line one
     * - Line two
     * - Zip code
     * - City
     * - State
     * - Country
     */

    // Add getter and setter methods for EVERY attribute


    }

    public String getLineOne() {
        return lineOne;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String giveAddress(lineOne, city, State, zip, country) {
        return (lineOne + city + state + zip + country).toString();

    }


}
    