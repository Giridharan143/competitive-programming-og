// public class treeOrginal {
    
// }


class treeOrginal{
    public static void main(String[] args) {
        LListCallerr linkedlist = new LListCallerr();
        linkedlist.addLList(1);
        linkedlist.addLList(2);
        linkedlist.addLList(3);
        linkedlist.addLList(4);
        linkedlist.viewLList();
        linkedlist.findTheDataFromLList(4);
        linkedlist.findTheDataFromLList(2);
        linkedlist.getLastElement();
        linkedlist.addonemorenumber(linkedlist.getHead());
        linkedlist.viewLList();
        linkedlist.viewLList((linkedlist.reverseLinkedlist(linkedlist.getHead())));

    }
}
class LinkedList{
    int data;
    LinkedList next;
    LinkedList(int a){
        this.data=a;        
    }

    public int getDataFromLL(){
        return this.data;
    }    
}


class LListCallerr{
    LinkedList head; // Just to get the Initial Position
    LinkedList last;
    LListCallerr(){
        this.head=null; // default value to null        
        
    }
    public LinkedList getHead(){
        return this.head;
    }

public void addLList(int a){
LinkedList newNode = new LinkedList(a);
LinkedList temp = this.head;
//LinkedList temp = this
if(this.head==null){
    this.head=newNode;
    this.last=newNode;
    System.out.println("First data : "+head.data+" is Updated !!!");
    return;
}
//else{
while(temp.next!=null){
    temp=temp.next;
}
temp.next=newNode;
//temp.next=this.last;
this.last=newNode;
System.out.println("Data : "+temp.next.data+" has been added !!");

//}
}

public void viewLList(){
    LinkedList temp=this.head;
    if(temp==null){
        System.out.println("Linked List Empty !!!");
    }
    while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp=temp.next;
    }
    System.out.println(" null");

}

public void viewLList(LinkedList head){
    LinkedList temp=head;
    if(temp==null){
        System.out.println("Linked List Empty !!!");
    }
    while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp=temp.next;
    }
    System.out.println(" null");

}


public void findTheDataFromLList(int a){
    LinkedList temp = head;boolean found = false;
    if(temp==null){
        System.out.println("No Items in the LinkedList !!!");
    }
    while(temp!=null){
        if(temp.data==a){
            found = true;
            System.out.println("The Number is Found : "+temp.data+" !!!");
            //break;
            return;
        }
        
            temp=temp.next;
    }
    if(!found)
    System.out.println("No !!! The data is not found !!!!");
}

public void getLastElement(){
    if(this.last==null){
        System.out.println("No elements in this List");
    }
    else{
        System.out.println("The Last Element is : "+this.last.data);
    }
}

public void addonemorenumber(LinkedList head){
    if(head==null){
        System.out.println("Nothing is present !!");
    }
    else{
        LinkedList temp=head;
        while(temp!=null){
            temp.data=temp.data*10;temp=temp.next;
            

        }
    
    }

}

public LinkedList reverseLinkedlist(LinkedList head){
    LinkedList prev = null;
    LinkedList next = null;
    LinkedList temp = head;
    if(temp==null){
        System.out.println("Empty Linked List");
    }
    else{        
        //LinkedList temp = head;
        while(temp!=null){
            // next=temp.next; // Normal movement of the Node
            // temp.next=prev;
            // prev=temp;
            // temp=next;
            next=temp.next;
            temp.next=prev;
            prev = temp;
            temp=next;
            
        }
    }
    return prev;

}


}
abstract class toBeImplemenred{
    abstract void findTheEvenNoFromLL();
}