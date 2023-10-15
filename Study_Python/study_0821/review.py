# 두 수 사이의 홀수 전부 출력
# print_odd(1, 10) - 1 3 5 7 9
def print_odd(start, end):
    if start == end:
        return
    elif start % 2 == 1:
        print(start)
    print_odd(start + 1, end)


print_odd(1, 10)


# 피보나치 수열 1 1 2 3 5 8 13 21 34 ... 몇 번째 피보나치 수열을 구할 것인가
# fibo(6) = 8
def fibo(n):
    if n == 1 or n == 2:
        return 1
    return fibo(n - 2) + fibo(n - 1)


# fibo(3) = fibo(1) + fibo(2)
# fibo(4) = fibo(2) + fibo(3)
# fibo(5) = fibo(3) + fibo(4)
# fibo(6) = fibo(4) + fibo(5)

print(fibo(6))


# 10진수 -> 2진수로 변환하기

def binary(n):
    if n < 1:
        return
    binary(n // 2)
    print(n % 2, end="")


binary(10)
print()
binary(50)