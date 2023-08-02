package study_0802;

import java.util.Scanner;

// 조건문
public class Class02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1, 2, 3 중에서 입력하세요 : ");
		int input = sc.nextInt();
				
		if(input == 1) {
			System.out.println("가위입니다.");
		} else if(input == 2) {
			System.out.println("바위입니다.");
		} else {
			System.out.println("보입니다.");
		}
		
		// switch
		int num = 12;

		switch (num) {
		case 12:
			System.out.println(num);
			break;
		case 1:
			num *= 10;
			break;
		case -5:
			--num;
		case (int) 10.25:
			// num = num < 2; <- 오류발생 : boolean과 int가 매치되어 있다.
			System.out.println(num < 2);
			break;
		case 'a':
			System.out.println("안녕하세요."); // num과 관련없는 내용도 들어올 수 있다.
			break;
		default:
			System.out.println("종착역입니다.");
		}

		// break; 를 입력하지 않으면 걸리는 모든 case의 결과값을 출력하게 된다.

	}
}
