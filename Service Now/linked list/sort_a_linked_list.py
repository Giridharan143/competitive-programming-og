class linked_list:
    def __init__(self,data):
        self.data=data
        self.next=None
class creation:
    def __init__(self):
        self.head=None
    
    def insert(self,input):
        new_data=linked_list(input)
        if self.head is None:
            self.head = new_data
            return
        #Don't use else for this condition already experienced about this prcodeure lately
        temp = self.head
        while(temp.next!=None):
            temp=temp.next
        temp.next=new_data

    def print_list(self):
        if self.head is None:
            return
        temp=self.head
        while(temp!=None):
            print(temp.data,"->",end=" ")
            temp=temp.next
        return

    def sort_a_linked_list(self):
        selection=None
        if self.head is None:
            print("The List is said to be Empty !!!")
        temp=self.head;count=0
        while(temp is not None):
            count+=1
            temp=temp.next
        temp=self.head
        for idx in range(count):
            first=temp.data
            second=temp.next.data
            if first>second:
                temp=first
                first=second
                second=temp
            temp=temp.next
        self.print_list()


cr = creation()
cr.insert(1)
cr.insert(2)
cr.insert(3)
cr.insert(4)
cr.print_list()
cr.sort_a_linked_list()