import pandas as pd
import numpy as np

# 1000명의 사람 데이터 만들기
# 이름 : Person_1, Person_2, ... Person_1000
# 나이 : 20 ~ 60 랜덤
# 도시 : 특정 도시에서 랜덤으로 할당 ex) New York, Paris, Berlin, London, Seoul, Tokyo

# 도시별 평균 나이 구하기
# 가장 많은 사람이 살고 있는 도시
# 연봉 추가해서 $50,000~ $ 150,000 랜덤으로 할당
# 연봉 1등과 꼴등 출력해보기
np.random.seed(0)

data = pd.DataFrame({
    'Name': ['Person_' + str(i) for i in range(1, 1001)],
    'Age': np.random.randint(20, 60, 1000),
    'City': np.random.choice(["New York", "Paris", "Berlin", "London", "Seoul", "Tokyo"], 1000)
})

# 도시별 평균 나이 구하기
new_york_mean = data[data['City'] == 'New York']['Age'].mean()
paris_mean = data[data['City'] == 'Paris']['Age'].mean()
berlin_mean = data[data['City'] == 'Berlin']['Age'].mean()
london_mean = data[data['City'] == 'London']['Age'].mean()
seoul_mean = data[data['City'] == 'Seoul']['Age'].mean()
tokyo_mean = data[data['City'] == 'Tokyo']['Age'].mean()

print(f"New York 사람들의 평균 나이 : 약 {int(new_york_mean)}세")
print(f"Paris 사람들의 평균 나이 : 약 {int(paris_mean)}세")
print(f"Berlin 사람들의 평균 나이 : 약 {int(berlin_mean)}세")
print(f"London 사람들의 평균 나이 : 약 {int(london_mean)}세")
print(f"Seoul 사람들의 평균 나이 : 약 {int(seoul_mean)}세")
print(f"Tokyo 사람들의 평균 나이 : 약 {int(tokyo_mean)}세")

group = data.groupby(['City'])['Age'].mean()
print(group)

# 가장 많은 사람이 살고 있는 도시
city_counts = data['City'].value_counts()
print(city_counts)
print(city_counts.idxmax())

# 연봉 추가해서 $50,000~ $ 150,000 랜덤으로 할당
data['Salary'] = np.random.randint(50000, 150000, size=data.shape[0])
# print(data)

# 연봉 1등과 꼴등 출력해보기
print("연봉  1등 --------------")
print(data.loc[data['Salary'].idxmax()])
print("연봉 꼴등 --------------")
print(data.loc[data['Salary'].idxmin()])

print()
print("인덱스로 뽑아보기 --------")
data_salary = data.sort_values('Salary', ascending=False)
print("연봉  1등 --------------")
print(data_salary.head(1))
print(data_salary.iloc[0])
print("연봉 꼴등 --------------")
print(data_salary.tail(1))
print(data_salary.iloc[len(data_salary)-1])


print("연봉 상위 5명 ------------")
print(data_salary.head(5))
print("연봉 하위 5명 ------------")
print(data_salary.tail(5))

