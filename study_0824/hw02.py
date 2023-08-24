# 숙제 2. 어떤 단어가 있는지, 각 단어가 몇 개씩 있는지 <- Class02 이어서

with open("alice.txt", "r") as f:
    contents = f.read()

# 구두점 제거
punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''
for punctuation in punctuations:
    contents = contents.replace(punctuation, "")

contents = contents.replace("\n", " ")

print(contents.split())
print(len(contents.split()))

alice = contents.split()

word_count = {}
for word in alice:
    if word in word_count:
        word_count[word] += 1
    else:
        word_count[word] = 1

for word, count in word_count.items():
    print(f"{word}: {count}")