class Nodee():
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
    def preorder(self,root):
        if root is None:
            return []
        result=[root.data]
        result+=self.preorder(root.left)
        result+=self.preorder(root.right)
        return result
    def inorder(self,root):
        '''
        if root is None:
            return []
        result=self.inorder(root.left)
        result.append(root.data)
        result+=self.inorder(root.right)
        return result
        '''
        result=[]
        if root is None:
            return []
        result=self.inorder(root.left)
        result.append(root.data)
        result+=self.inorder(root.right)
        return result
    def is_sum(self,node):
        self.ans=True
        def sol(root):
            if root is None:
                return 0
            if root.left==None and root.right==None:
                return root.data
            left=sol(root.left)
            right=sol(root.right)
            if left+right != root.data:
                self.ans=False
                return 0
        sol(node)
        return self.ans
    
    def summe(self,node):
        self.ans=True
        def cal(root):
            if root is None:
                return 0
            if root.left is None and root.right is None:
                return root.data
            left=cal(root.left)
            right=cal(root.right)
            if left+right!=root.data:
                self.ans=False
                return 0
            return root.data+left+right
        cal(node)
        return self.ans

    
        


root = Nodee(1)
root.left = Nodee(2)
root.right = Nodee(3)
root.left.left = Nodee(4)
root.left.right = Nodee(5)
root.right.right = Nodee(6)

# Perform preorder traversal
print("Preorder Traversal:", root.preorder(root))
print("Inorder Traversal:", root.inorder(root))
print(root.summe(root))