'''
Input: k = 5, arr1[] = [2, 3, 6, 7, 9], arr2[] = [1, 4, 8, 10]
Output: 6
Explanation: The final combined sorted array would be - 1, 2, 3, 4, 6, 7, 8, 9, 10. The 5th element of this array is 6.
'''
'''
nums1+=nums2
    nums1.sort()
    print(nums1)
    return nums1[k-1]

'''
def kth_element(k, nums1, nums2):
    n1 = len(nums1)
    n2 = len(nums2)

    if n1 > n2:
        return self.kth_element(k, nums2, nums1)
    
    less, more = max(0, n2 - k), min(k, n1)

    while less <= more:
        split_1 = (less + more) // 2
        split_2 = k - split_1

        left1 = nums1[split_1 - 1] if split_1 > 0 else float('-inf')
        left2 = nums2[split_2 - 1] if split_2 > 0 else float('-inf')
        right1 = nums1[split_1] if split_1 < n1 else float('inf')
        right2 = nums2[split_2] if split_2 < n2 else float('inf')

        if left1 <= right2 and left2 <= right1:
            return max(left1, left2)
        elif left1 > right2:
            more = split_1 - 1
        else:
            less = split_1 + 1


k = 5; arr1 = [2, 3, 6, 7, 9]
arr2 = [1, 4, 8, 10]
print(kth_element(k,arr1,arr2))