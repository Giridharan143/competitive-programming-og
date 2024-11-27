# this code is mainly about the level orderng in the tree structure where in

class Nodee():
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None

    def levelOrder(self,root):
        result=[]
        queue=[]
        if root is None:
            return root
        queue.append(root)
        while len(queue) > 0:
            n=len(queue)
            while n>0:
                value=queue.pop(0)
                result.append(value.data)
                if value.left:
                    queue.append(value.left)
                if value.right:
                    queue.append(value.right)
                n-=1
        return result
    def levell(self,root):
        if root is None:
            return None
        result=[] #to store the main values which needs to be given as an input
        queue=[] #to temporarily store the values in the list
        queue.append(root) #queue only contains the addresses of the data 
        while len(queue)>0:
            n=len(queue)
            while n>0:
                value=queue.pop(0)
                result.append(value.data)
                if value.left:
                    queue.append(value.left)
                if value.right:
                    queue.append(value.right)
            
        return result
    def printtree(self,root):
        curr=root
        if root is None:
            return []
        while curr:
            print(curr.data, end=' ')
            self.printtree(curr.left)
            self.printtree(curr.right)




root = Nodee(1)
root.left = Nodee(2)
root.right = Nodee(3)
root.left.left = Nodee(4)
root.left.right = Nodee(5)
root.right.right = Nodee(6)
print(root.levelOrder(root))
print(root.printtree(root))

# Perform preorder traversal