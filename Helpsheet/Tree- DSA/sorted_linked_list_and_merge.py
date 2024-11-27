class Node:
    def __init__(self,data) -> None:
        self.data=data
        self.next=None

class Linked_List():
    def sort_merge(self,head1,head2):
        sorte=Node(None)
        correct=sorte
        if head1 is None and head2 is None:
            return None
        while(head1 and head2):
            if head1.data<head2.data:
                correct.next=head1
                head1=head1.next
            else:
                correct.next=head2
                head2=head2.next
            correct=correct.next
        if head1:
            correct.next=head1
        if head2:
            correct.next=head2
        return sorte.next

    def even_odd_linked(self,head):
        if head is None:
            return None
        curr=head
        even_head=None
        odd_head=None
        even=None
        odd=None
        while curr:
            if curr.data%2==0:
                if even is None:
                    even_head=curr
                    even=even_head
                else:
                    even.next=curr
                    even=even.next                
            else:
                if odd is None:
                    odd_head=curr
                    odd=odd_head
                else:
                    odd.next=curr
                    odd=odd.next
                
            curr=curr.next
        if odd:
            odd.next=None
        if even:
            even.next=odd_head

        return even_head if even_head else odd_head
