class root:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
        self.next=None
class subroot:
    def __init__(self,data,root):
        self.data=data
        self.root=root
    def __str__(self):
        return str(self.data)



class bone_marrow:
    def __init__(self):
        self.head=None
        self.lastnode=None
    def __str__(self):
        return str(self.lastnode)
    def add(self,nums):
        idx=0
        while idx < len(nums):
            data=nums[idx] if nums else None
            left=nums[idx+1] if idx+1 < len(nums) else None
            right=nums[idx+2] if idx+2 < len(nums) else None
            newnode= root(data)
            newnode.left=subroot(left,newnode) if left is not None else None
            newnode.right=subroot(right,newnode) if right is not None else None
            if not self.head:
                self.head=newnode
            else:
                curr=self.head
                while curr.next:
                    curr=curr.next
                curr.next=newnode
            idx+=3
    def display(self):
        curr=self.head
        while curr:
            left_str=str(curr.left) if curr.left else "!"
            right_str=str(curr.right) if curr.right else "!"
            print(f"{left_str}<->{curr.data}<->{right_str} \n")
            #print("")
            if curr.next == None:
                self.lastnode=curr
            curr=curr.next        
        print(str(self.lastnode))
arr=[7,8,4,5,6,6,8,9]
newnode=bone_marrow()
newnode.add(arr)
newnode.display()


