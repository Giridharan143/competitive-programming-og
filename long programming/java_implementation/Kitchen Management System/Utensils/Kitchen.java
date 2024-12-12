package Utensils;
import java.util.ArrayList;
import java.util.Scanner;

public class Kitchen {
    int orderId;
    Ingredients ingi;
    String ingii;
    Scanner inp = new Scanner(System.in);
    ArrayList<Kitchen> order = new ArrayList<Kitchen>();

    public Kitchen(){}

    public Kitchen(int a,String b){
        this.orderId=a;
        this.ingii=b;
    }

public void takeOrders(){
    System.out.println("Enter the Order id: ");
    int a =inp.nextInt();
    for(Ingredients idx: ingi.ing){
        if(idx.getIngId()==a){
            //order.add(a,idx);
            System.out.println("yess we did it !!!");
        }
    }
    System.out.println(order);
}



}
