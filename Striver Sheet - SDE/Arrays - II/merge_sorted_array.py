class main:
    def firstApproach():
        
        
        return
    def binaryRec(self,nums,x):
            mid=int (len(nums)/2) 
            if not nums:
                print(f"Number {x} is not Found :( ")           
                return
            if nums[mid]==x:
                print(f"Number {x} is found :)")
                return
            elif nums[mid]>x:
                self.binaryRec(nums[:mid],x)
            else:
                self.binaryRec(nums[mid+1:],x)
            return
    """
    # def binarySearchingTest(target):
    #     nums=[1,4,6,2,3,7,8,9,10]
    #     nums.sort()
    #     binaryRec(nums,target)
    
    # binarySearchingTest(7)
    """

    def sampleApproach():
        nums=[1,2,3,4,5]
        first=0
        last=len(nums)-1
        print("Before Sorting -> ",nums)
        while(first!=last):
            nums[first],nums[last]=nums[last],nums[first]
            first+=1
            last-=1
        print("After Sorting ->  ",nums)
        return
    
"""
using these line for commiting my code for future doubts !!!
"""

    
# nums=[1,4,6,2,3,7,8,9,10]
# nums.sort()
# s=main()
# s.binaryRec(nums,8)