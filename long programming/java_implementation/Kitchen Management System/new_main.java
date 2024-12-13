// k.viewOrders();
// i.addi();
// k.viewIngredients();
import java.util.Scanner;

import Utensils.*;

public class new_main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Ingredients i = new Ingredients();
        Kitchen k = new Kitchen();
            // Menu options for the user
            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1. Take orders");
                System.out.println("2. View orders");
                System.out.println("3. Default add Ingrediants");
                System.out.println("4. View ingredients");
                System.out.println("0. Exit ordering");

                int option = inp.nextInt();
                inp.nextLine(); // Consume newline

                switch (option) {
                    case 1:
                        k.takeOrders();
                        break;
                    case 2:
                        k.viewOrders();
                        break;
                    case 3:
                        i.addi();
                        break;
                    case 4:
                         k.viewIngredients();
                        break;
                    case 0:
                        System.out.println("Exiting ordering menu...");
                        inp.close();
                        return;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
                
            }
        }
    }
         // Close Scanner after exiting all loops
