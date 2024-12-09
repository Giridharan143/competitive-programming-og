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

   

    public void cancelBooking(){
        roome.setAvailability(true);
        System.out.println("The Room"+roome.getRoomNo()+"has been canceled");
    }

    public void displayBooking(){
        System.out.println("The Booking Details\n");
        roome.displayRoom();
        cust.displayCustomer();
    }
    
}
