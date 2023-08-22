class Student:

    def __init__(self, name="학생", studentNumber="123456", grade=0):
        # 자바랑 달리 파이썬은 오버로딩을 쓸 수 없어서 키워드인자를 이용해서 작업할 수 있다.
        self._name = name
        self._studentNumber = studentNumber
        self._grade = grade

    def get_name(self):
        return self._name

    def get_grade(self):
        return self._grade

    def studentInfo(self):
        print("이름 : {}, 학년 : {}, 학번 : {}".format(self._name, self._grade, self._studentNumber))


stud1 = Student(name="우리")
stud1.studentInfo()


class Student20(Student):
    gradeNumber = 20
    number = 1
    zero = "000"

    def __init__(self):
        super().__init__("학생", str(Student20.gradeNumber) + self.zeroSet() + str(Student20.number), 4)
        Student20.number += 1

    def zeroSet(self):
        num = Student20.number
        if num // 10 > 0:
            Student20.zero = Student20.zero[:len(Student20.zero) - 1]
            num //= 10
        return Student20.zero

    def studentInfo(self):
        super().studentInfo()


class Student21(Student):
    gradeNumber = 21
    number = 1
    zero = "000"

    def __init__(self):
        super().__init__("학생", str(Student21.gradeNumber) + self.zeroSet() + str(Student21.number), 4)
        Student21.number += 1

    def zeroSet(self):
        num = Student21.number
        if num // 10 > 0:
            Student21.zero = Student21.zero[:len(Student21.zero) - 1]
            num //= 10
        return Student21.zero

    def studentInfo(self):
        super().studentInfo()


class Student22(Student):
    gradeNumber = 22
    number = 1
    zero = "000"

    def __init__(self):
        super().__init__("학생", str(Student22.gradeNumber) + self.zeroSet() + str(Student22.number), 4)
        Student22.number += 1

    def zeroSet(self):
        num = Student22.number
        if num // 10 > 0:
            Student22.zero = Student22.zero[:len(Student22.zero) - 1]
            num //= 10
        return Student22.zero

    def studentInfo(self):
        super().studentInfo()


class Student23(Student):
    gradeNumber = 23
    number = 1
    zero = "000"

    def __init__(self):
        super().__init__("학생", str(Student23.gradeNumber) + self.zeroSet() + str(Student23.number), 4)
        Student23.number += 1

    def zeroSet(self):
        num = Student23.number
        if num // 10 > 0:
            Student23.zero = Student23.zero[:len(Student23.zero) - 1]
            num //= 10
        return Student23.zero

    def studentInfo(self):
        super().studentInfo()


# ArrayList < Student20 > student20 = new ArrayList <> ();
# for (int i = 0; i < 10; i++) {
#     student20.add(new Student20());
#     }
# System.out.println(student20.size());
# for (int i =0; i < student20.size(); i++) {
#     System.out.println(student20.get(i));
#     }

student = []
for i in range(4):
    student.append(Student20())
print(len(student))

for i in student:
    i.studentInfo()

# stud1 = Student20()
# stud2 = Student20()
# stud3 = Student20()
# stud4 = Student20()
stud5 = Student21()
stud6 = Student21()
stud7 = Student21()
stud8 = Student21()
stud9 = Student23()
stud10 = Student23()
stud11 = Student23()
stud12 = Student23()

# stud1.studentInfo()
# stud2.studentInfo()
# stud3.studentInfo()
# stud4.studentInfo()
stud5.studentInfo()
stud6.studentInfo()
stud7.studentInfo()
stud8.studentInfo()
stud9.studentInfo()
stud10.studentInfo()
stud11.studentInfo()
stud12.studentInfo()
