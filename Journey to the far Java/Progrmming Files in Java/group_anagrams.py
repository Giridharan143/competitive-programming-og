from collections import defaultdict


# def group_anagrams(str):
#     dict = defaultdict(list)

#     for word in str:
#         sorte = ''.join(sorted(word))
#         dict[sorte].append(word)

#     return list(dict.values())

def group_anagrams(str):
    dict = defaultdict(list)
    for word in str:
        sorte = ''.join(sorted(word))
        dict[sorte].append(word)
    return list(dict.values())


strs1 = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(group_anagrams(strs1))