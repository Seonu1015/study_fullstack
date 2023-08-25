import pickle

def write_stud():
    with open("score_lst.p", "wb") as f:
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

            pickle.dump(stud_score, f)

def read_stud():
    try:
        with open("score_lst.p", "rb") as f:
            idx = 0
            while True:
                try:
                    res = pickle.load(f)
                    print("[{}] 이름 : {}, 수학 : {}, 과학 : {}, 영어 : {}".format(idx, res["이름"], res["수학"], res["과학"], res["영어"]))
                    idx += 1
                except EOFError:
                    break
    except FileNotFoundError:
        print("파일이 존재하지 않습니다.")
    return res

def delete_stud():
    res = read_stud()

    if res:
        sel_del = int(input("삭제할 번호를 입력해주세요. : "))
        res.pop(sel_del)
        with open("score_lst.p", "wb") as f:
            for i in res:
                pickle.dump(i, f)
        print("삭제가 완료되었습니다.")
    else:
        print("삭제할 레코드가 없습니다.")


while True:
    select_menu = int(input("메뉴를 선택해주세요. 1-입력, 2-조회, 3-삭제, 0-종료 : "))
    if select_menu == 1:
        write_stud()
    elif select_menu == 2:
        read_stud()
    elif select_menu == 3:
        delete_stud()
    elif select_menu == 0:
        print("종료되었습니다.")
        break
