package study_0811;

public class Class03 {
	public static void main(String[] args) {
		
		Outer outer = new Outer(4);
//		Outer.Inner inner = new Outer.Inner(); <- 불가능
//		Outer.Inner inner = new Outer(); <- 불가능
		Outer.Inner inner = outer.inner;
		inner.printOuter();
		
		Outer2.Inner inner2 = new Outer2.Inner(); //static을 선언해서 사용이 가능해진다.
		inner2.printOuter();
		
	}
}

//이너 클래스(Inner Class) -> 클래스 내부에 선언된 클래스

//1. 멤버 이너 클래스(Member Inner Class)
//외부 클래스의 모든 멤버를 참조할 수 있으며, 외부 클래스를 인스턴스화 한 뒤에 이너 클래스를 인스턴스화해야 사용가능하다.

//2. static 이너 클래스()
//이너 클래스는 보통 클래스 내부에서만 사용이 된다.
//캡슐화 (정보 은닉 목적)

//3. 이너 인터페이스(Inner Interface) -> 클래스 내부에 선언된 인터페이스
//클래스 내부에서만 사용될 것으로 예상되는 인터페이스를 내부에 정의한다.

//클래스 내부에서만 사용되니 public, private 같은 접근 지정자를 명시하지 않는 것이 일반적.