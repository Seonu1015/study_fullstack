package study_0803;

// 클래스와 객체
public class Class04 {
	public static void main(String[] args) {
		
		Person kim = new Person();
		
		kim.name = "KIM";
		kim.age = 23;
		
		System.out.println("이름 : " + kim.name + ", 나이 : " + kim.age);
		
		System.out.println("------------------------------");
		
		kim.speak();
		kim.run();
		kim.eat();
		
		System.out.println("------------------------------");
		
		// 생성자를 만들어서
		Person choi = new Person("CHOI", 34);
		choi.speak();
		choi.run();
		choi.eat();
		
	}
}

