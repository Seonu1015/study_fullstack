package study_0727;
import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		
		// 1. 자판기 만들기
		// 금액을 넣어주세요 : (입력)
		// 메뉴를 선택해주세요 : (메뉴1 -> 가격), (메뉴2 -> 가격) ... (입력) 메뉴 선택
		// 잔액이 부족합니다. or (메뉴)가 나왔습니다. 거스름돈 ??원이 나왔습니다.

		int m;
		System.out.println("금액을 넣어주세요 : ");
		
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		
		String str;		// String menu; <- 이런 식으로 써주면 좋을 듯
		System.out.println("메뉴를 선택해주세요 [아메리카노(900원), 카페라떼(1300원), 밀크티(1500원), 아이스티(1100원)] : ");
		
		str = scan.next();
		switch(str) {
			case "아메리카노":
				if(m >= 900) {
					System.out.println(str + "이(가) 나왔습니다. 거스름돈 " + (m - 900) + "원이 나왔습니다.");
				}
				else {
					System.out.println("잔액이 부족합니다.");
				}
				break;
			case "카페라떼":
				if(m >= 1300) {
					System.out.println(str + "이(가) 나왔습니다. 거스름돈 " + (m - 1300) + "원이 나왔습니다.");
				}
				else {
					System.out.println("잔액이 부족합니다.");
				}
				break;
			case "밀크티":
				if(m >= 1500) {
					System.out.println(str + "이(가) 나왔습니다. 거스름돈 " + (m - 1500) + "원이 나왔습니다.");
				}
				else {
					System.out.println("잔액이 부족합니다.");
				}
				break;
			case "아이스티":
				if(m >= 1100) {
					System.out.println(str + "이(가) 나왔습니다. 거스름돈 " + (m - 1100) + "원이 나왔습니다.");
				}
				else {
					System.out.println("잔액이 부족합니다.");
				}
				break;
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다.");
		}
		
		


	}
}

// 1. 자판기 만들기
// 금액을 넣어주세요 : (입력)
// 메뉴를 선택해주세요 : (메뉴1 -> 가격), (메뉴2 -> 가격) ... (입력) 메뉴 선택
// 잔액이 부족합니다. or (메뉴)가 나왔습니다. 거스름돈 ??원이 나왔습니다.

// 2. 점수 하나 입력 -> 학점을 A, B, C, D, F (점수 기준은 자율)

// 3. 점수 5개를 입력받는다. 최고점을 출력.

// 4. int a = 10, int b = 20, int c = 30 if문을 가지고 C가 가장 크다. 라고 출력하기
// (3가지 방법 사용)