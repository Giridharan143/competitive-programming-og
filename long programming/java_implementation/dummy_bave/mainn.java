import java.util.Scanner;

import dummy.*;

public class mainn {
    static Scanner inp = new Scanner(System.in);
        public static void main(String[] args) {
            //Scanner inp = new Scanner(System.in);
            Attendance a=new Attendance();
            Classr b = new Classr();
            while(true){
            System.out.println("Press 0 to exit 1 to continue !");
            int end = inp.nextInt();
        if (end==0)
                return;
        b.addStudent();
        a.attendance();
        b.displayStudentDetails();
        }
    }
}
