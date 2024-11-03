class Solution:
    def twoSum(self,nums,target):
        '''
        map={}
        for i,num in enumerate(nums):
            balance=target-num
            if balance in map:
                return [map[balance],i]
            map[num]=i
        '''#for practising another time
        map={}
        for pos,val in enumerate(nums):
            balance=target-val
            if balance in map:
                return [map[balance],pos]
            map[val]=pos
        


nums=[2,7,11,15]
target=9
sol=Solution()
print(sol.twoSum(nums,target))
