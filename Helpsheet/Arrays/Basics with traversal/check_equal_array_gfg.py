'''
Input: arr1[] = [1, 2, 5, 4, 0], arr2[] = [2, 4, 5, 0, 1]
Output: true
Explanation: Both the array can be rearranged to [0,1,2,4,5]
'''
'''
def equal_arr(nums1,nums2):
    p1=0
    if len(nums1)!=len(nums2):
        return False
    n=len(nums1)
    while p1<n :
        if nums1[p1]  not in nums2:
            return False     
        if nums2[p1]  not in nums1:
            return False 
        p1+=1  
    return True
'''
'''
def equal_arr(nums1,nums2):
    i=j=0;flag=False
    while i<len(nums1): # The loop is running till the entire sorting is done and completed and accesed
        while j < len(nums2): # the loop is running in complexity of O(n^2) for finding whether this element is present in the array
            if nums1[i]==nums2[j]:
                nums2.pop(nums2[j]) # if the index is stagnant in one array and switching in another array
                flag=True
                break
            j+=1
        if not flag:
            return False
        i+=1
    if i==len(arr1):
        return True
    return False
    '''
def equal_arr(nums1,nums2):
    Flag=False
    for i in range(len(nums1)):
        for j in range(i,len(nums2)):
            if nums1[i]==nums2[j]:
                Flag=True
                nums2.pop(j)
            if Flag==True:
                break
    if Flag== False:
        return False
    return True
    
    




arr1=[1, 2, 5]
arr2= [2, 4, 15]
print(equal_arr(arr1,arr2))