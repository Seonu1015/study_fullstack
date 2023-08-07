package DiceGame;

public class Player {
	
	int dice;
	String name;
	
	Player() {
		dice = (int) (Math.random()*6+1);
		name = "알 수 없음";
	}
	
	Player(String name) {
		dice = (int) (Math.random()*6+1);
		this.name = name;
	}
	
	String play(Player player) {
		String winner;		
		if(this.dice > player.dice ) {
			winner =  this.name;
		} else if(this.dice < player.dice ) {
			winner = player.name;
		} else {		
			winner = "무승부";
		}
		this.dice = (int) (Math.random()*6+1);
		player.dice = (int) (Math.random()*6+1);
		return winner;
	}

}
