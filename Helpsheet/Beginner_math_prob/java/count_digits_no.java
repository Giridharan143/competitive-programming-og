public class count_digits_no {
    // arr=[1,2,3,4,5]
    public static void main(String[] args) {
        int num=12345;int count=0;
        /*
        int counter=0; for(int i=0;i<arr.length;i++) counter+=1;
        System.out.println("The count of the digits in an number is : "+counter);
        */
        int temp=num;while(num>0)  {count+=1;num=num/10;}
        System.out.println(count);

    }
}
