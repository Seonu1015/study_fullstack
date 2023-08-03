package hw_Animal;

public class Animal {

	String type;
	String name;
	int age;

	Animal(String type) {
		this.type = type;
		this.name = " ";
		this.age = 0;
	}

	Animal(String type, String name, int age) {
		this.type = type;
		this.name = name;
		this.age = age;
	}

	void spk() {
		System.out.println("[ 종류 : " + type + ", 이름 : " + name + ", 나이는 : " + age + " ]");
	}

	void wlk() {
		System.out.println(name + " 이(가) 산책을 나갑니다.");
	}

	void slp() {
		System.out.println(name + " 이(가) 잠을 잡니다.");
	}

	void trt() {
		System.out.println(name + " 이(가) 간식을 먹습니다.");
	}

}
