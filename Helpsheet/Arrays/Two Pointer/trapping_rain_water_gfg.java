public class trapping_rain_water_gfg{
    public static int trappingWater(int[] arr) {
        int n=arr.length;
        if(n==0)
            return 0;
        int[] left_max= new int[n];
        int[] right_max = new int[n];
        left_max[0]=arr[0];
        for(int idx=1;idx<n;idx++){
            left_max[idx]=Math.max(left_max[idx-1],arr[idx]);
        }
        right_max[n-1]=arr[n-1];
        for(int idx=n-2;idx>=0;idx--){
            right_max[idx]=Math.max(right_max[idx+1],arr[idx]);
        }
        int sum=0;
        for(int idx=0;idx<n;idx++){
            sum+=Math.min(left_max[idx],right_max[idx])-arr[idx];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {3, 0, 0, 2, 0, 4};
        System.out.println("The Amount of Rain water trapped is "+trappingWater(arr)+" !!!");
    }
}