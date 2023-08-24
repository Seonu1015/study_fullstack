# 10 X 10 배열에서 서로 다른 두 원소를 선택해서ㅓ 두 원소의 차이의 절대값이 가장 작은 두 원소 찾기

import numpy as np

arr = np.random.rand(10,10)
print(arr)


print(arr.min(np.subtract(arr)))