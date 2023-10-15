# 리스트 세 개의 곱
lst1 = [1, 2, 3, 4, 5]
lst2 = [1, 3, 5, 7, 9]
lst3 = [2, 4, 8]

print(list(map(lambda x, y, z: x * y * z, lst1, lst2, lst3)))
print(list(map(lambda x: x[0] * x[1] * x[2], zip(lst1, lst2, lst3))))

# [2, 24, 120] 결과값이 이렇게 나오는 게 맞음

# 1부터 10까지의 제곱 값 중 홀수만 출력해보기

print(list(filter(lambda x: x % 2 == 1, map(lambda x: x * x, range(1, 11)))))
# print(list(map(lambda x: x * x, range(1, 11))))

