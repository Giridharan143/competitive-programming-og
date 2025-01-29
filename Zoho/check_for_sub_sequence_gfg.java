public class check_for_sub_sequence_gfg {
    public static void main(String[] args) {
        checker("ark","arnknnr");  
    }
    
    public static void checker(String str1,String str2){
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        int i=0,j=0;
        while(i<ch1.length && j < ch2.length){
            if(ch1[i]==ch2[j]){
                i++;
            }
            j++;
        }
        if(i==ch1.length){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
