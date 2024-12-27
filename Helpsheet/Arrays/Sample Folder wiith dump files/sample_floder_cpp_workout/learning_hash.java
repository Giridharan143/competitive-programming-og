// import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class learning_hash{
   static HashMap<String, String> mapi=new HashMap<>();
    static Scanner inp= new Scanner(System.in);
        public static void main(String[] args) {
            mapi.put("Giridharan K","310621205023");
            System.out.println(mapi.keySet());
            System.out.println(mapi.values());
            if(mapi.containsKey("Giridharan K")){
                System.out.println("Yeah it's present");
            }
            else{
                System.out.println("No it's not present");
            }
            if(mapi.containsValue("310621205023")){
                System.out.println("Yeah it's present");
            }
            else{ //310621205043  || 310621205006
                System.out.println("No it's not present");
            }
            for(int i=0;i<2;i++){
                System.out.println("Enter the Student's Name : ");
                String a=inp.nextLine();
                System.out.println("Enter the Student's Roll No : ");
                String b=inp.nextLine();
            mapi.put(a,b);
        }
        for(Map.Entry<String, String> idx : mapi.entrySet()){
            System.out.println("The Key : "+idx.getKey()+" The Value : "+idx.getValue());            
        }
        // for(int i=0;i<3;i++){
        //     mapi.keySet
        // }
        // mapi.forEach((key, value)-> System.out.println("The Key -> "+key+" The Values : "+value));
        // for(String key: mapi.keySet()){
        //     System.out.println(key);
        // }
        // for (String values:mapi.values()){
        //     System.out.print("Value -> "+values);System.out.println("---");
        // }
        // System.out.println(mapi.keySet()+" "+mapi.values());

        for(Map.Entry<String, String> idx:mapi.entrySet()){
            System.out.println("Value : "+idx.getValue()+"|| "+"Key : "+idx.getKey());
        }
    }
}