# 2차원 배열에서 각 행과 각 열의 합을 구하여 리스트로 변환해보기

import numpy as np

# 1 2 3
# 4 5 6
# 7 8 9

# 6 15 24
# 12 15 18

arr1 = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
print(arr1)

for i in arr1:
    i.sum()
    print(i.sum(), end=" ")
print()
for i in arr1.transpose():
    i.sum()
    print(i.sum(), end=" ")
print()

arr3 = np.array([arr1.sum(axis=1),arr1.sum(axis=0)]) # 0은 x축, 1은 y축, 2는 z축
print(arr3)
