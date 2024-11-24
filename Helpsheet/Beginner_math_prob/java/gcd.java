import java.util.Scanner;

class gcd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Input two integers
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Print the GCD of the numbers
        System.out.println("GCD is: " + g(a, b));
    }

    // Function to calculate GCD
    public static int g(int a, int b) {
        if (b > a) { 
            // Swap a and b if b is greater than a
            int temp = a;
            a = b;
            b = temp;
        }
        
        // Base case
        if (b == 0)
            return a;
        
        // Recursive call
        return g(b, a % b);
    }
}
