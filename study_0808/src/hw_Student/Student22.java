package hw_Student;

public class Student22 extends Student {

	private static int studentNumberInit = 20000000;

	private static int[] majorCounts = new int[5];
	private static final String[] MAJORS = { "국문과", "수학과", "경영학과", "무용과", "기타" };

	private static int count;
	private int studentNumber;

	Student22(String name, int age, String major) {
		super(name, age, major);

		this.studentNumber = setStudentNum();
	}

	int getMajorIndex() {
		for (int i = 0; i < MAJORS.length; i++) {
			if (this.getMajor().equals(MAJORS[i])) {
				return i;
			}
		}
		return MAJORS.length - 1;
	}

	int setStudentNum() {
		int majorIndex = getMajorIndex();
		count = ++majorCounts[majorIndex];
		return studentNumberInit + this.getMajorNum() + count;

	}

	@Override
	void studentInfo() {
		System.out.println();
		System.out.print("학번 : " + studentNumber + " ");
		super.studentInfo();
	}
}
