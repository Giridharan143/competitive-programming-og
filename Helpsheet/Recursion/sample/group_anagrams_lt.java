import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class group_anagrams_lt {
    public void toConvertCharArray(String[] str){
        // char[] car;
        // for(String idx:str){
        //     car=idx.toCharArray();
        //     System.out.println(car);
        // }
        
        for(String idx:str){
          char[]  car=idx.toCharArray();
        //   System.out.println(Arrays.toString(car));
        System.out.println(car);
        }
    }
    public void groupAnagrams(String[] strs){
        HashMap<String, Integer>map = new HashMap<>();
        for(String idx:strs){
            if(map.containsKey(idx)){
                map.put(idx,map.get(idx)+1);
            }
            else{
                map.put(idx,1);
            }
        }
        for(Map.Entry<String, Integer> maper :map.entrySet()){
            System.out.println("Key : "+maper.getKey()+" || "+" Value : "+maper.getValue());
        }
    }

    public static void main(String[] args) {
        String[] str={"Giri","Giri","Girls","Gukesh"};
        String[] str1 ={"giridharan","love"};
    group_anagrams_lt aber=new group_anagrams_lt();
    aber.groupAnagrams(str);
    aber.toConvertCharArray(str1);
    }

}
