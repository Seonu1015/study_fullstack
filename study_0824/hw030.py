# 10 X 10 배열에서 서로 다른 두 원소를 선택해서 두 원소의 차이의 절대값이 가장 작은 두 원소 찾기

import numpy as np

arr = np.random.rand(10, 10)
print(arr)

arr[0, 0] - arr[0, 1]
arr[0, 0] - arr[0, 2]
arr[0, 0] - arr[0, 3]
...
arr[0, 1] - arr[0, 2]
arr[0, 1] - arr[0, 3]
...

min_diff = arr[0,0]- arr[0.1]

for i in range(10):
    for j in range(9):
        diff = arr[i, j] - arr[i, j + 1]
        if diff < 0:
            diff = -diff
        if min_diff > diff:
            min_diff = diff

