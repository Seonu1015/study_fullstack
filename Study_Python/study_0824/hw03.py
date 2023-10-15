# 10 X 10 배열에서 서로 다른 두 원소를 선택해서 두 원소의 차이의 절대값이 가장 작은 두 원소 찾기

import numpy as np

arr = np.random.rand(10,10)
print(arr)

min_diff_index = (0, 1)
min_diff = arr[0, 1] - arr[1, 0]

for i in range(10):
    for j in range(i + 1, 10):
        diff = arr[i, j] - arr[j, i]
        if diff < 0:
            diff = -diff
        if diff < min_diff:
            min_diff = diff
            min_diff_index = (i, j)

print("가장 작은 차이:", min_diff)
print("인덱스:", min_diff_index)
print("두 원소:", arr[min_diff_index[0], min_diff_index[1]], arr[min_diff_index[1], min_diff_index[0]])