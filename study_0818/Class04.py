# 함수

lst = [1, 2, 3, 1, 4, 2, 1]

def allindex(lst, a):
    lstIndex = []
    for i in range(len(lst)):
        if lst[i] == a:
            lstIndex.append(i)
    return lstIndex

print(allindex(lst, 1))


# all, any 다시

person1 = ["치킨", "김치찌개", "족발", "삼겹살"]
person2 = ["김밥", "보쌈", "삼겹살", "쌈밥"]
person3 = ["치킨", "김치찌개", "떡볶이", "초밥", "삼겹살", "족발", "햄버거", "보쌈", "한우", "아이스크림"]

food1 = [i for i in person1 if any(i == j for j in person2)]
food = [i for i in food1 if any(i == j for j in person3)]
for x in food:
    print("3명이 모두 먹고싶은 음식은", x, "입니다.")

