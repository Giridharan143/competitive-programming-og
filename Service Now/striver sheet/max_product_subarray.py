# 2,3,0,1

def max_product_sub_array(nums):
    max_val=nums[0]
    max_temp=nums[0]
    min_temp=nums[0]

    idx =1

    while idx!=len(nums):
        num=nums[idx]

        # if num<0:
        #     min_temp,max_temp=max_temp,min_temp
        min_temp-min(num,min_temp*num)
        max_temp=max(num,max_temp*num)
        max_val=max(max_val,max_temp)
        idx+=1
    return max_val


def max_val(nums):
    maxt=nums[0];mint=nums[0];maxv=nums[0]
    idx=1
    while(idx!=len(nums)):
        num=nums[idx]
        if num <=0:
            mint,maxt=maxt,mint
        maxt=max(num,maxt*num)
        mint=min(num,mint*num)

        maxv=max(maxv,maxt)
        idx+=1
    return maxv
        


print(max_val([2,3,0,8]))
