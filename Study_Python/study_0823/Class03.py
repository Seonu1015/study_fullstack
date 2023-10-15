# 파일 입출력

# 1. 파일 열기(open) - 파일을 열어서 객체를 생성한다. 모드 설정(읽기, 쓰기, 추가...)
# 2. 파일 읽기(read) or 파일 쓰기(write) - 생성된 객체를 통해서 파일을 읽거나 쓸 수 있음.
# 3. 파일 닫기(close) - 파일 사용이 끝나면 반드시 닫아줘야 한다. 파일을 닫지 않으면, 메모리에 남아있어서 데이터 손실의 위험이 있다.

file = open("example.txt", "w")
file.write("안녕하세요.\n파일 입출력 시간입니다.")
file.close()

file = open("example.txt", "r")
res = file.read()
for i in res:
    print(i, end="")
    if i == ".":
        print()
file.close()

with open("example.txt", "r") as file:
    res = file.read()
    print(res)
print("---diary----------------------------------")
# 다이어리 프로그램 - 날짜를 입력하고, 일기 작성, 날짜를 입력해서 작정한 일기를 출력

def menu():
    print("1. Write a diary")
    print("2. Read a diary")
    choice = int(input("어느 것을 하시겠습니까? : "))

    if choice == 1:
        write_diary()
    elif choice == 2:
        read_diary()

# def write_diary():
#     date = input("날짜를 입력하세요. (08-23) : ")
#     with open("{}.txt".format(date), "w") as file:
#         file.write(input("일기를 작성하세요. : "))

def write_diary():
    date = input("날짜를 입력하세요. (dd-mm-yyyy) : ")
    text = input("오늘 하루는 어땠나요 : ")

    with open(f"{date}.txt", "w") as f:
        f.write(text)

    print("저장이 완료되었습니다.")

# def read_diary():
#     date = input("날짜를 입력하세요. (08-23) : ")
#     with open("{}.txt".format(date), "r") as file:
#         res = file.read()
#         print(res)

def read_diary():
    date = input("보고 싶은 다이어리의 날짜를 입력해주세요. (dd-mm-yyyy) : ")

    try :
        with open(f"{date}.txt", "r") as f:
            res = f.read()
            print(res)
    except FileNotFoundError:
        print("해당 날짜의 다이어리를 찾을 수 없습니다 ㅠㅠ")

while True:
    menu()