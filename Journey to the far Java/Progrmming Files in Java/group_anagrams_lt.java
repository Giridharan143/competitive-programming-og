/*Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]] */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_anagrams_lt{
    private static List<List<String>> anagrams(String[] strs){
            HashMap<String, List<String>> mapi = new HashMap<>();
            for(String idx:strs){
            char[] charci = idx.toCharArray();
            Arrays.sort(charci);
            String key_sorted = new String(charci);
            mapi.putIfAbsent(key_sorted,new ArrayList<>());
            mapi.get(key_sorted).add(idx);


        }
        return new ArrayList<>(mapi.values());
    }


    private static List<List<String>> grp_Anagrams(String[] str){
            HashMap<String, List<String>> mao = new HashMap<>();
            for(String idx: str){
                char[] are = idx.toCharArray();
                Arrays.sort(are);
                String join_key = new String(are);
                mao.putIfAbsent(join_key,new ArrayList<>());
                mao.get(join_key).add(idx);
            }
            return new ArrayList<>(mao.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = grp_Anagrams(strs);
        System.out.println(groupedAnagrams);
    }
}