class struct:
    def __init__(self,data):
        self.data=data
        self.next=None
        self.front=None
class Doubly_Linked_List:
    def __init__(self):
        self.head=None

    def insertion(self,data):
        Newdata=struct(data)  # New data address has been crated now we can play with that together easilty
        if self.head is None:
            self.head=Newdata
            return
        temp=self.head # Heading to the inital storage of thepointer and identifying it togwther
        while(temp.next is not None):
            temp=temp.next
        temp.next=Newdata
        Newdata.front=temp
        #return
    
    def print_sumer(self,head):
        if head is None:
            return
        temp=head
        while(temp is not None):
            print(temp.data,"-> ",end="")
            temp=temp.next
        print("None")
    
    def getHead(self):
        return self.head

    def reverse_linked_list(self):
        if self.head is None:
            return
        temp=self.head;prev=None
        while(temp is not None):
            next=temp.next
            temp.next=prev
            prev=temp
            temp=next
        print(self.print_sumer(prev))
        

if __name__=="__main__":
    db = Doubly_Linked_List()
    db.insertion(11)
    db.insertion(12)
    db.insertion(13)
    db.print_sumer(db.getHead())
    db.reverse_linked_list()
    