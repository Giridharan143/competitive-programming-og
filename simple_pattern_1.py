'''
Star problems :-

Print Elements from left to right 

n=int(input(""))
for i in range(0,n+1):
    print('*'*i)
'''
'''
*
**
***
****
*****
'''
'''
Print Elements from right to left

n = int(input())
for i in range(0,n+1):
    print(" "*(n-i)+'*'*i)

output :-

    *
   **
  ***
 ****
*****

'''
'''
DIAMOND PATTERN 

n = int(input("Diamond pattern (i.e only odd numbers should be given):"+'\t'))

for i in range(0,n//2+1):
    #print(" "* (n//2-i)+"*"*(2*i+1))
    print(" "*(n//2-i)+"*"*(2*i+1)) # upper part is done for now

for i in range(n//2-1,-1,-1):
    print(" "*(n//2-i)+'*'*(2*i+1)) #lower part is done right now

print("Pattern for printing the diamond is done perfectly")

output : 7

   *
  ***
 *****
*******
 *****
  ***
   *

'''
'''
Numbers as output

n =int(input())
for i in range (1,n+1):
    print((str(i)+' ')*i)
for i in range (1,n+1):
    print((' ')*(n-i)+((str(i))*i))

'''
'''
n = int(input())
j=1
for i in range (1,n+1,2):
    print(str(i)*j)
    j+=1
'''

