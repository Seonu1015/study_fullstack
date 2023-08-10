package study_0810;

public class Class01 {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.speak();
		
		Dog dog = new Dog();
		dog.speak();
		
		//Cat cat = new Animal(); <- 이건 불가능!
		Animal cat = new Cat();
		cat.speak();
		
		//Tiger tiger = new Dog();
		//Tiger tiger = new Cat();
		//부모-자식 관계가 아니기 때문에 불가능하다
		
		Animal tiger = new Animal();
		tiger.speak();
		Animal tigertiger = new Tiger();
		tiger.speak();
		Tiger tiger2 = new Tiger();
		
		//Animal ani1 = ???; // animal, dog, cat, tiger, tigertiger <- 모두 가능
		//Tiger ti1 = ???; // animal, dog, cat, tiger, tigertiger <- 모두 불가능 // tiger2 일 때는 가능
									//	    └ 얘네는 Animal의 객체이니까 안된다.
		
		Tiger ti1 = (Tiger) animal;
		//ti1 = (Tiger) dog; <- 부모 자식 관계가 아니어서 불가능
		ti1 = (Tiger) tigertiger; // 가능하다

	}
}

class Animal {
	public void speak() {
		System.out.println("동물이 소리를 낸다.");
	}
}

class Dog extends Animal {
	@Override
	public void speak() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	public void speak() {
		System.out.println("야옹");
	}
}

class Tiger extends Animal {
	@Override
	public void speak() {
		System.out.println("어흥");
	}
}

//다형성
//1. 메서드 오버라이딩, 메서드 오버로딩
//2. 참조변수 - 객체 캐스팅

//캐스팅 (int) Math.random
//		└ 이 (int) 가 캐스팅
//객체 캐스팅 (Character) monset

//다형성에서 부모-자식 관계에서 캐스팅을 사용할 수 있다. (연관성이 있어야 가능하다.)
//이 때, 참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스의 멤버의 변수보다 작아야 한다.
//부모 <= 자식


//class Parent {}
//class Child extends Parent {}
//class Person {}
//
//Parent p1 = new Parent();
//Child c1 = new Child();
//Parent p2 = new Child(); <- 가능!
//Child c2 = new Parent(); <- 불가능!
//Person pp = new Person();
//Child c2 = (Child)P2;


//참조 변수의 타입변환 (캐스팅)
//p1(new Parent), p2(new Child)
//c1 = (Child) p1
//c1 = (Child) p2
//c1 = (Child) pp <- 연관성이 없기 때문에 불가능
//
//p1 = /*(Child)*/ c1 <- 가능 (우항의 범위가 더 커야함) // 캐스팅 (Child) 을 생략할 수 있다
//Parent parent = new Child(); <- 가능