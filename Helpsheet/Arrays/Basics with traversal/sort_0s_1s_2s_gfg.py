'''
Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
'''

def sort0s1s2s(num):
    zero=0;one=0;two=len(num)-1
    while one<=two:
        if num[one]==0:
            num[zero],num[one]=num[one],num[zero]
            zero+=1;one+=1
        elif num[one]==1:
            one+=1;
        elif num[one]==2:
            num[one],num[two]=num[two],num[one]
            two-=1
    return num

'''
class Solution:
    # Function to sort an array of 0s, 1s, and 2s
    def sort012(self, num):
        zero = 0
        one = 0
        two = len(num) - 1
        
        # Loop until the `one` pointer crosses the `two` pointer
        while one <= two:
            if num[one] == 0:
                # If the number is 0, swap it with the zero index, and move both `zero` and `one` pointers
                num[zero], num[one] = num[one], num[zero]
                zero += 1
                one += 1
            elif num[one] == 1:
                # If the number is 1, no swapping is needed. Just move the `one` pointer.
                one += 1
            elif num[one] == 2:
                # If the number is 2, swap it with the `two` pointer and move `two` pointer backward.
                # But don't move `one` pointer yet because we need to check the element we swapped.
                num[one], num[two] = num[two], num[one]
                two -= 1
            
            print(num)  # To see the array after each step for debugging

        return num


'''

arr= [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
print(sort0s1s2s(arr))


