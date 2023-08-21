class Dog:
    def __init__(self, name, color): # 생성자
        self.hungry = 0
        self.name = name
        self.color = color
    def eat(self): # 메서드1
        self.hungry -= 10
        print("밥먹음", self.hungry)
    def walk(self): # 메서드2
        self.hungry += 10
        print("산책", self.hungry)

choco = Dog("choco", "black") # 객체 생성
jjong = Dog("jjong", "white")

choco.eat()
choco.eat()
choco.walk()
print(choco.hungry)
print(jjong.hungry)