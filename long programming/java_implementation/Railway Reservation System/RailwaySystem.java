import Railways.*;

import java.util.Scanner;

public class RailwaySystem {

    public static void main(String[] args) {
        Passenger pass = new Passenger();
        Train tra = new Train();
        Reservation rev = new Reservation();
        Ticket tic = new Ticket();
        Payment paytm = new Payment();
        Scanner inp = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Railway Management System");
            System.out.println("1. Manage Passengers");
            System.out.println("2. Manage Trains");
            System.out.println("3. Book Reservation");
            System.out.println("4. Cancel Reservation");
            System.out.println("5. View Ticket Details");
            System.out.println("6. Make Payment");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = inp.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. View Passenger:\n2.Display Pasenger :");
                    int choix = inp.nextInt();
                    inp.nextLine();                    
                    switch(choix){
                        case 1:
                        System.out.println("View Passenger Specific Details by Name :");
                        String a =inp.nextLine();
                        pass.viewPassengerDetails(a);
                        break;
                        case 2:
                        pass.displaypassengerDetails();
                        break;
                        default:
                        System.out.println("Wrong Input");
                    }

                    //pass.displaypassengerDetails();                    
                    // Call Passenger Management Functions
                    break;
                case 2:
                tra.addTrain();
                //tra.displayTrainDetails();
                    // Call Train Management Functions
                    break;
                case 3:
                tic.generateTicket();
                    // Call Reservation Booking Functions
                    break;
                case 4:
                System.out.println("Enter the Resevartion ID: ");
                int a =inp.nextInt();
                rev.cancelTicket(a);
                    // Call Reservation Cancellation Functions
                    break;
                case 5:
                System.out.println("Enter the Resevation ID: ");
                int b =inp.nextInt();
                tic.getReservationDetails(b);
                    break;
                case 6:
                    paytm.makePayment();
                    break;
                case 7:
                    System.out.println("Exiting the system...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        inp.close();
    }
}
