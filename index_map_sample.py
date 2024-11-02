def index_map(nums):
    




    '''
    index_map={}
    for pos,val in enumerate(nums):
        index_map[val**(nums[pos]+1)]  = pos
    print(nums)
    return list(index_map)

    '''
    '''
    index_map={}
    for pos,val in enumerate(nums):
        index_map[val+1]=pos
    return list(index_map)

    '''
words = ["apple", "banana", "apple", "orange", "banana", "apple"]

nums=[1,2,3,4,5,6,7]
#names=['gi]
print(index_map(nums))


