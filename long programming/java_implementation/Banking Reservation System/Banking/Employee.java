package Banking;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    Scanner inp = new Scanner(System.in);
    int employeeId;
    String employeeName;
    double employeeSalary;
    Address address;
    public static ArrayList<Employee> employee = new ArrayList<>();
    public Employee(){
        // Empty Constructor
    }
    public Employee(int a, String b, double c,Address d){
        this.employeeId=a;
        this.employeeName=b;
        this.employeeSalary=c;
        this.address=d;
    }
    public int getEmployeeId(){
        return this.employeeId;
    }
    public String getEmployeeName(){
        return this.employeeName;
    }
    public double getEmployeeSalary(){
        return this.employeeSalary;
    }
    public Address getEmployeeAddressLocation(){
        return this.address;
    }

public void addEmployee(){
    System.out.println("Enter the Employee ID : ");
    this.employeeId=inp.nextInt();
    inp.nextLine();
    System.out.println("Enter the Employee Name : ");
    this.employeeName=inp.nextLine();
    System.out.println("Enter the Employee Salary : ");
    this.employeeSalary=inp.nextDouble();
    inp.nextLine();
    System.out.println("Address Details ------------->");
    System.out.println("-------------------------------");
    Address add = new Address();
    add.addAddress();
    this.address=add;
    employee.add(new Employee(this.employeeId,this.employeeName,this.employeeSalary,add));
}

public void viewEmployeeDetails(){
    System.out.println("Enter the Employee ID : ");
    int a = inp.nextInt();
    inp.nextLine();
    Employee ab = null;
    for(Employee idx:employee){
        if(a==idx.getEmployeeId()){
            ab=idx;
        }
    }
    if(ab!=null){
        System.out.println("Employee ID : "+ab.getEmployeeId()+"Employee Name : "+ab.getEmployeeName()+"Employee Salary : "+ab.getEmployeeSalary());
    }
    else{
        System.out.println("This Employee doesn't exist !!");
    }

}

public void displayEmployeeDetails(){
    for(Employee idx:employee){
        System.out.println(idx.getEmployeeId()+idx.getEmployeeName()+idx.getEmployeeSalary());
    }
}

}
