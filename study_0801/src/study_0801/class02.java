package study_0801;

public class class02 {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		//Dog dog = new Dog();
		//Cat cat = new Cat(); <- 기본 생성자가 없기 때문에 오류발생
		//				↓ 생성자를 추가로 입력해주면 된다
		Dog dog = new Dog("강아지", 4);
		Cat cat = new Cat("고양이", 5);
		
		dog.eat();
		dog.sleep();
		System.out.println(dog.name + " " + dog.age);
		
		cat.eat();
		cat.sleep();
		System.out.println(cat.name + " " + cat.age);
		
		animal.eat();
		animal.sleep();
		System.out.println(animal.name + " " + animal.age);
		
		

	}
}

//[[상속(inneritance)]] -> 자식에게 물려주는 것.
//
//부모 클래스(parent class), 기반 클래스(bass class)
//부모 클래스는 보통 자식 클래스가 공통적으로 가지는 필드와 메서드를 정의할 때 사용한다.
//부모클래스명 {}
//
//자식 클래스(child class), 파생 클래스(derives class)
//자식 클래스는 보통 부모 클래스에게 상속을 받아서 새로운 클래스를 만드는 것. 속성, 메서드들을 물려받을 수 있다.
//자식클래스명 extends 부모클래스명 {}
//자식 클래스에서 부모 클래스에게 상속을 받아 속성과 메소드를 사용하려면 super라는 키워드를 사용해야 한다.

//식당 -> 어느 나라 음식?, 식당 이름, 평점 (부모 클래스)
//가게 -> 메뉴, 가격 (자식 클래스)