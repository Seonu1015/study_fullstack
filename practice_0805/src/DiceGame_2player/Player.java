package DiceGame_2player;

import java.util.Scanner;

public class Player {

	String name;
	int dice;
	int score;
	int roundCount;

	Player(String name) {
		this.name = name;
	}

	void printDice() {
		dice = (int) (Math.random() * 6) + 1;
		System.out.println(this.name + "의 주사위 : " + dice);
	}

	int rollDice() {
		dice = (int) (Math.random() * 6) + 1;
		return dice;
	}

	void playRound(Player p2) {
		int p1DiceValue = rollDice();
		int p2DiceValue = p2.rollDice();

		System.out.println(name + "의 주사위 값: " + p1DiceValue);
		System.out.println(p2.name + "의 주사위 값: " + p2DiceValue);

		if (p1DiceValue > p2DiceValue) {
			System.out.println(name + " 이(가) 이겼습니다!");
			score++;
		} else if (p1DiceValue < p2DiceValue) {
			System.out.println(p2.name + " 이(가) 이겼습니다!");
			p2.score++;
		} else {
			System.out.println("무승부입니다.");
		}
	}

	void determineWinner(Player p2) {
		if (score > p2.score) {
			System.out.println("축하합니다! " + name + " 이(가) 승리하였습니다. ^o^");
		} else if (score < p2.score) {
			System.out.println("축하합니다! " + p2.name + " 이(가) 승리하였습니다. ^o^");
		} else {
			System.out.println("무승부입니다. o_o;");
		}
	}
}
