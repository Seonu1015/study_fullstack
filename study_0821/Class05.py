class Car:
    car_count = 0
    def __init__(self, name, cc, year):
        self._name = name
        self._cc = cc
        self._year = year
        Car.car_count += 1
    def get_name(self, name):
        return name
    def set_name(self, name):
        self._name = name
    def set_cc(self, cc):
        self._cc = cc
    def set_year(self, year):
        self._year = year
    def printCC(self):
        if self._cc < 1000:
            print(self._name, "(소형)")
        elif self._cc < 2000:
            print(self._name, "(중형)")
        else:
            print(self._name, "(대형)")
    def carCount(self):
        print("총 등록된 차량개수 : ", Car.car_count)

a = Car("a", 900, 1994)
b = Car("b", 1700, 2007)
c = Car("c", 2300, 2018)

a.set_name("d")
a.printCC()
b.printCC()
c.carCount()