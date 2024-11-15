'''
Input: a[] = [85, 25, 1, 32, 54, 6], b[] = [85, 2] 
Output: 7
Explanation: 85, 25, 1, 32, 54, 6, and 2 are the elements which comes in the union set of both arrays. So count is 7.
Input: a[] = [1, 2, 1, 1, 2], b[] = [2, 2, 1, 2, 1] 
Output: 2
Explanation: We need to consider only distinct. So count is 2.
'''
def union(nums1,nums2):
    out=set()
    for num in nums1:
        if num not in out:
            out.add(num)
    for number in nums2:
        if number not in out:
            out.add(number)
    count=len(out)
    return count
a =[ 1, 2, 1, 1, 2] ;b = [2, 2, 1, 2, 1] 
print(union(a,b))
