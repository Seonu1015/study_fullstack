package Test_CardGame;

public class CardGame {
	public static void main(String[] args) {

		int score1 = 0;
		int score2 = 0;
		int hr = 0;

		Person player1 = new Person(0);
		Computer player2 = new Computer();

		for (int i = 0; i < 4; i++) {
			System.out.println("Round " + (i+1) + "-----------------");

			player1.chooseCard();
			player2.drawCard();

			player1.printPer();
			player2.printCom();

			if ((player1.card == 1 && player2.cardIndex == 3) || (player1.card == 4 && player2.cardIndex == 0)) {
				System.out.println("거지와 왕이 만났습니다!");
				if (player1.equals("거지")) {
					score1 += 4;
					hr = 1;
				} else {
					score2 += 4;
					hr = 2;
				}
				break;
				
			} else if (player1.card > player2.cardIndex+1) {
				score1++;
				System.out.println("당신이 이겼습니다! ^o^");
			} else if (player1.card < player2.cardIndex+1) {
				score2++;
				System.out.println("컴퓨터가 이겼습니다. T^T");
			} else {
				System.out.println("무승부입니다. o_o;");
			}
		}

		System.out.println("--------- 최종 우승자는!!! ---------");
		if (hr == 1) {
			System.out.println("당신이 히든 룰로 승리하였습니다. ^o^");
		} else if (hr == 2) {
			System.out.println("컴퓨터가 히든 룰로 승리하였습니다. T^T");
		} else if (score1 > score2) {
			System.out.println("축하합니다! 당신이 승리하였습니다. ^o^");
		} else if (score1 < score2) {
			System.out.println("컴퓨터가 승리하였습니다. 다음에 다시 도전하세요. T^T");
		} else {
			System.out.println("무승부입니다. o_o;");
		}

	}
}

//3. 카드게임 -> 객체화
//컴퓨터와 사람을 각각 객체화 한다. 컴퓨터vs컴퓨터, 컴퓨터vs사람, 사람vs사람