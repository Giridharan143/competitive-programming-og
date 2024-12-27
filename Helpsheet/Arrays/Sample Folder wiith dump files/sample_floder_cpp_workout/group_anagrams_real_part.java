//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_anagrams_real_part {
    public List<List<String>> group_anag(String[] strs){
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            for(String idx:strs){
                char[] car = idx.toCharArray();
                Arrays.sort(car);
                String combiner = new String(car);
                if(!map.containsKey(combiner)){
                    map.put(combiner,new ArrayList<>());
                }
                else{
                    map.get(combiner).add(idx);
                }
            }
                return new ArrayList<>(map.values());

            //     char[] car=idx.toCharArray();
            //     Arrays.sort(car);
            //     String combineChar= new String(car);
            //     if(!map.containsKey(combineChar)){
            //         map.put(combineChar,new ArrayList<>());
            //     }
            //     else{
            //         map.get(combineChar).add(idx);
            //     }

            // // }

            // return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        // GroupAnagrams ga = new GroupAnagrams();
        group_anagrams_real_part ga = new group_anagrams_real_part();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        // Get grouped anagrams
        List<List<String>> result = ga.group_anag(strs);
        
        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

}
