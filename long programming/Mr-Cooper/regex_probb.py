def withdict(str):
    string=[]
    dict={'[':']','(':')'}
    for char in str:
        if char in '[(':
            string.append(char)
        elif char==')' and string[-1]==dict[char]:
            string.pop()
        elif char==']' and string[-1]==dict[char]:
            string.pop()
        else:
            return False
    return True

def is_valid(str):
    compare={'[':']','(':')'}
    string=[]
    for char in str:
        if char=='[' or char=='(':
            string.append(char)
        elif char==')':
            if string[-1]=='(':
                string.pop()
            else:
                return False
        elif char==']':
            if string[-1]=='[':
                string.pop()
            else:
                return False
    if not string :return True 

a = "[(][()()]"

# Call the function and print result
result = is_valid(a)
print(result)


print(withdict(a))
