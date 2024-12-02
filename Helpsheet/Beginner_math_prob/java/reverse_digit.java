public class reverse_digit {
    public static void main(String[] args) {
        // num=12345;rev=54321
        int number=12345;int last=0;int newe=0;
        for(int i=0;number>0;i++)
        {
         int temp=0;
        temp=number;        
        last=number%10;
        newe = last+newe*10;
        number=number/10;
        } 
        System.out.println("The reversed digits are : "+newe);
        /* System.out.println("Hiii");*/
    }
    
}
