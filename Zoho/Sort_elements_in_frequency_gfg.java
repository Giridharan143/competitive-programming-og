import java.util.*;

public class Sort_elements_in_frequency_gfg implements Dump{

    public static void main(String[] args) {
        int[] arr ={5,5,4,6,4};
        arr=caller(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public void dumper(){        
        List<String> fruits = Arrays.asList("ziwi","Apple","Banana","Citrus","Dandelion");
        Collections.sort(fruits,(a,b) -> a.compareTo(b));
        System.out.println(fruits);       
    }

    public static int [] caller(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int idx:nums){
            map.put(idx,map.getOrDefault(idx,0)+1);
        }
        List<Integer> holder = new ArrayList<>();
        for(int idx:nums){
            holder.add(idx);
        }
        Collections.sort(holder,(a,b)->{
            if(!map.get(a).equals(map.get(b))){
                return map.get(b)-map.get(a);
            }
            else{
                // return map.get(a)-map.get(b);
                return a-b;
            }
        });
        return holder.stream().mapToInt(i->i).toArray();
    }
}
