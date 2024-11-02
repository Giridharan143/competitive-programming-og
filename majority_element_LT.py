'''
Input: nums = [3,2,3]
Output: 3
'''
class Solution:
    def majorityElement(self,nums):
        major={}
        for i in range(len(nums)):
            if nums[i] in major:
                major[nums[i]]+=1
            else:
                major[nums[i]]=1
        #print(major)
        major_key=0
        major_value=0
        for pos,val in major.items():
            if val > major_value:
                major_value=val
                major_key=pos
        print(major_key)



nums = [3,2,3]
sol=Solution()
sol.majorityElement(nums)