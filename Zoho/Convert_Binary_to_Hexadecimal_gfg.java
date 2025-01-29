public class Convert_Binary_to_Hexadecimal_gfg {
    public static void main(String[] args) {
        converter("1111001010010100001.010110110011011");
    }
    public static void converter(String ip){
        if(ip.contains(".")){
            String[] space = ip.split("\\.");
            System.out.println(returner(space[0])+"."+returner2(space[1]));
        }       
    }
    public static String returner(String ip) {
         int count = Integer.parseInt(ip,2);
         return Integer.toHexString(count).toUpperCase();
        }

    public static String returner2(String ip){
        while(ip.length()%4!=0){
            ip+="0";
        }
        StringBuilder outer = new StringBuilder();
        int caser = Integer.parseInt(ip,2);
        outer.append(Integer.toHexString(caser));
        return outer.toString().toUpperCase();
        // for(int i=0;i<ip.length();i+=4){
            
        // }
    }

}
