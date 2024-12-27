import java.util.Scanner;

public class Convert_it {   // 10_00._50 cent
        public static void main(String[] args) {
            // double amount = 10000.5;
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter the Number to be Converted to required format : ");
            double amount = inp.nextDouble();
            inp.nextLine();
            String an = String.format("%.2f",amount);
            // String an = String.format("%.2f",amount);
            // String an = Double.toString(amount);
            String[] seperator= an.split("\\.");
            // System.out.println(seperator[0]+" "+seperator[1]);
            String dollar = seperator[0];
            String cents = seperator[1];
            int count=0;
            StringBuilder output = new StringBuilder();
            for (int i = 0; i <= dollar.length()-2; i++) {
                output.append(dollar.charAt(i));
                count++;
                if(count%2==0 && i!=dollar.length()-2){
                    output.append('_');
                }
           }
           output.append(dollar.charAt(dollar.length()-1));
           output.append("._");output.append(cents);
            if(!cents.equals("0")){
                output.append(" cents");
            }
            else{
                output.append(" cent");
            }
        System.out.println(output);
    }
}

class Dump{
        // // 10_00._50 cents
        // String[] seperator = stramt.split("\\.");
        // String[] seperator= Double.toString(amount).format("%.2f").split("\\.");
        // String an = Double.toString(amount);
        // String an = String.format("%.2f",amount);
        /*for(int i=0;i<dollar.length();i++){
                if(count<2){
                // output[i]=dollar.charAt(i);
                output.append(dollar.charAt(i));
                count++;
                }
                count=1;
                output.append('_');
                i=i+1;
                if(i==dollar.length()-1){
                    output.append('.');
                    output.append('_');
                    int n=cents.length();                    
                    for(int j=0;j<n;j++){
                        output.append(cents.charAt(i));
                    }
                }
            }
            // for (int i = 0; i < output.length(); i++) {
            //     System.out.print(output);
            // }
            System.out.println(output);  
         */
}

