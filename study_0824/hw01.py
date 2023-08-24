import pickle


def menu():
    select_menu = int(input("메뉴를 선택해주세요. 1-입력, 2-조회, 3-삭제, 0-종료 : "))
    if select_menu == 1:
        write_stud()
    elif select_menu == 2:
        read_stud()
    elif select_menu == 3:
        delete_stud()
    elif select_menu == 0:
        print("종료되었습니다.")


def write_stud():

    name = str(input("이름을 입력해주세요. : "))
    math = int(input("수학 점수를 입력해주세요. : "))
    science = int(input("과학 점수를 입력해주세요. : "))
    english = int(input("영어 점수를 입력해주세요. : "))

    stud_score = {
        "이름": name,
        "수학": math,
        "과학": science,
        "영어": english
    }

    with open("score_lst.p", "wb") as f:
        for i in range(6):  # 반복문 사용해서 처리해보자
            pickle.dump(stud_score, f)

def read_stud():
    with open("score_lst.p", "rb") as f:
        data = pickle.load(f)
        print("[{}] 이름 : {}, 수학 : {}, 과학 : {}, 영어 : {}".format(0, data["이름"], data["수학"], data["과학"],
                                                                   data["영어"]))
        return data

def delete_stud():
    data = read_stud()
    sel_del = int(input("삭제할 번호를 입력해주세요. : "))
    data.pop(sel_del)
    with open("score_lst.p", "wb") as f:
        pickle.dump(data, f)
    print("삭제가 완료되었습니다.")


while True:
    menu()

# 리스트에 넣어서 출력하는게 아니라
# 한줄한줄 입력되도록 해서 출력되게 해보자