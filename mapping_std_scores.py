'''
def score(std,scr):
    calci={}
    for i in range(len(std)):
        calci[std[i]]=scr[i]
    print(calci)

students = ["Alice", "Bob", "Charlie"]
scores = [85, 90, 78]
score(students,scores)
'''
'''
def combine(it,pr):
    combine={}
    for i in range(len(it)):
        combine[it[i]]=pr[i]
    print(combine)


items = ["apple", "banana", "milk", "bread"]
prices = [0.99, 0.5, 1.99, 2.5]
combine(items,prices)
'''


def count_votes(vt):
    votes={}
    for word in vt:
        if word in votes:
            votes[word]+=1
        else:
            votes[word]=1
    return votes


votes = ["Alice", "Bob", "Alice", "Charlie", "Alice", "Bob", "Charlie", "Charlie"]
print(count_votes(votes))