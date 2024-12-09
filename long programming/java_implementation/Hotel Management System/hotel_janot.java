//import java.io.*;
//import java.lang.reflect.Array;
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
    rooms.add(new room(102, "Double")); // creating n object and operating it inside an arra list
    rooms.add(new room(103, "Suite"));
    System.out.println(rooms);


/*
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(1,2,3,4,5);
    System.out.println(arr);
*/
/*/
ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
StringBuffer  str = new StringBuffer("Hi!! Hello Welcome to my hotel !!");
System.out.println(arr);
System.out.println(str);
*/
    ArrayList<booking> bookings = new ArrayList<>();

    rooms.add(new room(104,"Legendary"));
    while (true) {
        System.out.println("\n--- Booking System Menu ---");
        System.out.println("1. Display Available Rooms");
        System.out.println("2. Book a Room");
        System.out.println("3. View Booking");
        System.out.println("4. Cancel a Booking");
        System.out.println("5. Exit");
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
                
           System.out.println("Kindly enter the Room number please: ");
           int roomId=inp.nextInt();
           room roomptr=null;
           inp.nextLine();//Nothing just for fun sake
           for(room idx:rooms) {
            if(idx.getRoomNo()==roomId && idx.getAvailability()) {
                roomptr=idx;
                break;
            }
           }
           if(roomptr==null)
            System.out.println("The Required room is not said to be available !!");
           else{
            System.out.println("Enter the Customer Name: ");
            String cust_name=inp.nextLine();
            System.out.println("Enter the Customer Contact Number: ");
            String cust_phone= inp.nextLine();
            customer ct = new customer(cust_name,cust_phone);
            booking bk = new booking(roomptr,ct);
            bookings.add(bk);
            roomptr.setAvailability(false);  // False if the area is said to be already equipped by the personnel and get to it
            System.out.println("The Room no "+roomptr.getRoomNo()+" is Booked Successfully !!!");

            
           }
           break;

           case 3:
           System.out.println("View the Bookings !!");
           if(bookings.isEmpty())
                    System.out.println("There is no Booking completed till now");

            else {
                    for(booking idx:bookings)
                        //System.out.print(idx.displayBooking());
                        idx.displayBooking();
            }
            break;

            case 4:
                System.out.println("Enter the Room No for Cancellation: ");
                int roomer = inp.nextInt();
                booking bookptr=null;
                for (booking idx : bookings){
                    if (idx.getRoomptr().getRoomNo()==roomer){
                        bookptr=idx;
                        break;
                    }
                }
                if (bookptr==null){
                    System.out.println("There is no room available for cancelling the booking !!");
                }
                else{
                bookptr.cancelBooking();
                bookings.remove(bookptr);

                }
                break;

                case 5:
                System.out.println("Thank you for choosing aviant hotels!!!");
                inp.close();
                System.exit(0);
                break;

                default:
                System.out.println("Kindly Enter an Proper Input !!");



           




        }        
    }
}
}
