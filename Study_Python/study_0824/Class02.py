# alice.txt에서 1. 단어가 총 몇 개 있는지
# 숙제 2. 어떤 단어가 있는지, 각 단어가 몇 개씩 있는지

with open("alice.txt", "r") as f:
    lst = []
    s = 0
    contents = f.read()
    for i in range(len(contents)):
        if contents[i] == " " or contents[i] == "-" or contents[i] == "\'" or contents[i] == "\n":
            if contents[i] != '':
                lst.append(contents[s:i])
            s = i+1
    lst.append(contents[s:len(contents)])
    # 아스키 코드로 "알파벳이 아니라면" 을 반영해서 처리해보자

    print(lst)
    print(len(lst))

with open("alice.txt", "r") as f:
    contents = f.read()

# 구두점 제거
punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''
for punctuation in punctuations:
    contents = contents.replace(punctuation, "")

contents = contents.replace("\n", " ")

print(contents.split())
print(len(contents.split()))

