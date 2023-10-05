# 숙제!!!!!!
# 1. 이진 탐색
# 정렬된 2D 행렬에서 특정 값을 찾는 알고리즘 구현하기 -> 있으면 True, 없으면 False
matrix = [
    [ 1,  4, 7,  11, 15],
    [ 2,  5, 8,  12, 19],
    [ 3,  6, 9,  16, 22],
    [10, 13, 14, 17, 24],
    [18, 21, 23, 26, 30]
]

# 행과 열이 오름차순
# 첫 번째 행의 요소가 가장 작고 마지막 요소가 가장 큼
# 시작 위치를 첫 번째 행의 마지막 열로 설정하면??

def searchMatrix(matrix, target):
    if not matrix:
        return False
    
    row = len(matrix) - 1
    col = 0

    while row >= 0 and col < len(matrix[0]):
        if matrix[row][col] > target:
            row -= 1
        elif matrix[row][col] < target:
            col += 1
        else:
            return True
    return False

print(searchMatrix(matrix, 5))
print(searchMatrix(matrix, 20))

# 2. 주어진 리스트에서 가장 많이 등장하는 값을 찾아 반환하기 -> 5
arr = [1, 3, 2, 2, 8, 3, 5, 5, 5]

def most_number(arr):    
    count = {}
    
    for i in arr:
        if i in count:
            count[i] += 1
        else:
            count[i] = 1

    max = 0
    keyValue = 0

    for key, value in count.items():
        if max < value:
            max = value
            keyValue = key

    return keyValue

print(most_number(arr))