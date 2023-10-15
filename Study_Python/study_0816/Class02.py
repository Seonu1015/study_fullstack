#Hello world -> Hell wrld

s = "Hello world"

# print(s.replace('o',''))

lst = list(s)
# print(lst)
#
# for i in lst:
#     if (i == 'o'):
#         continue
#     print(i, end="")

# \n <- 줄바꿈

# lst = list(s)
# del lst[4]
# del lst[6]
# for i in lst:
#     print(i, end="")
# print()

# lst[:4] <- lst[0:4] 와 같은 표현으로 인덱스 0부터 4전까지, 즉 0부터 3까지

# s = ""
# for i in lst[:4] + lst[5:7] + lst[8:]:
#     s += i
# print(s)


# 함수를 쓰지 않고!!!
# lst2 = []
# start = 0
# for i in range(len(lst)):
#     if lst[i] == 'o' or i == len(lst)-1:
#         lst2 += lst[start:i] # 0,4 / 5,7 / 8,len-1
#         start = i+1
# print(lst2)
# 마지막 d가 안나오는 문제 : 끝값에서 슬라이싱하면 그 전까지라 끝값에서 하나 올려줘야

lst = list('helloooo woorld') # 'oooooooooooooooo'
i = 0
while (True):
    if (i == len(lst)):
        break
    if lst[i] == 'o':
        del lst[i]
    else :
        i += 1
print(lst)

