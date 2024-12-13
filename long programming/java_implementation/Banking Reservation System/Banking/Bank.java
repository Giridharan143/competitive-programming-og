package Banking;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank{
    int bankId;
    String bankName;
    public static ArrayList<Bank> bank = new ArrayList<>();
    Scanner inp = new Scanner(System.in);

    public Bank(){
        // This is an empty constructor
    }
    public Bank(int a,String b){
        this.bankId=a;
        this.bankName=b;
    }

public int getBankId(){
    return this.bankId;
}

public String getBankName(){
    return this.bankName;
}
public void addBank(){
    System.out.println("Enter the Bank ID : ");
    this.bankId=inp.nextInt();
    inp.nextLine();
    System.out.println("Enter the Bank Name : ");
    this.bankName=inp.nextLine();
    bank.add(new Bank(this.bankId,this.bankName));
    System.out.println("The Bank Details has been Updated !!!");
}

public void viewBankDetails(){
    System.out.println("Enter the Bank ID: ");
    int a= inp.nextInt();
    inp.nextLine();
    Bank ab = null;
    for(Bank idx:bank){
        if(a==idx.getBankId()){
            ab=idx;
        }
    }
    if(ab!=null){
        System.out.println("Bank Name : "+ab.getBankName());
    }
    else{
        System.out.println("Bank doesn't exist !!");
    }
}

public void displayBankDetails(){
    for(Bank idx:bank){
        System.out.println(idx.getBankId()+idx.getBankName());
    }
}



}