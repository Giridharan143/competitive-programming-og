'''
7 5 2 11 2 43 1 1
2
Sample Output 1:
2 11 2 43 1 1 7 5
Explanation of Sample Input 1:
Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
Rotate 2 steps to the left: 2 11 2 43 1 1 7 5
'''
'''
def l_rotate(nums,k):
    temp=0
    if not nums and len(nums)==1:
            return nums
    for i in range(k):
         for idx in range(len(nums)-1,-1,-1):            
            if idx == len(nums) -1:
                     temp=nums[idx]
            if idx==0:
                     nums[idx]=temp
            if idx > 0:
                nums[idx]=nums[idx-1]
    return nums

def k_rotate(nums,k):
    temp=0
    if not nums and len(nums)==1:
            return nums
    for i in range(k):
        for idx in range(len(nums)):            
            if idx == 0:
                    temp=nums[idx]
            if idx==len(nums) -1:
                    nums[idx]=temp
            if idx != len(nums):
                nums[idx]=nums[idx+1]
    return nums

    '''

def k_rotate(nums,n,k):
    if not nums and nums==n:
        return nums
    k=k%n
    out=tuple(nums[k:]+nums[:k])
    return out
def l_rotate(nums,n,k):
    if not nums and nums==n:
        return nums
    out=[]
    out.append(nums[k:])
    out.append(nums[:k])
    return out
    

arr=[2 ,11 ,2 ,43 ,1 ,1 ,7 ,5]
k=3;n=len(arr)
print(l_rotate(arr,n,k))

               
                     
        
