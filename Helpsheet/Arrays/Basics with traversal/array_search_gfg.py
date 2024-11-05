'''
Input: arr[] = [1, 2, 3, 4], x = 3
Output: 2
Explanation: There is one test case with array as [1, 2, 3 4] and element to be searched as 3. Since 3 is present at index 2, the output is 2.
'''
def search_array(nums,k):
    for val in range(len(nums)):
        if nums[val]==k:
            return val
    return -1

arr = [10,8,3]
s=6
print(search_array(arr,s))