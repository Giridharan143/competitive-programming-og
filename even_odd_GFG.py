'''
def oddEven (n):
        str= "even" if n %2 ==0 else "odd"
        return str
n=1
print(oddEven(n))
'''
'''
Input: a = "3", b = "10"
Output: 9
Explanation: 310 = 59049. Last digit is 9.

'''"""
    arr1=int(a);arr2=int(b)
    power=arr1**arr2
    string = str(power)
    return str(power[-1])
    """
    '''
    a1,b1=int(a),int(b)
    power = pow(a1,b1,10)        
    return power

    arr1=int(a);arr2=int(b)
    power=arr1**arr2
    string = str(power)
    return str(power[-1])
'''

def getLastDigit(a, b):
    if b==0:
        return "1"
    
    
    a1,b1=int(a),int(b)
    power = pow(a1,b1,10)        
    return power
print(getLastDigit('3','10'))