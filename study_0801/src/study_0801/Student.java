package study_0801;

public class Student {
	
	String name;
	int age;
	String phone;
	//int studentNum = 0;
	
	Student(String str1, int num1, String str2) {				
		name = str1;
		age = num1;
		phone = str2;
		//studentNum = 0;				
	}
	
	Student(String str1) {				
		name = str1;
		age = 0;
		phone = "010-****-****";			
	}
	
	Student(int num) {				
		name = "Unknown";
		age = num;
		phone = "010-****-****";			
	}
	
	Student(String str1, int num1) {				
		name = str1;
		age = num1;
		phone = "010-****-****";				
	}
	
}
