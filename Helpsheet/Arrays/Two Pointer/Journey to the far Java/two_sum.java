import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class two_sum{
    Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        two_sum ab=new two_sum();
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int [] nums1={1,2,3,4,5};
        System.out.println(ab.two_summer(nums));
        //Arrays.stream(ab.two_summi(nums1)).forEach(System.out::print);
        // Arrays.stream(ab.two_summi(nums1))
        //     .forEach(idx-> System.out.println(idx+""));
        //System.out.println(Arrays.toString(ab.two_summi(nums1)));
        String out = Arrays.stream(ab.two_summi(nums1)).
                                                       mapToObj(num -> String.valueOf(num)).
                                                              collect(Collectors.joining(", ","[","]"));
        System.out.println(out);
        String[] iri = {"Giri"};
        String outer=String.stream(iri).
                                map(String::toUpper).
                                forEach(System.out::println);
        
    }

public ArrayList<Integer> two_summer(ArrayList<Integer> nums){
    ArrayList <Integer> arr = new ArrayList<>();
    for(int idx=0;idx<nums.size();idx++){
        arr.add(nums.get(idx)+1);
    }
    return arr;
}
public int[] two_summi(int[] nums){
    int n = nums.length;
    int[] arr=new int[nums.length];
    for(int idx=0;idx<n;idx++){
        arr[idx]=nums[idx]+1;
    }
    return arr;
}


}