package study_0727;

public class test04 {

	public static void main(String[] args) {
		
		// 4. int a = 10, int b = 20, int c = 30 if문을 가지고 C가 가장 크다. 라고 출력하기
		// (3가지 방법 사용)
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		
		// 방법1) if-else 사용
		
		if(a > b && a > c) {
			System.out.println("A가 가장 크다.");
		}
		else if(b > c) {
			System.out.println("B가 가장 크다.");
		}
		else {
			System.out.println("C가 가장 크다.");
		}

		// 방법2) if 중첩 - else
		
		if(a > b) {
			if(a > c) {
				System.out.println("A가 가장 크다.");
			}
		}
		else {
			if(b > c) {
				System.out.println("B가 가장 크다.");
			}
			else {
				System.out.println("C가 가장 크다.");
			}
		}
		
//		// 방법3) 단순 비교?
//		
//		if(c == 30) {
//			if(a == 10 && b == 20) {
//				System.out.println("C가 가장 크다.");
//			}
//		}
//		
//		// 방법4) if 안에 다 넣어버리기
//		
//		if(c > b) {
//			if(c > a) {
//				System.out.println("C가 가장 크다.");
//			}
//			else if(a > c) {
//				System.out.println("A가 가장 크다.");
//			}
//			else {
//				System.out.println("B가 가장 크다.");
//			}
//		}
//		
//		// 방법5)
//		
//		if(a - b < 0) {
//			if(b - c < 0) {
//				System.out.println("C가 가장 크다.");
//			}
//			else {
//				System.out.println("B가 가장 크다.");
//			}
//		}
//		else {
//			System.out.println("A가 가장 크다.");
//		}																		<< 결국 if 중첩

		
		if(a > c) {
			System.out.println("A가 가장 크다.");
		}
		else if(b > c) {
			System.out.println("B가 가장 크다.");
		}
		else {
			System.out.println("C가 가장 크다.");
		}

		
//			&&	T	F
//		T		T	F
//		F		F	F
//			||	T	F
//		T		T	T -> ! -> F F
//		F		T	F		  F T


		
				
//		// 삼항연산자
//		// 변수 = (조건) ? 값1 : 값2;	
//		
//		String str = (c > a && c > b) ? "C가 가장 크다." : "C가 가장 크지 않다";
//		System.out.println(str);												 << 이 방법은 첫번째 해결 방법과 같은 방법이다
//		
//		// switch
//		
//		switch(c) {
//		case 30:																<< 이 방법은 틀렸다
//			System.out.println("C가 가장 크다.");
//			break;
//		default:
//			System.out.println("C가 가장 크지 않다.");
//		}
		
	}

}
