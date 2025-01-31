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
    def find_middle_element(self):
        count=0
        if self.head is None:
            return
        temp=self.head
        while(temp != None):
            count+=1
            temp=temp.next
        pointer=count//2
        ter=self.head
        while(pointer!=0):
            if ter == None:
                continue
            ter=ter.next
            pointer-=1
        print("\nThe Required Middle Value : ",ter.data)
        return


cr = creation()
cr.insert(12)
cr.insert(11)
cr.insert(13)
cr.print_list()
cr.find_middle_element()