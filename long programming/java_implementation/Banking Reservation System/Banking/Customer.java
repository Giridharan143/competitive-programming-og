package Banking;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    // Need to update the Account Details 
    int customerId;
    String customerName;
    int accountId;
    String accountType;
    public static ArrayList<Customer> customer = new ArrayList<>();
    Scanner inp = new Scanner(System.in);
    public Customer(){
        //Empty Constructor
    }
    public Customer(int a,String b, int c, String d){
        this.customerId=a;
        this.customerName=b;
        this.accountId=c;
        this.accountType=d;
    }
    public int getCustomerId(){
        return this.customerId;
    }
    public String getCustomerName(){
        return this.customerName;
}
    public int getAccountId(){
        return this.accountId;
    }
    public String getAccountType(){
        return this.accountType;
    }

public void addCustomer(){
    System.out.println("Enter the CustomerID : ");
    this.customerId=inp.nextInt();
    inp.nextLine();
    System.out.println("Enter the Customer Name : ");
    this.customerName=inp.nextLine();
    System.out.println("Enter the Account ID : ");
    this.accountId=inp.nextInt();
    inp.nextLine();
    System.out.println("Enter the Account Type : (i.e Savings/Current)");
    this.accountType=inp.nextLine();
    customer.add(new Customer(this.customerId,this.customerName,this.accountId,this.accountType));
    System.out.println("The Customer Details has been Updated !!");
}

public void viewCustomerDetails(){ //Customer ID is given as an Input
    int a = inp.nextInt();
    Customer ab=null;
    for(Customer idx:customer){
        if(a==idx.getCustomerId()){
            ab=idx;
        }
    }
    if(ab!=null){
        System.out.println("Customer Name : "+ab.getCustomerName()+" Account ID : "+ab.getAccountId()+" Account Type : "+ab.getAccountType());
    }
    else{
        System.out.println("The Given Customer details doesn;t exists !!");
    }
}
public void displayCustomerdetails(){
    for(Customer idx:customer){
        System.out.println(idx.getCustomerId()+idx.getCustomerName()+idx.getAccountId()+idx.getAccountType());
    }
}

}
