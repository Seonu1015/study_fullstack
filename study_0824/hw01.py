import random


def play():
    while True:
        try:
            sel1 = int(input("당신 (1.가위, 2.바위, 3.보) : "))
            if 1 <= sel1 <= 3:
                break
            else:
                print("1, 2, 3 중 하나의 숫자를 입력하세요.")
        except ValueError:
            print("숫자를 입력하세요.")
    sel2 = random.randrange(1, 4)
    print(f"컴퓨터 (1.가위, 2.바위, 3.보) : {sel2}")
    count = 0
    win = 0

    if sel1 == 1 and sel2 == 3:
        print("승리")
        count = 1
        win = 1
    elif sel1 == 3 and sel2 == 1:
        print("패배")
        count = 1
    elif sel1 > sel2:
        print("승리")
        count = 1
        win = 1
    else:
        print("패배")
        count = 1
    return count, win

def write_game():
    accumulate_count, accumulate_win = read_game()
    accumulate_count += count
    accumulate_win += win
    with open("gamedata.txt", "w") as f:
        f.write(f"게임 횟수 : {accumulate_count}, 승리 횟수 : {accumulate_win}")
        return accumulate_count, accumulate_win

def read_game():
    try:
        with open("gamedata.txt", "r") as f:
            res = f.read()
            print(res)

    except FileNotFoundError:
        accumulate_count = 0
        accumulate_win = 0
        print(f"게임 횟수 : {accumulate_count}, 승리 횟수 : {accumulate_win}")
        return accumulate_count, accumulate_win # 요기를 다시 써보자


while True:
    count, win = play()
    write_game()


    # exit = input("게임을 종료하시겠습니까? (y/n): ")
    # if exit == "y":
    #     break
