package Details;

public class customer{

    int customerID;
    String name;
    String phoneNo;

    public customer(String b, String c){
        this.name=b;
        this.phoneNo=c;
    }

    public String getName(){
        return this.name;
    }

    public String getPhoneNo(){
        return this.phoneNo;
    }

    public void displayCustomer(){
        System.out.println("The Name of the Customer is: "+ this.name+ "THE Phone No of the Customer is : "+this.phoneNo);
    }


}