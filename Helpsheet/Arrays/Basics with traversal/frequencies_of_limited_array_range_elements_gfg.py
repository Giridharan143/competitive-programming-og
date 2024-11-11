'''
Input: n = 5, arr[] = [2, 3, 2, 3, 5], p = 5
Output: [0, 2, 2, 0, 1]
'''
#from collections import Counter
def freq_range(nums,n,rng):
    out=[0]*n
    for num in nums:
        if 1<=num<=n:
            out[num-1]+=1
    
    for idx in range(n):
        nums[idx]=out[idx]
    return nums



    #return nums

n = 5; arr = [2, 3, 2, 3, 5]; p = 5
print(freq_range(arr,n,p))