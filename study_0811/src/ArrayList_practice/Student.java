package ArrayList_practice;

import java.util.ArrayList;

public class Student {
	private String name;
	private String studentNumber;
	private int grade;
	
	static ArrayList<Student> students = new ArrayList<>();
		
	Student() {
		name = "";
		studentNumber = "";
		grade = 0;
		students.add(this);
	}	
	
	Student(String studentNumber, int grade) {
		name = "학생";
		this.studentNumber = studentNumber;
		this.grade = grade;
		students.add(this);
	}
	
	Student(String name, String studentNumber, int grade) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.grade = grade;
		students.add(this);
	}
	
	String getName() {
		return name;
	}
	
	int getGrade() {
		return grade;
	}
	
	public String toString() {
		return "이름 : " + name + ", 학년 : " + grade + ", 학번 : " + studentNumber;
	}
}
