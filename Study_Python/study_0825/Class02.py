# Pandas
# 데이터 분석 및 조작을 위한 라이브러리 (Numpy 기반)
import numpy as np
import pandas as pd

# Series : 1차원 배열 구조
# DataFrame : 2차원 배열 구조

# CSV, Excel, SQL 쿼리

# Series
s = pd.Series([1, 3, 4, np.nan, 6, 8])
print(s)
print(s[3])

s = pd.Series([1, 3, 4, np.nan, 6, 8], index=['A', 'B', 'C', 'D', 'E', 'F'])
print(s)
print(s['C'])

print("-------------------------------")

s1 = pd.Series([10, 20, 30, 40, 50])
print(s1)
print(s1.index)
print(s1.values)

s2 = pd.Series(['a', 'b', 'c', 1, 2, 3])
print(s2)

print("-------------------------------")

date = ['2023-01-01', '2023-06-15', '2023-08-25', '2023-10-06']
s4 = pd.Series([200, 180, np.nan, 210], index=date)
print(s4)

s5 = pd.Series({'2023': 200, '2022': 180, '2021': 210})
print(s5)

print(pd.date_range(start='2023-08-15', end='2023-08-25'))
print(pd.date_range(start='2023/08/15', end='2023/08/25'))
print(pd.date_range(start='15.08.2023', end='25/08/2023'))
print(pd.date_range(start='15.08.2023', end='2023/08/25'))

print(pd.date_range(start='2023-08-25', periods=4))
print(pd.date_range(start='2023-08-25', periods=6, freq='2B'))

print(pd.date_range(start='2023-08-25 09:30', periods=6, freq='H'))
print(pd.date_range(start='2023-08-25 09:30', periods=6, freq='30min'))

print("-------------------------------")

date = pd.date_range(start="2023-08-21", periods=5)
s = pd.Series(['월', '화', '수', '목', '금'], index=date)
print(s)

# DataFrame
data = {
    'Name': ['짱구', '철수', '훈이'],
    'age': [5, 5, 5]
}
df = pd.DataFrame(data)
print(df)
print("-------------------------------")
print(df['Name'])
print("-------------------------------")
print(df.loc[0])  # 이름
print("-------------------------------")
print(df.iloc[0])  # 위치
print("-------------------------------")
print(pd.DataFrame([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
print("-------------------------------")
data_list = np.array(([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
print(pd.DataFrame(data_list))
print("-------------------------------")
date = pd.date_range('2023-03-25', periods=3)
column = ['A', 'B', 'c']
print(pd.DataFrame(data, index=date, columns=column))

s1 = pd.Series([1, 2, 3, 4, 5])
s2 = pd.Series([9, 8, 7, 6, 5])

print(s1 + s2)
print(s1 - s2)

data1 = {'A': [1, 2, 3, 4, 5], 'B': [6, 7, 8, 9, 10], 'C': [11, 12, 13, 14, 15]}
data2 = {'B': [1, 2, 3, 4, 5], 'C': [6, 5, 7, 4, 2], 'A': [11, 12, 14, 52, 23]}

d1 = pd.DataFrame(data1)
d2 = pd.DataFrame(data2)

print(d1 + d2)
print(d2 - d1)

data = {'봄': [256.2, 156.2, 456.2, 315.5],
        '여름': [118.2, 154.6, 483.3, 159.3],
        '가을': [174.2, 137.2, 412.2, 337.5],
        '겨울': [132.2, 147.2, 234.2, 674.5]
        }
column_lst = ['봄', '여름', '가을', '겨울']
index_lst = [2020, 2021, 2022, 2023]

df = pd.DataFrame(data, columns=column_lst, index=index_lst)
print(df)

print(df.mean())
print(df.std())
print(df.mean(axis=1))
print(df.std(axis=1))

print(df.describe())

print(df.head())

print("------------------------------------------------------")
KTX_data = {'경부선 KTX': [39060, 39896, 42005, 43621, 41702, 41266, 32427],
            '호남선 KTX': [7313, 6967, 6873, 6626, 8675, 10622, 9228],
            '경전선 KTX': [3627, 4168, 4088, 4424, 4606, 4984, 5570],
            '전라선 KTX': [309, 1771, 1954, 2244, 3146, 3945, 5766],
            '동해선 KTX': [np.nan, np.nan, np.nan, np.nan, 2395, 3786, 6667]}
col_list = ['경부선 KTX', '호남선 KTX', '경전선 KTX', '전라선 KTX', '동해선 KTX']
index_list = ['2011', '2012', '2013', '2014', '2015', '2016', '2017']

df_KTX = pd.DataFrame(KTX_data, columns=col_list, index=index_list)
print(df_KTX)
print(df_KTX.head())
print(df_KTX.tail())
print(df_KTX.head(3))
print(df_KTX[2:4])
print(df_KTX.loc['2012':'2016'])
print("------------------------------------------------------")
print(df_KTX.loc['2012']['경부선 KTX'])
print("------------------------------------------------------")

df = df_KTX.sort_values('호남선 KTX')
print(df)

print(df.loc['2015'])

data = {
    'Name': ['짱구', '철수', '훈이'],
    'Age': [5, 5, 5],
    'Money': [120, 400, 50]
}
df = pd.DataFrame(data)
print(df[df['Age'] == 5]['Name'].values)
print(df.loc[df['Money'].idxmax()])

print("------------------------------------------------------")

data = {
    'Name': ['John', 'Anna', 'Peter', 'Linda'],
    'Age': [28, 24, 35, 32],
    'City': ['New York', 'Paris', 'Berlin', 'London']

}

df = pd.DataFrame(data)
print(df)
# 도시 기준으로 정렬
df_city = df.sort_values('City')
df_city = df.sort_values('City', ascending=True) # 오름차순
df_city = df.sort_values('City', ascending=False) # 내림차순
print(df_city)
# 평균 나이 구하기
print(df['Age'].mean())
# 이름이 Peter인 사람의 나이 출력
print(df[df['Name'] == 'Peter']['Age'].values)
# 가장 나이가 많은 사람의 이름과 도시 출력해보기
print(df.loc[df['Age'].idxmax()]['Name'], df.loc[df['Age'].idxmax()]['City'])
print(df.loc[df['Age'].idxmax()][['Name', 'City']])
oldest = df.loc[df['Age'].idxmax()]
print(oldest[['Name', 'City']]) # 2차원이니까 [[]] 두번 써주면 해결!!!

# 모든 사람의 이름을 대문자로 변경하기
df['Name'] = df['Name'].str.upper()
print(df)

# 나이가 30 이상인 사람들만 선택하기
print(df[df['Age'] >= 30])

older_than_30 = df[df['Age'] >= 30]
print(older_than_30)

# 각 도시별로 몇명이 살고 있는지 계산하기
city_counts = df['City'].value_counts()
print(city_counts)

# Gender라는 새로운 열을 추가해서 임의 성별 할당하기
np.random.seed(0)
df['Gender'] = np.random.choice(['Male', 'Female'], size=df.shape[0])
print(df)

# groupby : 데이터 특정 조건에 따라 그룹으로 분류하는 함수

data = pd.DataFrame({
    'City': ['Seoul', 'Seoul', 'Busan', 'Busan'],
    'Fruit': ['Apple', 'Banana', 'Apple', 'Banana'],
    'Quantity': [10, 15, 7, 12],
    'Price': [1000, 2000, 1500, 2500]
})

group = data.groupby(['City', 'Fruit'])['Quantity'].sum()
print(group)