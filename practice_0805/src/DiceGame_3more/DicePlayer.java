package DiceGame_3more;

import java.util.ArrayList;
import java.util.Scanner;

public class DicePlayer extends Player {

	Player[] players;
	int diceValue;
	ArrayList<Integer> dicePlayerValue;
	int roundCount;

	DicePlayer() {
		super();
		dicePlayerValue = new ArrayList<>();
	}

	void playGame(int playerCount) {
		this.players = new Player[playerCount];
		Player.printPlayersInfo(playerCount);
		diceRound();
		for (int i = 0; i < roundCount; i++) {
			System.out.println("Round " + (i + 1) + " -----------------");
			playRound(playerCount);
			int maxIndex = findMaxValueIndex(dicePlayerValue);
			if (maxIndex >= 0) {
				System.out.println(this.players[maxIndex].name + " 이(가) 이겼습니다.");
			} else {
				System.out.println("라운드에서 승자가 없습니다.");
			}
			dicePlayerValue.clear();
		}

	}

	void playRound(int playerCount) {
		for (int i = 0; i < playerCount; i++) {
			this.rollDice();
			dicePlayerValue.add(diceValue);
		}
		int maxValue = findMaxValueIndex(dicePlayerValue);
		System.out.println(dicePlayerValue);
	}

	void rollDice() {
		diceValue = (int) (Math.random() * 6) + 1;
	}

	void diceRound() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 라운드를 진행하시겠습니까? :");
		this.roundCount = sc.nextInt();
	}

	int findMaxValueIndex(ArrayList<Integer> values) {
		int maxValue = values.get(0);
		int maxIndex = -1;
		for (int i = 0; i < values.size(); i++) {
			int nextValue = values.get(i);
			if (nextValue > maxValue) {
				maxValue = nextValue;
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
