package hw_Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Student student201 = new Student20("A", 23, "국문과"); // <- 이렇게 만들게 되면 student의 객체인데 student20의 형식을 빌려온 것!
		Student student202 = new Student20("B", 23, "국문과");		
		Student student203 = new Student20("C", 24, "수학과");
		Student student204 = new Student20("A", 23, "국문과");
		Student student205 = new Student20("B", 23, "경영학과");		
		Student student206 = new Student20("C", 24, "수학과");
		Student student207 = new Student20("A", 23, "국문과");
		Student student208 = new Student20("B", 23, "무용과");		
		Student student209 = new Student20("C", 24, "수학과");
		Student student2010 = new Student20("A", 23, "국문과");
		Student student2011 = new Student20("B", 23, "국문과");		
		Student student2012 = new Student20("C", 24, "수학과");
		Student student2013 = new Student20("A", 23, "유아교육과");
		Student student2014 = new Student20("B", 23, "통계학과");		
		Student student2015 = new Student20("C", 24, "영문과");
		
//		student201.studentInfo();
//		student202.studentInfo();
//		student203.studentInfo();
//		student204.studentInfo();
//		student205.studentInfo();
//		student206.studentInfo();
//		student207.studentInfo();
//		student208.studentInfo();
//		student209.studentInfo();
//		student2010.studentInfo();
//		student2011.studentInfo();
//		student2012.studentInfo();
//		student2013.studentInfo();
//		student2014.studentInfo();
//		student2015.studentInfo();
		
		// student2012.setMajorList();
		
		System.out.println("----------------------------------");		
		Student.countMajorStudent();
		System.out.println("----------------------------------");
		Student.majorStudentsInfo();
		System.out.println("----------------------------------");
		Student.searchStudentInfo();
		
	}
}

// 학번을 검색하면 해당 학생의 정보가 출력되게끔 해보자 <- 알고리즘이 있다고???????!!
// 0810 다형성 부분 참고해서 작성해보자
