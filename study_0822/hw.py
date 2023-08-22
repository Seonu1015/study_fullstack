str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"
count = 0
for i in range(len(str) - 2):  # 범위 값을 고려해서 확인해줘야 한다
    if str[i] == "j" and str[i + 1] == "p" and str[i + 2] == "g":
    # if str[i]+str[i+1]+str[i+2] == "jpg":
    # if str[i:i+3] == "jpg":
        count += 1
print(count)

# 숙제2 람다식으로 써보기

str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"
# lst = [str[i:i+3] for i in range(len(str)-2)]
# print(len(list(filter(lambda x: x == "jpg", lst))))
print(len(list(filter(lambda x: x == "jpg", [str[i:i+3] for i in range(len(str)-2)]))))

# 숙제1 gpjgpj가 몇개 있는지 gpjgpjgpj - 1개 (겹치는건 체크되지 않게끔)
str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"

# str = "gpjgpjgpjgpjgpjgpjgpjgpjgpj"
# count = 0
# for i in range(len(str)-5):
#     if str[i:i + 6] == "gpjgpj":
#         count += 1
# print(count)

str = "gpjgpjgpjgpjgpjgpjgpjgpjgpj"
count = 0
i = 0
while i < len(str):
    if str[i:i+6] == "gpjgpj":
        count += 1
        i += 6
    else:
        i += 1
print(count)

# 숙제3 Class03 Atm 부분 마무리하기