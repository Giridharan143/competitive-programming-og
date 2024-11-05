'''
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.
'''
'''

def missing_number(nums):
    arr=[]
    nums.sort()
    #print(nums)
    if len(nums)==1:
        return nums[0]+1
    for i in range(1,len(nums)+1):
        if i not in arr:
            arr.append(i)
        if i in arr and i not in nums:
            return i
    return arr[-1]+1
    
    '''
def missing_num(nums):
    n=len(nums)+1 # we are adding 1 because there is one element missing in between
    actual_val=int(n*(n+1))/2
    sums_arr=0
    for i in range(len(nums)):
        sums_arr+=nums[i]
    return int(actual_val-sums_arr)



arr = [8, 2, 4, 5, 3, 7, 1]
print(missing_num(arr))