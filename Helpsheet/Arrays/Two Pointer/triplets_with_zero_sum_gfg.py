'''
Input: arr[] = [0, -1, 2, -3, 1]
Output: true
Explanation: The triplet [0, -1, 1] has a sum equal to zero.
'''

def triple0(nums):
    nums.sort()
    n=len(nums)
    for idx in range(n-2):
        left=idx+1
        right=n-1
        while left<right:
            sums=nums[idx]+nums[left]+nums[right]
            if sums==0:
                return True
            elif sums < 0:
                left+=1
            right-=1
    return False
'''
#User function Template for python3

class Solution:
    # Function to find triplets with zero sum.
    def findTriplets(self, arr):
        arr.sort()
        
        for i in range(0,n):
            l=i+1
            
            r = n-1
            
            while(l<r):
                total = arr[i]+arr[l]+arr[r]
                if total == 0:
                    return True
                    
                elif total<0:
                    l+=1
                    
                else:
                    r-=1
        return False
        #code here
'''

arr=[-5, 3, 2, -1, 0, 1]
print(triple0(arr))