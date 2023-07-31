package study_0731;

public class class02_practice {

	public static int a = 1;
	public static int b = 1;

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println(a++);
		System.out.println(b++); // 11 21
		func1();
		System.out.println("1. a : " + a + ", b : " + b); // 11 21
		func2(a, b);
		System.out.println("2. a : " + a + ", b : " + b); // 11 21
		func3();
		System.out.println("3. a : " + a + ", b : " + b); // 11 21
		func4();
		func5();
		System.out.println("4. a : " + a + ", b : " + b); // 11 21
		
		// func의 값은 거기서 반환으로 끝나고 print는 지역내의 변수를 끌고와서 출력해줄 뿐이다
		
//		a = func4();
//		b = func5();
//		System.out.println("4. a : " + a + ", b : " + b); // 2 2
		
		// a b에 함수 값을 넣어주는 작업을 해줘야 함수의 반환값이 출력된다
		
		func6(a); // 11
		func7(b); // 21
		System.out.println("5. a : " + a + ", b : " + b); // 11 21
		func8(a); // 11
		func9(b); // 21
		func10();
		func11();
		
	}

	public static void func1() { // 전역변수 : 2 2
		a++;
		b++;
	}

	public static void func2(int a, int b) { // 지역변수 : 12 22
		a++;
		b++;
	}

	public static void func3() {
		int a = -1;
		int b = -2;
	}

	public static int func4() {
		return a; // 2
	}

	public static int func5() {
		return b; // 2
	}
	
	public static int func6(int a) {
	    return a + 10; // 21
	}
	
	// 여기서 func6의 기능은 끝
	
	public static int func7(int b) {
	    return b + 10; // 31
	}
	
	// 여기서 func7의 기능은 끝
	
	public static void func8(int a) {
		System.out.println("6. a : " + a + ", b : " + b); // 11 2 <- 앞은 지역변수가 적용, 뒤는 전역변수가 적용
	}
	
	public static void func9(int b) {
		System.out.println("7. a : " + a + ", b : " + b); // 2 21
	}
	
	public static void func10() {
		System.out.println("8. a : " + a + ", b : " + b); // 2 2
	}
	
	public static void func11() {
	    int a = -1;
	    int b = -2;
		System.out.println("9. a : " + a + ", b : " + b); // -1 -2
	}

}
