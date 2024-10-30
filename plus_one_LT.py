class Solution:
    def plusOne(self,digits):
        for i in range(len(digits)-1,-1,-1):
            if digits[i] < 9 :
                digits[i]+=1
                return digits
            else:
                digits[i]=0
      #  return [1]+digits
       
        finalised_arr=[1]
        for i in range(0,len(digits)): # I am using this because to print the 1 with the remaining 9 which has been turned into zero
            finalised_arr.append(digits[i])
        return finalised_arr
       
digits=[9,9,9]
sol=Solution()
print(sol.plusOne(digits))