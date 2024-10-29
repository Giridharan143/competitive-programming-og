class caeser:
    def encrypt(self, text, shift):
        enc_text = []
        for char in text:
            if char.isalpha():
                # Determine if char is uppercase or lowercase for ASCII calculations
                base = ord('A') if char.isupper() else ord('a')
                # Shift character and wrap within alphabet bounds
                out = chr((ord(char) - base + shift) % 26 + base)
                enc_text.append(out)
            else:
                # Append non-alphabet characters unchanged
                enc_text.append(char)
        # Join all characters in enc_text to form the encrypted string
        return ''.join(enc_text)
    '''def encrypt(self,text,shift):
        enc_text=[]
        for char in text:
            if char.isalpha():
                base = ord('A') if char.isupper() else ord('a')
                out=chr((ord(char)-base+shift)%26+base)
                enc_text.append(out)                
            else:
                return enc_text.append(char)
        return ''.join(enc_text)
'''
    def decrypt(self,text,shift):
        return self.encrypt(text,26-shift)

print("kindly enter the string to be encryted: ")
string_inp=input("")
shift = 3
cs = caeser()
enc_text=cs.encrypt(string_inp,shift)
print(enc_text)
print(cs.decrypt(enc_text,shift))