class Node():
    def __init__(self,data):
        self.data=data
        self.next=None
class Linked():
    def __init__(self) -> None:
        self.head=None

    def insertion(self,data):
        newnode=Node(data)
        if self.head is None:
            self.head=newnode
        else:
            curr=self.head
            while curr.next:
                curr=curr.next
            curr.next=newnode

        print(f"The Value has been inserted {newnode.data} !!!")
    
    def middle(self,root):
        if root is None:
            return None
        slow=fast=self.head
        while fast and fast.next:
            slow=slow.next
            fast=fast.next.next
        if fast is not None:
            #slow=slow.next 
            return slow.data if slow is not None else "error"
        else:
            return slow.data if slow is not None else "Error"

li=Linked()
li.insertion(1)
li.insertion(2)
li.insertion(3)
li.insertion(6)
#li.insertion(9)
li.insertion(10)
print(li.middle(li))