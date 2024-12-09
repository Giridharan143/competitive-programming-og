package Details;

public class booking {
    /*int bookingID;
    String date;
    */
    private room roome;
    private customer cust;

    public booking(room a,customer b){
        this.roome=a;
        this.cust=b;
        roome.setAvailability(false);
        
    }

   public room getRoomptr(){
    return roome;
   }
   public void cancellation(){
    roome.setAvailability(true);
    System.out.println("The Room "+roome.getRoomNo()+" is said to be cancelled from usage !!");
   }

    public void cancelBooking(){
        roome.setAvailability(true);
        System.out.println("The Room "+roome.getRoomNo()+" has been canceled");
    }

    public void displayBooking(){
        System.out.println("The Booking Details\n");
        roome.displayRoom();
        System.out.println(" ");
        cust.displayCustomer();
    }
    
    
}
