import matplotlib.pyplot as plt  # MATHLAB
import numpy as np

import matplotlib as mpl

mpl.rcParams['font.family'] = 'Malgun Gothic'
mpl.rcParams['axes.unicode_minus'] = False

x = np.arange(1, 4.5, 0.5)
y1 = x * 2
y2 = x * 3

plt.plot(x, y1, 'r', x, y2, '--b')
plt.legend(["선 그래프 1", "선 그래프 2"], loc="upper left")
plt.title('선 그래프 예시')
plt.xlabel('X 축')
plt.ylabel('Y 축')

plt.text(2.5, 7, "문자열 출력", size=12)

# 눈금 설정
plt.xticks([1, 2, 3, 4])
plt.yticks([0, 5, 10])

# 격자 표시
plt.grid(True)

# 차트 꾸미기
ax = plt.gca()  # get current axes - 현재 활성화된 축 객체를 가져온다.
ax.spines["top"].set_visible(False)  # 스파인 (그래프 테두리)
ax.spines["right"].set_visible(False)
ax.spines["bottom"].set_linewidth(3)
ax.spines["left"].set_linewidth(3)
ax.tick_params(width=3)  # 축 눈금

plt.show()
