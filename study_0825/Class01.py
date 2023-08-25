# read() : 파일의 전체 내용을 문자열로 반환
# readline() : 파일에서 한 줄씩 문자열로 읽어옵니다.
# readlines() : 파일의 전체 내용을 한 줄씩 읽어와서 각각 리스트로 만들어서 반환

with open("alice.txt", "r") as f:
    line = f.readline()
    while line:
        print(line, end = "")
        line = f.readline()