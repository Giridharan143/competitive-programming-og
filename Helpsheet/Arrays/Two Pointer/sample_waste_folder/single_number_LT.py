def single_number(nums):
    hashmap={}
    for idx in range(len(nums)):
        if nums[idx] in hashmap:
            hashmap[nums[idx]]+=1
        else:
            hashmap[nums[idx]]=1
    single=0;si=0
    for pos,val in hashmap.items(): # pos is sometimes called as the key keep note of it
    
        if val==1:
            return pos
    else : return 0
    
    
    
nums=[1,1,2,3,3,4,2]
print(f"The Only number which is present only once is said to be : {single_number(nums)}")