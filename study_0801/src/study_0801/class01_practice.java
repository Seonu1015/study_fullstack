package study_0801;

public class class01_practice {
	public static void main(String[] args) {
		
		
		int num = 1;
		
		Student s1 = new Student("홍길동", 27, "010-1234-5678");
		System.out.println(s1.name + ", " + s1.age + "세, " + s1.phone + ", 학번: " + num++);

		Student s2 = new Student("김철수", 33, "010-1234-5678");
		System.out.println(s2.name + ", " + s2.age + "세, " + s2.phone + ", 학번: " + num++);
		
		Student s3 = new Student("이영희", 25, "010-1234-5678");
		System.out.println(s3.name + ", " + s3.age + "세, " + s3.phone + ", 학번: " + num++);
		
		Student s4 = new Student("박나라");
		System.out.println(s4.name + ", " + s4.age + "세, " + s4.phone + ", 학번: " + num++);
		
		Student s5 = new Student(35);
		System.out.println(s5.name + ", " + s5.age + "세, " + s5.phone + ", 학번: " + num++);
		
		Student s6 = new Student("최대한", 35);
		System.out.println(s6.name + ", " + s6.age + "세, " + s6.phone + ", 학번: " + num++);
	

	}	
}
