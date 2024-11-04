'''
a = 3
b = 6
Output: 3
'''

def gcd(a,b):
    if a<b:
        a,b=b,a
    if b==0:
        return a
    while b!=0:
        a,b=b,a%b
    return a

print(gcd(1,1))