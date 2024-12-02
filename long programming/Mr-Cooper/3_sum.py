a=[3,2,5,4,1,1,1,8]
a.sort()
print(a)
x=10
left=0;right=len(a)-1
for mid in range(1,len(a)-2):
    
    val = a[left]+a[mid]+a[right]
    if val==x:
        print(a[left],a[mid],a[right])
        left+=1
        right-=1
    elif val<x:
        left+=1
    elif val<x:
        right-=1
