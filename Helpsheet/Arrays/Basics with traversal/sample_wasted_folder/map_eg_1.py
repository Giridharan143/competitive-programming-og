def square(num):
    out=num*num
    return out
def add(num):
    return num+1

inp=[1,2,3,4,5,6]
output=map(square,inp)
add=map(add,inp)
print(add)
print(list(output))
print(list(add))