'''
Input: arr = [3, 2, 1, 56, 10000, 167]
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.
Input: arr = [1, 345, 234, 21, 56789]
Output: 1 56789
Explanation: minimum and maximum element of array are 1 and 56789.
Input: arr = [56789]
Output: 56789 56789
Explanation: Since the array contains only one element so both min & max are same.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
'''

def max_min(num):
    #result=[];
    min=0;max=0
    if len(num)==1:
        return num[0], num[0]
        return result
    for idx in range(len(num)):
        if idx==0:
            min,max=num[idx],num[idx]
        if num[idx] < min:
            min=num[idx]
        if num[idx] > max:      
            max=num[idx]
        #print(max)
    return min, max

arr = [1]
print(max_min(arr))
