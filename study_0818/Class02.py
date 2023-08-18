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

a = [num for num in range(2, 101) if all(num % i != 0 for i in range(2, num))]
print("100 이하의 소수 : ", a)

# all 함수, any 함수
# 여러 개의 조건 or 값이 있는 리스트, 튜플, set... 값의 조건에 따라 True or False 리턴하는 함수

# all함수 : 모든 값이 True일 때, True
# any함수 : 하나라도 True면 True를 리턴한다

number = [i + 1 for i in range(10)]  # 1...10
lst = [x for x in number if x % 2 == 0]

# all
res = all(x % 2 == 0 for x in number)
print(res)
res = all(x % 2 == 0 for x in lst)
print(res)

# any
res = any(x == 5 for x in number)
print(res)
res = any(x == 5 for x in lst)
print(res)

a = [x for x in range(2, 101) if all(x % i != 0 for i in range(2, x))]
print("100 이하의 소수 : ", a)