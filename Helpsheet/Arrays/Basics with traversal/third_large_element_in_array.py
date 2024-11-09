'''
Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The third largest element in the array [2, 4, 1, 3, 5] is 3.
'''
'''
def third_larg(num):
    if not num or len(num)<3:
        return -1
    for idx in range(len(num)):
        for pos in range(idx+1,len(num)):
            if num[idx]<num[pos]:
                num[idx],num[pos]=num[pos],num[idx]
    return num[-3]
'''
'''
    if not num:
        return -1
    if len(set(num))<3:
        return max(num)
    first=second=third=float('-inf') #-inf resembles the negative infinity
    for val in num:
        if val>first:
            third=second
            second=first
            first=val
        elif val > second and val!=first:
            third=second
            second=val
        elif val >third and val!=first and val!=second:
            third=val
    if third!=float('-inf'):
        return third
    return -1
    '''
''''''
def thirdLargest(arr):
    arr.sort()
    print (arr)
    while len(arr)>=3:
        return arr[-3]
    return -1

    ''''
        arr.sort()
        for i in range(len(arr)):
            return arr[-3]
        return -1
'''
    
    

arr = [2, 4, 1, 3, 5]
print(thirdLargest(arr))