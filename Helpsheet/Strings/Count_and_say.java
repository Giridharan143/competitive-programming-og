public class Count_and_say implements Dump{

    public static void main(String[] args) {
        // System.out.println(practice(4));
        System.out.println(getRLE(4));
    }

    public static String practice(int n){
        // I am going to code in here
        String num ="1";
        for(int j=1;j<n;j++){
            StringBuilder neww =new StringBuilder();
            int i=0;int count=1;
            while(i<num.length()-1){
                if(num.charAt(i)==num.charAt(+1)){
                    count++;
                }
                else{
                    neww.append(count).append(num.charAt(i));
                    count=1;
                }
                i++;
            }
            neww.append(count).append(num.charAt(i));
            num=neww.toString();
        }return num;
    }
    
    public void dumper(){

    }

    public static String getRLE(int n){ // 1 -> 11 -> 21-> 1211 
        String str ="1";// Default number 
        for(int i =0 ;i<n-1;i++){
            int j=0;int count=1;StringBuilder temp = new StringBuilder();
            while(j<str.length()-1){
                if(str.charAt(j)==str.charAt(j+1)){
                    count++;
                }
                else{
                    temp.append(count).append(str.charAt(j));
                    count=1;
                }
                j++;
            }
            temp.append(count).append(str.charAt(j));
            str=temp.toString();
        }return str;
    }
    
}
