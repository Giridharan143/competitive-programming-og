package Details;

public class room {
    int roomNo;
    String roomType;
    Boolean availability;

    public room(int a, String b){
        this.roomNo=a;
        this.roomType=b;
        this.availability=true;
    }

    public int getRoomNo(){
        return this.roomNo;
    }
    public String getRoomType(){
        return this.roomType;
    }

    public Boolean getAvailability(){
        return this.availability;
    }


    public void setAvailability(Boolean a){
        this.availability=a;
    }

    public void displayRoom(){
        System.out.println("The Room Number is: "+this.roomNo+" The Roomtype is : "+this.roomType+" The Availabiliity of the Room is :"+( this.availability?"Yes":"No"));

    }

  
    
    
}
