package Utensils;
import java.util.ArrayList;
import java.util.Scanner;

public class Kitchen {
    
        
      
    int orderId;
    Ingredients ingredientsS;
    double payment;
    Scanner inp = new Scanner(System.in);
    ArrayList<Kitchen> order = new ArrayList<Kitchen>();

    public Kitchen(){}

    public Kitchen(int a,Ingredients b, double payment){
        this.orderId=a;
        this.ingredientsS=b;
        this.payment=payment;
    }

public void takeOrders(){
    System.out.println("Enter the Order id: ");
    //int a =inp.nextInt();
    this.orderId=inp.nextInt();
    inp.nextLine();
    // Creating a new null file for ingredients
    Ingredients ingNow = new Ingredients();
    ingNow.addIngredients();
    this.ingredientsS=ingNow;
    System.out.println("Enter the Price of Buying it : ");
    this.payment=inp.nextDouble();
    inp.nextLine();
    order.add(new Kitchen(this.orderId,ingNow,this.payment));
}
public void viewIngredients(){
    for(Ingredients idx: ingredientsS.ing){
        System.out.println(idx.getIngId()+idx.getIngName());
    }
}
public Integer getOrderId(){
    return this.orderId;
}
public void viewOrders(){
    Kitchen ck=null;
    System.out.println("Enter the Order id: ");
    int b=inp.nextInt();
    inp.nextLine();
    for(Kitchen idx:order){ 
        if(b==idx.getOrderId()){
            ck=idx;
        }
    }
    if(ck!=null){
    System.out.println("Order ID : "+ck.getOrderId()+" Ingredients ID : "+ck.ingredientsS.getIngId()+" Ingredients Name : "+ck.ingredientsS.getIngName());
    }
    else{
        System.out.println("No Order present here ");
    }
}
public double getPaymentt(){
    return this.payment;
}
public void getPayment(int orderid){
    double payment=1.5;
    Kitchen ab=null;
    for(Kitchen idx:order){
        if(orderid==idx.getOrderId()){
            ab=idx;
        }
    }
    if(ab!=null){
        payment += ab.getPaymentt();
        System.out.println("The Amount to be added be with tax = "+payment);
    }
    else{
        System.out.println("Order ID is not found !!");
    }

}


}
