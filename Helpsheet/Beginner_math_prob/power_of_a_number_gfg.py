'''
N = 2, R = 2
Output: 4
'''
'''
def power_mod(base, power):
    result = 1
    base = base % 1000000007  # Apply modulo initially to avoid large values

    while power > 0:
        # If power is odd, multiply the current base with result
        if power % 2 == 1:
            result = (result * base) % 1000000007
        # Square the base and reduce the power by half
        base = (base * base) % 1000000007
        power //= 2

    return result

'''

def power_mod(base,power):
    result=1
    base=base%1000000007
    if power==0:
        return '1'
    while power!=0:
        if power%2!=0:
            result=(result*base)%1000000007
        base=(base*base)%1000000007
        power//=2
    return result
'''
def power_mod(base,power):
    return pow(base,power,1000000007)
'''
print(power_mod(12,21))
