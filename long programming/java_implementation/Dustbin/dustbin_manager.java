import soraa.*;
import kuppakaran.*;

public class dustbin_manager {

    public static void main(String[] args) {
        dustbin dt = new dustbin(80,"Full");
        //dt.status();
        hijk net= new hijk("Giridharan");
        System.out.println("The name of the user: "+net.welcome());
        duster_location loc=new duster_location(8,"Full","Chennai");
        loc.display();

        department dpt = new department(12000,34,"Kumaraswamy","Thandalam","Healthcare");
        dpt.report();
        if (dpt.work())
            System.out.println("Yes work done !");
        else    
            System.out.println("No work is still pending !");
        
    }   
}
