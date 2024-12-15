class LinkedList{
    int data;
    LinkedList next;
    LinkedList(int a){
        this.data=a;
        this.next=null;
    }
    public int getData(){
        return this.data;
    }
}

class LListCaler{
    private LinkedList start;
    LListCaler(){
        this.start=null; // Null is used when initializing an pointer to the default addresss
    }

public void addToLList(int a){
    //LListCaler newData =new LListCaler(a);
    LinkedList newData = new LinkedList(a);
    LinkedList temp = this.start;
    if(this.start==null){
       this.start=newData;
        System.out.println("First Data Has Been added Succcesfully !!");
    }
    else{
        //LListCaler finder =null;
        while(temp.next!=null){
            temp=temp.next;
    }
    temp.next=newData;
    
    //newData.next=null;    
    }
    // if(newData.data>-1)
    //     System.out.println("Data Has Been added Succcesfully !!");
    // else   
    //     System.out.println("Error in adding data to the LinkedList");
}
public void printLList(){
    LinkedList temp = start;
    if(temp==null){
        System.out.println("The Linked List is empty !!!");        
    }
    while(temp!=null){
        System.out.println("Data in Linked List : "+temp.data+" -> ");
        temp=temp.next;
    }
}

public void findNumberLList(int a){
    LinkedList temp = this.start;
    if(temp==null){
        System.out.println("The Linked List is Empty !!!");
    }
    while(temp!=null){
        if(temp.data==a){
            System.out.println("The Number is Found At Location : "+temp+" <-> "+temp.data);
            break;
        }        
        else{
            temp=temp.next;
        }
    }

}

}

class treeJava{
    public static void main(String[] args) {
        LListCaler newLList=new LListCaler();
        newLList.addToLList(1);
        newLList.addToLList(2);
        newLList.addToLList(3);
        newLList.printLList();
        newLList.findNumberLList(2);
    }
}





