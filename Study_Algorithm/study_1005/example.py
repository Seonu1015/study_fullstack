# Bubble Sort 예제

def bubble_sort(arr):

    for j in range(len(arr)):
        for i in range(len(arr) - j - 1):
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
    return arr

lst = [11,3,24,9,40,33,7,2,8,30]
print(bubble_sort(lst))

# Merge Sort 예제

def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    
    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])

    return merge(left, right)

def merge(left, right):
    result = []
    i = j = 0
    
    while i<len(left) and j<len(right):
        if left[i] < right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    
    while i<len(left):
        result.append(left[i])
        i += 1
        
    while j<len(right):
        result.append(right[j])
        j += 1
        
    return result

lst = [11,3,24,9,40,33,7,2,8,30]
print(merge_sort(lst))

# Quick Sort 예제 <- 이게 제일 중요!!!!!!

def quick_sort(arr):
    if len(arr) <= 1:
        return arr

    pivot = arr[len(arr)//2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]

    return quick_sort(left) + middle + quick_sort(right)

lst = [11,3,24,9,40,33,7,2,8,30]
print(merge_sort(lst))