package CardGame;

public class Main {
	public static void main(String[] args) {
		
		int score1 = 0;
		int score2 = 0;
		int hr1 = 0;

		if ((player1 == 1 && computer == 4) || (player1 == 4 && computer == 1)) {
			System.out.println("노예와 왕이 만났습니다!");
			if (player1 == 1) {
				score1 += 4;
				hr1 = 1;
			} else {
				score2 += 4;
				hr1 = 2;
			}
			break;
		} else if (player1 > computer) {
			score1++;
		} else if (computer > player1) {
			score2++;
		}
		
		if (hr1 == 1) {
			System.out.println("Player 1이 히든 룰로 승리하였습니다.");
		} else if (hr1 == 2) {
			System.out.println("컴퓨터가 히든 룰로 승리하였습니다.");
		} else if (score1 > score2) {
			System.out.println("Player 1이 승리하였습니다.");
		} else if (score1 < score2) {
			System.out.println("컴퓨터가 승리하였습니다.");
		} else {
			System.out.println("무승부입니다.");
		}
		

	}
}
