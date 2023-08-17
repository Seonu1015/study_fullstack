# 딕셔너리

# name = input("이름을 입력해주세요 : ")
# age = input("나이를 입력해주세요 : ")
# phone = input("연락처를 입력해주세요 : ")
# info = dict(name=name, age=age, phone=phone)
# print(info)
#
# lst = []
# for i in range(2):
#     name = input("이름을 입력해주세요 : ")
#     age = input("나이를 입력해주세요 : ")
#     phone = input("연락처를 입력해주세요 : ")
#     info = dict(name=name, age=age, phone=phone)
#     lst.append(info)
# print(lst)

# lst = [] <- 수정 필요함!!!
# while True:
#     name = input("이름을 입력해주세요 : ")
#     age = int(input("나이를 입력해주세요 : "))
#     phone = input("연락처를 입력해주세요 : ")
#
#     if age = 0:
#         break
#
#     dic = {"name": name, "age": age, "phone": phone}
#     lst.append(dic)
# print(lst)


# 세트

# s = {1, 2, 3} # 세트는 중복된 값을 넣을 수 없다.
# s.add(3)
# print(s)

# 사람 3명이 각각 먹고 싶은 여러 개 음식이 있다. 어떤 메뉴를 시키는 게 가장 좋을지 (교집합)
# person1 = {"피자", "파스타", "삼겹살", "우동", "떡볶이", "냉면"}
# person2 = {"김밥", "라면", "우동", "떡볶이", "짜장면", "김치찌개"}
# person3 = {"짜장면", "떡볶이", "라면", "우동", "초밥", "냉면"}
# # order = person1 & person2 & person3
# order = set.intersection(person1, person2, person3)
# print(order)

# 리스트에서 공통된 요소를 찾아보자 <- 숙제

person1 = ["치킨", "피자", "족발", "삼겹살"]
person2 = ["김밥", "김치찌개", "삼겹살", "떡볶이"]
person3 = ["치킨", "김치찌개", "떡볶이", "초밥", "삼겹살", "족발", "햄버거", "보쌈", "한우", "아이스크림"]

lst =[]
for i in range(len(person1)):
    for j in range(len(person2)):
        if person1[i] == person2[j]:
            lst.append(person1[i])
lst = set(lst)
print(lst)

x, y = input("비교할 두 사람을 선택하세요 (person1, person2, person3)")
lst =[]
for i in range(len(x)):
    for j in range(len(y)):
        if x[i] == y[j]:
            lst.append(x[i])
lst = set(lst)
print(lst)

# 사람 3명이 각각 음식을 여러 개 가지고 있다고 할 때, 두 명이 서로 음식을 교환해보자 (이미 갖고 있는 음식에 대한 교환 X)

person1 = ["치킨", "피자", "족발", "삼겹살"]
person2 = ["김밥", "김치찌개", "삼겹살", "떡볶이"]
person3 = ["치킨", "김치찌개", "떡볶이", "초밥", "삼겹살", "족발", "햄버거", "보쌈", "한우", "아이스크림"]
menu1 = set(person1)
menu2 = set(person2)
menu3 = set(person3)

while True:
    inputSet = int(input("1. 교환하기, 2. 종료하기"))

    if inputSet == 1:
        inputSet = int(input("누구와 교환하시겠습니까? 2.person2, 3.person3"))
        if inputSet == 2:
            print(menu1)
            print(menu2)
            myFood = input("어떤 음식을 교환하시겠습니까? ")
            yourFood = input("어떤 음식으로 교환받으시겠습니까?")

            if yourFood in menu1 or myFood in menu2:
                print("이미 갖고 있는 음식입니다. 다른 음식을 고르세요")
            elif not(yourFood in menu1 or myFood in menu2) and myFood in menu1 and yourFood in menu2:
                menu1.remove(myFood)
                menu2.add(myFood)
                menu2.remove(yourFood)
                menu1.add(yourFood)
            else:
                print("잘못된 입력입니다. 다시 입력하세요.")
            print(menu1)
            print(menu2)

        elif inputSet == 3:
            exchange1 = menu1 - menu3
            exchange2 = menu3 - menu1
            food1 = exchange1.pop()
            food2 = exchange2.pop()
            menu1.remove(food1)
            menu3.add(food1)
            menu3.remove(food2)
            menu1.add(food2)
        else:
            print("잘못된 입력입니다. 다시 입력하세요.")

    elif inputSet == 2:
        break
    else:
        print("잘못된 입력입니다. 다시 입력하세요.")

print(menu1)
print(menu2)
print(menu3)