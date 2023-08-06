package DiceGame_3more;

import java.util.Scanner;

public class DicePlayer extends Player {

	Player[] players;
	int diceValue;
	int roundCount;

	DicePlayer() {
		super();
	}

	void playGame(int playerCount) {
		this.players = new Player[playerCount];
		Player.printPlayersInfo(playerCount);
		this.diceRound();
		for (int i = 0; i < roundCount; i++) {
			System.out.println("Round " + (i + 1) + " -----------------");
						
			// 게임 진행 내용... 흠...
			
		}
	}

	void rollDice() {
		diceValue = (int) (Math.random() * 6) + 1;
	}

	void diceRound() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("몇 라운드를 진행하시겠습니까? :");
		this.roundCount = sc.nextInt();
	}


}
