package Test_CardGame;

import java.util.Scanner;

public class CardGame {
	public static void main(String[] args) {

		int score1 = 0;
		int score2 = 0;
		int hr = 0;
		
		int player1card = 0;
		int player2card = 0;

//		Person player1 = new Person(0);
//		Computer player2 = new Computer();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어떤 대결을 원하십니까? (1. User VS User, 2. User VS Computer, 3. Computer VS Computer)");
		int caseGame = sc.nextInt();
		
		System.out.println("카드 : 1.거지, 2.시민, 3.귀족, 4.왕");
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Round " + (i+1) + "-----------------");

//			player1.chooseCard();
//			player2.drawCard();
//
//			player1.printPer();
//			player2.printCom();
			
			if(caseGame == 1) {
				Person player1 = new Person(0);
				player1.chooseCard();
				player1card = player1.card;
				player1.printPer();
				Person player2 = new Person(0);
				player2.chooseCard();
				player2card = player2.card;
				player2.printPer();
			} else if(caseGame == 2) {
				Person player1 = new Person(0);
				player1.chooseCard();
				player1card = player1.card;
				player1.printPer();
				Computer player2 = new Computer();
				player2.drawCard();
				player2card = player2.cardIndex+1;
				player2.printCom();
			} else {
				Computer player1 = new Computer();
				player1.drawCard();
				player1card = player1.cardIndex+1;
				player1.printCom();
				Computer player2 = new Computer();
				player2.drawCard();
				player2card = player2.cardIndex+1;
				player2.printCom();
			}
			

			if ((player1card == 1 && player2card == 4) || (player1card == 4 && player1card == 1)) {
				System.out.println("거지와 왕이 만났습니다!");
				if (player1card == 1) {
					score1 += 4;
					hr = 1;
				} else {
					score2 += 4;
					hr = 2;
				}
				break;
				
			} else if (player1card > player2card) {
				score1++;
				System.out.println("Player 1이 이겼습니다! ^o^");
			} else if (player1card < player2card) {
				score2++;
				System.out.println("Player 2가 이겼습니다. T^T");
			} else {
				System.out.println("무승부입니다. o_o;");
			}
		}

		System.out.println("--------- 최종 우승자는!!! ---------");
		if (hr == 1) {
			System.out.println("Player 1이 히든 룰로 승리하였습니다. ^o^");
		} else if (hr == 2) {
			System.out.println("Player 2가 히든 룰로 승리하였습니다. ^o^");
		} else if (score1 > score2) {
			System.out.println("축하합니다! Player 1이 승리하였습니다. ^o^");
		} else if (score1 < score2) {
			System.out.println("축하합니다! Player 2가 승리하였습니다. ^o^");
		} else {
			System.out.println("무승부입니다. o_o;");
		}

	}
}

//3. 카드게임 -> 객체화
//컴퓨터와 사람을 각각 객체화 한다. 컴퓨터vs컴퓨터, 컴퓨터vs사람, 사람vs사람