import numpy as np
import matplotlib.pyplot as plt
# 산점도

np.random.seed(100)
x = np.random.normal(0, 1, 500) # 평균이 0, 표준편차 1인 난수 50개
y = np.random.normal(0, 1, 500)

plt.scatter(x, y)

plt.xlabel("X")
plt.ylabel("Y")

plt.title("Scatter Example")

plt.show()
