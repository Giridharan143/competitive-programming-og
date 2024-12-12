package Railways;

import java.util.ArrayList;
import java.util.Scanner;

public class Reservation {
    Scanner  inp = new Scanner(System.in);
    int reservationId;
    Passenger passangery = new Passenger();
    Train trainy = new Train();
    String dateOfJourney;
    Integer seatNumber;
    String status;
    public static ArrayList <Reservation> reservation = new ArrayList<>();
    public Reservation(){

    }

    public Reservation(int a,String d,int e, String f){
        this.reservationId =a;
        // this.passanger=b;
        this.dateOfJourney=d;
        this.seatNumber=e;
        this.status=f;
        // this.train=g;
        
    }

    public void generateTicket(){
        System.out.println("Kindly Enter the Reservation ID: ");
        int a = inp.nextInt();
        inp.nextLine();
        passangery.addPassenger();
        // System.out.println("Passenger Details ->");
        // //Passenger b  = new Passenger(); 
        // ArrayList <Passenger> b= Passenger.newPassenger;
        System.out.println("Kindly Enter the Date of Journey : ");
        String d = inp.nextLine();
        System.out.println("Kindly Enter the Seat Number : ");
        int e = inp.nextInt();
        //System.out.println("Kindly Enter the Status: ");
        String f = "Completed";
        trainy.addTrain();
        // System.out.println("Train Details -> ");
        // ArrayList <Train> g = train_caller.train;
       
        reservation.add(new Reservation(a,d,e,f));
    }
//    public void viewReservationDetails

    public void cancelTicket(int a){
        //this.status="Canceled";
        Reservation ab =null;
        for(Reservation idx : reservation){
            if(a==idx.getReservationId()){
                ab=idx;
            }
        }
        ab.changeStatus();
        if(ab.getStatusOfTicket().equalsIgnoreCase("Canceled"))
            System.out.println("The Ticket has been Cancelled !");
        else   
            System.out.println("NOt Canceled");
    }

    public void viewReservationDetails(int a){ // reservation ID
        Reservation ab = null;
        for(Reservation idx:reservation){
            if(a==idx.getReservationId()){
                ab=idx; //Loction has been identified
            }
        }
        System.out.println(" Reservation ID : "+ab.getReservationId()+" Date Of Journey : "+ab.getPassengerDOJ()+" Seat Number : "+ab.getPassengerSeatNo()+" Status : "+ab.getStatusOfTicket());        
    }

    public int getReservationId(){
        return this.reservationId;
    }
    public String getPassengerDOJ(){
        return this.dateOfJourney;
    }
    public Integer getPassengerSeatNo(){
        return this.seatNumber;
    }
    public String getStatusOfTicket(){
        return this.status;
    }
    public void changeStatus(){
        this.status="Canceled";
    }
    public void displayReservationDetail(){
        System.out.println(" Reservation ID : "+this.getReservationId()+" Date Of Journey : "+this.getPassengerDOJ()+" Seat Number : "+this.getPassengerSeatNo()+" Status : "+this.getStatusOfTicket());
    }
    

}
