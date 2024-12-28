public class sampler {
    public static void main(String[] args) {
        String a = "10,.23,45";
        String b = "91+9566157645";
    // for(int i=0;i<a.length();i++){
        // System.out.print((a.charAt(i)-'0')+1);
        // System.out.print(a.charAt(i)-'0');
        // String[] sep = a.split("\\,");
        String[] number=b.split("\\+");
        System.out.println("The Country Code : "+number[0]+"|| The Phone Number : "+number[1]);
    }
}

