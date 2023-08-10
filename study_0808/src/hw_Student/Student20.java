package hw_Student;

public class Student20 extends Student {

	private static int studentNumberInit = 20000000;
//	private static int countKor = 1;
//	private static int countMath = 1;
//	private static int countBusiness = 1;
//	private static int countDance = 1;
//	private static int countOther = 1;

//	일일이 입력한 것을 배열로 줄여보자
//	private static int[] count;
//	private int majorIndex;

	private static int[] majorCounts = new int[5];
	private static final String[] MAJORS = { "국문과", "수학과", "경영학과", "무용과", "기타" };

	private static int count;
	private int studentNumber;

	Student20(String name, int age, String major) {
		super(name, age, major);
//		majorIndex = this.getMajorList().indexOf(major);
//		count = new int[this.getMajorList().size()];
//		for(int i=0; i<count.length; i++) {
//        	count[i] = 0;
//        }
		this.studentNumber = setStudentNum();
	}
	
	int getStudentNum() {
		return studentNumber;
	}

	int getMajorIndex() {
		for (int i = 0; i < MAJORS.length; i++) {
			if (this.getMajor().equals(MAJORS[i])) {
				return i;
			}
		}
		return MAJORS.length - 1; // 배열 안에 없는 전공이면 기타에 넣게끔
	}

	int setStudentNum() {
		int majorIndex = getMajorIndex();
		count = ++majorCounts[majorIndex];
		return studentNumberInit + this.getMajorNum() + count;
		// count +1 을 안할 경우 0부터 출력 -> majorCounts[majorIndex]++;는 후위증가라서
		// ++majorCounts[majorIndex]; 로 바꾸면 count에 +1 을 하지 않고 1부터 진행하게 할 수 있음

//		if(this.getMajor().equals("국문과")) {
//			studentNumber = studentNumberInit + this.getMajorNum() + countKor;
//			countKor++;
//		} else if(this.getMajor().equals("수학과")) {
//			studentNumber = studentNumberInit + this.getMajorNum() + countMath;
//			countMath++;
//		} else if(this.getMajor().equals("경영학과")) {
//			studentNumber = studentNumberInit + this.getMajorNum() + countBusiness;
//			countBusiness++;
//		} else if(this.getMajor().equals("무용과")) {
//			studentNumber = studentNumberInit + this.getMajorNum() + countDance;
//			countDance++;
//		} else {
//			studentNumber = studentNumberInit + this.getMajorNum() + countOther;
//			countOther++;
//		}

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
//		return studentNumber;
	}

	@Override
	void studentInfo() {
		System.out.print("학번 : " + studentNumber + " ");
		super.studentInfo();
	}

}
