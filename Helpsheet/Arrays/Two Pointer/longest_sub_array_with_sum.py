'''
Input: arr[] = [10, 5, 2, 7, 1, 9], k = 15
Output: 4
Explanation: The subarray [5, 2, 7, 1] has a sum of 15 and length 4.

'''
'''
def longest_sub(nums,k):
    total=0
    hashmap={}
    length=0

    for i in range(len(nums)):
        total+=nums[i]

        if total==k:
            length=max(length,i+1)

        if total-k in hashmap:
            length = max(length,i - hashmap[total-k])

        if total not in hashmap:
            hashmap[total]=i

    return length
'''

def longest_sub(nums,target):
    sum=0
    dict={}
    lent=0
    for idx in range(len(nums)):
        sum+=nums[idx]

        if sum==target:
            lent= max(lent, idx+1)
        
        # to find the other subarrays

        elif sum-target in dict:
            lent=max(lent,idx - dict[sum-target])
        
        # to update the dictionary

        else:
            dict[sum]=idx
    print(dict)

    return lent



if __name__ == "__main__":
    arr = [10, 5, 2, 7, 1, 9]  # Example array
    k = 15  
    result = longest_sub(arr, k)
    print("The length of the longest subarray with sum", k, "is:", result)