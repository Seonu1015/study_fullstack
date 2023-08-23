# 음식 (추상클래스) - 피자, 햄버거, 김밥
# 매개변수에 리스트를 넣을 수도, 가변인수로 여러개를 넣을 수도 있는 경우까지 만들어보자 <- Pizza에서 만드는 중
# 숙제1 - topping, addTopping() -> 리스트, 값 여러개, 값 하나
# hw02에 강사님이 작성한 코드 일부가 있음

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
        self._crust = crust
        self._topping = topping
        self.set_topping()

    def get_topping(self):
        return self._topping

    def set_topping(self):
        while type(self._topping) == list:
            self._topping += self._topping

    def add_topping(self, *toppingadd):
        if type(toppingadd) == list:
            self._topping += ", " + ", ".join(toppingadd)
        elif type(toppingadd) == str:
            self._topping += ", " + toppingadd
    def order(self):
        print("{} 크러스트에 토핑은 {}인 {} 피자 : {}원 결제해주세요.".format(self._crust, self.get_topping(), super().get_name(), super().get_price()))

pizza1 = Pizza("콤비네이션", 27900, "치즈", ["페퍼로니", "미트볼"])
pizza1.order()
# pizza1.add_topping("포테이토", "치킨")
# pizza1.order()
# pizza1.add_topping(["피망", "올리브"])
# pizza1.order()
# pizza1.add_topping("양파 듬뿍")
# pizza1.order()

class Hamburger(Food):
    def __init__(self, name, price, side):
        super().__init__(name, price)
        self._side = side
    def order(self):
        if self._side == "콜라":
            super().set_price(super().get_price()+1500)
            print("{}에 {}를 추가하셨습니다. 총 결제 금액은 {}원 입니다.".format(super().get_name(), self._side, super().get_price()))
        elif self._side == "감자튀김":
            super().set_price(super().get_price() + 800)
            print("{}에 {}를 추가하셨습니다. 총 결제 금액은 {}원 입니다.".format(super().get_name(), self._side, super().get_price()))
        elif self._side == "너겟":
            super().set_price(super().get_price() + 1200)
            print("{}에 {}를 추가하셨습니다. 총 결제 금액은 {}원 입니다.".format(super().get_name(), self._side, super().get_price()))

# burger1 = Hamburger("치즈버거", 2100, "콜라")
# burger1.order()

class Kimbap(Food):
    def __init__(self, name, price, type):
        super().__init__(name, price)
        self._type = type
    def order(self):
        count = int(input("몇 개 주문하시겠습니까? : "))
        super().set_price(super().get_price()*count)
        print("{}김밥 {}줄 주문하셨어요. {}원입니다.".format(self._type, count, super().get_price()))

# kimbap1 = Kimbap("김밥", 2100, "야채")
# kimbap1.order()