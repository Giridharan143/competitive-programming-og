package soraa;
import java.util.*;

public class dustbin{

    int dust;
    String dustbin_status;
    boolean stat;
    public dustbin(int a, String b){
        this.dust=a;
        this.dustbin_status=b;
    }
private void status(){
    if (dustbin_status.equals("Full"))
        stat=true;
    else
        stat=false;
    
}

public void content(){
    if (stat==true)
        System.out.println("Yes");
    else
        System.out.println("No");
}

public void display(){
    System.out.println(dust+" and "+dustbin_status);
}
public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter the Number of Dust scale from 10: ");
    int a = inp.nextInt();
    inp.nextLine(); // Consume the leftover newline character
    System.out.println("Status of the Bin: ");
    String b = inp.nextLine(); // Read the full line of input
    dustbin dt = new dustbin(a,b);
    /*/
    System.out.println("Enter the Age: ");
    int x = inp.nextInt();
    inp.nextLine();
    System.out.println(x);
    System.out.println("Enter the Name: ");
    String c = inp.nextLine();
    System.out.println(c);
    */
    dt.display();
    inp.close();
    dt.status();
    dt.content();

    
}
}