import java.util.*;

public class sort_in_specific_order_gfg implements Dump {

    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 5, 4, 7, 10};
        sorti(arr);
    }

    public static void sorti(long[] nums){
        List<Long> odd = new ArrayList<>();
        List<Long> even = new ArrayList<>();
        for(Long num : nums){
            if(num%2==0)
                even.add(num);
            else
                odd.add(num);
        }
        odd.sort(Collections.reverseOrder());
        Collections.sort(even);
        int i=0;
        for(Long num1:odd) nums[i++]=num1;
        for(Long num2:even) nums[i++]=num2;
        System.out.println(Arrays.toString(nums));

    }

    public void dumper(){

    }
}
