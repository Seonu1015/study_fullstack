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
	private int majorIndex;
	private int studentNumber;

	Student20(String name, int age, String major) {
		super(name, age, major);
		//majorIndex = this.getMajorList().indexOf(major);
//		count = new int[this.getMajorList().size()];
//		for(int i=0; i<count.length; i++) {
//        	count[i] = 0;
//        }
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
		
//		if(this.getMajor().equals("국문과")) {
//			studentNumber = studentNumberInit + this.getMajorNum() + count[0];
//			count[0]++;
//		} else if(this.getMajor().equals("수학과")) {
//			studentNumber = studentNumberInit + this.getMajorNum() + count[1];
//			count[1]++;
//		} else if(this.getMajor().equals("경영학과")) {
//			studentNumber = studentNumberInit + this.getMajorNum() + count[2];
//			count[2]++;
//		} else if(this.getMajor().equals("무용과")) {
//			studentNumber = studentNumberInit + this.getMajorNum() + count[3];
//			count[3]++;
//		} else {
//			studentNumber = studentNumberInit + this.getMajorNum() + count[4];
//			count[4]++;
//		}
		return studentNumber;
	}

	@Override
	void studentInfo() {
		System.out.println();
		System.out.print("학번 : " + studentNumber + " ");
		System.out.println("이름 : " + this.getName() + ", 나이 : " + this.getAge() + ", 전공 : " + this.getMajor());
	}

}
