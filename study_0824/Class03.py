# Numpy (Numerical Python)
# 과학, 공학 연산을 쉽게 하도록 지원하는 다차원 배열(multi-dimensional array) 라이브러리
# Numpy를 사용해서 대규모 배열 처리를 쉽게 하도록 하고, 파이썬 List 와는 차이가 있다.

# cmd -> pip numpy install

import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([[1, 2, 3], [4, 5, 6]])

print(a)
print(b)

# 내부에 연속된 메모리 구조를 가지고 (Array Interface)를 가지고 있고, C를 통해 연산된다.

# 생성 함수 : np.array(), np.zeros(), np.ones(), np.empty(), np.arange(), np.linspace()
# 변환 함수 : ndarray.reshape(), ndarray.ravel(), ndarray.transpose(), ndarray.swapaxes()
# 연산 함수 : np.add(), np.substract(), np.multiply(), np.divide(), np.sqrt(), np.dot(), np.sum()
#                np.mean(), np.std(), np.max(), np.min(), np.argmax(), np.argmin()
# 집계 함수: ndarray.sum(), ndarray.mean(), ndarrray.std(), ndarray.max(), ndarray.min(),
#               ndarray.argmax(), ndarray.argmin()
# 논리함수 : np.logical_and(), np.logical_or(), np.logical_not()


# 생성 함수
arr1 = np.zeros(5)
print(arr1)

arr2 = np.zeros((2,8))
print(arr2)

arr3 = np.zeros((3,3,3))
print(arr3)

arr1 = np.ones(5)
print(arr1)
arr2 = np.ones((10,10))
print(arr2)

arr4 = np.empty(5)
print(arr1)
arr5 = np.empty((3,3))
print(arr5)

arr1 = np.arange(5)
print(arr1)
arr2 = np.arange(3,10)
print(arr2)
arr3 = np.arange(1, 10, 0.2)
print(arr3)

arr1 = np.linspace(0,1,5)
print(arr1)
arr2 = np.linspace(-10, 10, 10)
print(arr2)

# 변환 함수
# 배열 형태 변환

# 1차원 배열을 2차원 배열도 변환
arr = np.array([1,2,3,4,5,6])
arr2 = arr.reshape(2,3)
print(arr2)

# 2차원 배열을 1차원 배열로 변환
arr1 = arr2.flatten()
print(arr1)

# 타입 변환

# 정수를 실수로 변환
arr_int = np.array([1,2,3])
arr_float = arr_int.astype(float)
print(arr_float)

# 문자형 배열을 정수형 배열로 변환
arr_str = np.array(['1', '2', '3'])
arr_int = arr_str.astype(int)
print(arr_int)

# 축 변환
