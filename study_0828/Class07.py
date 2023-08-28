import numpy as np
import matplotlib.pyplot as plt
import calendar



import matplotlib as mpl

mpl.rcParams['font.family'] = 'Malgun Gothic'
mpl.rcParams['axes.unicode_minus'] = False

months = list(calendar.month_abbr)[1:]

# month = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']

data = [
    [50, 40, 30, 20, 60, 70, 80, 90, 100, 110, 120, 130],
    [60, 50, 40, 30, 80, 90, 100, 110, 120, 130, 140, 150]
]

n_data = len(months)
index = np.arange(n_data)

bwidth = 0.3
plt.bar(index, data[0], tick_label=months, color='tab:blue', align='edge', width=bwidth, label='2022년')
plt.bar(index+bwidth, data[1], tick_label=months, color='tab:orange', align='edge', width=bwidth, label='2023년')

plt.xticks(index + bwidth, months)
plt.legend()
plt.xlabel('월')
plt.ylabel('판매량')
plt.title('서초구 상점 물건 판매량')
plt.show()