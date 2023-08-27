# 추상 클래스

from abc import *  # *은 전부 다!
from abc import ABC, abstractmethod  # *로 가져오기 보다는 정확하게 선택해서 가져오는 게 더 좋다


class Animal(metaclass=ABCMeta):
    @abstractmethod
    def eat(self):
        pass


class Dog(ABC, Animal):  # 다중 상속이 가능!
    @abstractmethod
    def walk(self):
        pass

    def eat(self):
        print("우걱우걱")


class Golden(Dog):
    def walk(self):
        print("터벅터벅")

g1 = Golden()
g1.eat()

d1 = Dog()
d1.eat()

a1 = Animal()
a1.eat()

# 인터페이스 왜 없어??
# 다중 상속이 가능하다. -> 인터페이스가 필요없다.
