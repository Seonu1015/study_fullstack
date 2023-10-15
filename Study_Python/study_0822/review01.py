example = [[1, 2, 3], [4, [5, 6, [6, 5, 4, [3, 2, 1]]]], 7, [8, 9]]


# 재귀 함수를 이용해서 [1,2,3,4,5,6,7,8,9] 출력하기

def flatten(data):
    flat_lst = []
    for i in data:
        if type(i) == list:
            flat_lst += flatten(i)  # [1,2,3] - [4, [5,6]] - [8,9]
        else:
            flat_lst.append(i)
    return flat_lst


print(flatten(example))

# in, find 사용하지 않고 아래 코드 다시 작성해보기

files = ["memo.txt", "1.jpg", "32.png", "23.jpg", "223.jpg"]
print(list(filter(lambda x: x[len(x) - 4:] == ".jpg", files)))

print("-------------------------------------")
str = "jpgpgjgpjpgjgpjgpjgpjpgjpjgp"
count = 0
for i in range(len(str) - 2):  # 범위 값을 고려해서 확인해줘야 한다
    if str[i] == "j" and str[i + 1] == "p" and str[i + 2] == "g":
    # if str[i]+str[i+1]+str[i+2] == "jpg":
    # if str[i:i+3] == "jpg":
        count += 1
print(count)

lst = []
for i in range(len(str) - 2):  # 범위 값을 고려해서 확인해줘야 한다
    if str[i] == "j" and str[i + 1] == "p" and str[i + 2] == "g":
        lst.append(str[i:i+3])
print(len(lst))

# 람다식으로 써보기
print(len(list(filter(lambda x: str[i]+str[i+1]+str[i+2] == "jpg", list(str)))))

# gpjgpj가 몇개 있는지 gpjgpjgpj - 1개 (겹치는건 체크되지 않게끔)
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
