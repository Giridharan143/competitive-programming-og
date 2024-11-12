'''
Input: arr[] = [1, 5, 3, 2]
Output: 2 
Explanation: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
'''


'''
# User function Template for python3
class Solution:
    def countTriplet(self, arr):
        # code here
        arr = sorted(arr)
        count = 0
        for k in range(len(arr)-1, 0, -1):
            i=0
            j=k-1
            while i<j:
                sum = arr[i] + arr[j] 
                if sum<arr[k]:
                    i+=1
                elif sum> arr[k]:
                     j-=1
                elif sum == arr[k]:
                    count+=1
                    i+=1
                    j-=1
            
                    
        return count
        '''

def count_triplets(nums):
    nums=sorted(nums) # 2p-cdn1 - always 5 cdn is important to proceed
    n = len(nums);count=0
    # find the triplets so approach from behind
    for max in range(n-1,0,-1):
        i=0;j=max-1
        while i < j:#cdn2
            sum=nums[i]+nums[j]
            if sum==nums[max]:#cdn3
                count+=1
                i+=1
                j-=1
            elif sum<nums[max]:#cdn4
                i+=1
            elif sum>nums[max]:#cdn5
                j-=1
    return count
                

    
    return None


arr=[2, 3, 6]
print(count_triplets(arr))