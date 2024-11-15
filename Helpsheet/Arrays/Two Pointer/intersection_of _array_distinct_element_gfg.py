'''
Input: a[] = [1, 2, 3, 4, 5, 6], b[] = [3, 4, 5, 6, 7]
Output: 4
'''
def intersection(nums1,nums2):
    out=set();nums2=set(nums2)
    for num in nums1:
        if num in nums2:
            out.add(num)
            nums2.remove(num)
    return len(out)

a = [89, 24, 75, 11, 23]; b = [89, 2, 4]

print(intersection(a,b))