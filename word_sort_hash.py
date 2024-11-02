def word_count(words_arr):
    store_value={}
    store_index={}
    for pos,val in enumerate(words_arr):
        if val in store_value:
            store_value[val]+=1
            store_index[val].append(pos)
        else:
            store_value[val]=1
            store_index[val]=[pos]
    print(store_value)
    return(store_index)
    '''
def word_count(words_arr):
    store_value = {}
    store_index = {}
    
    for pos, val in enumerate(words_arr):
        # Update word count in store_value
        if val in store_value:
            store_value[val] += 1
            store_index[val].append(pos)  # Append the position to the existing list
        else:
            store_value[val] = 1
            store_index[val] = [pos]  # Initialize a list with the first position

    print("Word counts:", store_value)
    return store_index

words = ["apple", "banana", "apple", "orange", "banana", "apple"]
print("Word indices:", word_count(words))

    '''


words = ["apple", "banana", "apple", "orange", "banana", "apple"]
print(word_count(words))