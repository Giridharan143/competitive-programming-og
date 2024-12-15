package E_commerce;

import java.util.ArrayList;
import java.util.Scanner;

public class Order{
    Shipment shipmentCaller;
    Scanner inp = new Scanner(System.in);
    String type_of_goods;
    double goods_weight;
    String order_origin;
    String order_destination;
    double order_price;
    double total_order_cost;
    int orderId;
    static ArrayList<Order> order = new ArrayList<>();
    public Order(){
        // Empty Constructor
    }
    public int getOrderId(){
        return this.orderId;
    }
    public String getTypeOfGood(){
        return this.type_of_goods;
    }
    public double getGoodsWeight(){
        return this.goods_weight;
    }
    public String getOrderOrigin(){
        return this.order_origin;
    }
    public String getOrderDestination(){
        return this.order_destination;
    }
    public double getOrderPrice(){
        return this.order_price;
    }
    public Shipment getShipmentCaller(){
        return this.shipmentCaller;
    }

public Order(int g,String a, double b,String c,String d,double e,Shipment f){
    this.orderId=g;
    this.type_of_goods=a;
    this.goods_weight=b;
    this.order_origin=c;
    this.order_destination=d;
    this.order_price=e;
    this.shipmentCaller=f;
}
public void makeOrder(){
    System.out.println("Enter the Order ID : ");
    this.orderId=inp.nextInt();
    inp.nextLine();
    System.out.println("Enter the Type of Product : ");
    this.type_of_goods=inp.nextLine();
    System.out.println("Enter the Goods weight : ");
    this.goods_weight=inp.nextDouble();
    inp.nextLine();
    System.out.println("Enter Your Address : ");
    this.order_origin=inp.nextLine();
    System.out.println("Enter the Address you want it to be delivered : ");
    this.order_destination=inp.nextLine();
    System.out.println("Enter the Price : ");
    this.order_price=inp.nextDouble();
    //inp.nextLine();
    Shipment shipper = new Shipment();
    this.shipmentCaller=shipper;
    inp.nextLine();
    order.add(new Order(this.orderId,this.type_of_goods,this.goods_weight,this.order_origin,this.order_destination,this.order_price,shipper));
    System.out.println("Order has been successfully Placed !!");
}
public void viewOrder(){
    System.out.println("Enter the Order Id : ");
    int a = inp.nextInt();Order find = null;
    for(Order idx:order){
        if(a==idx.getOrderId()){
            find=idx;
        }
    }if(find!=null){
    System.out.println("Product: "+find.getTypeOfGood()+"Goods Weight : "+find.getGoodsWeight()+" Source :"+find.getOrderOrigin()+"Destination : "+find.getOrderDestination()+"Price : "+find.getOrderPrice());
    }
    else{
        System.out.println("Order is not found !!");
    }
}
public void moveToShipment(){
    Order finder=null;
    for (Order idx:order){
        if(idx.getOrderOrigin().equalsIgnoreCase(idx.getShipmentCaller().getShipmentSource())){
            finder=idx;
        }
    }
    if(finder!=null){
        System.out.println("The Order has been Shipped to the Desired Location !!");
    }
    else{
        System.out.println("The Required Route isn't Available");
    }
    
}

}