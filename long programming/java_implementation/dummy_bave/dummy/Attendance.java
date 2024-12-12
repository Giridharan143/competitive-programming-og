package dummy;
import java.util.ArrayList;
import java.util.Scanner;

public class Attendance {
    String teacherName;
    Classr classs;
    ArrayList<Attendance> atti = new ArrayList<>();
    Scanner inp = new Scanner(System.in);

    public Attendance() {}

    public Attendance(String teacherName, Classr classr) {
        this.teacherName = teacherName;
        this.classs = classr; // Initialize the Classr object here
    }

    public void attendance() {
        System.out.println("Enter the Student Id to be marked present: ");
        int a = inp.nextInt();
        Classr att = null;

        for (Classr idx : classs.classi) { // Use the stored Classr object
            if (idx.getStudentId() == a) {
                att = idx;
                break;
            }
        }

        if (att != null) {
            System.out.println("Attendance for Student ID: " + att.getStudentId() + ", Name: " + att.getStudentName() + " is marked!");
        } else {
            System.out.println("Student does not exist.");
        }
    }
}
