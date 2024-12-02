
'''
dict={}
arr=[1,2,1,3,4,5,6,7,7]
for pos,val in enumerate(arr):
    if val in dict:
        dict[val]+=1
    else:
        dict[val]=1
print(dict)
flag="No";check=[]
for val in dict.keys():
    print(val)
    if val not in check:
        check.append(val)
        flag="Yes"
    if val in check:
        flag="No"
        #check.append(val)
        break
print(check)
print(flag)
'''

import random as rd
dict={}
str=['a','b','c','d','e','f']
arr=[1,2,3,4,5,6,7]
for pos,val in enumerate(arr):
    t=rd.choice(str)
    dict[t]=val
print(dict)

for val in dict.keys():
    if val=='a' or val=='b':
        print(dict[val])
