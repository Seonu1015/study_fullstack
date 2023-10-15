# 숙제1 gpjgpj가 몇개 있는지 gpjgpjgpj - 1개 (겹치는건 체크되지 않게끔)

str = "gpjgpjgpjgpjgpjgpjgpjgpjgpj"

str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"
count = 0
i = 0
while i < len(str)-5:
    temp = ""
    for j in range(6):
        temp += str[i+j]
    if temp == "gpjgpj":
        count += 1
        i += 5
    i += 1
print(count)

# for문 : 반복 번위가 정해진 반복을 수행
# while문 : 반복 범위 없이 조건에 따라서 반복 여부를 결정

# 잘라내는 방법으로 사용해보자
str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"
count=0
while len(str)>6:
    temp = ""
    for j in range(6):
        temp += str[j]
    if temp == "gpjgpj":
        count += 1
        str = str[6:]
    str = str[1:]
print(count)

# 숙제2 람다식으로 써보기

str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"
# lst = [str[i]+str[i+1]+str[i+2] for i in range(len(str)-2)]
# print(len(list(filter(lambda x: x == "jpg", lst))))
print(len(list(filter(lambda x: x == "jpg", [str[i]+str[i+1]+str[i+2] for i in range(len(str)-2)]))))

str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"
res = list(filter(lambda x: x[0] == "j", [str[i:i+3] for i in range(len(str)-2)]))
print(res)
result = list(filter(lambda y : y == "jpg", res))
print("{}개 {}".format(len(result), result))

result = list(filter(lambda y : y == "jpg", list(filter(lambda x: x[0] == "j", [str[i:i+3] for i in range(len(str)-2)]))))
print("{}개 -> {}".format(len(result), result))