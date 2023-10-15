import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import csv
import matplotlib as mpl

mpl.rcParams['font.family'] = 'Malgun Gothic'
mpl.rcParams['axes.unicode_minus'] = False


def read_csv_file(file_path):
    data = []
    with open(file_path, mode='r', encoding='utf-8') as f:
        reader = csv.reader(f)
        next(reader)  # 헤더 건너뛰기

        for row in reader:
            print(row)
            name, age, gender, address = row
            data.append((int(age), gender, address))

    return data


# print(read_csv_file("seocho_people_address.csv"))

def creat_scatter_plot(data):
    addresses = sorted(set(address for _, _, address in data))  # 앞의 두개는 안쓰고 주소만 갖다 쓰겠다
    addresses_xcoord = {}

    for idx, address in enumerate(addresses):
        addresses_xcoord[address] = 50 + idx * 100

    coord_lst = [(addresses_xcoord[address], age, 'blue' if gender == '남성' else 'red') for age, gender, address in data]

    # coord_lst = [(age, 0 if gender == '남성' else 1, address[len(address) - 2:len(address)]) for
    #                    age, gender, address in data]
    # 불러올 때 순서를 바꿔줄 수 있다.

    x_coords_lst, y_coords_lst, colors = zip(*coord_lst)

    plt.scatter(x_coords_lst, y_coords_lst, c=colors, alpha=0.5)

    label_address = []
    for address in addresses:
        if not address[:4] in label_address:
            label_address.append(address[:4])
    print(label_address)

    plt.xticks([20000, 40000, 60000, 80000], labels=label_address, rotation=40)
    # [20000, 40000, 60000, 80000] 대신에 계산해서 넣는 것도 생각해보면 좋다

    plt.title('서초구 주민 인구 - 주소별 분포')
    plt.xlabel('주소')
    plt.ylabel('나이')


data_set = read_csv_file('seocho_people_address.csv')
creat_scatter_plot(data_set)
plt.show()
