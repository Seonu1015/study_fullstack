import numpy as np
import matplotlib.pyplot as plt
import csv

def read_csv_file(file_path):
    data = []
    with open(file_path, mode='r', encoding='utf-8') as f:
        reader = csv.reader(f)
        next(reader) # 헤더 건너뛰기

        for row in reader:
            name, age, gender, _ = row
            data.append((int(age), gender))

    return data

# 나이와 성별에 따른 산점도 그래프를 그리고
# 성별 평균 나이 구해보기

