'''
a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
a2[] = {11, 3, 7, 1, 7}
Output:
Yes
'''
'''
def array_subset(nums1,nums2):
    
    for idx in range(len(nums1)):

        if nums2[idx] not in nums1:
            
            return "No"
    return "Yes"
'''
'''

    
'''
'''
def counter(arr):
    hash_map={}
    hash_index={}
    for pos,val in enumerate(arr):
        if val in hash_map:
            hash_map[val]+=1
        else:
            hash_map[val]=1
        if val not in hash_index:
            hash_index[val]=pos
    print(hash_index)
    return hash_map
    ''
    
    for char in arr:
        if char in hash_map:
            hash_map[char]+=1
        else:
            hash_map[char]=1
    return hash_map
    '''
'''
arr='apple'
print(counter(arr))
'''
'''

def is_subset(nums1,nums2,n1,n2):
    for num in nums2:
        if num in nums1:
            nums1.remove(num)
            continue
        else:
            return "No"
    return "Yes"
'''
from collections import Counter
def is_subset(nums1,nums2,n1,n2):
    count_a=Counter(nums1)
    count_b=Counter(nums2)
    for num in count_b:
        #if count_b[num]> count_a[num]:
        if count_b[num]>count_a.get(num,0):
            return "No"
    return "Yes"

a1 ={11, 7, 1, 13, 21, 3, 7, 3}
a2= {11, 3, 7, 321, 7}
n1=n2=0
print(is_subset(a1,a2,n1,n2))
