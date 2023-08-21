example = [[1, 2, 3], [4, [5, 6]], 7, [8, 9]]

# 재귀 함수를 이용해서 [1,2,3,4,5,6,7,8,9] 출력하기
def flatten(data):
    temp = []
    for i in range(len(data)):
        if type(data[i]) == list:
            flatten(data[i])
        else:
            temp.append(data[i])
        print(i + 1, " 번째 : ", temp)
    return temp

flatten(example)
