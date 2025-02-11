class solution:
    def firstApproach(arr):
        i=len(arr)-2
        while i>=0 and arr[i]>=arr[i+1]:
            i-=1
        if i>=0:
            j=len(arr)-1
            while arr[j]<=arr[i]:
                j-=1
            arr[i],arr[j]=arr[j],arr[i]
        arr[i+1:]=reversed(arr[i+1:])
        print(arr)
        return
    # firstApproach([3,2,1])

    def secondApproach(nums):
        n=len(nums)
        mid=n-2
        while mid>=0 and nums[mid]>=nums[mid+1]:
            mid-=1
        if mid>=0:
            last=n-1
            while nums[last]<=nums[mid]:
                last-=1
            nums[mid],nums[last]=nums[last],nums[mid]
        nums[mid+1:]=reversed(nums[mid+1:])
        # print(nums)
        return
    secondApproach([1,1,5])