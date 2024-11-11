'''
Input:n = 6, x = 13, arr[] = [1,4,45,6,10,8]
Output: 1
Explanation: The triplet {1, 4, 8} in the array sums up to 13.
'''
'''
def triple_sum(nums,n,target):
    sup=[]
    i=0;j=1
    #print('Nonething')
    while i<n:
        while j<n:
            complement=nums[i]+nums[j]
            print(complement)
            #print(i,j)
            if (complement==target):
                return 0
            val=target-complement
            #print(val)
            if val in sup:
                return 1
            sup.append(nums[i])
            i+=1;j+=1
    print(sup)
    return 0
    '''
def triple_sum(nums,n,target):
    nums.sort() #first sorting is important in doing the three pointer problem
    for idx in range(n-2):
        left=idx+1 #second number to current number
        right=n-1 # last number
        while left<right:
            sum=nums[idx]+nums[left]+nums[right]
            if sum==target:
                return 1
            if sum>target:
                right-=1
            else:
                left+=1
        #print(sum)
    return 0

arr=[3,2,2,3]
#arr= [1,4,45,6,10,8]
n = 4
x = 9
print(triple_sum(arr,n,x))

'''    
    for idx in range(0,n):
        for j in range(1,n):
            complement=nums[idx]+nums[j]
            print(idx,j)
            if (complement==target):
                return 0
            val=target-complement
            print(val)
            if val in sup:
                return 1
            sup.add(nums[idx])
            '''
    
        

