package Railways;

import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {
    Scanner inp = new Scanner(System.in);
    int ticketId;
    private Reservation reservationn;
    double ticketPrice;
    String ticketType;
    public static ArrayList <Ticket> ticket = new ArrayList<>();
    public Ticket(){
        //Free Constructor is Established here
    }
   public Ticket(int a, Reservation b,double c, String d){
        this.ticketId=a;
        this.reservationn=b;
        this.ticketPrice = c;
        this.ticketType = d;        
    }

    public void generateTicket(){
        System.out.println("Kindly Enter the Ticket ID: ");
        int a = inp.nextInt();
        inp.nextLine();
        // System.out.println("Reservation Details: ");
        // Reservation b =new Reservation();
        Reservation rev =new Reservation(); //Local calling function
        rev.generateTicket();
        this.reservationn=rev;
        // Reservation rev = new Reservation();
        // rev.generateTicket();
        // this.reservationn = rev;
        System.out.println("Enter The Price: ");
        double c = inp.nextDouble();
        inp.nextLine();
        System.out.println("Kindly Enter the Ticket Type : ");
        String d = inp.nextLine();
        ticket.add(new Ticket(a,rev,c,d));
        System.out.println("The Ticket has been Issued !!");
    }

    public int getTicketId(){
        return this.ticketId;
    }
    public void getReservationDetails(int a){
        //return this.reservation;
        //Reservation ab = null;
        Ticket ab =null;
        for(Ticket idx: ticket){
            if(a==idx.reservationn.getReservationId()){
                ab=idx;break;
            }
        }
            /*
        }
        for(Reservation idx: Reservation.reservation){
            if(a==idx.getReservationId()){
                 ab=idx;break;
            }
                 */
        
        if(ab!=null){
        System.out.println("Ticket ID: "+ab.getTicketId()+" Ticket Price : "+ab.getPrice()+" Ticket Type : "+ab.getTicketType()+"Reservation Details :\n");
        ab.reservationn.displayReservationDetail();
        }
        else{
            System.out.println("Reservation not found !!");
        }

        
    }
    public double getPrice(){
        return this.ticketPrice;
    }
    public String getTicketType(){
        return this.ticketType;
    }
    public Reservation getReservationT(){
        return this.reservationn;
    }
/*
    public void viewTicketDetails(int a){
        Ticket ab=null;
        for(Ticket idx:ticket){
            if(idx.getReservationT() !=null && a==idx.getReservationT().getReservationId()){
                ab=idx;break;
            }
        }
        
        if(ab!=null){
            System.out.println("Ticket ID : "+ab.getTicketId()+" Ticket Price : "+ab.getPrice()+" Ticket Type : "+ab.getTicketType());
            System.out.println("Reservation Details : \n");
            ab.getReservationT().displayReservationDetail();
        }
        else{
            System.out.println("The Ticket Error !!");
        }
    }*/
    }