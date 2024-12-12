package Railways;

import java.util.ArrayList;
import java.util.Scanner;

public class Passenger {
    Scanner inp = new Scanner(System.in);
    int passengerId;
    String passengerName;
    int passengerAge;
    String passengerGender;
    String passengerPhone;
    public static ArrayList<Passenger> newPassenger = new ArrayList<Passenger>(); 

    public Passenger(){

    }

    public Passenger(int a,String b, int c, String d, String e){
        this.passengerId=a;
        this.passengerName=b; 
        this.passengerAge=c;
        this.passengerGender=d;
        this.passengerPhone=e;
    }

    public void addPassenger(){
        System.out.println("Enter the Passenger ID : ");
        int a = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter the Passenger Name: ");
        String b = inp.nextLine();
        System.out.println("Enter the Passenger Age: ");
        int c = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter the Passenger Gender: ");
        String d = inp.nextLine();
        System.out.println("Enter the Passenger Phone No: ");
        String e = inp.nextLine();
        newPassenger.add(new Passenger(a,b,c,d,e));
        System.out.println("The Passenger details has been Registered !!!");
    }
    public void viewPassengerDetails(String a){ // Called using Passeger Name
        Passenger viewer=null;
        for(Passenger idx:newPassenger){
            if(a.equalsIgnoreCase(idx.getPassengerName())){
               viewer=idx;System.out.println(viewer);
                // System.out.println("Passenger ID: "+idx.getPassengerId()+" Passenger Name : "+this.getPassengerName()+"Passenger Age : "+this.getPassengerAge()+" Passenger Age : "+ this.getPassengerAge()+" Passenger Contact Info : "+this.getPassengerPhoneNo());
            }
        }
        
        if(viewer!=null){
            System.out.println("Passenger ID : "+viewer.getPassengerId()+" Passenger Name : "+viewer.getPassengerName()+" Passenger Age : "+viewer.getPassengerAge()+" Passenger Age : "+ viewer.getPassengerAge()+" Passenger Contact Info : "+viewer.getPassengerPhoneNo());
        }
        else
            System.out.println("No such Passenger exits");
    }
    public String getPassengerName(){
        return this.passengerName;
    }

    public int getPassengerId(){
        return this.passengerId;
    }
    public int getPassengerAge(){
        return this.passengerAge;
    }
    public String getPassengerGender(){
        return this.passengerGender;
    }
    public String getPassengerPhoneNo(){
        return this.passengerPhone;
    }
    
    public void displaypassengerDetails(){
        System.out.println("Passenger ID: "+this.getPassengerId()+"Passenger Name : "+this.getPassengerName()+"Passenger Age : "+this.getPassengerAge()+"Passenger Gender : "+this.getPassengerGender()+"Passenger Phone No : "+this.getPassengerPhoneNo());
    }
    

}
