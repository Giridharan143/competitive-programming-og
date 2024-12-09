import java.util.*;

public class nothing {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner inp = new Scanner(System.in);
        //System.out.println("Enter the Number of Elements: ");
        //int n=inp.nextInt();
        /*
        for (int idx=0;idx<n;idx++){
                arr.add(inp.nextInt());
        }
                */
        //System.out.println(arr); //
        ArrayList<Integer> arr1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(arr1);//

        ArrayList<String> str = new ArrayList<String>(Arrays.asList("ARK","giri","jk"));
        System.out.println(str);
        for (int idx=0;idx<arr1.size();idx++){
            arr1.set(idx,arr1.get(idx)+1);            
        }
    System.out.println(arr);


    }
    
}
