import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class two_sumi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] nums={1,2,3,4,5,6};
        //int[] nums={1,2,3,4};
        ArrayList<Integer> nums1 = new ArrayList<>();
        while(true){
        System.out.println("Enter 0 exit ArrayList : ");
        String choice = inp.nextLine();
        //inp.nextLine();
        if(choice.equals("0"))
            break;
        System.out.println("Enter the Number");
        int temp = inp.nextInt();
        inp.nextLine();
        nums1.add(temp);
        }
        System.out.println("ArrayList nums1 is : "+nums1);
        int target=7;
        two_sumi ab = new two_sumi();
        System.out.println("Enter 1 for ArrayList :\nEnter 2 for normal Array : ");
        int ch = inp.nextInt();inp.nextLine();
        switch(ch){
        case 1:
        ab.formulaterTwoSummer(nums1, target);
        break;
        case 2:
        ab.formulateTwoSumi(nums, target);
        break;
        }
    }
public void formulateTwoSumi(int[] nums, int x){
    /* 
    Arrays.stream(nums).sorted();
    int first=0;Boolean flag=false;int temp=0;
    for (int second=1;second<nums.length;second++){
        int calci=nums[first]+nums[second];
        if(calci==x){
            flag=true;temp=second;
            System.out.println("The Pairs(Array) of Numbers to Target is : "+nums[first]+" + "+nums[temp]+" = "+x);
            first++;second=0;
        }
    }
    if(!flag)
        System.out.println("No Two pairs has been found");
     */
    Arrays.stream(nums).sorted();
    int first=0;int second = nums.length-1;Boolean flag=false;int count=0;
    while(first<second){
        int calci = nums[first] + nums[second];
        if(calci==x){
            System.out.println("The Pairs(Array) of Numbers to Target is : "+nums[first]+" + "+nums[second]+" = "+x);
            first++;second--;flag=true;count++;
        }
        else if (calci<x){
            first++;
        }
        else if (calci>x){
            second--;
        }
    }
    if(!flag)
        System.out.println("Unfortunately no Pairs have been found !!!");
    else    
        System.out.println("Number of unique pairs are : "+count);



}

public void formulaterTwoSummer(ArrayList<Integer> nums, int x){
    //Arrays.stream(nums).sorted();
    //nums.stream().sorted();
    Collections.sort(nums);
    int first=0;int temp=0;Boolean Flag=false;
    for(int second=1;second<nums.size();second++){
        int calci=nums.get(first)+nums.get(second);
        if(calci==x){
            temp=second;Flag=true;
            System.out.println("The Pairs(Arrylst) of Numbers to Target is : "+nums.get(first)+" + "+nums.get(temp)+" = "+x);
            second=0;first++;
        }
    }
    if(!Flag){
        System.out.println("No Two pairs have been found !!!");
    }

}

}
