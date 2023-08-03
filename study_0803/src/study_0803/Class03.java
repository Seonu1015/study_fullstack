package study_0803;

import java.util.Scanner;

public class Class03 {

	public static void main(String[] args) {

		String[] cardGame = { "거지", "시민", "귀족", "왕" };
		int score = 0;

		for (int i = 0; i < 4; i++) {
			System.out.println("Round " + (i + 1) + " --------------------");

			int player1 = setting(1);
			int player2 = setting(2); // 지역변수 선언

			score += scoreCal(player1, player2);
			if (score > 10 || score < -10) {
				break;
			} // 아래 함수랑 연결해서 break를 메인에서 걸어준다
			
		}

		winnerJudge(score);

	}

	static int setting(int player) {
		Scanner sc = new Scanner(System.in);
		System.out.println("카드 : {1.거지, 2.시민, 3.귀족, 4.왕}");
		System.out.println("플레이어 " + player + " 차례 : ");
		player = sc.nextInt();
		return player;
	}

	static int scoreCal(int player1, int player2) {
		if ((player1 == 1 && player2 == 4) || (player1 == 4 && player2 == 1)) {
			System.out.println("노예와 왕이 만났습니다!");
			if (player1 == 1) {
				return 100;
			} else {
				return -100;
			} // break는 switch와 반복문을 멈춰준다.
				// 해당 위치에는 switch와 반복문이 없기 때문에 break가 작동하지 않는다
				// return을 넣어주자
		} else if (player1 > player2) {
			return 1;
		} else if (player2 > player1) {
			return -1;
		}
		return 0;
	}

	static void winnerJudge(int score) {

		if (score > 10) {
			System.out.println("Player 1이 히든 룰로 승리하였습니다.");
		} else if (score < -10) {
			System.out.println("Player 2가 히든 룰로 승리하였습니다.");
		} else if (score > 0) {
			System.out.println("Player 1이 승리하였습니다.");
		} else if (score < 0) {
			System.out.println("Player 2가 승리하였습니다.");
		} else {
			System.out.println("무승부입니다.");
		}
	} // 이대로 진행하면 앞에서 진행한 scoreCal이 적용되지 않고 있다

}


//지역변수 -> 특정 지역에서만 사용가능
//전역변수 -> 전 지역에서 사용 가능
//
//전역변수로 작성하게 되면,
//장점 : 모든 곳에서 접근이 가능하다.
//단점 : 모든 곳에서 접근이 가능하다. (보안성이 취약하다)
//
//지역변수 할 때, 함수 안밖 구분이 어려워요
//변수가 선언된 위치 <- 어디의 지역변수 인지 알 수 있다
//지역의 구분은 항상 {} 사이
//변수 선언
//1. {} 사이,
//2. () 사이 -> () 옆에 보면 {}가 있다 이 {}의 위치가 변수가 선언된 위치