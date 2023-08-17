# 리스트에서 공통된 요소를 찾아보자

person1 = ["치킨", "김치찌개", "족발", "삼겹살"]
person2 = ["김밥", "보쌈", "삼겹살", "치킨"]
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

# 컴퓨터가 반복문을 돌려서 찾는거라 결국 연산횟수는 같음
# 꺼내서 생각해보는 것도 좋을 것 같다!

lst=[]
for i in person1:
    if i in person2 and i in person3:
        lst.append(i)
print(set(lst))

# 같은 거 아닌가? 아무리 생각해도 줄일 방법이 떠오르지 않음