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
            n-=1
        return result