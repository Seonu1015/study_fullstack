# lst = [[1, 2], [3, 4], [5, 6], [7, 8], [9, 10]]

# int[][] arr = new int[5][2];
# for(int i=0; i<arr.length(); i++) {
#     for(int j=0; j<arr[0].length(); j++) {
#         arr[i][j] = 5*i + j + 1
#     }
# }

lst = [[0, 0], [0, 0], [0, 0], [0, 0], [0, 0]]
for i in range(len(lst)):
    for j in range(len(lst[0])):
        lst[i][j] = 2 * i + j + 1
for i in range(len(lst)):
    for j in range(len(lst[0])):
        print(lst[i][j], end=" ")
    print()

lst = []
num = 1
for i in range(5):
    temp = []
    for j in range(2):
        temp.append(num)
        num += 1
    lst.append(temp)
print(lst)

s = 123456
lst = []
while s > 0:
    # lst.insert(0, s % 10)
    lst.append(s % 10)
    s //= 10
for i in range(len(lst) // 2):
    temp = lst[i]
    lst[i] = lst[len(lst) - i - 1]
    lst[len(lst) - i - 1] = temp
print(lst)

lst = []
s = 123456
num = 10
count = 0
while s > num:
    num *= 10
    count += 1
# print(count)
# print(s//10**count)
while s > 0:
    lst.append(s // 10 ** count)
    s = s % (10 ** count)
    count -= 1
print(lst)

