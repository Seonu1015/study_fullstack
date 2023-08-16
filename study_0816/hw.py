# 숙제
# 1번. list 함수 원리 구현해보기 (숫자로), 문자열로 바꾸면 안돼

# 오답 1 :
# s = "123456"
# 오답 2 :
# s = [1, 2, 3, 4, 5, 6]
# 오답 3 :
# s = str(s)

# 2번. (1)[3,6,9,20,-7,5] 리스트를 sort와 같은 함수를 사용하지말고 for문을 활용하여 오름차순으로 정렬해주세요.

# 2x5 이차원 리스트 만들어서 1~10까지 채우기
# lst = [[0, 0], [0, 0], [0, 0], [0, 0], [0, 0]]

# 1번. 숫자 형태를 이용해서 해보자

# s = 123456
# lst = []
# for i in range(6):
#     lst.append(i+1);
# print(lst)
# 이건 살짝 아쉬운 답, 숫자값이 바뀌어도 진행이 가능하도록!

s = 123456
lst = []
while s > 0:
    a = s % 10
    lst.insert(0, a)
    s //= 10
print(lst)

# 2번.

a = [3, 6, 9, 20, -7, 5]

for i in range(len(a)):
    for j in range(i + 1, len(a)):
        if a[i] > a[j]:
            a[i], a[j] = a[j], a[i]
print(a)

# 3번.
# lst = [[0, 0], [0, 0], [0, 0], [0, 0], [0, 0]]

lst = []
num = 1
for i in range(5):
    temp = []
    for j in range(2):
        temp.append(num)
        num += 1
    lst.append(temp)
print(lst)
