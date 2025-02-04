class struct:
    def __init__(self,data):
        self.left=None
        self.right=None
        self.data=data
    
    def getLeftPtr(self):
        return self.left
    
    def getRightPtr(self):
        return self.right
    
    def getData(self):
        return self.data
    
class tree:
    def __init__(self,data):
        self.root=struct(data)

    def insertLeft(self,root,data):
        if root.left is None:
            root.left=struct(data)
        else:
            new_data=struct(data)
            new_data.left=root.left
            root.left=new_data

    def insert_right(self,root,data):
        if root.right is None:
            root.right=struct(data)
        else:
            newData=struct(data)
            newData.right=root.right
            root.right=newData

    def inOrderTraversal(self,root):
        if root: # is not said to be none
            self.inOrderTraversal(root.left)
            print(root.data,end="-")
            self.inOrderTraversal(root.right)
    
    def insert_anywhere(self,root,data):
        if root.left is None:
            root.left=struct(data)
        elif root.right is None:
            root.right=struct(data)
        else:
            self.insert_anywhere(root.left,data) 

    def preOrderTraversal(self,root):
        if root:
            print(root.data,end="-")
            self.preOrderTraversal(root.left)
            self.preOrderTraversal(root.right)
    
    def postOrderTraversal(self,root):
        if root:
            self.postOrderTraversal(root.left)
            self.postOrderTraversal(root.right)
            print(root.data,end="-")

    def level_order_traversal(self,root):
        if root is None:
            return
        queue=[]
        selector=[root]
        while selector:
            ptr=selector.pop(0)
            queue.append(ptr.data)
            if ptr.left:
                selector.append(ptr.left)
            if ptr.right:
                selector.append(ptr.right)
        print(queue)

class tree_problrms:

    
    
    def level_order_traversal(self,root):
        queue=[]
        selector=[root]
        while selector:
            queue.append(selector.pop(0).data)
            if root.left:
                selector.append(root.left)
            if root.right:
                selector.append(root.right)
        print(queue)


tr=tree(1)
tr.insertLeft(tr.root,2)
tr.insert_right(tr.root,3)
tr.insertLeft(tr.root.left,4)
tr.insert_right(tr.root.right,5)
tr.inOrderTraversal(tr.root)
print()
tr.preOrderTraversal(tr.root)
print()
tr.postOrderTraversal(tr.root)
print()
tr.level_order_traversal(tr.root)