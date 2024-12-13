import java.util.Scanner;

import Banking.*;


public class Banking_System_Main {
    public static void main(String[] args) {            
        Scanner inp = new Scanner(System.in);
        Bank bank = new Bank();
        Branch branch = new Branch();
        Customer customer = new Customer();
        Employee employee = new Employee();
        Account account = new Account();
        Loan loan = new Loan();

        while(true){
            System.out.println("Banking Management System");
            System.out.println("-------------------------");
            System.out.println("1.Bank Management");
            System.out.println("2.Branch Management");
            System.out.println("3.Customer Management");
            System.out.println("4.Employee Management");
            System.out.println("5.Account Management");
            System.out.println("6.Loan Management");
            System.out.println("7.Exit");
            int choice = inp.nextInt();
            switch(choice){
                case 1:
                System.out.println("1.Add a Bank");
                System.out.println("2.View bank details");
                System.out.println("3.Display Bank Details");
                System.out.println("4.exit");
                int choicee= inp.nextInt();
                switch(choicee){
                    case 1:
                        bank.addBank();
                        break;
                    case 2:
                        bank.viewBankDetails();
                        break;
                    case 3:
                        bank.displayBankDetails();
                        break;
                    case 4:
                        System.out.println("Exiting Banking Management System --------->");
                        return;
                }
                break;
                case 2:
                    System.out.println("1.Add a Bank Branch");
                    System.out.println("2.View branch details");
                    System.out.println("3.Display Branch Details");
                    System.out.println("4.exit");
                    int choicea= inp.nextInt();
                    switch(choicea){
                        case 1:
                            branch.addBranch();
                            break;
                        case 2:
                            branch.viewBranchDetails();
                            break;
                        case 3:
                            branch.displayBranchDetails();
                            break;
                        case 4:
                            System.out.println("Exiting the Branch Management System-------------->");
                            return;
                    }
                    break;
                    case 3:
                    System.out.println("1.Add a Customer");
                    System.out.println("2.View Customer details");
                    System.out.println("3.Display Customer Details");
                    System.out.println("4.exit");
                    int choiceb= inp.nextInt();
                    switch(choiceb){
                        case 1:
                            customer.addCustomer();
                            break;
                        case 2:
                            customer.viewCustomerDetails();
                            break;
                        case 3:
                            customer.displayCustomerdetails();
                            break;
                        case 4:
                            System.out.println("Exiting the Customer Management System --------------------------------------->");
                            break;
                    }
                     break; 
                    case 4:
                    System.out.println("1.Add a Employee");
                    System.out.println("2.View Employee details");
                    System.out.println("3.Display Employee Details");
                    System.out.println("4.exit");
                    int choicec= inp.nextInt();
                    switch(choicec){
                        case 1:
                            employee.addEmployee();;
                            break;
                        case 2:
                            employee.viewEmployeeDetails();
                            break;
                        case 3:
                            employee.displayEmployeeDetails();
                            break;
                        case 4:
                            System.out.println("Exiting the Employee Management System ---------------------------------------->");
                            return;                        
                    }
                    break;
                    case 5:
                    System.out.println("1.Update Account Details");
                    System.out.println("2. Update Account Balance");
                    System.out.println("3. Credit Transaction ");
                    System.out.println("4. Display Account Details");
                    System.out.println("5. Exit");
                    int choiced= inp.nextInt();
                    switch(choiced){
                        case 1:
                            account.updateAccountDetails();
                            break;
                        case 2:
                        System.out.println("Enter the Amount to be Balance :");    
                        double a = inp.nextDouble();
                        account.updateBalance(a);
                        break;
                        case 3:
                        account.creditTransaction();
                        break;
                        case 4:
                        account.displayAccountdetails();
                        break;
                        case 5:
                        System.out.println("Exiting the Account Management System ------------------------------------------------------->");
                        return;
                    }
                    break;
                
                    case 6:
                    System.out.println("1.Add a Loan");
                    System.out.println("2.View Loan details");
                    System.out.println("3.Display Loan Details");
                    System.out.println("4.exit");
                    int choicel= inp.nextInt();
                    switch(choicel){
                        case 1:
                            loan.addLoan();
                            break;
                        case 2:
                            loan.viewLoanDetails();
                            break;
                        case 3:
                            loan.displayLoanDetails();
                            break;
                        case 4:
                            System.out.println("Exiting the Loan Management System ------------------------------------------------------------->");
                            break;
                    }
                    break;

                    case 7:
                        System.out.println("Exiting the Application !!!!!");
                        System.out.println("----------------------------------------------------------------------------------------------------------");
                        inp.close();
                        return;
                        
            }
        }
    }
}
