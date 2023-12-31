# pickle 모듈
import pickle
# 파이썬에 딕셔너리, 리스트, 클래스 - 자료구조, 객체 등을 자료형 변환 없이 그대로 파일에 저장하고 싶을 때 사용한다.
# 인수가 여러 개일 때 -> 게시판(1. 글번호, 2. 글제목, 3. 글내용)

data = {"no": 1, "title": "제목", "content": "내용"}

print(data["no"])

with open('data.p', 'wb') as f:
    pickle.dump(data, f)

d = dict()
with open('data.p', 'rb') as f:
    d = pickle.load(f)

print(d)