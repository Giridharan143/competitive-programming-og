def remove_element(nums, val):
    cor = 0
    k = 0

    if not nums:
        return 0

    for curr in range(len(nums)):
        if nums[curr] == val:
            k += 1
        else:
            nums[cor] = nums[curr]
            cor += 1
    for i in range(cor,len(nums)):
        nums[i]='_'
    counter=cor

    return counter

nums = [0,1,2,2,3,0,4,2]
val = 2
print(remove_element(nums, val))
#print("Updated nums:", nums[:len(nums) - k])
