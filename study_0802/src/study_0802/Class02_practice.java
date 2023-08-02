package study_0802;

import java.util.Scanner;

public class Class02_practice {
	public static void main(String[] args) {
		// 두 명이 가위바위보를 해서 누가 이겼는지

		Scanner sc = new Scanner(System.in);

		int score1 = 0;
		int score2 = 0;
		int score3 = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("<< Round " + (i + 1) + " >> -----------------");

			System.out.println("숫자를 입력하세요 [ 1.가위, 2.바위, 3.보 ] : ");
			System.out.println("Player1 : ");
			int player1 = sc.nextInt();
			System.out.println("Player2 : ");
			int player2 = sc.nextInt();
			
			if(player1 == player2) {
				System.out.println("무승부입니다.");
				score3++;
			}
			if(player1 == 1) {
				if(player2 == 2) {
					System.out.println("Player 2가 승리하였습니다. ^o^");
					score2++;
				} else if(player2 == 3) {
					System.out.println("Player 1이 승리하였습니다. ^o^");
					score1++;
				}
			} else if(player1 == 2) {
				if(player2 == 3) {
					System.out.println("Player 2가 승리하였습니다. ^o^");
					score2++;
				} else if(player2 == 1) {
					System.out.println("Player 1이 승리하였습니다. ^o^");
					score1++;
				}
			} else if(player1 == 3) {
				if(player2 == 1) {
					System.out.println("Player 2가 승리하였습니다. ^o^");
					score2++;
				} else if(player2 == 2) {
					System.out.println("Player 1이 승리하였습니다. ^o^");
					score1++;
				}
			}

//			if (player1 > player2 || (player1 == 1 && player2 == 3)) { // << 수정이 필요한데 왜 틀렸는지는 알겠음!! 
//				System.out.println("Player 1이 승리하였습니다. ^o^");
//				score1++;
//			} else if (player2 > player1 || (player1 == 3 && player2 == 1)) {
//				System.out.println("Player 2가 승리하였습니다. ^o^");
//				score2++;
//			} else {
//				System.out.println("무승부입니다.");
//				score3++;
//			}

//			switch로 만들어보자 : if 안에 switch 안에 if 넣을 수 있다. switch 안에 switch도 쓸 수 있다
//			switch (player1) {
//			case 1:
//				if(player1 > player2 || player2 == 3) {
//					System.out.println("Player 1이 승리하였습니다. ^o^");
//					score1++;
//				} else if(player1 == player2) {
//					System.out.println("무승부입니다.");
//					score3++;
//				} else {
//					System.out.println("Player 2가 승리하였습니다. ^o^");
//					score2++;
//				}
//				break;
//			case 2:
//				if(player1 > player2) {
//					System.out.println("Player 1이 승리하였습니다. ^o^");
//					score1++;
//				} else if(player1 == player2) {
//					System.out.println("무승부입니다.");
//					score3++;
//				} else {
//					System.out.println("Player 2가 승리하였습니다. ^o^");
//					score2++;
//				}
//				break;
//			case 3:
//				if(player2 == 1) {
//					System.out.println("Player 2가 승리하였습니다. ^o^");
//					score2++;
//				} else if(player1 == player2) {
//					System.out.println("무승부입니다.");
//					score3++;
//				} else {
//					System.out.println("Player 1이 승리하였습니다. ^o^");
//					score1++;
//				}
//				break;
//			default:
//				System.out.println("잘못된 입력이 있습니다.");
//			}
		}

		System.out.println("<< 최종 결과 >> -----------------");
		if (score1 > score2) {
			System.out.println("축하합니다! Player 1이 우승입니다! " + score1 + "승 " + score3+ "무 " + score2 + "패");
		} else if (score1 < score2) {
			System.out.println("축하합니다! Player 2가 우승입니다!" + score1 + "승 " + score3+ "무 " + score2 + "패");
		} else {
			System.out.println("무승부입니다.");
		}

	}
}
