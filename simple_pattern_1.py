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
'''
n = int(input())
for i in range(n,-1,-1):
    print((str(i)+' ')*i)
#output:-
5
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 
'''
'''
n =int(input(""))
for i in range(1,n+1):
    for j in range(i,0,-1):
        print(j, end=' ')
    print()

'''
'''
n = 5
for i in range(0,n+1):
    for j in range(i,-1,-1):
        print('*', end=' ')
    print()
#print("\n")
for i in range(n,-1,-1):
    for j in range(i,-1,-1):
        print('*', end=" ")
    print()

#output :-
* 
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
'''
n=5

for i in range(1,n+1):
    print(' '*(n-i),end='')
    for j in range(i):
        print('*',end='')
    print()




#Lower Pattern
for i in range(n,-1,-1):
    for j in range(i,-1,-1):
        print('*',end=" ")
    print()
