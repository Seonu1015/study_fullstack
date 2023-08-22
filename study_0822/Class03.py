# Account - (AtmAccount, BankAccount, CreditAccount)
# Atm = 현금 입출금
# Bank = 예금 이자 (최저 금액 이상일 때, 이자 발생)
# Credit = 결제 (한도 초과)

class Account:
    def __init__(self, accountNum="123-05-456789", balance=0):
        self._accountNum = accountNum
        self._balance = balance

    def get_accountNum(self):
        return self._accountNum

    def get_balance(self):
        return self._balance

    def deposit(self, amount):
        if amount < 0:
            print("잘못된 입력입니다.")
            return
        self._balance += amount

    def withdraw(self, amount):
        if amount < 0:
            print("잘못된 입력입니다.")
            return
        elif amount > self._balance:
            print("잔액이 부족합니다.")
            return
        self._balance -= amount


acc1 = Account(balance=1000)
acc1.deposit(500)
acc1.deposit(-500)
print(acc1.get_balance())
acc1.withdraw(-500)
acc1.withdraw(3000)
acc1.withdraw(700)
print(acc1.get_balance())


class AtmAccount(Account):
    # 출금할 때 지폐 어떻게 뽑을지 내용 추가
    def __init__(self):
        super().__init__("123-01-456789", 1000000)


    def deposit(self, amount):
        if amount % 10000 > 0:
            print("만원 단위로만 입금이 가능합니다.")
        super().deposit(amount)

    def withdraw(self, amount):
        if amount % 10000 > 0:
            print("만원 단위로만 출금이 가능합니다.")
            return
        print("출금하려는 지폐 단위를 선택해주세요.")
        select = int(input("1. 5만원권+1만원권 | 2. 1만원권만 : "))
        a = amount // 50000
        b = (amount - ((amount // 50000) * 50000)) // 10000
        c = amount // 10000
        if select == 1:
            print("5만원권 : {}장, 1만원권 : {}장".format(a, b))
        else:
            print("1만원권 : {}장".format(c))
        super().withdraw(amount)


acc2 = AtmAccount(balance=1000000)
print(acc2.get_balance())
acc2.deposit(1000000)
print(acc2.get_balance())
acc2.withdraw(230000)
print(acc2.get_balance())


class BankAccount(Account):
    def __init__(self):
        super().__init__()
    def interest(self):


class CreditAccount(Account):
    def __init__(self):
        super().__init__()
