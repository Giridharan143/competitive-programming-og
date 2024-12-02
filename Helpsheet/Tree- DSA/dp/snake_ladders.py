'''
a=[1,2,3,4,5,6,7,8,9]
arr=[]
'''
'''
snake={a[2*i]:a[2*i+1] for i in range(len(a)//2)}
print(snake)
'''


def call(n,nums):
    snake_ladder={nums[2*i]:nums[2*i+1] for i in range(n)}
    min_throws=float('inf') #maximum value is said to be given
    visited=[False]*31
    def play(cell,throw):
        nonlocal min_throws
        if cell==30:
            min_throws = min(min_throws,throw)
            return
        # always remember to put in the value of the stack
        if cell in snake_ladder:
            cell=snake_ladder[cell]
        if visited[cell]:
            return
        visited[cell]=True
        
        for i in range(1,7):
            new_cell=cell+i;new_throw=throw+1
            if new_cell<=30 and new_throw<min_throws:
                play(new_cell,new_throw)
        visited[cell]=False
    play(1,0)
    return min_throws
N = 8
arr = [3, 22, 5, 8, 11, 26, 20, 29, 
    17, 4, 19, 7, 27, 1, 21, 9]

arr_list=arr
#minthrow(N,arr_list)
print(call(N,arr))