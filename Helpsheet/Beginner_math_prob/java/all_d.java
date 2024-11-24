import java.util.*;
public class all_d{
    public static void main(String[] args) {
        int number=50, count=0;
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int i=1;i<number;i++){if (i%2==0){ arr1.add(i); count+=1;}}
        System.out.println(arr1);System.out.println(count);
    }
}