public class reverse_exponential_gfg {

    private static int reverseNumber(int n){

        if(n==0){
            return 0;
        }
        String rev = Integer.toString(n);
        int lengther = rev.length();
        // String reverser = new StringBuilder(rev).reverse().toString();
        // int a = Integer.parseInt(reverser);
        return n%10 * (int) Math.pow(10,lengther-1) + reverseNumber(n/10);
    }

    // private static int powerNumber(int num){
    //     int reversee = reverseNumber(num);
    //     // double_expo = Math.pow()
    //     int result = (int) Math.pow(num,reversee);
    //     return result;
    // }

    private static int powerNumber(int num,int pow){
        // Base Condition for the Function to end

        if(pow==0){
            return 1;
        }
        long mod = 1000000007;
        int halfPower = powerNumber(num, pow/2);
        halfPower = (int) ((double)halfPower*halfPower % mod);
        if(pow%2==1){
            halfPower= (int) ((double)halfPower*num %mod);
        }
        return halfPower;

    }


    public static void main(String[] args) {
        //System.out.println(reverseNumber(1234));
       // int reverseNumber = reverseNumber(10)

        System.out.println(powerNumber(2,reverseNumber(2)));


    }
       
}
