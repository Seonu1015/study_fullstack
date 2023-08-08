package hw_Student;

public class Main {
	public static void main(String[] args) {

		Student20 student201 = new Student20("A", 23, "국문과");
		Student20 student202 = new Student20("B", 23, "국문과");
		
		Student20 student203 = new Student20("C", 24, "수학과");
		
		Student22 student221 = new Student22("A", 21, "경영학과");
		
		student201.studentInfo();
		student202.studentInfo();
		student203.studentInfo();
		student221.studentInfo();
		
	}
}
