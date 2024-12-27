/*words = ["abc", "bca", "cab", "bac", "xyz", "yzx", "zxy", "def"]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_words_same_char {

    public static List<List<String>> grp_numbers(String[] str){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String idx : str){
            char[] seperator = idx.toCharArray();
            Arrays.sort(seperator);
            String key = new String(seperator);
            // To Find the Index of the Common Elements using the Index
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(idx); // I am accessing the ArrayList in the given idx present in the System                     
        }return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] rwords = {"abc", "bca", "cab", "bac", "xyz", "yzx", "zxy", "def"};
        List<List<String>> holder = grp_numbers(rwords);
        System.out.println(holder);
    }
    
}
