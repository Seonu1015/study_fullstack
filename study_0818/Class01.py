# 리스트에서 공통된 요소를 찾아보자

person1 = ["치킨", "김치찌개", "족발", "삼겹살"]
person2 = ["김밥", "보쌈", "삼겹살", "초밥"]
person3 = ["치킨", "김치찌개", "떡볶이", "초밥", "삼겹살", "족발", "햄버거", "보쌈", "한우", "아이스크림"]

for i in person1:
    if i in person2 and i in person3:
        print("공통 음식 : ", i)

for i in person1:
    for j in person2:
        if i == j:
            for k in person3:
                if i == k:
                    print("공통 음식 : ", i)

for i in person1:
    if len(person2) < len(person3):
        for j in person2:
            if i == j:
                for k in person3:
                    if i == k:
                        print("공통 음식 : ", i)
    else:
        for j in person3:
            if i == j:
                for k in person2:
                    if i == k:
                        print("공통 음식 : ", i)

# 두 개의 리스트 곱하기
a = [[10, 20], [30, 40], [50, 60]]
b = [[2, 3], [4, 5], [6, 7]]

lst = []
for i in range(len(a)):
    temp = []
    for j in range(len(a[i])):
        temp.append(a[i][j] * b[i][j])
    lst.append(temp)
print(lst)

# [[1,2],[3,4],[5,6]] 리스트 컴프리헨션으로 만들기
a = [[2 * i + j + 1 for j in range(2)] for i in range(3)]
print(a)

# 2차원 10X10 리스트 0으로 채우기 리스트 컴프리헨션으로 만들기
a = [[0 for i in range(10)] for j in range(10)]
print(a)

# 100 이하의 소수(약수가 1과 자기자신)로 이루어진 1차원 리스트 컴프리헨션으로 만들기
a = []
for num in range(2, 101):
    isPrime = True
    for i in range(2, num):
        if num % i == 0:
            isPrime = False
            break
    if isPrime:
        a.append(num)
print("100 이하의 소수 : ", a)