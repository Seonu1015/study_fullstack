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
lst = list(fruit)
fruit_list = []
start = 0
for i in range(len(lst)):
    if lst[i] == "," or i == len(lst) - 1:
        if i == len(lst) - 1:
            fruit_list.append(lst[start:i + 1])
        else:
            fruit_list.append(lst[start:i])
        start = i + 1
print(fruit_list)

fruit = "apple,pear,corn,carrot"
for i in fruit:
    if i == ',':
        print()
    else:
        print(i, end="")
