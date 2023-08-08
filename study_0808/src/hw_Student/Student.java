package hw_Student;

public class Student {

	private String name;
	private int age;
	private String major;
	private int majorNum;

	Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
		this.majorNum = majorNumber();
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

	int getMajorNum() {
		return this.majorNum;
	}

	int majorNumber() {
		if (major.equals("국문과")) {
			majorNum = 123400;
		} else if (major.equals("수학과")) {
			majorNum = 234500;
		} else if (major.equals("경영학과")) {
			majorNum = 345600;
		} else if (major.equals("무용과")) {
			majorNum = 456700;
		} else {
			majorNum = 567800;
		}
		return majorNum;
	}

	void studentInfo() {
		System.out.println("이름 : " + this.getName() + ", 나이 : " + this.getAge() + ", 전공 : " + this.getMajor());
	}

}
