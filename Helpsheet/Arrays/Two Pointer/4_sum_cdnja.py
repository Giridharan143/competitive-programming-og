'''
Sample Input 1:
6 8
2 2 2 2 1 3
Sample Output 1 :
2
'''
'''
def sum_4(nums,target):
    nums.sort()
    n=len(nums)
    for idx in range(n-3):
        left=idx+1
        right=idx+3
        mid=idx+2
        while left < mid and mid < right:
            sum=nums[idx]+nums[left]+nums[mid]+nums[right]
            if(sum==target):
                array=[nums[idx],nums[left],nums[mid],nums[right]]
                array=set(array)
                return list(array)
            if sum<target:
                left+=1;mid+=1
            else:
                right-1;mid-=1
            if left==mid or mid==right:
                break
    return 0
'''
'''
def sum_4(nums,target): # for the problem of same number as quadrrapules
    n=len(nums)
    result=set()
    for i in  range(n-3):
        if i>0 and nums[i]==nums[i-1]:
            continue     #succesfully initialised the first pointer
        for j in range(i+1,n-2):
            if j>i+1 and nums[j]==nums[j-1]:
                continue
            left=j+1
            right=n-1
            sums=nums[i]+nums[j]+nums[left]+nums[right]
            if sums==target:
                result.add((nums[i],nums[j],nums[left],nums[right]))
                while left < right and nums[left]==nums[left-1]:
                    continue
                while left > right and nums[right]==nums[right+1]:
                    continue
                left+=1;right-=1
            if sums < target:
                left+=1
            if sums> target:
                right-=1
    return len(result)

'''
def sum_4(nums,target):
    n=len(nums)
    nums.sort()
    result=[]
    result=set(result)
    for i in  range(n-3):
        for j in range(i+1,n-2):
            left=j+1
            right=n-1
            while left < right:
                sums=nums[i]+nums[j]+nums[left]+nums[right]
                if sums==target:
                    result.add((nums[i],nums[j],nums[left],nums[right]))            
                    left+=1;right-=1
                elif sums < target:
                    left+=1
                elif sums> target:
                    right-=1
    
    return [list(num) for num in result]

    
arr=[1,0,-1,0,-2,2]
x=0
print(sum_4(arr,x))