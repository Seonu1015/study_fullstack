# 별 출력하기 (리스트에 넣어서)

# 사각형별
star1 = ['*****' for i in range(5)]
print('\n'.join(star1))

lst = []
for i in range(5):
    temp = ""
    for j in range(5):
        temp += '*'
    lst.append(temp)
for i in lst:
    print(i)

# 계단식별
star2 = ['*' * (i + 1) for i in range(5)]
print('\n'.join(star2))

for i in range(5):
    for j in range(5):
        if i >= j:
            print('*', end="")
        else:
            print()
            break
print()

lst = []
for i in range(5):
    temp = ""
    for j in range(i + 1):
        temp += '*'
    lst.append(temp)
for i in lst:
    print(i)

# 대각선별
star3 = [' ' * i + '*' for i in range(5)]
print('\n'.join(star3))

for i in range(5):
    for j in range(5):
        if i == j:
            print('*')
            break
        else:
            print(end=" ")

lst = []
for i in range(5):
    temp = ""
    for j in range(5):
        if i == j:
            temp += '*'
            break
        else:
            temp += " "
    lst.append(temp)
for i in lst:
    print(i)

# 계단식(역순) <- 2번의 답을 reverse를 사용해서 뒤집는 간단한 방법도 있다
star4 = ['*' * (5 - i) for i in range(5)]
print('\n'.join(star4))

# 계단식(역순)
star5 = [' ' * i + '*' * (5 - i) for i in range(5)]
print('\n'.join(star5))

# 리버스를 써보자
print("--------------------------")
lst = []
for i in range(5):
    temp = []
    for j in range(4, -1, -1):
        if i <= j:
            temp.append("*")
        else:
            temp.append(" ")
    lst.append(temp)
for i in lst:
    print(i)
print("reverse-------------------")
lst = []
for i in range(5):
    temp = []
    for j in range(4, -1, -1):
        if i <= j:
            temp.append("*")
        else:
            temp.append(" ")
    lst.append(temp)
for i in lst:
    i.reverse()
for i in lst:
    print(i)

star = [" " * i + "* " * (5 - i) for i in range(5)]
for i in star:
    print(i)

star = [" " * i + "* " * (5 - i) for i in range(5)]
for i in reversed(star):
    print(i)