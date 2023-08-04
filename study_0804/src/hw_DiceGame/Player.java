package hw_DiceGame;

public class Player {
	
	String name;
	int dice;
	
	Player(String name) {
		this.name = name;
	}
	
	Player(String name, int dice) {
		this.setting();
		this.name = name;
		this.dice = dice;
	}
	
	void setting() {
		dice = (int) (Math.random()*6) +1;
	}
	
	void printDice() {
		System.out.println(this.name + "의 주사위 : " + dice);
	}

}
