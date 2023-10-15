# 리스트

lst = [1, 2, 3, 4, 5, 6, 7, 8, 9]

print(max(lst))
print(min(lst))
print(sum(lst))

maxLst = lst[0]
minLst = lst[0]
sumLst = 0
for i in range(len(lst)):
    if maxLst < lst[i]:
        maxLst = lst[i]
    if minLst > lst[i]:
        minLst = lst[i]
    sumLst += lst[i]
print(maxLst, minLst, sumLst)

# split, join

fruit = "apple,pear,corn,carrot"
fruit_list = fruit.split(",")
print(fruit_list)

fruit = "-".join(fruit_list)
print(fruit)

fruit = "apple,pear,corn,carrot"
fruit_list = []
start = 0
for i in range(len(fruit)):
    if fruit[i] == "," or i == len(fruit) - 1:
        if i == len(fruit) - 1:
            fruit_list.append(fruit[start:i + 1])
        else:
            fruit_list.append(fruit[start:i])
        start = i + 1
print(fruit_list)

fruit = "apple,pear,corn,carrot"
fruit_list = []
s = ''
for i in fruit:
    if i == ',':
        fruit_list.append(s)
        s = ''
    else:
        s += i
fruit_list.append(s)
print(fruit_list)

fruit = "apple,pear,corn,carrot"
fruit_list = []
start = 0
for i in range(len(fruit)):
    if fruit[i] == ",":
        fruit_list.append(fruit[start:i])
        start = i + 1
fruit_list.append(fruit[start:len(fruit)])
print(fruit_list)

# 아스키코드
print(ord('a'))  # ordinal position
print(chr(97))  # character

fruit = "apple,./+pear-25-corn,carrot"
fruit_list = []
start = 0
for i in range(len(fruit)):
    if not ((ord(fruit[i]) >= 65 and ord(fruit[i]) <= 90) or (ord(fruit[i]) >= 97 and ord(fruit[i]) <= 122)):
        if fruit[start:i] != "":  # s != i-1
            fruit_list.append(fruit[start:i])
        start = i + 1
fruit_list.append(fruit[start:len(fruit)])
print(fruit_list)

print("====================================")

fruit = "carrotapplecornpear"  # 만약 구분자가 없다면, 단어 데이터베이스를 만들어서 진행
fruit_list = ['apple', 'pear', 'corn', 'carrot']  # 임시 데이터베이스
lst = []
s = 0
for i in range(len(fruit)):
    if fruit[s:i] in fruit_list:
        lst.append(fruit[s:i])
        s = i
lst.append(fruit[s:len(fruit)])
print(lst)

fruit = "carrotapplecornpear"
fruit_list = ['apple', 'pear', 'corn', 'carrot']
lst = []
s = ''
for i in fruit:
    s += i
    if s in fruit_list:
        lst.append(s)
        s = ''
if s in fruit_list:
    lst.append(s)
print(lst)

