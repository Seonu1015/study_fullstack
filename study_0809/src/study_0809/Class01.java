package study_0809;

public class Class01 {
	public static void main(String[] args) {
		
		System.out.println(Math.add(1, 2));
		System.out.println(Math.add(1.5, 2.456));
		System.out.println(Math.add(1, 2, 3));
		
	}
}

//다형성(Polymorphism)

//1. 메서드 오버로딩 (Overloading)
//메서드를 선언할 때, 똑같은 이름으로 메서드를 사용 <- 생성자에서 해봤음
//메서드 오버라이딩 : 자식 클래스에서 동일한 이름과 매개변수를 가진 메서드를 정의하여 부모 클래스의 메서드를 대체하는 것.
//메서드 오버로딩 : 같은 이름의 메서드를 매개변수의 개수, 타입, 순서 등의 차이를 이용하여 메서드 자체를 여러개 정의하는 것.

//void attack(Character character) {}
//void attack(Monster monster) {}
//매개변수가 다르기 때문에 서로 다르게 받아들인다