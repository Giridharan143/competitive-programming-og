# def recursion(n):
#     if n==1:
#         return 1
#     return n* recursion(n-1)
# def addition(num):
#     if num==0:
#         return 0
#     else:
#         return num+addition(num-1)
    
# def fibonacci(num):
#     if num==0:
#         return 0
#     elif num==1:
#         return 1
#     else:
#         # return fibonacci(num-1)+fibonacci(num-2)
#         fun = fibonacci(num-1)+fibonacci(num-2)
#         # print(fun)
#         return fun
# # def fibonaccii(num, memo={}):
# #     if num in memo:  # Check if result is already computed
# #         return memo[num]
# #     if num == 0:
# #         return 0
# #     elif num == 1:
# #         return 1
# #     else:
# #         # Store the computed result in the memo dictionary
# #         memo[num] = fibonaccii(num - 1, memo) + fibonaccii(num - 2, memo)
# #         return memo[num]

# # # Test the function
# # print(fibonaccii(50))  # Efficient even for large values like 50




# print(fibonacci(5))
# print(addition(5))
# print(recursion(5))



def power(num,pow):
    if pow==0:
        return 1
    else:
        return num*power(num,pow-1)

result = power(2, 4)
print(result)

def patter(num):
    if num==0:
        patter(num)
        return 0
    else:
       return num//patter(num//5)
print(patter(10))