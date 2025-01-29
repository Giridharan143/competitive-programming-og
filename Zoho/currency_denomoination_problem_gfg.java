import java.util.*;

public class currency_denomoination_problem_gfg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Amount to be Entered : ");
        int amt = sc.nextInt();
        find_curr(amt);
    }
    
    public static void find_curr(int rupees){
        int amt=rupees;
        int[] denomination = {2000,1000,500,200,100,50,20,10,5,2,1};
        Map<Integer,Integer> dict = new LinkedHashMap<>();
        for(int den:denomination){
            if(rupees>=den){
                int count = rupees/den;
                // dict.put(den,count);
                // if(dict.containsKey(den))
                //     dict.put(den,dict.get(den)+1);
                // else
                    dict.put(den,count);
                rupees=rupees%den;
            }
        }
        for(Map.Entry<Integer, Integer> entry:dict.entrySet()){
            System.out.print(entry.getKey()+" X "+entry.getValue()+" = "+(entry.getKey()*entry.getValue())+"\n");
        }
        System.out.println("Total = "+amt+" !!");
    }

}
