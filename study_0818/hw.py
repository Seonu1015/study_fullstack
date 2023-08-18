# 재귀함수 실습문제

# 두 수 사이의 홀수 전부 출력
# print_odd(1, 10) - 1 3 5 7 9
def f_odd(a, b):
    if a > b:
        return
    if a % 2 == 1:
        print(a, end=" ")
    f_odd(a + 1, b)
f_odd(1, 10)

print()


# 피보나치 수열 1 1 2 3 5 8 13 21 34 ... 몇 번째 피보나치 수열을 구할 것인가
# fibo(6) = 8
# fibo(0) = 0 / fibo(1) = 1 / fibo(2) = 1 / fibo(3) = 2 / fibo(4) = 3
def fibo(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    return fibo(n-1) + fibo(n-2)
    fibo(n-1)

print(fibo(6))


# 10진수 -> 2진수로 변환하기
# 10 -> 1010
# 2 -> 10

def binary(n):
    if n == 0:
        return
    binary(n // 2)
    print(n % 2, end="")
binary(2)
print()