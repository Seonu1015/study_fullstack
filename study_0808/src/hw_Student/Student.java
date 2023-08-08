package hw_Student;

public class Student {

	private String name;
	private int age;
	private static String major;
	private static int majorNum;

	Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}

	String getName() {
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}

	String getMajor() {
		return this.major;
	}
	
	static int majorNumber() {
		if(major.equals("국문과")) {
			majorNum = 123000;
		} else if(major.equals("수학과")) {
			majorNum = 234000;
		} else if(major.equals("경영학과")) {
			majorNum = 345000;
		} else if(major.equals("무용과")) {
			majorNum = 456000;
		} else {
			majorNum = 567000;
		}
		return majorNum;
	}
	
	void studentInfo() {
		System.out.println("이름 : " + this.getName() + ", 나이 : " + this.getAge() + ", 전공 : " + this.getMajor());
	}

}
