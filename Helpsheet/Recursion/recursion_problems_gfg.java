public class recursion_problems_gfg {
    public void printNos(int temp,int n) {
        if(temp>n)
            return;
        System.out.print(temp+" ");
        printNos(temp+1,n);
            // System.out.print(n+" ");
            // return printNos(n-1);
            // System.out.print(printNos(n-1));
        
    }
    public void reverseNaturalNUmbers(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        reverseNaturalNUmbers(n-1);

    }


    public void normalAddNaturalNumber(int i,int n){
        if(i>n){
            return;
        }        
        System.out.print(i+" ");
        normalAddNaturalNumber(i+1, n);        
    }


    public void printNNaturalNumbersFromBeginning(int n){
        if(n<1){
            return;
         } // Never use else for the Recursive problem because the problem query would be eliminated quickly asap as it runs only once
         printNNaturalNumbersFromBeginning(n-1);
         System.out.print(n+" ");

        }


/*Input: n = 5
Output: 120
Explanation: 5*4*3*2*1 = 120 */

public int factorial(int n){
    if(n==1){
        return 1;
    }
    return n*factorial(n-1);
}

/*The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

The Fibonacci sequence is defined as follows:

F(0) = 0
F(1) = 1
F(n) = F(n - 1) + F(n - 2) for n > 1
 */

private int nthFibonacci(int n){
    if(n==0){
        return 0;
    }
    else if(n==1){
        return 1;
    }
    return nthFibonacci(n-1)+nthFibonacci(n-2);
}

/*Input: n = 2
Output: 4
Explanation: The reverse of 2 is 2, and 22 = 4.

Input: n = 10
Output: 10
Explanation: The reverse of 10 is 1 (leading zero is discarded), and 101 = 10.*/


// private int reverseNumberl(int n){
//     // String ni = Integer.toString(n);
//     // int reverse = 
//     // String ni = new StringBuilder(n).reverse().toString();
//     String ni = Integer.toString(n);
//     String nii = new StringBuilder(ni).reverse().toString();
//     int b = Integer.parseInt(nii);
//     // double b = Double.parseDouble(nii);
//     // int result =  (int) Math.pow(a,b);
//     return b ;
// }
public void powerfinder(int a){
    int rev = reverse(a);
    int multiplier = Math.pow()
}


public static void main(String[] args) {
    int n=10;
    recursion_problems_gfg printt=new recursion_problems_gfg();
    // System.out.println(printt.printNos(n));
    // printt.printNos(1, n);
    // printt.reverseNaturalNUmbers(n);
    // printt.normalAddNaturalNumber(1, n);
    // printt.printNNaturalNumbersFromBeginning(n);
    //System.out.println(printt.factorial(5));
    // System.out.println(printt.nthFibonacci(5));
    System.out.println(printt.reverseNumberl(2));
}
}
