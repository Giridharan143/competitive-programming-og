public class m{

    public static void main(String[] args) {
        practice("  -1222gfg");  // THere is this one case where the value is 75565656 which is greater
    }
   
   
    public static void practice(String s){
        s=s.trim(); // Removed all the extra spaces present in the system
        int sign =1;int idx=0; int n =s.length();int out=0;
        if(s.charAt(idx)=='-'){
                sign = -1;
                idx++;
            }
        while(idx<n){            
            if(idx<n && s.charAt(idx)>='0' && s.charAt(idx)<='9'){ // to check whether the give character is an integer
                int num = s.charAt(idx)-'0'; /// This will help you get the convertion of the given number could driven into an Integer
                out=out*10+num;
                idx++;
            }

        }
        System.out.println(out*sign);
    }

    public static void dumper(){
         /// " -12gf"
            // s=s.trim();
            // System.out.println(s);
        //     int out=0;
        // for (int i = 0; i < s.length(); i++) {
        //     out=out*10+(s.charAt(i)-'0');
        // }
        // System.out.println((out*10));
    //    char[] digits={s.charAt(0),s.charAt(1)};
    //     String out=String.valueOf(digits);
    //     System.out.println(out-'0');
    }
}