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

	String getMajor() {
		return this.major;
	}
	
	static int majorNumber() {
		if(major.equals("국문과")) {
			majorNum = 1234;
		} else if(major.equals("수학과")) {
			majorNum = 2345;
		} else if(major.equals("경영학과")) {
			majorNum = 3456;
		}
		return majorNum;
	}

}
