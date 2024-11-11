'''
Input: arr[] = [1, 4, 45, 6, 10, 8], target =16
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16

'''

def find_pair(nums,target):
    sup=set()
    for idx in range(len(nums)):
        complement=target-nums[idx]
        if complement in sup:
            return True
        sup.add(nums[idx])
    return False
        

    return None

arr=[1, 2, 4, 3, 6]
target=11
print(find_pair(arr,target))

