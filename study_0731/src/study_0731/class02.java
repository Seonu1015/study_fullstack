package study_0731;

public class class02 {

	public static int a = 10;
	public static int b = 20; // 전역변수 O <- 색이 변한다

	public static void main(String[] args) {

		int a = 1;
		int b = 2; // 전역변수 X, public static void main(String[] args) {} 이 안에 속한 지역변수 O

		System.out.println(function());
		System.out.println(a + b); // 해당 {} 안에서는 지역변수가 우선한다
		function(a, b); // 지역변수가 전달되서 해당 함수를 진행한다

	}

	public static int function() {
		return a + b;
	}

	public static void function(int a, int b) {
		System.out.println(a + b);
	}

}

//지역변수 & 전역변수
//
//지역변수 -> 반복문 안에서 사용했던, for(int i=0) {}
//매개변수 -> 지역변수
