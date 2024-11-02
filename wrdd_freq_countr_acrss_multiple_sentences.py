def wrd_frq(word_arr):
    char_map={}
    for sentences in word_arr:  
        words=sentences.split()
        for word in words:
            if word in char_map:
                char_map[word]+=1
            else:
                char_map[word]=1
    print(char_map)


sentences = ["hello world", "hello everyone", "world of coding", "hello coding world"]
wrd_frq(sentences)