public class even_odd{
    public static String eo(int a){
        
        if(a%2==0) return "Even"; else return "Odd";   

    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8};int count=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(eo(arr[i]));
            count+=1;
        }System.out.println("The Number of elements : "+count);
    }
}