package Railways;

import java.util.ArrayList;
import java.util.Scanner;

public class Train{
    Scanner inp = new Scanner(System.in);
    int trainId;
    String trainName;
    String source;
    String destination;
    String departureTime;
    String arrivalTime;
    public static ArrayList<Train> train = new ArrayList<>();
    public Train(){

    }
    Train(int a, String b,String c,String d,String e,String f){
        this.trainId=a;
        this.trainName=b;
        this.source=c;
        this.destination=d;
        this.departureTime=e;
        this.arrivalTime=f;
    }

    public void addTrain(){
        System.out.println("Enter the Train Id: ");
        int a = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter the Train Name : ");
        String b = inp.nextLine();
        System.out.println("Enter the Source of Travel : ");
        String c = inp.nextLine();
        System.out.println("Enter the Destination of Travel : ");
        String d = inp.nextLine();
        System.out.println("Enter the Departure Time in DD-MM-YEAR ");
        String e = inp.nextLine();
        System.out.println("Enter the Arrival Time in DD-MM-YEAR ");
        String f = inp.nextLine();
        
        train.add(new Train(a,b,c,d,e,f));
        System.out.println("The Train Info has been updated succesfully !!");

    }
    public void ViewTrainDetails(int a){ // Using Train Number
        Train checker = null;
        for(Train idx:train){
            if(a==idx.getTrainId())
                checker=idx; // The Address of the Required Passenger is said to be find out
        }
        if(checker!=null){
            System.out.println("Train Id : "+checker.getTrainId()+" Train Name : "+checker.getTrainName()+" Source : "+checker.getSource()+"Destination : "+checker.getDestination()+" Departure Time : "+checker.getDepartureTime()+" Arrival Time : "+checker.getArrivalTime());
        }
    }
    public void viewTrainSchedule(String a,String b){ // Using Source and Destination
        Train ab =null;
        for(Train idx : train){
            if(a.equalsIgnoreCase(idx.getSource()) && b.equalsIgnoreCase(idx.getDestination())) {
                ab=idx;            
            }
        }
      if(ab!=null){
            ab.ViewTrainDetails(ab.getTrainId());   
             }        
       else
             System.out.println("There is no such route please verify !!!");
    }

    public int getTrainId(){
        return this.trainId;
    }    
    public String getTrainName(){
        return this.trainName;
    }
    public String getSource(){
        return this.source;
    }
    public String getDestination(){
        return this.destination;
    }
    public String getDepartureTime(){
        return this.departureTime;
    }
    public String getArrivalTime(){
        return this.arrivalTime;
    }
    public void displayTrainDetails(){
        System.out.println("Train Id : "+this.getTrainId()+" Train Name : "+this.getTrainName()+" Source : "+this.getSource()+"Destination : "+this.getDestination()+" Departure Time : "+this.getDepartureTime()+" Arrival Time : "+this.getArrivalTime());
    }

}