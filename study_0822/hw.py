str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"
count = 0
for i in range(len(str) - 2):  # 범위 값을 고려해서 확인해줘야 한다
    if str[i] == "j" and str[i + 1] == "p" and str[i + 2] == "g":
    # if str[i]+str[i+1]+str[i+2] == "jpg":
    # if str[i:i+3] == "jpg":
        count += 1
print(count)

# 숙제2 람다식으로 써보기
print(len(list(filter(lambda x: str[i] == "j" and str[i + 1] == "p" and str[i + 2] == "g", list(str)))))
# └ 일단 이건 아님...

# 숙제1 gpjgpj가 몇개 있는지 gpjgpjgpj - 1개 (겹치는건 체크되지 않게끔)
str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"

str = "gpjgpjgpjgpjgpjgpjgpjgpjgpj"
count = 0
x = range(len(str)-6)
for i in x:
    if str[i:i + 6] == "gpjgpj":
        count += 1
        print("count", count, i, "번째 ", str[i:i+6])
        x = range(i+6, len(str))
        # str = str[i+6:]
print(count)