# 1260원을 동전으로 바꾸려고 하는데 가장 적은 동전이 몇개인가?

def greedy_algorithm(money):
    coin_type = [500, 100, 50, 10]
    count = 0

    for coin in coin_type:
        count += money // coin
        money %= coin
    
    return count

print(greedy_algorithm(1260))