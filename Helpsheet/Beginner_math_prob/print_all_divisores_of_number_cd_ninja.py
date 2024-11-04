'''
Sample Input 1 :
10
Sample Output 1 :
1 2 5 10

'''
def divisors(n):
    out=[]
    for idx in range(1,n+1):
        if n%idx==0:
            out.append(idx)
    return out

print(divisors(10))