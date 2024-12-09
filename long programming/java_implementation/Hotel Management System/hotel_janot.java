import java.io.*;
import java.util.*;
import Details.*;

public class hotel_janot {
    public static void main(String[] args) {
    customer cust= new customer("George","9566157645");
    //booking booki= new booking(1,"19/12/1987");
    room roome=new room(1101,"Single");

    Scanner inp = new Scanner(System.in);

    ArrayList<room>  rooms = new ArrayList<>();
    rooms.add(new room(101,"Single"));
    rooms.add(new room(102, "Double"));
    rooms.add(new room(103, "Suite"));

    ArrayList<booking> bookings = new ArrayList<>();
    while (true) {
        System.out.println("\n--- Booking System Menu ---");
        System.out.println("1. Display Available Rooms");
        System.out.println("2. Book a Room");
        System.out.println("3. Cancel a Booking");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
        int option=inp.nextInt();
        inp.nextLine();

        switch (option){
            case 1:
                for(room i:rooms){
                    if (i.getAvailability()){
                    System.out.println("The Room No is: "+i.getRoomNo());
                    System.out.println("The Room Type is: "+i.getRoomType());
                    }
                }
            break;

            case 2:
                

        }
    



    
        
    }
}
