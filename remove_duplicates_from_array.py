class Solution:
    def removeDuplicates(self, nums):
        if not nums:
            return 0
        crt_pot = 0 
        for cur_pot in range(1, len(nums)):
            if nums[cur_pot] != nums[crt_pot]:
                crt_pot += 1
                nums[crt_pot] = nums[cur_pot]
                
        count = crt_pot + 1
        
        # Replace remaining elements with underscores
        
        print(count,end='')
        print(", nums =", nums[:count])

# Test the function
nums = [1,1,2]
sol = Solution()
sol.removeDuplicates(nums)
