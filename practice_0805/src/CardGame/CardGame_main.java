package CardGame;

import java.util.Scanner;

public class CardGame_main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("어떤 대결을 원하십니까? (1. User VS User, 2. User VS Computer, 3. Computer VS Computer)");
		int caseGame = sc.nextInt();

		System.out.println("카드 : 1.거지, 2.시민, 3.귀족, 4.왕");

		Computer computer1 = new Computer();
		Computer computer2 = new Computer();
		// 그동안 계속 카드가 중복된 이유
		// 매 라운드마다 객체를 새로 생성했기 때문
		// 이게 지역변수와 전역변수!!!!
		
		Score score = new Score();

		switch (caseGame) {
		case 1:
			for (int i = 0; i < 4; i++) {
				System.out.println("Round " + (i + 1) + " ----------");

				Person person1 = new Person();
				person1.chooseCard();
				String playerCard1 = person1.getPersonCard();

				Person person2 = new Person();
				person2.chooseCard();
				String playerCard2 = person2.getPersonCard();

				System.out.println("플레이어1 카드: " + playerCard1);
				System.out.println("플레이어2 카드: " + playerCard2);
				
				score.calScore(playerCard1, playerCard2);
				//System.out.println("플레이어1 : " + score.getScorePlayer1() + ", 플레이어2 : "+ score.getScorePlayer2());

				System.out.println();
			}
			break;

		case 2:
			for (int i = 0; i < 4; i++) {
				System.out.println("Round " + (i + 1) + " ----------");
				Person person = new Person();
				person.chooseCard();

				String playerCard1 = person.getPersonCard();
				String playerCard2 = computer1.getComputerCard();

				System.out.println("플레이어1 카드: " + playerCard1);
				System.out.println("플레이어2 카드: " + playerCard2);
				
				score.calScore(playerCard1, playerCard2);
				//System.out.println("플레이어1 : " + score.getScorePlayer1() + ", 플레이어2 : "+ score.getScorePlayer2());

				System.out.println();
			}
			break;

		case 3:
			for (int i = 0; i < 4; i++) {
				System.out.println("Round " + (i + 1) + " ----------");
				String playerCard1 = computer1.getComputerCard();
				String playerCard2 = computer2.getComputerCard();

				System.out.println("플레이어1 카드: " + playerCard1);
				System.out.println("플레이어2 카드: " + playerCard2);
				
				score.calScore(playerCard1, playerCard2);
                //System.out.println("플레이어1 : " + score.getScorePlayer1() + ", 플레이어2 : "+ score.getScorePlayer2());

                if (score.isGameFinished()) {
                    break;
                }
				System.out.println();
			}
			break;
		}

		int finalScore1 = score.getScorePlayer1();
        int finalScore2 = score.getScorePlayer2();

        if (score.isGameFinished()) {
            if (score.hr == 1) {
                System.out.println("최종 승자는 플레이어1입니다!");
            } else if (score.hr == 2) {
                System.out.println("최종 승자는 플레이어2입니다!");
            }
        } else {
            if (finalScore1 > finalScore2) {
                System.out.println("플레이어1이 최종 승자입니다!");
            } else if (finalScore1 < finalScore2) {
                System.out.println("플레이어2가 최종 승자입니다!");
            } else {
                System.out.println("무승부입니다!");
            }
        }
	}
}
