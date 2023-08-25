# hw03_0824 풀이

import numpy as np

arr = np.random.rand(10)
sorted_arr = np.sort(arr)

print(sorted_arr[sorted_arr.argmax()] - sorted_arr[sorted_arr.argmin()])

min = sorted_arr[sorted_arr.argmax()] - sorted_arr[sorted_arr.argmin()]
min_idx = 0

for i in range(len(sorted_arr)-1):
    diff = abs(sorted_arr[i] - sorted_arr[i+1])
    if min > diff:
        min = diff
        min_idx = i

print(f"첫번째 원소 : {sorted_arr[min_idx]}, 두번째 원소 : {sorted_arr[min_idx+1]}, 최소 차이값 : {min}")

