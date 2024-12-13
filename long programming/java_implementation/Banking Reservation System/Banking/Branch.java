package Banking;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    int branchId;
    String branchName;
    Address address;
    public static ArrayList<Branch> branch = new ArrayList<>();
    Scanner inp = new Scanner(System.in);
    public Branch(){
        //Empty Constructor
    }
    public Branch(int a, String b,Address c){
        this.branchId=a;
        this.branchName=b;
        this.address=c;
    }

    public int getBranchId(){
        return this.branchId;
    }

    public String getBranchName(){
        return this.branchName;
    }

    public Address getBranchAddressLocation(){
        return this.address;
    }

public void addBranch(){
    System.out.println("Enter the Branch ID : ");
    this.branchId=inp.nextInt();
    inp.nextLine();
    System.out.println("Enter the Branch Name : ");
    this.branchName=inp.nextLine();
    System.out.println("Moving to Address Section ------->");
    System.out.println("------------------------------------");
    Address add = new Address();
    add.addAddress();
    this.address=add;
    branch.add(new Branch(this.branchId,this.branchName,add));
}

public void viewBranchDetails(){ // Enter the Bank Id
    System.out.println("Enter the Branch ID : ");
    int b = inp.nextInt();
    inp.nextLine();
    Branch ab = null;
    for(Branch idx:branch){
        if(b==idx.getBranchId()){
            ab=idx;
        }
    }
    if(ab!=null){
        System.out.println("Branch Name : "+ ab.getBranchName()+"Branch City : "+ab.address.getCity()+" Branch State : "+ab.address.getState()+" Branch Country : "+ab.address.getCountry());
    }
}

public void displayBranchDetails(){
    for(Branch idx:branch){
        System.out.println(idx.getBranchId()+idx.getBranchName()+idx.address.getCity()+idx.address.getState()+idx.address.getCountry());
    }
}

}
