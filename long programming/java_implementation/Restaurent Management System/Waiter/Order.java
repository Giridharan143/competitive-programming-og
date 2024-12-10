package Waiter;

import java.util.*;

public class Order {
    private Menu men;
    int orderId;
    double totalPrice;
    Boolean served=true;
    //Menu m = new Menu();
    ArrayList<Double> items = new ArrayList<Double>();
    ArrayList<Menu> menus = new ArrayList<Menu>();
    ArrayList<Order> orders = new ArrayList<Order>();
    Scanner inp = new Scanner(System.in);
public Order(int a){ // Creating an Constructor
        this.orderId=a;
       //this.men=c;    
    }

public int getOrderId(){
    return this.orderId;
}

public double getTotalPrice(){
    return this.totalPrice;
}
public Boolean getServablitiy(){
    return this.served;
}

public void setServable(Boolean a){
    this.served=a;
}

public void addMenuItem(){
    System.out.println("Kindly Enter the Item Id: ");
    int itemi = inp.nextInt();
    inp.nextLine();
    System.out.println("Kindly Enter the Name of the Food: ");
    String foodi = inp.nextLine();
    System.out.println("Kindly Enter the Price: ");
    double pricei = inp.nextDouble();
    menus.add(new Menu(itemi,foodi,pricei));
    
    System.out.println("The Menu Has Been Added Successfully !!!");
}


public void getMenu(){
    Menu m = new Menu();
    return m;
}
public void viewAllItems(){
    if(menus.isEmpty()){
        System.out.println("There are no Items in the Menu, Kindly Update it !!");        
    }
    else{
        for (Menu idx:menus){
            System.out.println("Viewing The Menu: ");
            System.out.println(idx.getName()+"="+idx.getPrice());
        }
    }
}

public void placeOrder(){
    
    System.out.println("Kindly Enter the Item ID: || To Exit press -2");
    int itemIdi = inp.nextInt(); 
    if(itemIdi==-2)   
        break;
    inp.nextLine();
    for (Menu idx : menus){
        if(idx.getItemId()==itemIDi){
            orders.add(new Order(orderIdi);
        }
    }

}

public void viewAllOrders(){
    for(Order idx : orders){


    }
    }
}





