import java.util.Scanner;

public class Alpha_num {
     // a1b22
    public static void main(String[] args) {
        // String poi = "a1b2c10";
        Scanner inp = new Scanner(System.in);
        String poi = inp.nextLine();
        // int count =0;
        // int n =poi.length();
        // zohoCalling(poi);
        weWillDoItForSure(poi);
    }


    public static void zohoCalling(String a){
    int n=a.length();int count =0 ; Character last='\0';
    for(int i=0;i<=n-1;i++){
        Character curr = a.charAt(i); // a
        
        if(Character.isDigit(curr)){
            // int temp = Integer.parseInt(String.valueOf(curr));
            int temp = curr - '0';
            count = 10*count+temp; 
        }
        else{
            if(count>0 && last !='\0'){
                for(int j=0;j<count;j++){
                    System.out.print(last);
                }
            }
            last = curr;
            count=0;
        }
    }
    if(count > 0 && last !='\0'){
        for (int k = 0; k<count ; k++) {
            System.out.print(last);
        }
    }
}
public void dumper(){
    // for(int i=0;i<=n-1;i++){
    //     int temp;
    //     Character curr = poi.charAt(i);
    //     if(Character.isDigit(curr)){
    //         temp = Integer.parseInt(String.valueOf(curr));
    //         count = 10*count + temp;
    //     }
    //     else{
    //         for (int j = 0; j < count; j++) {
    //             System.out.println(curr);
    //         }
    //         count=0;
    //     }
    // }

}

public static void weWillDoItForSure(String str){  
    int count=0;Character lastChar = '\0';int n = str.length();
    for(int i=0;i<n;i++){
        Character curr = str.charAt(i);
        
        // Going to check whether the given section is an digit

        if(Character.isDigit(curr)){
            int temp = curr - '0'; // This is the condition to get the Integer to the character in the String
            count = count * 10 + temp;
        }
        else{
            if(count > 0 && lastChar!='\0'){
                for(int j=0;j<count;j++){
                    System.out.print(lastChar);
                }
            }
            lastChar=curr; // This is Going to go in an default value
            count=0; 
        }
    }
    if(count >0 && lastChar!='\0'){
        for(int l=0;l<count;l++){
            System.out.print(lastChar);
        }
    }
}




}

