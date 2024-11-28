class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

class Solution:
    
    # Function to return the diameter of a Binary Tree.
    def diameter(self, root):
        #to find the length of the tree
        ans=[0]
        self.dfs(root,ans)
        return ans[0]
    def dfs(self,root,ans):
        if root is None:
            return 0
        else:
            left=self.dfs(root.left,ans)
            right=self.dfs(root.right,ans)
            # I have accessed all the values right now
            ans[0]=max(ans[0],left+right)
            return max(left,right)+1 # to append the number of nodes that are preent in the tree



def printTree(root):
    if not root:
        return
    print(root.data, end=" ")
    printTree(root.left)
    printTree(root.right)

root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

solution = Solution()
print("Original Tree:")
printTree(root)
print("\nDiameter of the tree:", solution.diameter(root))