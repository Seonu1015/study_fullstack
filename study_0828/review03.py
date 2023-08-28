import pandas as pd
import numpy as np

# 1000명의 사람 데이터 만들기

# 1번 데이터셋
# ID : ID_1, ID_2, ... ID_1000
# 나이 : 20 ~ 60 랜덤
# 도시 : 특정 도시에서 랜덤으로 할당 ex) New York, Paris, Berlin, London, Seoul, Tokyo

# 2번 데이터셋
# ID : ID_1, ID_2, ... ID_1000
# 연봉 : 50000 ~ 150000

# 3번 데이터셋
# 도시 : 특정 도시에서 랜덤으로 할당 ex) New York, Paris, Berlin, London, Seoul, Tokyo
# 나라 : 특정 도시의 나라 ex) USA, France, Germany, Korea, Japan

# 1. 1번 2번 병합(ID기준)
# 2. 병합된 데이터에 City를 기준으로 병합
# 3. 각 나라별 평균 연봉
# 4. 제일 연봉이 높은 사람의 나라

np.random.seed(0)  # <- 고정해놔서 랜덤값이 실행할때마다 바뀌지 않음!! 오 신기!!

data1 = pd.DataFrame({
    'ID': ['ID_' + str(i) for i in range(1, 1001)],
    'Age': np.random.randint(20, 60, 1000),
    'City': np.random.choice(["New York", "Paris", "Berlin", "London", "Seoul", "Tokyo"], 1000)
})

data2 = pd.DataFrame({
    'ID': ['ID_' + str(i) for i in range(1, 1001)],
    'Salary': np.random.randint(50000, 150000, 1000)
})

data3 = pd.DataFrame({
    'City': ["New York", "Paris", "Berlin", "London", "Seoul", "Tokyo"],
    'Nation': ["USA", "France", "Germany", "UK", "Korea", "Japan"]
})

# 1. 1번 2번 병합(ID기준)
data12 = pd.merge(data1, data2, on='ID', how='outer')
print(data12)

# 2. 병합된 데이터에 City를 기준으로 병합
data = pd.merge(data12, data3, on='City', how='outer')
print(data)

# 3. 각 나라별 평균 연봉
average_nation = data.groupby(['Nation'])['Salary'].mean()
print(average_nation)

# 4. 제일 연봉이 높은 사람의 나라
print(data.loc[data['Salary'].idxmax()]['Nation'])
data_salary = data.sort_values('Salary', ascending=False)
print(data_salary.iloc[0]['Nation'])

print("연봉 상위 10명 ------------")
print(data_salary.head(10))
print("연봉 하위 10명 ------------")
print(data_salary.tail(10))
