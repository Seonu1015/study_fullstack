import random
import pickle


def play():
    sel1 = int(input("당신 (1.가위, 2.바위, 3.보) : "))
    sel2 = random.randrange(1, 4)
    print(f"컴퓨터 (1.가위, 2.바위, 3.보) : {sel2}")
    count = 0
    win = 0

    if sel1 == 1 and sel2 == 3:
        print("승리")
        return count + 1, win + 1
    elif sel1 > sel2:
        print("승리")
        return count + 1, win + 1
    else:
        print("패배")
        return count + 1

gamedata = {"게임 횟수": 0, "승리횟수": 0}

def write_game():
    with open("gamedata.p", "wb") as f:
        pickle.dump(gamedata, f)


def read_game():
    d = dict()
    with open("gamedata.p", "rb") as f:
        d = pickle.load(f)
    print(d)
    print()


while True:
    play()
    write_game()
    read_game()
