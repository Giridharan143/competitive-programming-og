def common_string(str1,str2):
    n1=len(str1);n2=len(str2)

    dp_table=[[0]*(n1+1) for i in range(n2+1)]
    result=0
    for i in range(1,n1):
        for j in range(1,n2):
            if str1[i-1]==str2[j-1]:
                dp_table[i][j]=dp_table[i-1][j-1]+1
                result=max(result,dp_table[i][j])
            else:
                dp_table[i][j]=0
    return result
    '''
    n1=len(str1);n2=len(str2)

    dp_table=[[0]*(n1+1) for i in range(n2+1)]
    #print(dp_table)
    
    res=0

    for i in range(1,n1):
        for j in range(1,n2):
            if str1[i-1]==str2[j-1]:
                dp_table[i][j]=dp_table[i-1][j-1]+1
                res=max(res,dp_table[i][j])
            else:
                dp_table[i][j]=0


    return res
    '''

s1 = "abc"
s2 = "acb"
print(common_string(s1, s2)) 