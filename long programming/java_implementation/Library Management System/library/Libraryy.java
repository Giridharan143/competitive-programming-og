package library;

import java.util.*;

public class Libraryy {
    //String Books;
    Scanner inp = new Scanner(System.in);
    ArrayList <Book> books = new ArrayList <Book>();

    public void addBook(int a, String b, String c){
        books.add(new Book(a,b,c));
        System.out.println("The Book is Added Succesfully !!");
    }

    public void viewAvailableBooks(){
        if(books.isEmpty()){
            System.out.println("There are no Books present !!");
        }
        else{
        for(Book idx:books){
            System.out.println(idx.getTitle()+"->"+idx.getAuthor());
            System.out.println("\n");
          }
        }
    }

    public void borrowBook(){
        System.out.println("Enter the Book ID which needs to be borrowed: ");
        int brw = inp.nextInt();
        Book borrow = null;
        for(Book idx : books){
            if(idx.getBookId()==brw){
                borrow=idx;
            }
        }
        if (borrow.isAvailable()){
            borrow.setAvailability(false);
            System.out.println(borrow.getTitle()+" was borrowed Successfully !!");
        }
        else{
            System.out.println("The Book is not available!!");
        }

    }

    public void returnBook(){
        System.out.println("The Book ID of the Book to be returned: ");
        int ret = inp.nextInt();
        Book retu = null;
        for(Book idx:books){
            if(idx.getBookId()==ret){
                retu=idx;
            }
        }
        if  (!retu.isAvailable()){
            retu.setAvailability(true);
            System.out.println("The Book -"+retu.getTitle()+" has been returned back !!");
        }
        else {
            System.out.println("The Book is not available");
        }
    }


    
}
