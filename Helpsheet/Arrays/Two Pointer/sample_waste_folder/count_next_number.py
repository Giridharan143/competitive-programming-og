def fancy(nums,target):
    count=1;flag=False
    for idx in range(1,len(nums)):
        if nums[idx-1]==nums[idx]:
            count+=1
            if count==target:
                flag=True
        else:
            count=1
    if flag:
        return "Fancy"
    else:
        return "Not Fancy"



arr=[2,1,1,1,1,1,1,2,3,4,5,67,7]
num=6
print(fancy(arr,6))