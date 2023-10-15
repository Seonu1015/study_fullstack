class Person:
    def __init__(self, name, age):
        self._name = name
        self._age = age

    def get_name(self):
        return self._name

    def get_age(self):
        return self._age

    def sayHello(self):
        print("Hello, my name is", self._name, "i'm", self._age, "years old.")


class Dog:

    def __init__(self, name, age):
        self._name = name
        self._age = age

    def get_name(self):
        return self._name

    def set_name(self, name):
        self._name = name

    def get_age(self):
        return self._age

    def set_age(self, age):
        self._age = age

    def sayHello(self):
        print("멍멍 :", self._name, ", 왈왈 :", self._age)

    def ageCal(self):
        print("사람 나이로 환산하면", (24 + (self._age - 2) * 4), "세 입니다.")

    def compareToAge(self, person):  # 객체를 가져올 때 파이썬은 자료형을 쓰지 않아도 되기 때문에 person만 쓰면 된다.
        return (24 + (self._age - 2) * 4) > person.get_age()

    def printB(self, person):
        # if (24 + (self._age - 2) * 4) > person.get_age():
        if self.compareToAge(person):
            print(self._name, "의 나이가 ", person.get_name(), "의 나이보다 더 많습니다.")
        else:
            print(self._name, "의 나이가 ", person.get_name(), "의 나이보다 더 적습니다.")


choco = Dog("choco", 2)
tom = Person("Tom", 27)

choco.ageCal()
print(choco.compareToAge(tom))
choco.printB(tom)
