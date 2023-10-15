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
            name, age, gender, _ = row
            data.append((int(age), gender))

    return data


# print(read_csv_file('seocho_people.csv'))

# 나이와 성별에 따른 산점도 그래프를 그리고
# 성별 평균 나이 구해보기

age_gen = read_csv_file('seocho_people.csv')
# print(age_gen)
# print(type(age_gen[0]))

data = pd.DataFrame({
    'Age': [age_gen[i][0] for i in range(len(age_gen))],
    'Gender': [age_gen[i][1] for i in range(len(age_gen))]
})

# print(data)

aver_m_age = data[data['Gender'] == '남성']['Age'].mean()
aver_f_age = data[data['Gender'] == '여성']['Age'].mean()
# print("남성 평균 나이 :", aver_m_age)
# print("여성 평균 나이 :", aver_f_age)

age = []
gender = []

for i in range(len(age_gen)):
    age.append(age_gen[i][0])
    gender.append(age_gen[i][1])

# for i in y:
#     if i == '남성':
#         color = 'y'
#     else:
#         color = 'm']

color = ['y' if i == '남성' else 'm' for i in gender]

plt.scatter(age, gender, c=color)

plt.text(aver_m_age, '남성', f"남성 평균 나이 : {aver_m_age:.2f}")
plt.text(aver_f_age, '여성', f"여성 평균 나이 : {aver_f_age:.2f}")

plt.title('서초구 성별 나이')
plt.xlabel('나이')
plt.ylabel('성별')

plt.show()

print("----------------------------------------")


def creat_scatter_plot(data):
    coordinates_lst = [(age, 0 if gender == '남성' else 1) for age, gender, _ in data]
    x_coords_lst, y_coords_lst = zip(*coordinates_lst)

    plt.scatter(x_coords_lst, y_coords_lst, c=y_coords_lst, cmap=plt.get_cmap('bwr'))

    plt.title('서초구 주민 인구 - 나이와 성별')
    plt.yticks([0, 1], ['남성', '여성'])
    plt.xlabel('나이')
    plt.ylabel('성별')

def compare_age(data):
    male_lst = [age for age, gender, _ in data if gender == '남성']
    female_lst = [age for age, gender, _ in data if gender == '여성']

    aver_male = sum(male_lst) / len(male_lst)
    aver_female = sum(female_lst) / len(female_lst)
    print(f"남성 평균 나이 : {aver_male:.2f}")
    print(f"여성 평균 나이 : {aver_female:.2f}")

data_set = read_csv_file('seocho_people.csv')

creat_scatter_plot(data_set)
plt.colorbar(label='Gender')
plt.show()