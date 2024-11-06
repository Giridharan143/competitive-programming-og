'''
Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array.
Input: arr[] = [0, 3, 1, 2] 
Output: [] 
Explanation: There is no repeating element in the array, so the output is empty.
'''
'''
def duplicate(num):
    #print(num)
    #temp=[]
    temp = set()
    #set(temp)
    out=[]
    for idx in range(len(num)):
        if num[idx] in temp and num[idx] not in out:
            out.append(num[idx])
        temp.add(num[idx])
        #print(temp)
    return sorted(out)
'''
def duplicate(num):
    num.sort() #[1,1,2,2]
    result=[]
    comp=None
    flag=False
    for idx in num:
        if comp==None or comp!=idx:
            comp=idx
            flag=False
        elif comp==idx and flag==False:
            result.append(idx)
            flag=True
    return result



arr= [3, 1, 0, 4, 2, 3, 1]
print(duplicate(arr))
