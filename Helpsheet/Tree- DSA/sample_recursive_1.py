print ("hi")
#987
#output = 24

def sumer(num):
    if num < 10:
        return num
    digits= sum(int(number) for number in str(num))
    newlist=list(x for x in str(num))
    print(newlist)
    return digits

print(sumer(987))
def max_subarray_sum(nums):
    out = float("-inf")
    curr=0
    for num in nums:
        curr+=num
        if curr > out:
            out=curr
        if curr<0:
            curr=0
        print(curr)
    return out



arr = [-2, -3, 4, -1, -2, 1, 5, -3]
print("Maximum Subarray Sum:", max_subarray_sum(arr))