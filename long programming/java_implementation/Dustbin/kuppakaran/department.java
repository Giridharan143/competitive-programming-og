package kuppakaran;

public class department extends men {

    String dept;

    public department(double a,int b, String c,String d, String e){

        super(a,b,c,d);
        this.dept=e;
    }
public void report(){
    System.out.println(dept);
}
public Boolean work(){
    if (dept.equals("Healthcare")){
        return true;
    }
    else 
        return false;
}

    
}
