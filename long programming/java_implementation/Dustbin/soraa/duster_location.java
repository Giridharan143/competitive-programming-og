package soraa;

public class duster_location extends dustbin{

    String location;
    public duster_location(int a, String b,String c){
        super(a, b);
        this.location=c;
    }
   // @Override
    public void display(){
        super.display();
        String stringer= "The Location of the dustbin is said to be "+location;
        System.out.println(stringer);
    }
    
}
