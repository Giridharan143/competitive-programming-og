def getLastDigit(a1, b1):
    a,b=int(a1),int(b1)
    if b==0:
        return "1"  
    last_digit=a % 10
    cycle=[last_digit]
    while True:
        next_digit=(cycle[-1]*last_digit)%10
        #if next_digit!=last_digit:
        if(next_digit==last_digit):
            break
        cycle.append(next_digit) 
    
    #print(len(cycle))
    idx=((b-1)%len(cycle))
    #print(idx)
    print(cycle[idx])
#print(getLastDigit('3','10'))
print("Enter The base value: ");a=int(input());print("Enter the Power value:");b=int(input())
getLastDigit(a,b)