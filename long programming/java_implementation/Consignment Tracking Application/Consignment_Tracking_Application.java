import java.util.Scanner;

import E_commerce.*;


public class Consignment_Tracking_Application {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Order orderr = new Order();
        Shipment shipmentt = new Shipment();
        while(true){
            System.out.println("Welcome to the Consignment Tracking Application .........");
            System.out.println("1. Add an Order :");
            System.out.println("2. View an Order : ");
            System.out.println("3. Push to Shipment");
            System.out.println("4. Status of the Shipment ");
            System.out.println("5. Exit");
            int choice = inp.nextInt();
            inp.nextLine();
            switch(choice){
                case 1:
                    orderr.makeOrder();
                    double a=orderr.getOrderPrice();
                    shipmentt.updateCapacity(a);
                    break;
                case 2:
                    orderr.viewOrder();
                    break;
                case 3:
                    orderr.moveToShipment();
                    break;
                case 4:
                    shipmentt.statusOfHolder();
                    break;
                case 5:
                System.out.println("Exiting the System ---------");
                inp.close();
                return;


            }
        }
    }
}
