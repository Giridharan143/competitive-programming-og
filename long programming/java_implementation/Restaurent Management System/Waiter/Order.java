package Waiter;

import java.util.*;

public class Order {
   // private Menu men;
    int orderId;
    double totalPrice;
    Boolean served=false;    
    //Menu m = new Menu();
    //ArrayList<Double> items = new ArrayList<Double>();
    //ArrayList<Menu> orderitems = new ArrayList<>(); // this contains the items which are present in the items
    ArrayList<Menu> items = new ArrayList<>(); // this contains the addition of all the elements which are selected by the user
    ArrayList<Menu> menus = new ArrayList<Menu>(); // this contains the list of all the part of the menus available for it
    ArrayList<Order> orders = new ArrayList<Order>(); // this contains the pointer to the addresss of the required node is arrived
    Scanner inp = new Scanner(System.in);
public Order(int a){ // Creating an Constructor
        this.orderId=a;
       //this.men=c;    
    }
public Order(){
    // to initialise an empty constructor
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
/*
public void addMenuItem(Menu item){
    this.orderitems.add(item);
    this.totalPrice+=item.getPrice();
}
    */

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
/*

public void getMenu(){
    Menu m = new Menu();
    return m;
}
    */
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

    System.out.println("Kindly enter the Order ID : ");
    int orderId = inp.nextInt();
    inp.nextLine();
    //ArrayList<Menu> items = new ArrayList<>();
    while(true){
    System.out.println("Enter the Item Id which needs to be ordered || If done press -8");
    int itemi = inp.nextInt();
    inp.nextLine();
    if(itemi==-8)
        break;
    Menu selectedItem =null;
    
    for(Menu idx: menus){
        if(idx.getItemId()==itemi){
            selectedItem=idx;
        }
    }
    if(selectedItem!=null){
        this.items.add(selectedItem);
        this.totalPrice+=selectedItem.getPrice();
        System.out.println("The Food : "+selectedItem.getName()+" is said to be ordered with price of "+selectedItem.getPrice());
    }
    else{
        System.out.println("The seleted item is not available in the menu");
    }
    }

  // Creating an reference for getting the new Order 

  Order newOrder = new Order();
  newOrder.items=this.items;
  newOrder.totalPrice=this.totalPrice;
  orders.add(newOrder);
  System.out.println("The order "+orderId+" is done successfully");
  newOrder.setServable(true);
}
public void viewOrders(){
    for (Menu idx:items){
        System.out.println(idx.getName());
    }
    for (Order idx:orders){
        System.out.println(idx.getTotalPrice());
    }
}
}
/*
public void placeOrder(){
    
    System.out.println("Kindly Enter the Item ID: || To Exit press -2");
    int itemIdi = inp.nextInt(); 
    if(itemIdi==-2)   
        break;
    inp.nextLine();
    for (Menu idx : menus){
        if(idx.getItemId()==itemIDi){
            orders.add(new Order(orderIdi));
        }
    }

}
    

public void viewAllOrders(){
    for(Order idx : orders){


    }
    }
}

*/



