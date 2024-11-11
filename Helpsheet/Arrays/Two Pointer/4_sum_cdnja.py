'''
Sample Input 1:
6 8
2 2 2 2 1 3
Sample Output 1 :
2
'''

def sum_4(nums,target):
    n=len(nums)
    for idx in range(n-3):
        left=idx+1
        right=n-1
        mid=idx+2
        while left < mid and mid < right:
            sum=nums[idx]+nums[left]+nums[mid]+nums[right]
            if(sum==target):
                return 1
            if sum<target:
                left+=1;mid+=1
            else:
                right-1;mid-=1
            if left==mid or mid==right:
                break
    return 0

arr=[2, 2, 3,2, 1, 2]
x=8
print(sum_4(arr,x))