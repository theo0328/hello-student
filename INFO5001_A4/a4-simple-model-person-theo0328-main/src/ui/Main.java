package ui;

import model.Address;
import model.Person;
import model.Phone;

public class Main {

    Address add1 = new Address();
    add1.lineOne = "1255 Harrison St.";
    add1.zip = 98109;
    add1.city = "Seattle";
    add1.country = "USA";



    Person person = new Person();
    person.firstName = "Theo";
    person.lastName = "Lim";
    person.HomeAdd = add;
    person.cellNum = 2064996758;

    fullInfoOfPerson();




 

    public static void main(String[] args) {
        System.out.println(add1.giveInfo + person.giveAddress);
        
    }
}
