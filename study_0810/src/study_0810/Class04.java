package study_0810;

public class Class04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


abstract class Animal1 { // "동물이 소리를 낸다."를 굳이 입력하고 싶지 않지만, 자식 클래스에서는 넣게 하고 싶다!!
	abstract void speak();
}

class Dog1 extends Animal1 {
	@Override
	public void speak() {
		System.out.println("멍멍");
	}
}

class Cat1 extends Animal1 {
	@Override
	public void speak() {
		System.out.println("야옹");
	}
}

class Tiger1 extends Cat1 {

}

//부모는 한 명 밖에 없다. extends는 하나 밖에 받을 수 없다.
//추상클래스 vs 일반클래스

//일반 클래스 - 추상 클래스 - 일반 클래스
//추상 클래스 - 일반 클래스 - 일반 클래스 <- 순서는 상관없이 상속이 이어질 수 있다