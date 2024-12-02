a=[4,3,2,6]
store=0
a.sort()
for i in range(len(a)-1):
    store+=a[i]+a[i+1]
    a[i+1]=store
print(store)


