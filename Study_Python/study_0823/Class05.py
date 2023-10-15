import random
import pickle


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

    gamedata["게임 횟수"] += count
    gamedata["승리횟수"] += win


def write_game():
    with open("gamedata.p", "wb") as f:
        pickle.dump(gamedata, f)


def read_game():
    with open("gamedata.p", "rb") as f:
        return pickle.load(f)


gamedata = {"게임 횟수": 0, "승리횟수": 0}

while True:
    play()
    write_game()
    print(gamedata)

    exit = input("게임을 종료하시겠습니까? (y/n): ")
    if exit == "y":
        break

# def read_game():
#     try:
#         with open("gamedata.p", "rb") as f:
#             return pickle.load(f)
#     except FileNotFoundError:
#         return {"게임 횟수": 0, "승리횟수": 0}
#
# gamedata = read_game()
