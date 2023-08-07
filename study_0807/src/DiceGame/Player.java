package DiceGame;

public class Player {
	
	int dice;
	String name;
	
	Player() {
		dice = (int) (Math.random()*6+1);
		name = "알 수 없음";
	}
	
	Player(String name) {
		dice = rollDice();
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
		return winner;
	}
	
	String play3(Player player1, Player player2) {
		String winner = player1.play(player2);
		if(winner.equals(player1.name)) {
			winner = this.play(player1);
			// 자기자신이랑 플레이어1 무승부?
			if(winner.equals("무승부")) {
				winner = this.rematch(this, player1);
			}
		} else if(winner.equals(player2.name)) {
			winner = this.play(player2);
			// 자기자신이랑 플레이어2 무승부?
			if(winner.equals("무승부")) {
				winner = this.rematch(this, player2);
			}
		} else {
			//플레이어 1,2가 무승부
			winner = player1.play(this);
			//자기자신도 무승부
			if(winner.equals("무승부")) {
				player1.dice = this.rollDice();
				player2.dice = rollDice();
				this.dice = rollDice(); // 셋 다 무승부한 상황
				System.out.println("무승부입니다. 재경기합니다.");
				this.play3(player1, player2); // 재귀함수 <- 자기 자신을 불러들이는 함수
			} else if(winner.equals(player1.name)) {
				winner = this.rematch(player1, player2);
			}
		}
		
		player1.dice = this.rollDice();
		player2.dice = rollDice();
		this.dice = rollDice();
		
		return winner;
	}
	
	String rematch(Player player1, Player player2) {
		System.out.println("무승부입니다. 재경기합니다.");
		String winner = player1.play(player2);
		while(player1.equals("무승부")) {
			System.out.println(player1.name +" : " + player1.dice + player2.name + " : " + player2.dice);
			System.out.println("무승부입니다. 재경기합니다.");
			player1.dice = rollDice();
			player2.dice = rollDice();
			winner = player1.play(player2);
		}
		return winner;
	}
	
	int rollDice() {
		return (int) (Math.random()*6+1);
	}

}
