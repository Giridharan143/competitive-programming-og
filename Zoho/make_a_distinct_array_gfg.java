import java.util.*;

public class make_a_distinct_array_gfg implements Dump  {

    public static void main(String[] args) {
        int[] arr={95,76766456,789};
        int[] temper = make_dist(arr);
        for (int i = 0; i < temper.length; i++) {
            System.out.print(temper[i]+" ");
        }
    }

    public static int[] make_dist(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            while(num>0){
                int temp = num%10; 
                set.add(temp);
                num/=10;                
            }
        }
        List<Integer> cust = new ArrayList<>(set);
        int[] sender = new int[set.size()];
        for (int i = 0; i < cust.size(); i++) {
            sender[i]=cust.get(i);
        }
        return sender;
    }

    public void dumper(){
        /*
         there is the inout of this
        Input: nums = [131, 11, 48]
        Output: 1 3 4 8
        Explanation: 1, 3, 4, and 8 are only distinct
        digits that can be extracted from the numbers
        of the array.
        Example 2:

        Input: nums = [111, 222, 333, 4444, 666]
        Output: 1 2 3 4 6
        Explanation: 1, 2, 3, 4, and 6 are only distinct
        digits that can be extracted from the numbers
        of the array.

         */
    }


}
