# Need to create an two nodes one for storage and another for the manipulation of the system

class box:
    def __init__(self,data):
        self.val=data
        self.nxt=None
class ListL:
    def __init__(self) -> None:
        self.first=None

    def insert(self, data):
        puthu=box(data)
        if not self.first:
            self.first=puthu
        else:
            now=self.first
            while now.nxt:
                now=now.nxt
            now.nxt=puthu
    def show(self):
        traverse=self.first
        while traverse:
            print(traverse.val,end="->")
            traverse=traverse.nxt
        print("None !!")

    def delete(self,num):
        if not self.first:
            return "There is no element present in the linked list"
        if self.first.val==num:
            self.first=self.first.nxt
        else:
            curr=self.first
            while curr:
                if curr.nxt.val==num:
                    #print(str(curr.val))
                    curr.nxt=curr.nxt.nxt
                    return
                curr=curr.nxt
    def reverse(self):
        #1233 # 3321
        '''
        curr=self.first
        prev=None
        if not self.first:
            return "There is no elements"
        while curr:
            nextnode=curr.nxt
            curr.nxt=prev
            prev=curr
            curr=nextnode
        self.first=prev
'''
        curr=self.first;prev=None
        while curr:
            nextnode=curr.nxt
            curr.nxt=prev
            prev=curr
            curr = nextnode
        self.first=prev
        return self.first


li=ListL()
li.insert(10)
li.insert(11)
li.show()
li.insert(12)
#li.delete(10)
li.delete(11)
li.insert(22)
li.insert(89)
li.show()
li.reverse()
li.show()