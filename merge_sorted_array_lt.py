class Solution:    
    def merge(self,nums1, m, nums2, n):
        n1p=m-1;n2p=n-1;og=((m+n)-1)
        while n1p>=0 and n2p>=0:
            if nums1[n1p] > nums2[n2p]:
                nums1[og] = nums1[n1p]
                n1p-=1
            else:
                nums1[og]=nums2[n2p]
                n2p-=1
            og-=1
        while(n2p>=0):
            nums1[og]=nums2[n2p]
            n2p-=1
            og-=1
        return nums1

nums1 = [1,2,3,0,0,0] # nums1 has space for elements from nums2
m = 3  # Number of valid elements in nums1
nums2 = [2, 5, 6]  # Second sorted array
n = 3  # Number of valid elements in nums2

# Call the merge function
print(merge(nums1, m, nums2, n))

