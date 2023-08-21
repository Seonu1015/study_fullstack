example = [[1, 2, 3], [4, [5, 6]], 7, [8, 9]]


def flatten(data):
    temp = []
    for i in range(len(data)):
        if type(data[i]) == list:
            for j in range(len(data[i])):
                if type(data[i][j]) == list:
                    for k in range(len(data[i][j])):
                        temp.append(data[i][j][k])
                else:
                    temp.append(data[i][j])
        else:
            temp.append(data[i])
    print(temp)


flatten(example)  # [1,2,3,4,5,6,7,8,9]


# 람다(lambda)표현식
# 람다는 익명 함수를 생성하는 키워드다. 코드를 짧게 만드는데 사용됨.
# 함수를 만들 때, 간단한 함수를 만든다. 매개변수, return, def.. 과정들이 너무 번거롭기 때문에

# lambda arguments: expression
def add(x, y):
    return x + y


add_lambda = lambda x, y: x + y

# lanbda 람다 키워드
# arguments 매개변수 x, y
# expression 표현식 x + y

print(add(3, 4))
print(add_lambda(3, 4))


# map 함수 - 파이썬 내장 함수
# 주어진 함수를 반복 가능한(iterable) 객체의 각 원소에 적용하고, 결과를 반환한다. <- 리스트 컴프리헨션

# map(function, iterable) -> 원래 객체의 각 원소에 해당 함수를 적용한 결과를 반환한다.

def square(x):
    return x * x


lst = [1, 2, 3, 4, 5]
square_list = map(square, lst)
lst = list(square_list)
print(lst)

lst = [1, 2, 3, 4, 5]
square_list = map(lambda x: x * x, lst)
lst = list(square_list)
print(lst)

a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

for i in range(len(a)):
    if a[i] % 2 == 0:
        a[i] = 0

print(a)


def f(x):
    if x % 2 == 0:
        return 0
    else:
        return x


for i in range(len(a)):
    a[i] = f(a[i])
print(a)

a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(list(map(f, a)))

a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(list(map(lambda x: 0 if x % 2 == 0 else x, a)))

# 람다표현식에서는 elif를 쓸 수 없다
a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(list(map(lambda x: 0 if x % 2 == 0 else 1 if x % 3 == 0 else 2, a)))


# filter 함수 - 파이썬 내장 함수
# 주어진 함수를 반복 가능한(iterable) 객체의 결과가 참인 원소들만 반환한다.

# filter(function, iterable)

def is_even(x):  # return 값이 boolean
    return x % 2 == 0


lst = [1, 2, 3, 4, 5]
even_lst = filter(is_even, lst)
print(list(even_lst))

lst = [1, 2, 3, 4, 5]
even_lst = filter(lambda x: x % 2 == 0, lst)
print(list(even_lst))

# 실습문제

numbers = [12, 32, 55, 12, 32, 4, 86, 50]
lst = map(lambda x: "합격" if x > 60 else "대기" if x > 50 and x <= 60 else "불합격", numbers)
print(list(lst))


def findJPG(x):
    return ".jpg" in x


files = ["memo.txt", "1.jpg", "32.png", "23.jpg", "223.jpg"]
lst = filter(findJPG, files)
print(list(lst))

files = ["memo.txt", "1.jpg", "32.png", "23.jpg", "223.jpg"]
lst = filter(lambda x: ".jpg" in x, files)
print(list(lst))

files = ["memo.txt", "1.jpg", "32.png", "23.jpg", "223.jpg"]
lst = filter(lambda x: ".jpg", files)
print(list(lst))
