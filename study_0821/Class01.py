example = [[1, 2, 3], [4, [5, 6]], 7, [8, 9]]


def flatten(data):
    temp = []
    for i in range(len(data)):
        if type(data[i]) == list :
            for j in range(len(data[i])):
                if type(data[i][j]) == list:
                    for k in range(len(data[i][j])):
                        temp.append(data[i][j][k])
                else:
                    temp.append(data[i][j])
        else:
            temp.append(data[i])
    print(temp)

flatten(example)  # [1,2,3,4,5,6,7,8,9]

# 숙제.....
def flatten(data):
    temp = []
    for i in range(len(data)):
        if type(data[i]) == list:
            flatten(data[i])
        else:
            temp.append(data[i])
        print(i + 1, " 번째 : ", temp)


flatten(example)