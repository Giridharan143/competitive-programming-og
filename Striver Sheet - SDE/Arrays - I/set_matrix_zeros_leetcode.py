class main:
    def set_zero_matrix(matrix):
        m=len(matrix);n=len(matrix[0])
        # m -> Row and n -> Column
        firstRow=any(matrix[0][j] for j in range(n))        
        firstColumn=any(matrix[j][0] for j in range(m))
        for i in range(1,m): # Rowtraversal
            for j in range(1,n):
                if matrix[i][j]==0:
                    matrix[0][j]=0
                    matrix[i][0]=0

        for i in range(1,m): # Rowtraversal
            for j in range(1,n):
                if matrix[i][0]==0 or matrix[0][j]==0:
                    matrix[i][j]=0
        if firstRow:
            for j in range(n):
                matrix[0][j]=0
        if firstColumn:
            for j in range(m):
                matrix[j][0]=0
        temp=0
        while temp!=m:
            print(matrix[temp])
            temp+=1
        return
    # set_zero_matrix([[0,1,2,0],[3,4,5,2],[1,3,1,5]])

class sample:

    def insert_matrix():
        arr=[[1,2,3],[2,4,6]]
        summ=[];calci=0
        for i in range(len(arr)-1):
            temp=[]
            for j in range(len(arr[i])):
                # calci+=arr[i][j]
                val=arr[i][j]*arr[i+1][j]
                summ.append(val)
        print(summ)
        return

    def anyFunc():
        str="Giriidddharank"
        flag=any('t'==char for char in str)
        if flag:
            print("Yes")
        else:
            print("no")
        return
    def hashMap():
        map={}
        str="giiririr"
        for char in str:
            if char in map:
                map[char]=map[char]+1
            else:
                map[char]=1
        for key,pos in map.items():
            if pos > 1:
                print(key,end="->")
            else:
                continue
        
    # print(f"{hashMap()} Duplicates")

    # insert_matrix()

class solution:
    def zeroTwoOneMatrix(matrix):
        # Length of row
        # Length of column
        row=len(matrix)
        column=len(matrix[0])

        for i in range(1,row):
            for j in range(1,column):
                if matrix[i][j]==0:
                    matrix[0][j]=0
                    matrix[i][0]=0
        for i in range(1,row):
            for j in range(1,column):
                if matrix[i][0]==0 or matrix[0][j]==0:
                    matrix[i][j]=0
        flagRow1=any(matrix[i][0]==0 for i in range(row))
        flagColumn1=any(matrix[0][i]==0  for i in range(column))
        if flagRow1:
            for i in range(row):
                matrix[i][0]=0
        if flagColumn1:
            for i in range(column):
                matrix[0][i]=0
        for k in range(row):
            print(matrix[k])
        return
    # matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
    # print(matrix,"\n")
    # zeroTwoOneMatrix(matrix)

def finalOutZeroMatrix(matrix):
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
            if matrix[0][j]==0 or matrix[i][0]==0:
                matrix[i][j]=0
    if firstRow:
        for idx in range(column):
            matrix[0][idx]=0
    if firstColumn:
        for idx in range(row):
            matrix[idx][0]=0
    return 

matrix=[[1,1,1],[1,0,1],[1,1,1]]
print(matrix,"\n")
print(finalOutZeroMatrix(matrix))