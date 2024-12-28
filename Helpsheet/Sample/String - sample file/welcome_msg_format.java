public class welcome_msg_format {
    // I welcome you
    // you welcome I

    public static void main(String[] args) {
        default_reverse("I welcome you");
    }

    public static void default_reverse(String str){
        String[] pairs = str.trim().split("\\s");StringBuilder neww = new StringBuilder();
        for (int i = pairs.length-1;i>=0; i--) {
            neww.append(pairs[i]);
            if(i!=0){
                neww.append(" ");
            }
        }

        System.out.println(neww);
    }

    public static void dumperMethod(){
        // StringBuilder neww = new StringBuilder();
        // String neww="";
        // for(int i =0;i<str.length();i++){
        //     neww=neww+str.charAt(i);
        // }
        // // neww.append(str);
        // System.out.println(neww);
    }
}
