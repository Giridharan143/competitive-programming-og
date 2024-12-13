package Banking;

import java.util.ArrayList;
import java.util.Scanner;
/*
abstract class none{
    public abstract void accountDetails();
}
*/
public class Account {
    
    Scanner inp = new Scanner(System.in);
    Customer customer;  // Unwanted Customer Reference Variable
    int accountId;
    String accountHoldername;
    String accountType;
    double accountBalance=0;
    public static ArrayList<Account> account = new ArrayList<>();
    public Account(){
        //Empty Constructor
    }
    public Account(int z,String a,String b,double c){
        this.accountId=z;
        this.accountHoldername=a;
        this.accountType=b;
        this.accountBalance=c;
    }
    public int getAccountId(){
        return  this.accountId;
    }
    public String getAccountHolderName(){
        return this.accountHoldername;
    }
    public String getaccountType(){
        return this.accountType;
    }
    public double getAccountBalance(){
        return this.accountBalance;
    }
public void updateAccountDetails(){
    System.out.println("Enter the Account ID : ");
    int a = inp.nextInt();
    inp.nextLine();
    Customer ab= null;
    for(Customer idx:customer.customer){
        if(a==idx.getAccountId()){
            ab=idx;
        }
    }
    if(ab!=null){        
        System.out.println("The Account Id is Verified !!");
        this.accountId=ab.getAccountId();
        this.accountHoldername=ab.getCustomerName();
        this.accountType=ab.getAccountType();
        System.out.println("Enter the Amount to be Credited : ");
        this.accountBalance+=inp.nextDouble();
        inp.nextLine();
        account.add(new Account(this.accountId,this.accountHoldername,this.accountType,this.accountBalance));        
    }
    else{
        System.out.println("The Account doesn't Exists !!!");
    }
}
public double updateBalance(double a){
    this.accountBalance+=a;
    return this.accountBalance;
}

public void creditTransaction(){
    System.out.println("Enter the Account ID : ");
    int a = inp.nextInt();
    Account ab =null;
    for(Account idx:account){
        if(a==idx.getAccountId()){
            ab=idx;
        }
    }
    if(ab!=null){
        System.out.println("Enter the Amount to be credited : ");
        ab.updateBalance(inp.nextDouble());
        System.out.println("The Amount has been updated !!");
    }
    else{
        System.out.println("The Account doesn't exist !!");
    }
}
public void displayAccountdetails(){
    for(Account idx:account){
        System.out.println(idx.getAccountId()+idx.getAccountHolderName()+idx.getaccountType()+idx.getAccountBalance());
    }
}





}
