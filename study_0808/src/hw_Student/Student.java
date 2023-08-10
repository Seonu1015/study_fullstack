package hw_Student;

import java.util.ArrayList;

public class Student {

	private String name;
	private int age;
	private String major;
	private int majorNum;
	
	Student() {
		
	}

	Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
		this.majorNum = majorNumber();
		setMajorList();
		//addStudents(student);
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
		
	static ArrayList<String> majorList = new ArrayList<>();
	// 생성된 객체가 해당 어레이리스트를 "공유"해서
	// 어레이리스트 안에 쌓이게 하려면 static!!
	
	ArrayList<String> getMajorList() {
		return this.majorList;
	}
	
	void setMajorList() {
		if(!majorList.contains(major)) {
			majorList.add(major);
			//System.out.println(majorList);
		}
	}

	int getMajorNum() {
		return this.majorNum;
	}

	int majorNumber() {
		if (major.equals("국문과")) {
			majorNum = 123000;
		} else if (major.equals("수학과")) {
			majorNum = 234000;
		} else if (major.equals("경영학과")) {
			majorNum = 345000;
		} else if (major.equals("무용과")) {
			majorNum = 456000;
		} else {
			majorNum = 999000;
		}
		return majorNum;
	}
	
//    public static final String majorKorean = "국문과";
//    public static final int majorNumKorean = 123400;
//    public static final String majorMath = "수학과";
//    public static final int majorNumMath = 234500;
//    public static final String majorBusiness = "경영학과";
//    public static final int majorNumBusiness = 345600;
//    public static final String majorDance = "무용과";
//    public static final int majorNumDance = 456700;

	void studentInfo() {
		System.out.println("이름 : " + this.getName() + ", 나이 : " + this.getAge() + ", 전공 : " + this.getMajor());
	}
	
	
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			Student student = (Student) obj;
//			return majorList.get(0).equals(obj);
//		}
//		return false;
//	} // 이거 뭔가 잘못됐다....
	
	ArrayList<Student> students = new ArrayList<>();
	
	void addStudents(Student student) {
		students.add(student);
		
	}

}
