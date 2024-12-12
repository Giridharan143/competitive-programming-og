package Railways;

import java.util.ArrayList;
import java.util.Scanner;

public class Payment {
    Scanner inp = new Scanner(System.in);
    int reservationIdP;
    double paymentAmount;
    String paymentStatus;
    String paymentMethod = "Pending";     // -> To Completed
    ArrayList <Payment> paymt = new ArrayList<>();

    public Payment(){
        // this is an default constructor
    }
    public Payment(int a, double c, String d){
        this.reservationIdP =a;
        this.paymentAmount = c;
        //this.paymentStatus =e;
        this.paymentMethod = d;
    }

    public void makePayment(){
        System.out.println("Kindly Enter the Reservation Id: ");
        int a = inp.nextInt();
        inp.nextLine();
        // System.out.println("Kindly Enter the Ticket : ");
        // Ticket b =new Ticket();
        System.out.println("Enter the Payment Amount: ");
        double c = inp.nextDouble();
        inp.nextLine();
        System.out.println("Enter the Payment Method : ");
        String d = inp.nextLine();
        paymt.add(new Payment(a,c,d));
        this.paymentStatus="Completed";
        System.out.println("The Payment has been Completed !!");

    }
    public int getReservationId_payments(){
        return this.reservationIdP;
    }
    public double getpaymentAmount(){
        return this.paymentAmount;
    }
    public String getPaymentMethod(){
        return this.paymentMethod;
    }
    
    public String getPaymentStatus(){
        return this.paymentStatus;
    }
}