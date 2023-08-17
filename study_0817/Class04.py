a = [i for i in range(10)]
# a = [i] a에 [i]를 넣겠다
# i가 뭔데?
# for i in range(10) : 0...9
# a = [0...9]
print(a)

a = [i for i in range(10) if i % 2 == 0]
# a = [i] a에 [i]를 넣겠다
# i가 뭔데?
# for i in range(10) : 0...9
# if i % 2 == 0 i는 2로 나눈 나머지가 0이야
# a = [0, 2, 4, 6, 8]
print(a)

a = [i * j for i in range(2, 10) for j in range(1, 10)]
# a = [i*j] a에 i*j 를 넣겠다
# i가 뭔데?
# for i in range(2, 10) : i는 2...9
# j가 뭔데?
# for j in range(1, 10) : j는 1...9
print(a)

a = [0 for i in range(100)]
print(a)

word = ["school", "game", "piano", "science", "hotel", "mountian"]
wordSix = [word[i] for i in range(len(word)) if len(word[i]) >= 6]
print(wordSix)

word = ["school", "game", "piano", "science", "hotel", "mountian"]
wordLen = [len(word[i]) for i in range(len(word))]
print(wordLen)

# o를 포함하는 단어
word = ["school", "game", "piano", "science", "hotel", "mountian"]
wordIncludeO = [word[i] for i in range(len(word)) if 'o' in word[i]]
print(wordIncludeO)

# s로 시작하는 단어 + 첫글자는 대문자로 출력되게끔
word = ["school", "game", "piano", "science", "hotel", "mountian"]
wordStartS = [word[i][:1].upper() + word[i][1:] for i in range(len(word)) if word[i][:1] == 's']
print(wordStartS)

