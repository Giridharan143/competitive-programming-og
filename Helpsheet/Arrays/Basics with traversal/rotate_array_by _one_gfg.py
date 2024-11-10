'''
Input: arr = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
'''
'''
def rotate(nums):
    last=len(nums)-1
    for idx in range(len(nums)):
        if idx==0:
            iter=nums[idx]            
            nums[idx]=nums[last]
            nums[last]=nums[-2]
        if idx>0 and idx!=last:
            nums[idx]=iter
        # print(nums)
            iter=nums[idx+1]
        print(iter)
        print(nums)

        # nums[idx]=nums[last]
    #return nums
'''
def right_rotate(nums):
    if not nums or len(nums)==1:
        return nums
    last=nums[-1]
    for idx in range(len(nums)-1,0,-1): #This is the method for moving in the right direction
        nums[idx]=nums[idx-1]
    nums[0]=last
    return nums
#arr=[2,3,4,5,1]

def left_rotate(nums):
    if not nums or len(nums)==1:
        return nums
    first=nums[0]
    for idx in range(0,len(nums)-1,1):
        nums[idx]=nums[idx+1]
        #print(nums)
    nums[-1]=first
    return nums


arr = [1, 2, 3, 4, 5]
print(right_rotate(arr))
print(left_rotate(arr))
