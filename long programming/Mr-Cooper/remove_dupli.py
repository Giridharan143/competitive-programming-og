a=[1,1,2,3,4,4,1]
a.sort()
print(a)
comp=0;i=1  # two Pointer X Vigilante method
while i<len(a):
    if a[i]!=a[comp]:
        comp+=1
        a[comp]=a[i];i+=1
        
    else:
        i+=1
print(a[:comp+1])


   
