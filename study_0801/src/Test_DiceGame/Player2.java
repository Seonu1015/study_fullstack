package Test_DiceGame;

public class Player2 extends DiceGame {

	int[] p2dice;
	
	Player2(int p2dice) {
		this.p2dice = new int[] { p2dice };
	}
	
	void setting() {
		p2dice = new int[6];
		
		for(int i=0; i<p2dice.length; i++) {
			int num = (int) (Math.random() * 6) +1;
			System.out.print(num + " ");
		}
		
	}
	
	
	
}
