package hw_Student;

public class Student20 extends Student {

	private static int studentNumberInit = 20000000;
	private static int countKor = 1;
	private static int countMath = 1;
	private static int countBusiness = 1;
	private static int countDance = 1;
	private static int countOther = 1;
	
	// 일일이 입력한 것을 배열로 줄여보자
	private static int[] count;
	
	Student20(int[] count) {
		for (int i = 0; i < this.getMajorList().length/* 어레이리스트의 칸수는 length가 아닌가? */; i++) {
			count[i] = 1;
		}
	}

	private int studentNumber;

	Student20(String name, int age, String major) {
		super(name, age, major);
		this.studentNumber = setStudentNum();
	}
	
	int setStudentNum() {
		if(this.getMajor().equals("국문과")) {
			studentNumber = studentNumberInit + this.getMajorNum() + countKor;
			countKor++;
		} else if(this.getMajor().equals("수학과")) {
			studentNumber = studentNumberInit + this.getMajorNum() + countMath;
			countMath++;
		} else if(this.getMajor().equals("경영학과")) {
			studentNumber = studentNumberInit + this.getMajorNum() + countBusiness;
			countBusiness++;
		} else if(this.getMajor().equals("무용과")) {
			studentNumber = studentNumberInit + this.getMajorNum() + countDance;
			countDance++;
		} else {
			studentNumber = studentNumberInit + this.getMajorNum() + countOther;
			countOther++;
		}
		return studentNumber;
	}

	@Override
	void studentInfo() {
		System.out.println();
		System.out.print("학번 : " + studentNumber + " ");
		System.out.println("이름 : " + this.getName() + ", 나이 : " + this.getAge() + ", 전공 : " + this.getMajor());
	}

}
