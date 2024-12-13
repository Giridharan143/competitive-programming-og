package Banking;

import java.util.ArrayList;
import java.util.Scanner;

public class Address {
    String city;
    String state;
    String country;
    public static ArrayList <Address> address = new ArrayList<>();
    Scanner inp = new Scanner(System.in);
    public Address(){
        // Empty Constructor 
    }

    public Address(String a, String b, String c){
        this.city=a;
        this.state=b;
        this.country=c;
    }

    public String getCity(){
        return this.city;
    }

    public String getState(){
        return this.state;
    }

    public String getCountry(){
        return this.country;
    }
public void addAddress(){
    System.out.println("Enter the City : ");
    this.city=inp.nextLine();
    System.out.println("Enter the State : ");
    this.state= inp.nextLine();
    System.out.println("Enter the Country : ");
    this.country=inp.nextLine();
    address.add(new Address(this.city,this.state,this.country));
    System.out.println("The Address has been updated !!");
}

}
