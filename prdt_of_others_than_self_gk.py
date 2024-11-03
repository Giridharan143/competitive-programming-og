#nums=[1,2,3,4]

def prdt_others(nums):
    corr=[1]*len(nums)
    #print(corr)
    temp=1
    for idx in range(len(nums)):
        corr[idx]=temp*corr[idx]
        temp*=nums[idx]
    #print(corr)
    temp1=1
    for idx in range(len(nums)-1,-1,-1):
        corr[idx]=temp1*corr[idx]
        temp1*=nums[idx]
    print(corr)
    
nums=[1,2,3,4]
prdt_others(nums)

"nice job giri"