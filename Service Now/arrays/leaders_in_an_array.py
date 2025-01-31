<<<<<<< HEAD
=======
def func1(nums):
    temp=set();max=0
    
    for idx in range(len(nums)):
        for num in range(len(nums)):
            if nums[idx] > max:
                max=nums[idx]
            elif nums[idx]<nums[num]:
                max=nums[num]
            if max not in temp:
                temp.add(max)
            else:
                temp.add(max)
    return temp
def func2(nums):
    max_=0;temp=set()
    for left in range(0,len(nums)):
        for curr in range(0,len(nums)):
            if(nums[left]<=nums[curr]):
                continue
            elif curr==len(nums)-1:
                max_=nums[curr]
                temp.add(max_)
                curr=0
    return temp
def func3(nums):
    temp = set()
    max_val = float('-inf')  # Initialize to negative infinity

    # Traverse from right to left
    for i in range(len(nums) - 1, -1, -1):
        if nums[i] >= max_val:
            max_val = nums[i]
            temp.add(max_val)  # Store the leader

    #return sorted(temp)  # Sorting to maintain correct order
    return temp

def correct(nums):
    temp=set();maxi=float('-inf')
    for idx in range(len(nums)-1,-1,-1):
        if(nums[idx]>=maxi):
            maxi=nums[idx]
            temp.add(maxi)
    return temp
    

if __name__== "__main__":
    arr=[16,17,4,3,5,2]
    # print(func2(arr))
    print(correct(arr))



>>>>>>> 67b845827e581a3a0d76b94c5de88762c3114417
