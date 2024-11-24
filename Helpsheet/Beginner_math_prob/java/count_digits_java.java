import java.util.*;

public class count_digits_java {
    public static int count(int arr[]){
        int counter=0;
        for(int i=0;i<arr.length;i++){
            counter+=1;        
        }
        return  counter;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n= inp.nextInt();
        int arr[]={1,2,3,9,9,4,5};
        System.out.println(count(arr));
        //int arr[]=new arr[];
        /*
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
                arr[i]=inp.nextInt();
        }
        System.err.println(count(arr));

    }*/
}
}