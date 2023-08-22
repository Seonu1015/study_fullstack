class Student:

    def __init__(self, name, studentNumber, grade):
        self._name = name
        self._studentNumber = studentNumber
        self._grade = grade

    def get_name(self):
        return self._name

    def get_grade(self):
        return self._grade

    def studentInfo(self):
        print("이름 : {}, 학년 : {}, 학번 : {}".format(self._name, self._grade, self._studentNumber))


class Student20(Student):
    gradeNumber = 20
    majorNumber = 10
    number = 1

    def __init__(self):
        super().__init__("학생", (Student20.gradeNumber * 100000) + (Student20.majorNumber * 1000) + Student20.number, 4)
        self._student = Student20.number
        Student20.number += 1

    def studentInfo(self):
        super().studentInfo()


class Student21(Student):
    gradeNumber = 21
    majorNumber = 10
    number = 1

    def __init__(self):
        super().__init__("학생", (Student21.gradeNumber * 100000) + (Student21.majorNumber * 1000) + Student21.number, 4)
        self._student = Student20.number
        Student21.number += 1

    def studentInfo(self):
        super().studentInfo()


class Student22(Student):
    gradeNumber = 22
    majorNumber = 10
    number = 1

    def __init__(self):
        super().__init__("학생", (Student22.gradeNumber * 100000) + (Student22.majorNumber * 1000) + Student22.number, 4)
        self._student = Student20.number
        Student22.number += 1

    def studentInfo(self):
        super().studentInfo()


class Student23(Student):
    gradeNumber = 23
    number = 1
    zero = "000"

    def __init__(self):
        super().__init__("학생", str(Student23.gradeNumber) + "0" + str(Student23.number), 4)
        self._student = Student20.number
        Student23.number += 1

    def zeroSet(self, number):
        num = self._student
        if num / 10 > 0:
            Student23.zero = Student23.zero[:len(Student23.zero) - 1]
            num /= 10
        return Student23.zero

    def studentInfo(self):
        super().studentInfo()


print(str(Student23.gradeNumber))

stud1 = Student20()
stud2 = Student20()
stud3 = Student20()
stud4 = Student20()
stud5 = Student21()
stud6 = Student21()
stud7 = Student21()
stud8 = Student21()
stud9 = Student23()
stud10 = Student23()
stud11 = Student23()
stud12 = Student23()

stud1.studentInfo()
stud2.studentInfo()
stud3.studentInfo()
stud4.studentInfo()
stud5.studentInfo()
stud6.studentInfo()
stud7.studentInfo()
stud8.studentInfo()

stud9.studentInfo()
stud10.studentInfo()
stud11.studentInfo()
stud12.studentInfo()
