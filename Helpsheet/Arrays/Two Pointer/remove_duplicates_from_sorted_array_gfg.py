def rem_dupli(nums):
    out=[];flag=False
    for idx in range(0,len(nums)):
        ldx=len(nums)-1
        if nums[idx]==nums[ldx]:
            out.append(nums[idx])
            nums.remove(nums[idx])
            ldx-=1
        if len(nums)==0:
            return out
    return out


a=[2, 2, 2, 2, 2]
print(rem_dupli(a))