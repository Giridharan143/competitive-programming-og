
"""
    *
   * *
  * * *
 * * * *
* * * * *
"""

def second_pattern(n):
    temp=n
    for idx in range(n,0,-1): # 5-5 5-4 5-3
        condition = n-idx
        while(condition>0):
            print(" ",end="")
        print()


    for idx in range(0,n):
        while(temp>0):
            print("* ",end=" ")
            temp-=1
        print()
        temp=n-idx-1
second_pattern(5)