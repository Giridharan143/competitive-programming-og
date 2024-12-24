"""
Input: arr[] = [7, 4, 0, 9]
Output: 10
Explanation:
Water trapped by above 
block of height 4 is 3 units and above 
block of height 0 is 7 units. So, the 
total unit of water trapped is 10 units.

"""


# def trapping_rain_water(arr):
#     temp=0;sum=0
#     for num in arr:
#         if temp<num:
#             temp=num
#         sum=temp-num
#     return sum

def trapping_rain_water(arr):
    n=len(arr)
    if n==0:
        return 0
    lefti = [0]*n ; righti = [0]*n
    lefti[0]=arr[0]
    for idx in range(1,n):
        lefti[idx]=max(lefti[idx-1],arr[idx])
    righti[n-1]=arr[n-1]
    for idx in range(n-2,-1,-1):
        righti[idx]=max(righti[idx+1],arr[idx])
    trapp_water=0
    for idx in range(0,n):
        trapp_water+=min(lefti[idx],righti[idx])-arr[idx]
    return trapp_water

    

arr =  [3, 0, 0, 2, 0, 4]
print(trapping_rain_water(arr))