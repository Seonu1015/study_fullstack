package study_0801;

//부모 클래스
public class Animal {

	String name;
	int age;
	
	//기본생성자
	Animal() {
		name = "???";
		age = 0;
	}
	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void eat() {
		System.out.println("The animal is eating.");
	}
	
	void sleep() {
		System.out.println("The animal is sleeping.");
	}	
	
}

//자식 클래스에 name, age, eat(), sleep()을 전달해 줄 수 있을 것 같다.