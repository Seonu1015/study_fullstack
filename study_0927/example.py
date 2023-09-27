# 이진 탐색

def binary_search(array, target, low=None, high=None):
    if low is None:
        low = 0
    if high is None:
        high = len(array) - 1

    if high < low:
        return False
    
    mid = (low+high) // 2
    print(array[mid], end=' ')

    if target == array[mid]:
        return True
    elif target < array[mid]:
        return binary_search(array, target, low, mid-1)
    else :
        return binary_search(array, target, mid+1, high)

lst = [1,3,4,9,10,13,17,24,28,30]
print(binary_search(lst, 4))
print(binary_search(lst, 30))
print(binary_search(lst, 38))

# 정렬

# 선택 정렬

lst = [11,3,24,9,40,33,7,2,8,30]

# min_num = lst[0]
# lst_sort = []

# for i in range(len(lst)):
#     for j in lst:
#         if j < min_num:
#             min_num = j
#     lst_sort.append(min_num)

# print(lst_sort) <- 실패작..... ㅠㅠㅠㅠ

def selection_sort(arr):

    for i in range(len(arr)):
        min_index = i

        for j in range(i+1, len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j

        arr[i], arr[min_index] = arr[min_index], arr[i]

    return arr

lst = [11,3,24,9,40,33,7,2,8,30]
print(selection_sort(lst))

print("=====================================")

# 삽입 정렬

# [29, 10, 14, 37, 13]
# [  , 29, 14, 37, 13] - 10
# [10, 29, 14, 37, 13]
# [10,   , 29, 37, 13] - 14
# [10, 14, 29, 37, 13]
# [10, 14, 29,   , 37] - 13
# [10, 14,   , 29, 37] - 13
# [10,   , 14, 29, 37] - 13
# [10, 13, 14, 29, 37]

def insertion_sort(arr):

    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1

        while j>=0 and key<arr[j]:
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = key

    return arr

lst = [11,3,24,9,40,33,7,2,8,30]
print(insertion_sort(lst))
