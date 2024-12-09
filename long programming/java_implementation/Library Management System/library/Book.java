package library;

public class Book {
    int bookID;
    String title;
    String author;
    boolean availability;
    
   public Book(int a, String b, String c){
        this.bookID=a;
        this.title=b;
        this.author=c;
        this.availability=true;
        //this.availability=d;
    }
    public int getBookId(){
        return this.bookID;
    }
    public String getTitle(){
        return this.title;        
    }
    public String getAuthor(){
        return this.author;
    }
    public boolean isAvailable(){
        return this.availability;
    }
    public void displayBook(){
        System.err.println("BookID : "+this.bookID+" Title: "+this.title+" Author : "+this.author);
    }
    public void setAvailability(Boolean a){
        this.availability=a;
    }
}
