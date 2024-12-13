package Banking;

import java.util.ArrayList;
import java.util.Scanner;

public class Loan {
    Scanner inp = new Scanner(System.in);
    int loanId;
    String loanType;
    String loanStatus;
    public static ArrayList<Loan> loan = new ArrayList<>();
    public Loan(){
        // Empty Constructor
    }
    public Loan(int a,String b, String c){
        this.loanId=a;
        this.loanType=b;
        this.loanStatus=c;
    }
    public int getLoanId(){
        return this.loanId;
    }
    public String getLoanType(){
        return this.loanType;        
    }
    public String getLoanStatus(){
        return this.loanStatus;
    }

public void addLoan(){
    System.out.println("Enter the Loan ID : ");
    this.loanId=inp.nextInt();
    inp.nextLine();
    System.out.println(" Enter the Loan Type: (i.e Personal/Home/Jewel/Car) ");
    this.loanType=inp.nextLine();
    System.out.println("Enter the Loan Status : (i.e Completed/Pending/Hold)");
    this.loanStatus=inp.nextLine();
    loan.add(new Loan(this.loanId,this.loanType,this.loanStatus));
    System.out.println("Loan Status Updated !!!");
}

public void viewLoanDetails(){
    System.out.println("Enter the Loan ID : ");
    int a = inp.nextInt();
    inp.nextLine();
    Loan ab =null;
    for(Loan idx:loan){
        if(a==idx.getLoanId()){
            ab=idx;
        }
    }
    if(ab!=null){
        System.out.println("Loan ID : "+ab.getLoanId()+" Loan Type : "+ab.getLoanType()+" Loan Status : "+ab.getLoanStatus());
    }
}

public void displayLoanDetails(){
    for(Loan idx:loan){
        System.out.println(idx.getLoanId()+idx.getLoanType()+idx.getLoanStatus());
    }
}

}
