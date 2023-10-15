package study_0727;
import java.util.Scanner;

public class class04 {
	public static void main(String[] args) {
	
		int a = 5;
		int b = 5;
		if(a == 5 && b == 5) {
			System.out.println("a는 5다. b도 5다");
		}
		else {
			System.out.println("a는 5가 아니다.");
		}
		
		if(a == 5) {
			System.out.print("a는 5다.");
			if(b == 5) {								// if 안에 if가 중첩일 때는 먼저 if 가 참일 때, 중첩된 if가 실행된다
				System.out.println("b도 5다.");
			}
			else {
				System.out.println("b는 5가 아니다.");
			}
		}
		else if (a == 6) {
			System.out.println("a는 6이다.");
			if(b == 6) {
				System.out.println("b도 6이다.");
			}
			else {
				System.out.println("b는 6이 아니다.");
			}
		}
		
		// 숫자가 홀수인지 짝수인지, 양수인지 음수인지
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		if(a > 0) {
			System.out.print("a는 양수입니다.");
			if(a % 2 == 0) {
				System.out.println(" 그리고 짝수입니다.");
			}
			else {
				System.out.println(" 그리고 홀수입니다.");
			}
		}
		else if(a < 0) {
			System.out.print("a는 음수입니다.");
			if(a % 2 == 0) {
				System.out.println(" 그리고 짝수입니다.");
			}
			else {
				System.out.println(" 그리고 홀수입니다.");
			}
		}
		else {
			System.out.println("a는 0이다.");
		}
		

		switch(a) {
			case 1:
				System.out.println("a는 1입니다.");
				break;
			case 2:
				System.out.println("a는 2입니다.");
				break;
			case 3:
				System.out.println("a는 3입니다.");
				break;
			default:
				System.out.println("a는 1,2,3이 아니다.");
			
		}
		
		// 위 switch문을 if문으로 바꿔보자
		
		if(a == 1) {
			System.out.println("a는 1입니다.");
		}
		else if(a == 2) {
			System.out.println("a는 2입니다.");
		}
		else if(a == 3) {
			System.out.println("a는 3입니다.");
		}
		else {
			System.out.println("a는 1,2,3이 아니다.");
		}
		
		// switch문과 if문이 결과는 같은데 switch문을 사용하는 이유는 코드가 길어질수록 속도가 많이 빠르기 때문, 가독성 측면에서도 좋다
		
		
		String str = (a % 2 == 0) ? "짝수" : "홀수";
		System.out.println(str);
		
		
		
		
		
		
	}
}

// [[조건문]]

// if문

//	if(조건식) {
//		코드 -> 조건식이 참일 때, 실행
//	}
//	else {											<- else 는 항상 마지막에
//		코드 -> 이전에 있던 조건식이 거짓일 때, 실행
//	}

//	if(조건1) {
//		조건1이 참일 때, 실행
//	}
//	else if(조건2) {									<- else if 는 if 다음에
//		조건1이 거짓이고 조건2가 참일 때, 실행
//	}
//	else if(조건3) {
//		조건1, 2가 거짓이고 조건3가 참일 때, 실행
//	}
//	else if(조건 계속 추가 가능!!) {
//
//	}
//	else {
//		조건1,2,3... 모두 거짓일 때, 실행
//	}


// switch문

// switch(변수) {
//	case 1 : 코드
//		break;
//	case 2 : 코드
//		break;
//	case 3 : 코드
//		break;
//	case 4 : 코드
//		break;
//	default : 코드
// }


// 삼항연산자
// 변수 = (조건) ? 값1 : 값2;			<- 조건이 참이면 값1 할당, 거짓이면 값2 할당


