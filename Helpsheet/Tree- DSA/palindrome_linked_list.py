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

    def palindrome(self):
        stack=[] #to find the numbers are equal when they are being removed from the list to be specified
        slow=fast=self.head
        while fast and fast.next:
            stack.append(slow.data)
            slow=slow.next #gradual progression
            fast=fast.next.next # increasing the amount of progression to 2x
        if fast: # if its and odd number just skipping the middle value
            slow=slow.next
        while slow:
            if stack.pop()!=slow.data:
                return "It's not an Palindrome"
            slow=slow.next
        return "It's a Palindrome"
    def middle(self):
        slow=fast=self.head;prev=None
        while fast and fast.next:
            prev=slow
            slow=slow.next
            fast=fast.next.next
        if not fast :
            return f"the middle value is {str(prev.data)}"
        else:
            return f"the middle value is {str(slow.data)}"
            

listt=LinkedList()
listt.add(1)
listt.add(2)
listt.add(1)
listt.add(2)
listt.add(1)
listt.add(1)
listt.display()
#listt.position()
listt.display()
#listt.position_even()
listt.display()
print(listt.palindrome())
print(listt.middle())