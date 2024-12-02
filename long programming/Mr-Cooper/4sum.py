'''
a=[1,2,4,5,6,7]
a.sort()
x=12

for mid1 in range(0,len(a)-3):
    for mid2 in range(mid1+1,len(a)-2):
        left=mid2+1;right=len(a)-1
        while left< right:           
            val=a[left]+a[mid1]+a[mid2]+a[right]
            if val==x:
                print(a[left],a[mid1],a[mid2],a[right]);left+=1;right-=1
            elif val<x:
                left+=1
            elif val>x:
                right-=1
'''
a=[1,2,4,5,6,7,8,6,7]
a.sort();flag=False
x=17;n=len(a)
for left in range(0,n-3):
    for mid in range(left+1,n-2):
        center=mid+1;right=n-1
        while center<right:
            val=a[left]+a[mid]+a[center]+a[right]
            if val == x:
                print(f"{a[left],a[mid],a[center],a[right]} = {x}")
                flag=True
                center+=1;right-=1
            elif val <x:
                center+=1
            elif val>x:
                right-=1

                     
if flag:
    print("yessssss!!!!")
else:
    print("There is no 4 sum !!")