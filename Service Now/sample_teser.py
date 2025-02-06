hashMap={}
arr=[1,2,3,4,5,6]
val=['a','b','c','d','e','f']

for idx in range(len(arr)):
    hashMap[val[idx]]=arr[idx]
#print(hashMap)

def fibonacii(n):
    if n==0:
        return 0
    if n==1:
        return 1
    return fibonacii(n-1)+fibonacii(n-2)

def summer(n):
    if n==0:
        return 0
    return n+summer(n-1)

def reverse_string_recursion(str):
    if not str:
        return ""
    return reverse_string_recursion(str[1:])+str[0]

# print(reverse_string_recursion("giri"))

def merge_two_sorted(nums1,nums2):
    new_arr=[0]*((len(nums1))+(len(nums2)))
    n1=0
    for idx in range(len(nums1)):
        new_arr[n1]=nums1[idx]
        n1+=1
    for idx in range(len(nums2)):
        new_arr[n1]=nums2[idx]
        n1+=1
    return new_arr

print(merge_two_sorted([1,2,3,4,5],[6,7,8,9,10]))