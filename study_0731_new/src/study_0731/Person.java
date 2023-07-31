package study_0731;

public class Person {
	String name = "Kim";
	int age = 20;
	int[] arr = new int[5]; // <- 배열도 넣어서 가능함!
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void sayHello() {
		System.out.println("Hello, my name is " + name + " and I'm "
				+ age + " years old.");					
	}

}
