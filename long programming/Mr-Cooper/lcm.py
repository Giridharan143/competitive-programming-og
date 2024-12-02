import math
def lcm(nums):
    val=nums[-1];lcm=0
    lcm_=[]
    for num in nums:
        lcm+=(num*val)//gcd(num,val)
        lcm_.append(lcm)
    return lcm_
def gcd(a,b):
    if b==0:
        return a
    while b!=0:
        if a>b:
            a,b=b,a
        b=a%b
    return a
#print(gcd(10,10))




a=[5,10]
print(lcm(a))