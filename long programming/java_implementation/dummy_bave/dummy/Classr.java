package dummy;

import java.util.ArrayList;
import java.util.Scanner;

public class Classr{
    int studentId;
    String studentName;
    Scanner inp =new Scanner(System.in);
    public static ArrayList<Classr> classi = new ArrayList<>();
    public Classr(){

    }
    public Classr(int a, String b){
        this.studentId=a;
        this.studentName=b;
    }

    public void addStudent(){
        System.out.println("Enter the Student Id: ");
        int a = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter the Student Name : ");
        String b =inp.nextLine();
        classi.add(new Classr(a,b));
        System.out.println("Student Details has been added Succesfully !!");
    }
    public int getStudentId(){
        return this.studentId;
    }
    public String getStudentName(){
        return this.studentName;
    }

    public void displayStudentDetails(){
        for(Classr idx:classi){
            System.out.println(idx.getStudentId() + "->"+idx.getStudentName());
        }
    }



}