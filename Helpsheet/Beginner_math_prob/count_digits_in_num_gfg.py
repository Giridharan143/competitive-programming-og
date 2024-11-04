'''
Input: n = 1234
Output: 2
'''
def digits(n):
    count=0
    val=n
    while n!=0:
        last=n%10
        if val%last==0 and last>0:
            count+=1
        n//=10        
    return count

    

print(digits(12))

