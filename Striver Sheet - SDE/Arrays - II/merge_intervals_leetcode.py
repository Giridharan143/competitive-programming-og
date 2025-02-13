class main:
    
    """
    Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    Output: [[1,6],[8,10],[15,18]]
"""
    def firstApproach(nums):
        n=len(nums);out=[]
        for timePeriod in nums:
            if not out or out[-1][1]<=timePeriod[0]:
                out.append(timePeriod)
            else:
                out[-1][1]=max(out[-1][1],timePeriod[1])
        print(out)
        return
    
    # firstApproach(intervals)
    
    def sampleApproach():
        test=[[1,2],[4,5],[2,4],[3,2]]
        test.sort()
        print(test)
        # for i in range(len(test)-1,-1,-1):
        #     # if test[i][1]>
        return
    # sampleApproach()
    
    def secondApproach(nums):
        n = len(nums);merged=[]
        for time in nums:
            if not merged:
                merged.append(time)
            elif merged[-1][1]<time[0]:
                merged.append(time)
            else:
                merged[-1][1]=max(merged[-1][1],time[1])
        # print(merged)
        return merged
    intervals = [[1,3],[2,6],[8,10],[15,18]]
    secondApproach(intervals)
    
class sample:
    def trying_sorting_0s_1s():
        nums=[2,0,1,2,0,1,2,0,1]
        print("Orginal array -> ",nums)
        count_zero=0
        count_one=0
        count_two=0
        out=[]
        for num in nums:
            if num==0:
                count_zero+=1
            elif num==1:
                count_one+=1
            elif num==2:
                count_two+=1
        while count_zero:
            out.append(0)
            count_zero-=1
        while count_one:
            out.append(1)
            count_one-=1
        while count_two:
            out.append(2)
            count_two-=1
        print("Sorted -> ",out)
        return
    # trying_sorting_0s_1s()