def fruit(fruit,color):
    fruits={}
    for i in range(len(fruit)):
        fr=fruit[i]
        clr=color[i]
        if clr in fruits:
            fruits[clr].append(fr)
        else:
            fruits[clr]=[fr]
    print(fruits)


fruits = ["apple", "banana", "grape", "kiwi", "orange", "blueberry", "strawberry"]
colors = ["red", "yellow", "purple", "green", "orange", "blue", "red"]
fruit(fruits,colors)