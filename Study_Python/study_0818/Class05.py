# 가변인수 (like 자바 - 오버로딩)

# 함수 매개변수

# 1. 기본 인자값(Default Argument Values)
# 함수에 전달되는 기본 매개변수 기본값을 지정해주는 것

def func1(pa1=1, pa2=2, pa3=3):
    return 0


# 2. 키워드 인자(Keyword Argument)
# 함수에 전달되는 인자를 키-값 의 형태로 전달하는 것
# 순서 상관없이 키값에 일치하는 곳에 값이 전달된다.

def greeting(name, message="Hello"):
    print(f"{message}, {name}")


greeting(message="안녕", name="홍길동")  # 순서가 중요하지 않다(자바와 차이)
greeting(name="김철수")


# 3. 가변 인수 리스트(Arbitrary Argument Lists)
# 함수에 전달되는 매개변수 앞에 (*)을 붙여서 가변 인수로 지정해주는 것
# 인자가 일렬로 나열되서 전달되는데, tuple 형태로 전달이 된다.

def sum(*args):
    res = 0
    for arg in args:
        res += arg
    return res


print(sum(1, 2, 3))
print(sum(1, 2, 3, 4, 5, 6, 2345365, 123865))


# 4. 위치 인자 리스트(Positional Argument List)
# 함수에 전달되는 매개변수 앞에 (**)을 붙여서 인자 리스트로 지정해주는 것
# 만약, 함수를 호출했을 경우 키-값 쌍의 형태로 값이 전달되면, 딕셔너리 형태로 전달된다.

def greeting2(**kwargs):
    for name, message in kwargs.items():  # key-value = name-message
        print(f"{message}, {name}")


greeting2(Chris="Hello", Bob="안녕")


# 가변인수 실습
def calc(a, *args):
    if a == "+":
        res = 0
        for arg in args:
            res += arg
    elif a == "*":
        res = 1
        for arg in args:
            res *= arg
    return print(res)


calc("+", 1, 2, 3, 4, 5)
calc("*", 1, 2, 3, 4, 5)
