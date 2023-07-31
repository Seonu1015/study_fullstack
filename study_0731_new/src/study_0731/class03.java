package study_0731;

public class class03 {
	public static void main(String[] args) {

		Person lee = new Person("Lee", 21);
		
		lee.sayHello();
		System.out.println(lee.name);
		System.out.println(lee.age);
		
		Person kim = new Person("Kim", 20);
		kim.sayHello();
		System.out.println(kim.name);
		System.out.println(kim.age);
		
		Dog dog1 = new Dog();
		dog1.name = "푸들";
		dog1.age = 5;
		dog1.sayHello();
		
		Dog dog2 = new Dog();
		dog2.name = "치와와";
		dog2.age = 2;
		dog2.sayHello();
		
		System.out.println("--------------------------");
		
		Car car1 = new Car();
		car1.model = "쏘나타";
		car1.size = "중형";
		car1.cc = 2000;
		car1.information();
		
		Car car2 = new Car();
		car2.model = "싼타페";
		car2.size = "중형suv";
		car2.cc = 2000;
		car2.information();
		
	}
}

//[[객체와 클래스]]
//자바 <객체지향언어>

//클래스 (설계도)
//객체 (설계도를 통해 만들어진 것)

//[접근제어자] class 클래스명 {
//	인스턴스 변수
//	자료형 변수명1;
//	자료형 변수명2; ... << 여러 개를 설계해도 상관없고 아예 없어도 상관없다. 
//	
//	생성자
//	클래스명(매개변수1, 매개변수2...) <- 매개변수도 많거나 없을 수 있다
//	
//	메소드
//	자료형 함수명(매개변수1, 매개변수2...) {
//		코드
//		반환값
//	}
//}

//틀만 만들어두면 쉽게 가져와서 쓸 수 있어서 편하다
//한 패키지 안에 있어야 불러올 수 있다

//자동차 클래스, 인스턴스 변수, 메소드