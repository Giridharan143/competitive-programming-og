package Waiter;

public class Menu{
    int itemId;
    String Name;
    double price;    

public Menu(int a, String b, double c){
        this.itemId=a;
        this.Name=b;
        this.price=c;
    }


public int getItemId(){
    return this.itemId;
}
public String getName(){
    return this.Name;
}
public double getPrice(){
    return this.price;
}

public void displayMenu(){
    System.out.println("Item ID: "+this.itemId+" Name : "+this.Name+" Price: "+this.price);
}

}
