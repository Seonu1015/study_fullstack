package DiceGame_2player;

public class DiceGame {
	public static void main(String[] args) {

		Player p1dice = new Player("대한");
		Player p2dice = new Player("민국");

		for (int i = 0; i < 5; i++) {
			System.out.println("Round " + (i + 1) + ": ");
			p1dice.playRound(p2dice);
		}

		System.out.println("--------- 최종 결과!!! ---------");
		p1dice.determineWinner(p2dice);
	}
}

//부모클래스를 만들어서 해보자
