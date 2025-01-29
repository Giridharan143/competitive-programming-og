public class Convert_hexadecimal_to_binary_gfg implements Dump {
   public static void main(String[] args) {
    //hex_to_bin("1AC5");
   // converter("1AC5");
    System.out.println(finalTouch("1AC5"));
    System.out.println(finalTouch("5D1F"));
   }
   public static void hex_to_bin(String hex){
    // that os said to be look like this 1ACB%
    StringBuilder strgb =new StringBuilder();
    for(Character idx : hex.toCharArray()){
        int decimal = Character.digit(idx,16);
        String temp = String.format("%4s",Integer.toBinaryString(decimal).replace(' ','0'));
        strgb.append(temp);
        System.out.println(strgb);
    }
   }
   
    public void dumper(){

    }

    public static void converter(String word){
        char[] stat = word.toCharArray();
        StringBuilder out = new StringBuilder();
        for(char i:stat){
            int con = Character.digit(i,16);
            String temp = String.format("%4s",Integer.toBinaryString(con)).replace(' ','0');
            out.append(temp);            
        }
        System.out.println(out);        
    }

    public static String finalTouch(String number){
        char[] tester = number.toCharArray();StringBuilder outer = new StringBuilder();
        for(char num:tester){
            // Need to access the value then need to convert it into an Binary vaoue from the iniatlly formin number is gotten for the speculation
            int source = Character.digit(num,16); // Converted to integer -> then to binary s found out
            String sen = String.format("%4s",Integer.toBinaryString(source)).replace(' ','0');
            outer.append(sen);
        }
        return outer.toString();
    }
}


