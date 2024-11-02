def char_freq(word_arr):
    char_freq={}
    #cha_idx={}
    for word in word_arr:
        for char in word:
            if char in char_freq:
                char_freq[char]+=1                
            else:
                char_freq[char]=1
    print(char_freq, end='')
'''
def char_freq(word_arr):
    char_freq = {}
    for word in word_arr:      # Iterate through each word in the list
        for char in word:       # Iterate through each character in the word
            if char in char_freq:
                char_freq[char] += 1
            else:
                char_freq[char] = 1
    print(char_freq)

sent = ['hello', 'love']
char_freq(sent)


'''

sent=['hello','love','hssnis']
char_freq(sent)






