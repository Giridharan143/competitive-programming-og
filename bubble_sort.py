
#nums=[1,5,7,6,3,2,1]
nums=[]
print("enter number of elements : ", end='')

n=int(input())

for i in range(n):
    val=int(input())
    nums.append(val)
if not nums:
    exit()
for i in range(len(nums)):
   for j in range(0,len(nums)-1-i):
        if nums[j] > nums[j+1]:
            nums[j+1],nums[j]=nums[j],nums[j+1]
print("the sorted array is :",nums)

'''
nums = [1, 5, 7, 6, 3, 2, 1]

if not nums:
    #print("The list is empty.")
    exit()
else:
    for i in range(len(nums)):
        for j in range(0, len(nums) - 1 - i):  # Adjusted loop condition
            if nums[j] > nums[j + 1]:
                nums[j + 1], nums[j] = nums[j], nums[j + 1]

print("The sorted array is:", nums)
'''