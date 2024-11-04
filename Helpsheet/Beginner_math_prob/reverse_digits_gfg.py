'''
Input : 122
Output: 221
'''
def rev(n):
    last=0;reve=0
    while n > 0:
        last=n%10 # I will get the last digit 2
        reve=last+10*reve
        n//=10
    return reve

print(rev(122))
    