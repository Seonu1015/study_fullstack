package DiceGame_2player;

public class DiceGame {
	public static void main(String[] args) {
		
		Player p1dice = new Player("대한");
		Player p2dice = new Player("민국");
		
		int score1 = 0;
		int score2 = 0;
		
        int rounds = 6;

        for (int i = 0; i < rounds; i++) {
            System.out.println("Round " + (i + 1) + ": ");
            p1dice.playRound(p2dice);
        }
		
		System.out.println("--------- 최종 결과!!! ---------");
		if (score1 > score2) {
			System.out.println("축하합니다! " + p1dice.name + "이(가) 승리하였습니다. ^o^");
		} else if (score1 < score2) {
			System.out.println("축하합니다! " + p2dice.name + "이(가) 승리하였습니다. ^o^");
		} else {
			System.out.println("무승부입니다. o_o;");
		}
		
	}
}

//부모클래스를 만들어서 해보자
