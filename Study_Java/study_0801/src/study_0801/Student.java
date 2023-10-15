package study_0801;

// class01_practice 와 연결
public class Student {

	String name;
	int age;
	String phoneNum; // int phoneNum = 01012345678 <- int의 크기를 넘어서기 때문에 오류발생
	int studentNum;

	// s1~s3
//	Student(String str1, int num1, String str2, int num2) {				
//		name = str1;
//		age = num1;
//		phoneNum = str2;
//		studentNum = num2;				
//	}

	// s4
	Student(String str1) { // String 하나를 매개변수로 받는 생성자
		name = str1;
		age = 0;
		phoneNum = "010-****-****";

		if (str1.charAt(0) < 58) { // 입력된 값의 차이에 따라 입력 위치에 변화를 주면 된다
			phoneNum = str1;
			name = "Unknown";
		} else {
			name = str1;
			phoneNum = "010-****-****";
		}
	}

	// s5
	Student(int num) {
		name = "Unknown";
		age = num;
		phoneNum = "010-****-****";
	}

	// s6 <- s4와 결국 결과가 같아짐!!
//	Student(String str2) { // String 하나를 매개변수로 받는 생성자 결국 str1과 str2는 컴퓨터 입장에서 구별을 못한다
//		name = "Unknown";
//		age = 0;
//		phoneNum = str2;			
//	}

	// s7
	Student(String str1, int num) {
		name = str1;
		age = num;
		phoneNum = "010-****-****";
	}

	// s8
	Student(int num, String str2) {
		name = "Unknown";
		age = num;
		phoneNum = str2;
	}

	Student(String name, int age, String phoneNum) {
		// this(); // 클래스 내부(생성자 내부)에서 기본 생성자를 호출
		// this(name, age, phoneNum); 자기 자신을 불러오는 것은 오류!!
		this(name, age, phoneNum, 1);
	}

	Student(String name, int age, String phoneNum, int studentNum) {
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		this.studentNum = studentNum;
	}
	
//	Student(String name, int age, String phoneNum, int studentNum) {
//		this();
//	} <- 오류가 나는 이유는 생성자가 바로 위와 같기 때문이다
//	맨 위에 기본 생성자를 만들어보자

	void printStudent() {
		System.out.println(this.name + ", " + this.age + "세, " + this.phoneNum + ", 학번: " + this.studentNum);
	}

}

//this -> 클래스 내부를 가리킨다. (this.인스턴스변수)
//Student.printStudent(); 이건 호출이 안된다. 단, this -> 해당 객체
//this() -> 메소드, 생성자 -> s1();
//생성자 부분에서 다른 생성자를 불러오는 것.
//생성자 가장 첫번째 줄에 나와야 한다.