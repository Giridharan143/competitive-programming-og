class sample:
    def firstApproach(n):
        matrix=[]
        for i in range(n):
            row = [1]*(i+1) # complete the inital part of the array
            for j in range(1,i):
                row[j]=matrix[i-1][j-1]+matrix[i-1][j]
            matrix.append(row)
        for idx in range(len(matrix)):
            print(matrix[idx])
        return
    # firstApproach(5)

    def secondApproach(n):
        matrix=[]
        for i in range(n):
            temp_row= [1]*(i+1)
            for j in range(1,i):
                temp_row[j]=matrix[i-1][j-1]+matrix[i-1][j]
            matrix.append(temp_row)
        for i in range(len(matrix)):
            print(matrix[i])
        return
    secondApproach(5)