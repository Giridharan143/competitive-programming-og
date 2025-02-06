# 10,5,6,7,8,9,2,3,
# checking whether the consecutive numers are said to be lesser than the numers which are said to be before that

def max_sub_seq(nums):
    n=len(nums)
    dp=[1]*n
    for i in range(n):
        for j in range(i):
            if nums[j]<nums[i]:
                dp[i]=max(dp[i],dp[j]+1)
                print(dp,end="\t")
    return max(dp)

def max_sub_array(nums):
    n=len(nums)
    dp=[1]*n
    for first in range(n):
        for second in range(first):
            if nums[second]<nums[first]:
                dp[first]=max(dp[first],dp[second]+1)
    return max(dp)




print(max_sub_array([10, 9, 2, 5, 3, 7, 101, 18]))