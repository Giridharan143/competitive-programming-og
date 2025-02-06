class struct:
    def __init__(self,data):
        self.data=data
        self.next=None
    def getData(self):
        return self.data
    def getNextPtr(self):
        return self.next
    
class Linked_List:
    def __init__(self):
        self.head=None
    
    def getHead(self):
        return self.head
    
    def insertion(self,data):
        if self.head is None:
            self.head=struct(data)
            return
        temp=self.head #for the ptr to traverse to the end of this list
        while temp.next:
            temp=temp.next
        newData=struct(data)
        temp.next=newData
    def printt(self,head):
        if head is None:
            print("The Linked List is sad to be empty !!!!")
            return
        temp=head
        while temp:
            print(temp.data,end="->")
            temp=temp.next
        print("None")
        return
    
    def reverse_ll(self,head):
        if head is None:
            print("This is an Empty LInked LIst Kindly input some data into it for furthe rprocessing ")
            return
        temp=head;prev=None
        while temp:
            nextt=temp.next
            temp.next=prev
            prev=temp
            temp=nextt
        self.printt(prev)
        return
    
    # def merge2_ll(self,head1,head2):
    #     if head1 is None or head2 is None:
    #         return
    #     temp1=head1;temp2=head2
    #     while temp1.next:
    #         temp1=temp1.next
    #     temp1.next=temp2
    #     outer=head1
    #     self.printt(outer)

    def add_two_numbers(self,head1,head2):
        dummy=Linked_List()
        temp=dummy
        temp1=head1
        temp2=head2
        summer=0
        while temp1 or temp2:
            if temp1:
                summer+=temp1.data
            if temp2:
                summer+=temp2.data
            # summer+=temp1.data+temp2.data
            temp1=temp1.next
            temp2=temp2.next
        print("Summer = ",summer)
        return
    
    def add_reverse(self,l1,l2):
        dummy = Linked_List()  # Dummy node to start the linked list
        current = dummy  # Pointer to build the result linked list
        carry = 0  # To store carry from sum

        while l1 or l2 or carry:
            sum_value = carry  # Start with carry from last step

            if l1:
                sum_value += l1.data  # Add dataue from l1
                l1 = l1.next  # Move to next node

            if l2:
                sum_value += l2.data  # Add value from l2
                l2 = l2.next  # Move to next node

            carry, digit = divmod(sum_value, 10)  # Split sum into carry & digit
            current.next = struct(digit)  # Store digit in linked list
            current = current.next  # Move to next node

        self.printt(dummy.next)
        

    


        



class main:
    ll=Linked_List()
    ll.insertion(1)
    ll.insertion(2)
    ll.insertion(3)
    ll.insertion(4)
    print("Linked List 1: ",end="")
    ll.printt(ll.getHead())
    # print()
    # ll.reverse_ll(ll.getHead())
    l2=Linked_List()
    l2.insertion(5)
    l2.insertion(6)
    l2.insertion(7)
    l2.insertion(8)
    print("Linked List 2: ",end="")
    l2.printt(l2.getHead())
    # ll.merge2_ll(ll.getHead(),l2.getHead())
    # ll.add_two_numbers(ll.getHead(),l2.getHead())
    ll.add_reverse(ll.getHead(),l2.getHead())