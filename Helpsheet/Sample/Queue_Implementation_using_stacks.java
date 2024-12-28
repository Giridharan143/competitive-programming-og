import java.util.Scanner;
import java.util.Stack;

public class Queue_Implementation_using_stacks{
    static Scanner inp =  new Scanner(System.in);
    static Stack <Integer> stack1 = new Stack<>();
    static Stack <Integer> stack2 = new Stack<>();

    public static void main(String[] args) throws Exception {
        enQueueR();
        deQueue();
        peeker();
        deQueue();
        peeker();
    }
    public static void enQueue(int a) throws Exception{
        try{
        stack1.push(a);
        }
        catch(Exception error){
            System.out.println("THere is an error !!!");
            error.printStackTrace();
        }
    }   
    public static void deQueue(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        System.out.println("The First Number "+stack2.pop()+" is Removed !!");
    }
    public static void peeker(){
        System.out.println("The Current first Element in the Stack is : "+stack2.peek());
    }
    public static void enQueueR() throws Exception{
        try{
        while(true){
            System.out.println("Enter 0 to exit pushing elements || 100 to exit System!!!");
            // int temp = inp.nextInt();
            // inp.nextLine();
            String temp = inp.nextLine();
            if(temp.equals("0")){
                return;
            }
            if(temp.equals("100")){
                System.exit(0);
            }
            System.out.println("Enter the Number to add to Stack : ");
            // stack1.push(inp.nextInt());
            enQueue(inp.nextInt());
            inp.nextLine();
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
    



    public void dumper(){
        // public static void practice(int n){
    //     Stack<Integer> stack = new Stack<>();
    //     while(n>0){
    //         stack.push(n);
    //         n--;
    //     }
    //     // System.out.println(stack.peek());
    //     while(!stack.isEmpty()){
    //         System.out.print(stack.pop()+"->");
    //     }
    // }
    }
}