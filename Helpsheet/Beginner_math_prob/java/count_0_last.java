public class count_0_last {
    static int arr[]={0,1,0,3,4,5,0,1};
    public static void main(String[] args) {
        counter(arr);
    }
    public static void counter(int arr[]){
        int vigilante=0;
        for(int i=0;i<arr.length;i++){ if(arr[i]!=0) arr[vigilante]=arr[i]; } 
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //System.out.println(arr);
        
    }
    
    
}
