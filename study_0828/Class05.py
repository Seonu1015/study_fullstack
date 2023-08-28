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
        next(reader) # 헤더 건너뛰기

        for row in reader:
            print(row)
            name, age, gender, address = row
            data.append((int(age), gender, address))

    return data

# print(read_csv_file("seocho_people_address.csv"))

def creat_scatter_plot(data):
    coordinates_lst = [(age, 0 if gender == '남성' else 1, address[len(address)-2:len(address)]) for age, gender, address in data]
    x_coords_lst, y_coords_lst, z_coords_lst = zip(*coordinates_lst)

    plt.scatter(z_coords_lst, x_coords_lst, c=y_coords_lst, cmap=plt.get_cmap('bwr'), alpha=0.5)

    plt.title('서초구 주민 인구 - 주소별 분포')
    plt.xlabel('주소')
    plt.ylabel('나이')

data_set = read_csv_file('seocho_people_address.csv')
creat_scatter_plot(data_set)
plt.show()