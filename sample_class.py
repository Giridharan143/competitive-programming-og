print ("hello\nnice to meet you\n")
class name:
    def uppercase(self,text):
        txt = text.upper()
        return txt

    def lowercase(self,text):
        txt=text.lower()
        return txt

namer = name()
input_name = input("")
print("If you want to change your case to upper give 0 and if you want to change your case to lower give input as 1")
case=int(input(""))
if(case==0):
    print(namer.uppercase(input_name))
if(case==1):
    print(namer.lowercase(input_name))

