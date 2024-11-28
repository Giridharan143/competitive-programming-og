'''


'''

class Node():
    def __init__(self,data) -> None:
        self.data=data
        self.next=None
def split(head):
    if not head:
        return None
    slow=head;fast=head;prev=None
    while fast and fast.next:
        prev=slow
        slow=slow.next
        fast=fast.next.next
    if prev:
        prev.next=None
    return slow

def merge(first,second):
    if not first:
        return second
    if not second:
        return first
    if first.data<second.data:
        first.next=merge(first.next,second)
        return first
    else:
        second.next=merge(first,second.next)
        return second


class Solution:
    #Function to sort the given linked list using Merge Sort.
    def mergeSort(self, head):
        if not head or not head.next:
            return head
        second=split(head)
        first=self.mergeSort(head)
        second=self.mergeSort(second)
        
        return merge(first,second)
        
        
    
def printList(head):
    if head is None:
        return 0
    curr=head
    while curr:
        print(curr.data,end="->")
        curr=curr.next
    print("None")

def create_linked_list(values):
    if not values:
        return None
    head=Node(values[0])
    curr=head
    for val in values[1:]:
        curr.next=Node(val)
        curr=curr.next
    return head

        

values = [4, 2, 1, 3]
head = create_linked_list(values)
print("Original linked list:")
printList(head)

solution = Solution()
sorted_head = solution.mergeSort(head)

print("Sorted linked list:")
printList(sorted_head)

