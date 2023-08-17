# 딕셔너리

name = input("이름을 입력해주세요 : ")
age = input("나이를 입력해주세요 : ")
phone = input("연락처를 입력해주세요 : ")
info = dict(name=name, age=age, phone=phone)
print(info)

lst = []
for i in range(2):
    name = input("이름을 입력해주세요 : ")
    age = input("나이를 입력해주세요 : ")
    phone = input("연락처를 입력해주세요 : ")
    info = dict(name=name, age=age, phone=phone)
    lst.append(info)
print(lst)

lst = []
while True:
    name = input("이름을 입력해주세요 : ")
    age = int(input("나이를 입력해주세요 : "))
    phone = input("연락처를 입력해주세요 : ")

    if age = 0:
        break

    dic = {"name": name, "age": age, "phone": phone}
    lst.append(dic)
print(lst)

# 세트

