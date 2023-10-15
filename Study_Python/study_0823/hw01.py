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
        self._topping = []
        for i in topping:
            if type(i) == list:  # isinstance(i, list) 로 작성할 수도 있다.
                self._topping += i
            elif type(i) == str:  # 만약 토핑에 "a, b"라고 입력했을 경우도 추가
                topping_str = i.split(',')
                for j in topping_str:
                    self._topping.append(j)
            else:
                self._topping.append(i)

    def add_topping(self, *toppingadd):
        for i in toppingadd:
            if type(i) == list:
                self._topping += i
            else:
                self._topping.append(i)

    def order(self):
        print("{} 크러스트에 토핑은 {}인 {} 피자 : {}원 결제해주세요.".format(self._crust, ", ".join(self._topping), super().get_name(),
                                                            super().get_price()))


pizza1 = Pizza("콤비네이션", 27900, "치즈", ["페퍼로니", "미트볼"], ['hvhgg'], "saf,adsf")
pizza1.order()
pizza1.add_topping("포테이토", "치킨")
pizza1.order()
pizza1.add_topping(["피망", "올리브"])
pizza1.order()
pizza1.add_topping("양파 듬뿍")
pizza1.order()


class Hamburger(Food):

    def __init__(self, name, price):
        super().__init__(name, price)
        self._side = []
        self.side_menu = {
            "콜라": 1500,
            "감자튀김": 800,
            "너겟": 1200,
            "치즈스틱": 1000,
            "어니언링": 1300
        }

    def show_side_menu(self):
        print("사이드 메뉴:")
        for side in self.side_menu.keys():
            print("- " + side)

    def add_side(self, selected_side):
        if selected_side in self.side_menu:
            self._side.append(selected_side)
            print("{}를 추가하셨습니다.".format(selected_side))
        else:
            print("유효하지 않은 사이드 메뉴입니다.")

    def select_side(self):
        while True:
            select = input("사이드 메뉴를 추가하시겠습니까? (추가: 'y', 종료: 'n'): ")
            if select == 'y':
                self.show_side_menu()
                selected_side = input("추가할 사이드 메뉴를 입력하세요: ")
                self.add_side(selected_side)
            elif select == 'n':
                break
            else:
                print("올바른 입력이 아닙니다. 'y' 또는 'n'을 입력하세요.")

    def order(self):
        total_price = super().get_price()
        for side in self._side:
            side_price = self.side_menu[side]
            total_price += side_price
        print("주문 내역:")
        print(f"- 메인 메뉴: {super().get_name()}, 가격: {super().get_price()}원")
        print("- 사이드 메뉴:")
        for side in self._side:
            print(f"  - {side}, 가격: {self.side_menu[side]}원")
        print("총 결제 금액은 {}원 입니다.".format(total_price))


burger1 = Hamburger("치즈버거", 2100)
burger1.select_side()
burger1.order()


class Kimbap(Food):
    def __init__(self, name, price, type):
        super().__init__(name, price)
        self._type = type

    def order(self):
        count = int(input(f"{self._type}{super().get_name()} 몇 개 주문하시겠습니까? : "))
        super().set_price(super().get_price() * count)
        print(f"{self._type}{super().get_name()} {count}개 주문하셨어요. {super().get_price()}원입니다.")


kimbap1 = Kimbap("김밥", 2100, "야채")
kimbap1.order()
