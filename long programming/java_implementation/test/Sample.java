class Sample{
    public static void main(String[] args){
        /*
        System.out.println("Hello");
        int a,b,c,d=7,13,25,11;
        int a=7;int b=45;int c=25;int d=3;
        compare(a, b, c, d);
        compareLess(a, b, c, d);
        String name = "Giridharan K";
        String name1="mam";
        System.out.println(name);
        char[] seperate = name.toCharArray();
        for(int idx=(seperate.length)-1;idx>=0;idx--){
            System.out.println(seperate[idx]);
        }
        palindrome(name1);
        square(5);
        System.out.println();
        square(1);
        System.out.println();
        square(2);
        System.out.println();
        square(3);
        System.out.println();
        square(4);
        System.out.println();
        square(5);
        palindrome(name);
         */
       
        // System.out.println();
        // triangle(1);
        // System.out.println();
        // triangle(2);
        // System.out.println();
        // triangle(3);
        // System.out.println();
        // triangle(4);
        // System.out.println();
        triangleLeft(5);

    }
    public static void triangleLeft(int n){
        int j=0;
        for(int i=0;i<n;i++){
            for(j=n-1-i;j>0;j-=1){
                System.out.print(" ");               
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }


    public static void triangleRight(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }       
        return;
    }

    public static void compare(int a,int b,int c,int d){
        int max=0;
        if (a>b && a>c && a>d){
            max=a;
        }
        else if(b>a && b>c && b>d){
            max=b;
        }
        else if(c>a && c>b && c>d){
            max=c;
        }
        else{
            max=d;            
        }
        System.out.println("The Maximum Value is : "+max);
        return;
    }

    public static void compareLess(int a,int b,int c,int d){
        int min=0;
        if (a<b && a<c && a<d){
            min=a;
        }
        else if(b<a && b<c && b<d){
            min=b;
        }
        else if(c<a && c<b && c<d){
            min=c;
        }
        else{
            min=d;            
        }
        System.out.println("The Minimum Value is : "+min);
        return;
    }
    
       
    public static void palindrome(String a){
        char[] first=a.toCharArray();
        int initial=0;int end=(first.length)-1;Boolean flag=true;
        while(initial<=end){
            if (first[initial]!=first[end]){
                flag=false;
                break;
            }
            initial++;
            end--;
        }
        if(flag){
            System.out.println("Yess!! It is an Palindrome !!!");
        }
        else{
            System.out.println("No!! It is not an Palindrome !!!");
        }
        // char[] second=b.toCharArray();


    }

    public static void square(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return;
    }


}
    

// class test{
//     int a,b,c,d;
// }