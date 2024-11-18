def rem_dupli(nums):
    if not nums and len(nums)==1:
        return len(nums)
    # Vigiilante in shadows - Method to solve the problem in Array
    vigilant=0
    for idx in range(1,len(nums)):
        if nums[idx]!=nums[vigilant]:
            vigilant+=1
            nums[vigilant]=nums[idx]
    print(nums)


    return vigilant+1

a=[2, 5, 2, 2, 2]
print(rem_dupli(a))