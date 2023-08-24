# Account - (AtmAccount, BankAccount, CreditAccount)
# Atm = 현금 입출금
# Bank = 예금 이자 (최저 금액 이상일 때, 이자 발생)
# Credit = 결제 (한도 초과)

class Account:
    def __init__(self, account_num="123-05-456789", balance=0):
        self._accountNum = account_num
        self._balance = balance

    def get_account_num(self):
        return self._accountNum

    def get_balance(self):
        return self._balance

    def set_balance(self, amount):
        self._balance += amount

    def deposit(self):
        amount = int(input("얼마를 입금하시겠습니까? : "))
        if amount < 0:
            print("잘못된 입력입니다.")
            return
        self._balance += amount

    def withdraw(self):
        amount = int(input("얼마를 출금하시겠습니까? : "))
        if amount < 0:
            print("잘못된 입력입니다.")
            return
        elif amount > self._balance:
            print("잔액이 부족합니다.")
            return
        self._balance -= amount


# acc1 = Account(balance=1000)
# acc1.deposit()
# print(acc1.get_balance())
# acc1.withdraw()
# print(acc1.get_balance())


class AtmAccount(Account):
    def __init__(self, account_num="145-59-145896", balance=100000):
        super().__init__(account_num, balance)

    # cash를 통화별로 리스트? 딕셔너리? 로 설정해서 하면 메서드들이 더 깔끔해질 수 있을지도?

    def deposit(self):
        print("얼마를 입금하시겠습니까?")
        a = int(input("5만원권 : "))
        b = int(input("1만원권 : "))
        amount = a * 50000 + b * 10000
        super().set_balance(amount)

    def withdraw(self):
        amount = int(input("얼마를 출금하시겠습니까? : "))
        if amount > super().get_balance():
            print("잔액이 부족합니다.")
            return
        if amount % 10000 > 0:
            print("만원 단위로만 출금이 가능합니다.")
            return
        print("출금하려는 지폐 단위를 선택해주세요.")
        select = int(input("1. 5만원권 최대한 많이 | 2. 5만원권 선택, 나머지 만원권 | 3. 1만원권만 :"))
        if select == 1:
            print("5만원권 : {}장, 1만원권 : {}장".format((amount // 50000), ((amount - ((amount // 50000) * 50000)) // 10000)))
        elif select == 2:
            count = int(input("5만원권을 몇장 선택하시겠습니까? : "))
            if count * 50000 > amount:
                print("출금하려는 금액보다 많이 선택하셨습니다.")
            else:
                print("5만원권 : {}장, 1만원권 : {}장".format(count, (amount - (count * 50000)) // 10000))
        else:
            print("1만원권 : {}장".format((amount // 10000)))
        super().set_balance(-amount)


acc2 = AtmAccount("124-74-584567", 1000000)
print(acc2.get_account_num())
print(acc2.get_balance())
acc2.deposit()
print(acc2.get_balance())
acc2.withdraw()
acc2.withdraw()
acc2.withdraw()
print(acc2.get_balance())


class BankAccount(Account):
    def __init__(self, account_num="145-59-145896", balance=100000):
        super().__init__(account_num, balance)

    def interest_month(self):
        if super().get_balance() < 1000000:
            print("거치금 100만원 이상부터 이자가 지급됩니다.")
            return
        month = int(input("원금을 거치할 기간을 입력해주세요. (월단위) : "))
        interest_rate = 0.0027
        interest = int(super().get_balance() * interest_rate * month / 12)
        print("현재 매월 {}원의 이자가 발생합니다.".format(interest))


print("==================================")
acc3 = BankAccount(balance=500000)
print(acc3.get_account_num())
print(acc3.get_balance())
acc3.interest_month()

acc4 = BankAccount(balance=5000000)
print(acc4.get_account_num())
print(acc4.get_balance())
acc4.interest_month()


class CreditAccount(Account):
    total_payment = 0

    def __init__(self, account_num="145-26-145896", balance=100000):
        super().__init__(account_num, balance)

    def payment(self, amount_payment):
        if CreditAccount.total_payment + amount_payment > 500000: # 다음 달에 리밋을 다시 불러오려면 변수로 작성하는게 좋다
            print("결제 한도가 초과되었습니다. 승인이 취소됩니다.")
            return
        else:
            print("{}원이 결제되었습니다.".format(amount_payment))
            print("다음 달 결제 예정 금액 : {}원".format(CreditAccount.total_payment + amount_payment))
            CreditAccount.total_payment += amount_payment


print("==================================")
acc5 = CreditAccount()
print(acc5.get_account_num())
print(acc5.get_balance())
acc5.payment(340000)
acc5.payment(90000)
acc5.payment(120000)
