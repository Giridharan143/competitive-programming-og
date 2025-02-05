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
    
class BST:
    def __init__(self,data):
        self.root=struct(data)

    def insertionn(self,root,data):
        if root:
            if root.data < data and root.left is None:
                root.left=struct(data)
            else:
                self.insertion(root.left,data)
            if root.data > data and root.right is None:
                root.right=struct(data)
            else:
                self.insertion(root.right,data)

    def inserttion(self,root,data):
        if root is None:
            return struct(data)
        if data<root.data:
            root.left = self.insertion(root.left,data)
        elif data>root.data:
            root.right = self.insertion(root.right,data)
        return root
    
    def insertion(self,root,data):
        if root is None:
            return struct(data)
        if data<root.data:
            root.left=self.insertion(root.left,data)
        elif data>root.data:
            root.right=self.insertion(root.right,data)
        return root
    
    def printt(self,root):
        if root:
            self.printt(root.left)
            print(root.data,end="->")
            self.printt(root.right)

    def findValue(self,root,data):
        if root is None:
            print("Value is not found !!!")
            return
        if data==root.data:
            print("Found !!")
            return
        if data<root.data:
            return self.findValue(root.left,data)
        elif data>root.data:
            return self.findValue(root.right,data)
        

bst=BST(3)
bst.insertion(bst.root,2)
bst.insertion(bst.root,1)
bst.insertion(bst.root,4)
bst.insertion(bst.root,5)
bst.printt(bst.root)
print()
bst.findValue(bst.root,40)