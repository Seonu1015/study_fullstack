example = [[1, 2, 3], [4, [5, 6]], 7, [8, 9]]
# 재귀 함수를 이용해서 [1,2,3,4,5,6,7,8,9] 출력하기
def flatten(data, temp=[]):
    for i in data:
        if type(i) == list:
            flatten(i)
        else:
            temp.append(i)
            # print("temp : ", temp)
    return temp
print(flatten(example))

# [1,2,3] 까지 출력해서 고정하고 이런 식으로 진행하면....


# in, find 사용하지 않고 아래 코드 다시 작성해보기

files = ["memo.txt", "1.jpg", "32.png", "23.jpg", "223.jpg"]
lst = filter(lambda x: ".jpg" in x, files)
print(list(lst))
files = ["memo.txt", "1.jpg", "32.png", "23.jpg", "223.jpg"]
print(list(filter(lambda x: x.find(".jpg") != -1, files)))

# 숙제
files = ["memo.txt", "1.jpg", "32.jpgpg", "23.jpg", "223.jpg"]
print(list(filter(lambda x: x[len(x) - 4:len(x)] == ".jpg", files)))

# 코드를 좀 깔끔하게 정리해보자!!

# x = "1.jpg"
# print(len(x))
# print(x[len(x) - 4:len(x)])
