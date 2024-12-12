import java.util.Scanner;

import Utensils.*;


public class new_main {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true){
        System.out.println("Press 0 to exit - or anyting continue");
        int a = inp.nextInt();
        if(a==0) return;
        Ingredients i = new Ingredients();
        Kitchen k = new Kitchen();
    i.addIngredients();
    k.takeOrders();
    i.displayIngredients();
        }
    
    }
}
