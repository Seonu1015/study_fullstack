package study_0801;

public class Person {

	String name; // = "park";
	int age; // = 1;
	
	Person() { // <- 기본 생성자
		System.out.println("Person 객체가 생성되었습니다.");
		name = "Unknown";
		age = 0;
	}
	
	Person(String str) { // <- p4
		name = str;
		age = 0;
	}
	
	Person(int num) { // <- p5
		name = "Unknown";
		age = num;
	}
	
	Person(String str, int num) { // 매개변수가 있는 생성자 <- p3
		name = str.toUpperCase();
		age = num;
	}
	
	Person(String str1, String str2, int num1, int num2) {
		name = str1;
		age = num1;
	}
	
	void printPerson() {
		System.out.println(age + " " + name);
	}
	
	
	
	
	
}
