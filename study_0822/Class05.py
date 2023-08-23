# 음식 (추상클래스) - 피자, 햄버거, 김밥

from abc import *

class Food(metaclass=ABCMeta):
    def __init__(self, name, price):
        self._name = name
        self._price = price

    def get_name(self):
        return self._name
    def get_price(self):
        return self._price
    def set_price(self, price):
        self._price = price
    @abstractmethod
    def order(self):
        pass

class Pizza(Food):
    def __init__(self, name, price, crust, *topping):
        super().__init__(name, price)
        self._topping = ", ".join(topping)
        self._crust = crust

    def order(self):
        print("{} 크러스트에 {}을 올린 {} 피자 : {}원 결제해주세요.".format(self._crust, self._topping, super().get_name(), super().get_price()))

pizza1 = Pizza("콤비네이션", 27900, "치즈", "페퍼로니", "미트볼")
pizza1.order()

class Hamburger(Food):
    def __init__(self, name, price):
        super().__init__(name, price)
    def order(self):
        self._cola = str(input("콜라도 같이 주문하시겠습니까? : "))
        if self._cola == "yes":
            super().set_price(super().get_price()+1500)
            print("총 결제 금액은 {}원 입니다.".format(super().get_price()))

burger1 = Hamburger("치즈버거", 2100)
burger1.order()

class Kimbap(Food):
    def __init__(self, name, price, type):
        super().__init__(name, price)
        self._type = type
    def order(self):
        count = int(input("몇 개 주문하시겠습니까? : "))
        super().set_price(super().get_price()*count)
        print("{}김밥 {}줄 주문하셨어요. {}원입니다.".format(self._type, count, super().get_price()))

kimbap1 = Kimbap("김밥", 2100, "야채")
kimbap1.order()