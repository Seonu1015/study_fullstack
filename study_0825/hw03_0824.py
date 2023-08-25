# 10 X 10 배열에서 서로 다른 두 원소를 선택해서 두 원소의 차이의 절대값이 가장 작은 두 원소 찾기

import numpy as np

arr = np.random.rand(10, 10)
# print(arr)

# arr[0, 0] - arr[0, 1]
# arr[0, 1] - arr[0, 2]
# arr[0, 2] - arr[0, 3]
# ...
# arr[0, 9] - arr[1, 0]
#
# arr[1, 1] - arr[1, 2]
# arr[1, 2] - arr[1, 3]
# ...

arr1 = arr.flatten()
lst = []
for i in arr1:
    lst.append(i)

# lst[0] - lst[1]
# lst[1] - lst[2]
# ...
# lst[97] - lst[98]

lst.sort()

min_idx = 0
min_diff = lst[0] - lst[1]
if min_diff < 0:
    min_diff = -min_diff
diff_lst = []

for i in range(len(lst) - 1):
    diff = lst[i] - lst[i + 1]
    diff_lst.append(diff)

    if diff < 0:
        diff = -diff
    if min_diff > diff:
        min_diff = diff
        min_idx = i

print("연산 횟수 :", len(diff_lst))
print("가장 작은 차이 :", min_diff)
print(f"두 원소 : {lst[min_idx]}, {lst[min_idx + 1]}")

print("▲ 연산횟수 기존보다 줄일 수 있게 수정 -------------------------")
print()

min_idx = (0, 0, 0, 0)
min_diff = arr[0, 0] - arr[0, 1]
if min_diff < 0:
    min_diff = -min_diff

diff_lst = []

for i in range(10):
    for j in range(10):
        for x in range(10):
            for y in range(j + 1, 10):
                diff = arr[i, j] - arr[x, y]
                diff_lst.append(diff)

                if diff < 0:
                    diff = -diff
                if min_diff > diff:
                    min_diff = diff
                    min_idx = (i, j, x, y)
print("연산 횟수 :", len(diff_lst))
print("가장 작은 차이 :", min_diff)
print(
    f"arr{min_idx[0], min_idx[1]} : {arr[min_idx[0], min_idx[1]]}, arr{min_idx[2], min_idx[3]} : {arr[min_idx[2], min_idx[3]]}")

print("---------------------------------------------------------")
print()
# 두 원소의 차이의 절대값이 가장 큰 두 원소를 찾아보자

max_i = [i for i in str(arr.argmax())]
min_i = [i for i in str(arr.argmin())]

if len(max_i) == 1:
    max_i.insert(0, "0")
if len(min_i) == 1:
    min_i.insert(0, "0")

print(f"가장 큰 차이 : {arr.max() - arr.min()}, arr[{', '.join(max_i)}] : {arr.max()}, arr[{', '.join(min_i)}] : {arr.min()}")
