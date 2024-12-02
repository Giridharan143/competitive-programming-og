
head=None
class LinkedList:
    def __init__(self,data):
        self.data=data
        self.next=None
def create(node):    
    newnode=LinkedList(node)
    global head
    if node is None:
        head=newnode
        return
    curr=head
    while curr.next:
        curr=curr.next
    curr.next=newnode

def display(node):
    curr=node
    while curr:
        print(curr.data,"->")
        curr=curr.next


gi=LinkedList(0)
create(1);create(2);create(3)
display(gi)