# 재귀함수(recursion function)
# 1. 함수 내부에서 자기 자신 함수를 호출해야 한다.
# 2. 재귀를 종료시켜주는 조건문이 존재해야 한다.

def test(end):
    if end == 0:
        return
    print("재귀함수!")  # 위치를 신경써서 작성해야한다
    # end -= 1
    test(end - 1)


test(5)


def test(end):
    if end == 0:
        return
    test(end - 1)
    print(end)


# test(5) -> test(4) -> test(3) -> test(2) -> test(1) 이렇게 진행한 뒤에
# 다시 되돌아가면서 1 2 3 4 5 를 출력하게 된다

# 재귀함수 팩토리얼 구하기

def factorial(n):
    if n == 1:
        return 1
    return n * factorial(n - 1)

print(factorial(5))


# 실습

def f_sum(n):
    if n == 0:
        return 0
    return n + f_sum(n - 1)
print(f_sum(5))

def f_number(n):
    if n == 0:
        return
    f_number(n // 10)
    print(n % 10)
f_number(1234)

