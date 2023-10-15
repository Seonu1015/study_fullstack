package study_0801;

public class Cat extends Animal {

	String name;
	int age;
	
	Cat(String name, int age) {
		// super();	<- 부모클래스에 기본생성자가 없으면 오류발생	
		this.name = name;
		this.age = age;
	}
	
	void eat() {
		System.out.println("야용~");
	}
	
	void sleep() {
		System.out.println("고양이가 잠을 잡니다.");
	}	
	
}

//Cat cat = new Cat();
