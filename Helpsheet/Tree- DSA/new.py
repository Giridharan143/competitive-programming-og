class Node:
    def __init__(self,data): # two variables has been used
        self.data=data # this stores te current value in the node and used for future purposes
        self.next=None # this acts as an pointer the next location of the data

# end of the node initialisation

class LinkedList:
    def __init__(self):
        self.head=None
    # the head pointer has the value of the last node which is said to be accesed

    def add(self, data):
        newN=Node(data)
        if not self.head:
            self.head=newN
        else:
            curr=self.head
            while curr.next:
                curr=curr.next
            curr.next=newN
    def display(self):
        curr=self.head
        while curr:
            print(curr.data, end=" -> ")
            curr=curr.next
        print(None)

    '''
    Input:
1 -> 2 -> 3 -> 4 -> 5 -> None

Output:
1 -> 3 -> 5 -> 2 -> 4 -> None
'''
    def position(self):
        if not self.head:
            return None
        curr=self.head
        odd_start=None;odd_end=None
        even_start=None;even_end=None
        idx=1
        while curr:
            if idx%2==1:
                if not odd_start:
                    odd_start=odd_end=curr
                else:
                    odd_end.next=curr
                    odd_end=curr
            else:
                if not even_start:
                    even_start=even_end=curr
                else:
                    even_end.next=curr
                    even_end=curr
            curr=curr.next
            idx+=1
        if odd_end:
            odd_end.next=even_start
        if even_end:
            even_end.next= None
        self.head=odd_start

    def position_even(self):
        even_head=even_toe=None
        odd_head=odd_toe=None
        curr=self.head
        idx=1
        while curr:
            if idx%2==0:
                if not even_head:
                    even_head=even_toe=curr
                else:
                    even_toe.next=curr
                    even_toe=curr
            else:
                if not odd_head:
                    odd_head=odd_toe=curr
                else:
                    odd_toe.next=curr
                    odd_toe=curr
            curr=curr.next
            idx+=1
        if even_toe:
            even_toe.next=odd_head
        if odd_toe:
            odd_toe.next=None
        self.head=even_head
        


listt=LinkedList()
listt.add(10)
listt.add(12)
listt.add(34)
listt.add(54)
listt.add(78)
listt.display()
listt.position()
listt.display()
listt.position_even()
listt.display()