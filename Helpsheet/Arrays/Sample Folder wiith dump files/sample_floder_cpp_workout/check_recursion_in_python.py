def sum_natural_numbers(i,n):
    if i>n:
        return
    print(i,end="->")
    sum_natural_numbers(i+1,n)
    # if i==n:
    #     return n
    # sum_natural_numbers(i+1,n)
    
def sum_natural_numbers(n):
    if n<1:
        return
    sum_natural_numbers(n-1)
    print(n, end=" ")

# print(sum_natural_numbers(1,10))
sum_natural_numbers(10)