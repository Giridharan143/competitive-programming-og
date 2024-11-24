import java.util.*;
public class wnew {
    public static void main(String args[]){
        //System.out.println("Hi Guys are you : free ?");
        Scanner inp = new Scanner(System.in);
        String name=inp.nextLine();
        //System.out.println(name);
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
        inp.close();
    }
    
}
