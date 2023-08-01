package study_0801;

public class class01_practice {
	public static void main(String[] args) {
		
		int num = 1;
		
//		Student s1 = new Student("홍길동", 27, "010-1234-5678");
//		System.out.println(s1.name + ", " + s1.age + "세, " + s1.phoneNum + ", 학번: " + num++);
//
//		Student s2 = new Student("김철수", 33, "010-1234-9876");
//		System.out.println(s2.name + ", " + s2.age + "세, " + s2.phoneNum + ", 학번: " + num++);
//		
//		Student s3 = new Student("이영희", 25, "010-1234-4567");
//		System.out.println(s3.name + ", " + s3.age + "세, " + s3.phoneNum + ", 학번: " + num++);
//		
//		Student s4 = new Student("박나라");
//		System.out.println(s4.name + ", " + s4.age + "세, " + s4.phoneNum + ", 학번: " + num++);
//		
//		Student s5 = new Student(35);
//		System.out.println(s5.name + ", " + s5.age + "세, " + s5.phoneNum + ", 학번: " + num++);
//		
//		Student s6 = new Student("010-1234-3456"); 
//		System.out.println(s6.name + ", " + s6.age + "세, " + s6.phoneNum + ", 학번: " + num++);
//		
//		Student s7 = new Student("최대한", 35);
//		System.out.println(s7.name + ", " + s7.age + "세, " + s7.phoneNum + ", 학번: " + num++);
//	
//		Student s8 = new Student(32, "010-1234-2345");
//		System.out.println(s8.name + ", " + s8.age + "세, " + s8.phoneNum + ", 학번: " + num++);
		
		//풀이
		
		Student s1 = new Student("A", 27, "010-1234-5678", num++);
		Student s2 = new Student("B", 27, "010-1234-5678", num++);
		Student s3 = new Student("C", 27, "010-1234-5678", num++);
		
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();
		
		Student s4 = new Student("010-1234-5678");
		Student s5 = new Student("jack");
		
		//System.out.println((int)'0'); <- 아스키 코드를 찾아서 Student클래스에서 s4번과 같이 확인
		
		s4.printStudent();
		s5.printStudent();
		
		Student s6 = new Student("C", 27, "010-1234-5678");
		s6.printStudent();
		
		
	}	
}

