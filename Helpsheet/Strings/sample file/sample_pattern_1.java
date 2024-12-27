public class sample_pattern_1 {

    /*
     * 1
     * **
     * 333
     * ****
     * 55555
     *      */
    public static void main(String[] args) {
        phoneNoPattern();
    }
/*
 * 9 8 7
 * 4 5 6 
 * 1 2 3 
 */

    public static void phoneNoPattern(){
        int n =9;
        for(int i=0;i<3;i++){
            StringBuilder newi = new StringBuilder();
            for(int j =0;j<3;j++){
                newi.append(String.valueOf(n)+" ");n--;
            }
            System.out.println(newi.reverse());
        }
    }

    public static void patternEvenHashTag(int n){
        for(int i=1;i<=n;i++){
            for(int j =0;j<i;j++){
                if(i%2!=0){
                    System.out.print(i);
                }
                else{
                System.out.print('#');
                }
            }System.out.println();
        }
    }
}
