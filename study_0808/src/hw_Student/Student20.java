package hw_Student;

public class Student20 extends Student {
	
	static int studentNumberInit = 20000000;
	static int count = 0;
	
	Student20(String name, int age, String major) {
		super(name, age, major);
		this.studentNumberInit = studentNumberInit;
		this.count++;
	}
	
	private int studentNumber() {
		this.studentNumberInit += count;
		return this.studentNumber();
	}
	
	int 
	
	int getStudentNumber() {
		return this.studentNumber();
	}
	
	@Override
	void studentInfo() {
		System.out.println("studentNumberInit : " + studentNumberInit + ", count : " + count);
//		System.out.println("학번 : " + this.getStudentNumber());
		System.out.println("이름 : " + this.getName() + ", 나이 : " + this.getAge() + ", 전공 : " + this.getMajor());
	}
	
}
