class Dump:
    def sample(n):
        lisst=[]
        for i in range(n):
            temp=[1]*(i+1)
            for j in range(1,i):
                temp[j]=lisst[i-1][j-1]+lisst[i-1][j]
            lisst.append(temp)
        for idx in range(len(lisst)):
            print(lisst[idx])
        return
    # sample(6)
    # [1,3,0]
    def matrixZero(matrix):
        row=len(matrix)
        column=len(matrix[0])
        firstRow=any(matrix[0][i]==0 for i in range(column))
        firstColumn=any(matrix[i][0]==0 for i in range(row))
        for i in range(1,row):
            for j in range(1,column):
                if matrix[i][j]==0:
                    matrix[i][0]=0
                    matrix[0][j]=0
        for i in range(1,row):
            for j in range(1,column):
                if matrix[i][0]==0 or matrix[0][j]==0:
                    matrix[i][j]=0
        if firstRow:
            for i in range(column):
                matrix[0][i]=0
        
        if firstColumn:
            for i in range(row):
                matrix[i][0]=0
            
        for i in range(row):
            print(matrix[i])
        return
    # arr=[1,0,1],[1,1,1]
    # matrixZero(arr)

    def nextP(nums):
        mid=len(nums)-2
        while mid>=0 and nums[mid]>=nums[mid+1]:
            mid-=1
        if mid>=0:
            last=len(nums)-1
            while nums[last]<nums[mid]:
                last-=1
            nums[mid],nums[last]=nums[last],nums[mid]
        nums[mid+1:]=reversed(nums[mid+1:])
        print(nums)
        return
    arr=[1,2,3]
    # nextP(arr)


class Main:
    def kadane_algo():
        
        
        return