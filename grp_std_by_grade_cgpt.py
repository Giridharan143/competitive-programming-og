def grade(st,gr):
    grade={}
    for i in range(len(st)):
        stu=st[i]
        grad=gr[i]
        if grad in grade:
            grade[grad].append(stu)
        else:
            grade[grad]=[stu]
    print(grade)

students = ["Alice", "Bob", "Charlie", "David", "Eve"]
grades = ["A", "B", "A", "C", "B"]
grade(students,grades)