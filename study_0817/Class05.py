a = [[10, 20], [30, 40], [50, 60]]
b = [[2, 3], [4, 5], [6, 7]]

lst = []
for i in range(len(a)):
    temp = []
    for j in range(len(a[i])):
        temp.append(a[i][j] * b[i][j])
    lst.append(temp)
print(lst)

# for x, y in lst:
#     print(x, y)
#
# for i in lst:
#     for j in i:
#         print(j, end=' ')
#     print()

# [[1,2],[3,4],[5,6]] 리스트 컴프리핸션으로 만들기
# 2차원 10X10 리스트 0으로 채우기 리스트 컴프리핸션으로 만들기
# 100 이하의 소수(약수가 1과 자기자신)으로 이루어진 1차원 리스트 컴프리핸션으로 만들기

# [[1,2],[3,4],[5,6]] 리스트 컴프리핸션으로 만들기
a = [[2 * i + j + 1 for j in range(2)] for i in range(3)]
print(a)

# 2차원 10X10 리스트 0으로 채우기 리스트 컴프리핸션으로 만들기
a = [[0 for i in range(10)] for j in range(10)]
print(a)

# 100 이하의 소수(약수가 1과 자기자신)로 이루어진 1차원 리스트 컴프리핸션으로 만들기
a = [i for i in range(2, 101) if
     (i == 2 or i % 2 != 0) and (i == 3 or i % 3 != 0) and (i == 5 or i % 5 != 0) and (i == 7 or i % 7 != 0)]
print(a)

a = []
for num in range(2, 101):
    is_prime = True
    for i in range(2, num):
        if num % i == 0:
            is_prime = False
            break
    if is_prime:
        a.append(num)
print(a)

a = [num for num in range(2, 101) if all(num % i != 0 for i in range(2, num))]
print(a)