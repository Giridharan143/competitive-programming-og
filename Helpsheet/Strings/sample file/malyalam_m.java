import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class malyalam_m {
    public static void main(String[] args) {
        String a = "ara";
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Word : ");
        String b = inp.nextLine();
        firstOccurence(b);
    }
    public static void firstOccurence(String str){
        int counter=0;
        LinkedHashMap<Character, Integer> lang = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            Character temp = str.charAt(i);
                // lang.put(temp,counter++);
                lang.put(temp,lang.getOrDefault(temp,0)+1);
            
        }
        for(Map.Entry<Character, Integer> mapi: lang.entrySet()){
            if(mapi.getValue()>1){
                System.out.println("Key which is repeated first is : "+mapi.getKey());
            }
            else{
                counter++;
            }
        }System.out.println("Number of Distinct variable : "+counter);
    }
}
