import numpy as np
import matplotlib.pyplot as plt
import calendar
import matplotlib as mpl

mpl.rcParams['font.family'] = 'Malgun Gothic'
mpl.rcParams['axes.unicode_minus'] = False

# 함수화 하는 것이 좋다!!!!
def creat_sales_bar_chart(years, data):
    months = list(calendar.month_abbr)[1:]

    index = np.arange(len(months))
    # n_data = len(months)
    # index = np.arange(n_data)

    bar_width = 0.3

    for i in range(len(years)):
        plt.bar(index + (i*bar_width),
                data[i],
                tick_label=months,
                align='edge',
                width=bar_width,
                label=years[i])
    # bwidth = 0.3
    # plt.bar(index, data[0], tick_label=months, color='tab:blue', align='edge', width=bwidth, label='2022년')
    # plt.bar(index + bwidth, data[1], tick_label=months, color='tab:orange', align='edge', width=bwidth, label='2023년')

    plt.legend()
    plt.xlabel('월')
    plt.ylabel('판매량')
    plt.title('서초구 상점 물건 판매량')
    plt.show()

years = ['2022년', '2023년', '2024년']
data = [
    [50, 40, 30, 20, 60, 70, 80, 90, 100, 110, 120, 130],
    [60, 50, 40, 30, 80, 90, 100, 110, 120, 130, 140, 150],
    [50, 40, 30, 20, 60, 70, 80, 90, 100, 110, 120, 130]
]

creat_sales_bar_chart(years, data)


# plt.xticks(index + bwidth, months)
# plt.legend()
# plt.xlabel('월')
# plt.ylabel('판매량')
# plt.title('서초구 상점 물건 판매량')
# plt.show()

print(calendar.calendar(2023))
print(calendar.month(2023,8))
print(calendar.weekday(2023,8,28))

print(list(calendar.month_name)[1:])
print(list(calendar.month_abbr)[1:])