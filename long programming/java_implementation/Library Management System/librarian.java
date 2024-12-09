import library.*;
import java.util.*;
//import java.io.*;

public class librarian{
    public static void main(String[] args) {
        //ArrayList <Book> bookptr = new ArrayList<Book>();
        Libraryy lib = new Libraryy();
        Scanner inp = new Scanner(System.in);
        while(true){
        System.out.println("\nThe Library Management System ");
        System.out.println("-----------------------------");
        System.out.println("Kindly Choose from the Options : ");
        System.out.println("1. Add a Book");
        System.out.println("2. View Available Books");
        System.out.println("3. Borrow a Book");
        System.out.println("4. Return a Book");
        System.out.println("5. Exit\n");
        int choice = inp.nextInt();
        switch(choice){
            case 1:
                System.out.println("Kindly Enter The Book ID : ");    
                int booki = inp.nextInt();
                inp.nextLine();
                System.out.println("Kindly Enter the Title of the Book: ");
                String title = inp.nextLine();
                System.out.println("Kindly Enter the Author Name: ");
                String auth = inp.nextLine();
                //bookptr.add(new Book(booki,title,auth));
                lib.addBook(booki, title, auth);
                System.out.println("Hurray the Book is added !!");
                break;

            case 2:
                lib.viewAvailableBooks();
                break;
            case 3:
                //System.out.println("Enter the Book ID to borrow : ");
                //int bookij = inp.nextInt();                
                lib.borrowBook();
                break;
            case 4:
                //System.out.println("Enter the Book ID to return : ");
               // int retew = inp.nextInt();
                lib.returnBook();
                break;
            case 5:
                System.out.println("Thank you choosing our Library System !!\n Byeeee");
                inp.close();
                System.exit(0);
                break;
            default:
                System.out.println("Kindly Provide the correct options for further usage !!!");
        }
     }   

    }
}