package study_0807;

public class Class02 {
	public static void main(String[] args) {
		
		Moviee movie = new Moviee("기생충", 132);
		
		movie.playMovie();
		
		movie.setTime(142);
		System.out.println(movie.getTitle() + movie.getTime());
		
	}
}

//캡슐화(Encapsulation)
//객체 지향 프로그래밍에서 사용되는 개념
//객체의 상태를 보호하기 위해 데이터(변수)와 기능(메서드)를 하나로 묶는 것을 말한다.
//보안성 - 외부에서 객체 내부에 직접적으로 접근하는 것을 제한함으로써,
//		객체의 무결정을 유지하고 객체의 사용 방법을 간소화 할 수 있다.
		
//캡슐화 이후에는 당연히 내부 상태를 외부에서 직접적으로 수정할 수 없다.


//접근 제한자(Access Modifier)
//public*, protected, default, private*

//public -> 모든 코드에서 접근이 가능
//private -> 해당 클래스 내부에서만 접근이 가능
//protected -> 동일 패키지 내에서는 모두 접근 가능, 외부 패키지에서는 상속을 받은 클래스 내부에서만 접근 가능
//default -> 동일 패키지 내에서만 접근 가능

//정보 은닉(information hiding)
//private int num; <- 변수 자체로는 접근이 안되지만
//getNum(), setNum(int num) <- 메서드를 통해서 접근하겠다 : getter, setter 메서드 <- 개발자들의 약속(?)

//getter, setter -> 인스턴스 변수의 값을 변경하는 역할을 한다.
//게터와 세터를 통해 정보 은닉을 유지하고, 외부에서도 필요한 데이터에 접근을 가능하게 한다.

