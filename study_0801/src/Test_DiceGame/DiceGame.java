package Test_DiceGame;

public class DiceGame {
	public static void main(String[] args) {
		
		Player p1dice = new Player("대한");
		Player p2dice = new Player("민국");
		
		int score1 = 0;
		int score2 = 0;
		
		for(int i=0; i<6; i++) {
			System.out.println("Round " + (i+1) + ": ");
			
			p1dice.setting();
			p2dice.setting();
			
			p1dice.printDice();
			p2dice.printDice();
			
			if (p1dice.dice > p2dice.dice) {
	            System.out.println(p1dice.name + "이(가) 승리했습니다!");
	            score1++;
	        } else if (p1dice.dice < p2dice.dice) {
	            System.out.println(p2dice.name + "이(가) 승리했습니다!");
	            score2++;
	        } else {
	            System.out.println("무승부입니다!");
	        }
		}
		
		System.out.println("--------- 최종 우승자는!!! ---------");
		if (score1 > score2) {
			System.out.println("축하합니다! " + p1dice.name + "이(가) 승리하였습니다. ^o^");
		} else if (score1 < score2) {
			System.out.println("축하합니다! " + p2dice.name + "이(가) 승리하였습니다. ^o^");
		} else {
			System.out.println("무승부입니다. o_o;");
		}
		
	}
}
