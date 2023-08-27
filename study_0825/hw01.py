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
            pickle.dump(stud_score, f)


def read_stud():  # readline 은 쓸 수가 없음 오류가 계속 발생, 아마 피클에서는 안되는걸지도??
    try:
        with open("score_lst.p", "rb") as f:
            count = 0
            while True:
                try:
                    stud_score = pickle.load(f)
                    print(
                        f"[{count}] 이름 : {stud_score['이름']}, 수학 : {stud_score['수학']}, 과학 : {stud_score['과학']}, 영어 : {stud_score['영어']}")
                except EOFError:
                    break
    except FileNotFoundError:
        print("파일이 존재하지 않습니다.")


def delete_stud():
    try:
        with open("score_lst.p", "rb") as f:
            data = []
            count = 0
            while True:
                try:
                    stud_score = pickle.load(f)
                    print(
                        f"[{count}] 이름 : {stud_score['이름']}, 수학 : {stud_score['수학']}, 과학 : {stud_score['과학']}, 영어 : {stud_score['영어']}")
                    count += 1
                    data.append(stud_score)
                except EOFError:
                    break

            sel_del = int(input("삭제할 번호를 입력해주세요. : "))
            if 0 <= sel_del < len(data):
                del data[sel_del]

                with open("score_lst.p", "wb") as f:
                    for i in data:
                        pickle.dump(i, f)
                print("삭제가 완료되었습니다.")
            else:
                print("잘못된 번호입니다.")
    except FileNotFoundError:
        print("파일이 존재하지 않습니다.")


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
    else:
        print("잘못된 메뉴 선택입니다. 다시 선택해주세요.")
