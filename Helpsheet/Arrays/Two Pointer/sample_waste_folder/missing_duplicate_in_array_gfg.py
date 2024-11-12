'''
a = [3, 1, 2, 5, 4, 6, 7, 5]
    ans = findMissingRepeatingNumbers(a)
    print("The repeating and missing numbers are: {", ans[0], ", ", ans[1], "}\n")


Output: The repeating and missing numbers are: {5, 8}
'''
def miss_dupli(nums):
    n=len(nums)
    hassh=[0]*(n+1)   #don't use the keyword hash because it's said to create an built in func error so be careful about it please
    for idx in range(0,n):
        #val=nums[idx]
        hassh[nums[idx]]+=1
    dupli=miss=0
    for idx in range(len(hassh)):
        if hassh[idx]==2:
            dupli=idx
        elif hassh[idx]==0:
            miss=idx
        if dupli != 0 and miss !=0:
            break
    string=f"The Repeating Element is: {dupli} \nThe Missing   Element is: {miss}"
    return string

#a = [3, 1, 2, 5, 4, 6, 7, 5]
a=[1,2,2,3]
print(miss_dupli(a))

