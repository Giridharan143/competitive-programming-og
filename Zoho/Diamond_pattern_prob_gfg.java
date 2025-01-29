public class Diamond_pattern_prob_gfg implements Dump{

    public static void main(String[] args) {
        first_pattern(5);
        second_pattern(5);
    }

    public static void first_pattern(int n){
            for(int i=1;i<=n;i++){
                // The Loop for about 5 times as the test run is said to be working out 
                for(int j=0;j<n-i;j++){
                    System.out.print(" ");                    
                }
                for(int k=1;k<=i;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }

    public static void second_pattern(int n){
        for(int i=0;i<n;i++){
            // Loop would be run for almost 5 times
            // 
            for(int j=n-i;j!=n;j++){
                System.out.print(" ");
            }
                for(int k=0;k<n-i;k++){
                    System.out.print("* ");
                }
            System.out.println();
    }
}
    
    public void dumper(){

        /*
                *
            *      *
        *      *      *

         This is Nothing just an empty oart
         */
    }
}
