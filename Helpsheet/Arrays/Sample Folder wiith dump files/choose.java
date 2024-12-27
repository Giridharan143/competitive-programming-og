import java.util.Scanner;
abstract class Books{
    abstract public void addBook();
}
public class choose {
    //Books book = new Books();
    public static void main(String[] args) {
        while(true){  // Infinte Loop until the Base case is reached
        System.out.println("Enter the Choice ");
        System.out.println("1. Add a Book :");
        System.out.println("2. Add a Library Member: ");
        System.out.println("143. Exit the System : ");
        Scanner inp = new Scanner(System.in);
        int choice = inp.nextInt();
        inp.nextLine();
        switch(choice){
            case 1:
                // b1.addBook();
                System.out.println("Book Is Added !!");
                break;
            case 2:
                //m1.addMember();
                System.out.println("Library Member is Added !!");
                break;
            case 143:
                System.out.println("Exiting the System --------------------------------------------------------");
                inp.close();
                return;
            default:
                System.out.println("Enter the Proper option !!!");
                break;


        }

        }
    }
}
