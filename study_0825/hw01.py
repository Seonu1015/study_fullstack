# readline(), readlines() 를 이용해서 0824 hw01 을 수정해보자

import pickle

def write_stud():
    while True:
        name = input("이름을 입력해주세요. (엔터를 누르면 종료) : ")
        if not name:
            break
        math = int(input("수학 점수를 입력해주세요. : "))
        science = int(input("과학 점수를 입력해주세요. : "))
        english = int(input("영어 점수를 입력해주세요. : "))

        stud_score = {
            "이름": name,
            "수학": math,
            "과학": science,
            "영어": english
        }

        with open("score_lst.p", "ab") as f:
            for i in data:
                pickle.dump(i, f)

def read_stud():
    try:
        with open("score_lst.p", "rb") as f:
            line = f.readline()
            while line:
                print(line.strip())
                line = f.readline()
    except FileNotFoundError:
        print("파일이 존재하지 않습니다.")

def delete_stud():
    with open("score_lst.p", "rb") as f:
        line = f.readline()
        while line:
            print(line.strip())
            line = f.readline()
        sel_del = int(input("삭제할 번호를 입력해주세요. : "))
        data.pop(sel_del)
        with open("score_lst.p", "wb") as f:
            for i in data:
                pickle.dump(i, f)
        print("삭제가 완료되었습니다.")


while True:
    select_menu = int(input("메뉴를 선택해주세요. 1-입력, 2-조회, 3-삭제, 0-종료 : "))
    if select_menu == 1:
        write_stud()
    elif select_menu == 2:
        data = read_stud()
        print(data)
        idx = 0
        for i in data:
            print("[{}] 이름 : {}, 수학 : {}, 과학 : {}, 영어 : {}".format(idx, i["이름"], i["수학"], i["과학"], i["영어"]))
            idx += 1
    elif select_menu == 3:
        delete_stud()
    elif select_menu == 0:
        print("종료되었습니다.")
        break
