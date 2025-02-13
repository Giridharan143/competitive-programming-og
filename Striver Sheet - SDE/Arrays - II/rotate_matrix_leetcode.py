"""
"""
class sample:
    def sample():
        matrix1=[
            [1,2,3],
            [4,5,6],
            [7,8,9]
        ]
        # matrix2=[
        #     [7,8,9],
        #     [1,5,6]
        # ]
        row= len(matrix1)
        column = len(matrix1[0])
        for i in range(len(matrix1)):
            print(matrix1[i])


        for i in range(row):
            for j in range(i+1,column):
                matrix1[i][j],matrix1[j][i]=matrix1[j][i],matrix1[i][j]
                """
                0-1,0-2,1-2,2-1,2-2,3
                """
                
        print("After swapping")
        for i in range(len(matrix1)):
            print(matrix1[i])

        print("rotating 90 degree")
        for row in matrix1:
            row.reverse()

        for i in range(len(matrix1)):
            print(matrix1[i])
        return
    # sample()

    def mainXsample(matrix):
        row = len(matrix)
        column=  len(matrix[0])

        for i in range(row):
            for j in range(i+1,column):
                matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
        for row in matrix:
            row.reverse()
        return
    