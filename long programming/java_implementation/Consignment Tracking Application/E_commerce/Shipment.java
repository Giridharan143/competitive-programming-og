package E_commerce;

import java.util.ArrayList;
import java.util.Scanner;

public class Shipment {
    String shipmentSource;
    String shipmentDestination;
    double shipmentCapacity;
    double shipmentHolder=10000;
    public static ArrayList<Shipment> shipment = new ArrayList<Shipment>();
    
    Scanner inp = new Scanner(System.in);
    public String getShipmentSource(){
        return this.shipmentSource;
    }
    public String getShipmentDestination(){
        return this.shipmentDestination;
    }
    public double getShipmentCapacity(){
        return this.shipmentCapacity;
    }
    public Shipment(){
        // Empty Constructor
    }
    public Shipment(String a,String b,double c){
        this.shipmentSource=a;
        this.shipmentDestination=b;
        this.shipmentCapacity=c;
    }
    public void defaultAddDetails(){
        shipment.add(new Shipment("Chennai","Banglore",1000));
        shipment.add(new Shipment("Hyderabad","Telungana",10000));
        // System.out.println("Enter the Source : ");
        // this.shipmentSource=inp.nextLine();
        // System.out.println("Enter the Destination : ");
        // this.shipmentDestination=inp.nextLine();
        // System.out.println("Enter the weight of the Product");
        // this.shipmentCapacity=inp.nextDouble();
        // inp.nextLine();
        // shipment.add(new this.shipmentSource,this.shipmentDestination,this.shipmentCapacity);
    }

    public void updateCapacity(double a) {
        
        this.shipmentHolder-= a;
    }
    public void statusOfHolder(){
        if(this.shipmentHolder<=1000){
            System.out.println("Shipment is Not Full");
        }
        else if(this.shipmentHolder>1000){
            System.out.println("Shipment is Full");
        }
    }
}
