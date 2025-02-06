def sliding_window(nums,k):
    size=k
    for idx in range(len(nums)-k+1):
        max=nums[idx]
        for window in range(1,k):
            if nums[idx+window]>max:
                max=nums[idx+window]
        print(max,end=" ")

    print("|")
    return

# arr = [1, 2, 3, 1, 4, 5]; k = 3 
# sliding_window(arr,k)
# # 3 3 4 5

def sum_sliding_window(nums,k):
    for idx in range(len(nums)-k+1):
        sum=arr[idx]
        for window in range(1,k):
            sum+=arr[idx+window]
        print(sum,end=" ")
    print("-")
    return


arr = [2, 1, 5, 1, 3, 2]
K = 3
sum_sliding_window(arr,K)
