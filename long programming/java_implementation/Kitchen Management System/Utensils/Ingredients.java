package Utensils;

import java.util.ArrayList;
import java.util.Scanner;

public class Ingredients{
    int ingId;
    String ingName;
    Scanner inp = new Scanner(System.in);
    public static ArrayList <Ingredients> ing = new ArrayList<>();

    public Ingredients(){}

    public Ingredients(int a, String b){
        this.ingId=a;this.ingName=b;
    }

public int getIngId(){
    return this.ingId;
}

public String getIngName(){
    return this.ingName;
}
public void addi(){
    this.ingId=12;
    this.ingName="Giri";
    ing.add(new Ingredients(this.ingId,this.ingName));
}
public void addIngredients(){
    System.out.println("Enter the Ingredient Id : ");
    this.ingId = inp.nextInt();
    inp.nextLine();
    System.out.println("Enter the Ingredient Name : ");
    this.ingName =inp.nextLine();
    ing.add(new Ingredients(this.ingId,this.ingName));
    System.out.println("The Ingredients have been added to the list !!");
}

public void displayIngredients(){
    for(Ingredients idx : ing){
        System.out.println("Ingredient ID : "+idx.getIngId()+" Ingredient Name : "+idx.getIngName());
    }
}

}