public class Diamond_Pattern_gfg implements Dump{

    public static void main(String[] args) {
        problem();
    }
    static void problem(){
        int n=5;
        first_printer(n);
        second_printer(n);
    }
    public static void first_printer_error(int n){
       int temp=n;
        for(int i=0;i<n;i++){
            temp--;
            for(int j=0;j<temp;j++){
                System.out.println(' ');
            }
            if(i==0){
                System.out.println("* ");
            }
            while(i!=0){
                System.out.println("* ");
                i--;
            }
        }
    }
    
    public static void first_printer(int n){
        for(int i=0;i<n;i++){
            // This loop is said to run for the range of 5 times
            // we need to first print spaces
            for(int j=0;j<=n-i-1;j++){  // 4 -> 5-1 // 3->5-1-1 // 2->5-3-->5-2-1
                System.out.print(" ");
            }
            // After printing the spaces
                for(int k=0;k<=i;k++){
                    System.out.print("* ");
                }
                System.out.println();
        }
    }
    
    public static void second_printer(int n){
        // Create the loop
        for(int i=0;i<n;i++){
            //Printing the Spaces part
            for(int j=0;j<=i;j++){ // 0 spaces || 1 spaces -> 5-0 || 5-1 || 5-2
                System.out.print(" ");
            }
                for(int k=n;k>0;k++){ // 
                    System.out.print("* ");
                }
        }
    }
    
    public void dumper(){
        /*

        * * * * *
         * * * *
          * * *
           * *
            *


            * 
           * *
          * * *
         * * * * 
        * * * * *
        n=5
        there are 4 spaces initally with reducing side and spaces are printed
        based on that
         */
    /* 5 stars and by then - > 0 spaces in first iteration
    -> 1 space and 
    -> 2 space and third iteration
     */    
    }
}