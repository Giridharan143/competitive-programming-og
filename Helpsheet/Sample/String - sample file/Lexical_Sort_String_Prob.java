import java.util.Scanner;

public class Lexical_Sort_String_Prob implements alphabets{
    public void start(){
                System.out.println("starting...");
            }
    public void run(int b){
        if(b==1){
            System.out.println("yeah... Babyyy");
        }
        else   
            System.out.println("Nooo...Baby");
    }
            public static void main(String[] args) {
                Lexical_Sort_String_Prob a = new Lexical_Sort_String_Prob();
                Scanner inp = new Scanner(System.in);
                a.start();a.run(inp.nextInt());
                inp.close();
        }
}