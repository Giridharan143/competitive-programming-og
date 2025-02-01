class LinkedListNode:
    def __init__(self, data):
        self.data = data
        self.next = None
    
    def getData(self):
        return self.data
    
    def getNextPtr(self):
        return self.next


class LinkedList:
    def __init__(self):
        self.head = None

    def getHead(self):
        return self.head

    def insertion(self, data):
        newNode = LinkedListNode(data)
        if self.head is None:
            self.head = newNode
            return self.head
        temp = self.head
        while temp.next is not None:
            temp = temp.next
        temp.next = newNode
        

    def printt(self):
        temp = self.head
        while temp is not None:
            print(temp.getData(),end=", ")
            temp = temp.getNextPtr()
        return
    
    # def palindrome_checker(self,ptr):

def checker(ptr1,ptr2):
    temp1=ptr1.getHead()
    temp2=ptr2.getHead()
    while temp1 is not None and temp2 is not None:
        if temp1.data != temp2.data:
            print("No")
            return
        temp1=temp1.next
        temp2=temp2.next
    if temp1 is None and temp2 is None:
        print("Yes")
    else:
        print("No")
        


# Main Execution
if __name__ == "__main__":
    c = LinkedList()
    d= LinkedList()
    print("Enter the First Data(0 to exit) : ")
    while(True):
        inp=input("")
        if inp=='0':
            break
        c.insertion(inp)
    print("Enter the Second Data(0 to exit) : ")
    while(True):        
        inp=input("")
        if inp=='0':
            break
        d.insertion(inp)
    checker(c,d)


    

