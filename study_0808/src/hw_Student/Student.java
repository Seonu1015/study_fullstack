package hw_Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	Scanner sc = new Scanner(System.in);

	private String name;
	private int age;
	private String major;
	private int majorNum;

	static ArrayList<Student> studentsList = new ArrayList<>();

	static ArrayList<String> majorList = new ArrayList<>();
	// 생성된 객체가 해당 어레이리스트를 "공유"해서
	// 어레이리스트 안에 쌓이게 하려면 static!!

	Student() {

	}

	Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
		this.majorNum = majorNumber();
		setMajorList();
		setStudentsList(this);
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

	ArrayList<Student> getStudentsList() {
		return Student.studentsList;
	}

	void setStudentsList(Student student) {
		studentsList.add(student);
	}

	ArrayList<String> getMajorList() {
		return Student.majorList;
	}

	void setMajorList() {
		if (!majorList.contains(major)) {
			majorList.add(major);
			// System.out.println(majorList);
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

	static void countMajorStudent() { // 메서드에 static을 쓰면 클래스 자체를 객체로 넣어서 작업 가능
										// Student.countMajorStudent(); <- 이게 가능해진다.
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 확인하고 싶은 전공을 입력하세요.");
		String inputMajor = sc.next();
		int countStudent = 0;
		for (int i = 0; i < studentsList.size(); i++) {
			if (inputMajor.equals(studentsList.get(i).major)) {
				countStudent++;
			}
		}
		System.out.println(inputMajor + "의 학생 수 : " + countStudent);
	}

	static void majorStudentsInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("전공을 입력하세요.");
		String inputMajor = sc.next();
		for (int i = 0; i < studentsList.size(); i++) {
			if (inputMajor.equals(studentsList.get(i).major)) {
				studentsList.get(i).studentInfo();
			}
		}
	}

	static void searchStudentInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학번을 입력하세요.");
		int SN = sc.nextInt();
		for (int i = 0; i < studentsList.size(); i++) {
			if (studentsList.get(i) instanceof Student20) {
				Student20 s = (Student20) studentsList.get(i);
				if (SN == s.getStudentNum()) {
					studentsList.get(i).studentInfo();
				}
			}
		}
	}
	
	

}
