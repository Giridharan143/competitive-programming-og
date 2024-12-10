import java.util.Scanner;

import Waiter.*;

public class Restaurant{
    //static Order ord;
            public static void main(String[] args) {
                Scanner inp = new Scanner(System.in);
                Order ord = new Order();
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add Menu Item");
            System.out.println("2. View All Menu Items");
            System.out.println("3. Place Order");
            System.out.println("4. View All Orders");
            System.out.println("5. Exit");
            int choice = inp.nextInt();
            inp.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    ord.addMenuItem();
                    break;
                case 2:
                    ord.viewAllItems();
                    break;
                case 3:
                    ord.placeOrder();
                    break;
                case 4:
                    ord.viewOrders();
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    inp.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}