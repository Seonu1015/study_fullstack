package study_0810;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//@Override
//public boolean equals(Obeject obj) {
//	obj.toString() == this.toString()
//	obj.studentNumber == obj.studentNumber ...
//}

//@Override
//public boolean equals(Object obj) {
//	if(obj instanceof Unit) {
//		Unit unit = (Unit) obj;
//		return this.name == obj.name && this.level == unit.level;
//	}
//	return false;
//}

//최상위 클래스 Object
//public boolean equals(Obeject obj)
//모든 클래스들은 Object에 들어갈 수 있다.
//
//Object obj = new Child();
//Object obj = new Tiger();

//equals 원래는 Object 클래스에서 주소값을 비교하여 같은지 판단하는 것

//Object obj = new Unit();
//return this.name == obj.name && this.level == obj.level;
//obj.name과 obj.level에서 빨간 줄이 뜨는 이유는 Object 상에서 자기한테 name이 있는지 level 있는지 알 수가 없기 때문

//명확하게 obj가 어떤 클래스인지 검증하고 나면 자기한테 name이 있는지 level이 있는지 알 수가 있다.
//참조변수 instanceof 클래스명 <- boolean 형태

//p1 instanceof Child -> p1 클래스가 Child야? false
//p1 instanceof Parent -> p1 클래스가 Parent야? true
//p1 instanceof Object -> p1 클래스가 Object야? true

//c1 instanceof Child -> c1 클래스가 Child야? true
//c1 instanceof Parent -> c1 클래스가 Parent야? true
//c1 instanceof Object -> c1 클래스가 Object야? true