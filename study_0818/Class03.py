# 별 출력하기 (리스트에 넣어서)
# 사각형별
star1 = ['*****' for i in range(5)]
print('\n'.join(star1))

# 계단식별
star2 = ['*' * (i + 1) for i in range(5)]
print('\n'.join(star2))

# 대각선별
star3 = [' ' * i + '*' for i in range(5)]
print('\n'.join(star3))

# 계단식(역순)
star4 = ['*' * (5 - i) for i in range(5)]
print('\n'.join(star4))

# 계단식(역순)
star5 = [' ' * i + '*' * (5 - i) for i in range(5)]
print('\n'.join(star5))
