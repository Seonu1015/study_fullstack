# 리스트에서 공통된 요소를 찾아보자

person1 = ["치킨", "피자", "족발", "삼겹살"]
person2 = ["김밥", "김치찌개", "삼겹살", "치킨"]
person3 = ["치킨", "김치찌개", "떡볶이", "초밥", "삼겹살", "족발", "햄버거", "보쌈", "한우", "아이스크림"]

lst =[]
for i in range(len(person1)):
    for j in range(len(person2)):
        for k in range(len(person3)):
            if person1[i] == person2[j] and person1[i] == person3[k]:
                lst.append(person1[i])
lst = set(lst)
print(lst)

# 위 코드의 연산횟수를 줄여보자

lst =[]
for i in range(len(person1)):
    if person1[i] in person2 and person1[i] in person3:
        lst.append(person1[i])
lst = set(lst)
print(lst)

# 컴퓨터가 반복문을 돌려서 찾는거라 결국 같은 표현이나 마찬가지
# 꺼내서 생각해보는 것도 좋을 것 같다!

