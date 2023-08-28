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
            name, age, gender, address, _ = row
            data.append((int(age), gender, address))

    return data

print(read_csv_file("seocho_people_address.csv"))