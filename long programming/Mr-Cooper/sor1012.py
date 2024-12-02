a=[0,1,1,2,0]
curr=0;low=0;high=len(a)-1

while curr<=high:
    if a[curr]==2:
        a[high],a[curr]=a[curr],a[high]
        high-=1
    if a[curr]==1:
        curr+=1
    if a[curr]==0:
        a[low],a[curr]=a[curr],a[low]
        low+=1
        curr+=1

print(a)