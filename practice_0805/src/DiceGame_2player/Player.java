package DiceGame_2player;

public class Player {
	
	String name;
	int dice;
	int score;
	
	Player(String name) {
		this.name = name;
	}
	
	void printDice() {
		dice = (int) (Math.random()*6) +1;
		System.out.println(this.name + "의 주사위 : " + dice);
	}
	
	int rollDice() {
		dice = (int) (Math.random() * 6) + 1;
        return dice;
	}
	
	void playRound(Player player2) {
        int player1DiceValue = rollDice();
        int player2DiceValue = player2.rollDice();

        System.out.println(name + "의 주사위 값: " + player1DiceValue);
        System.out.println(player2.name + "의 주사위 값: " + player2DiceValue);

        if (player1DiceValue > player2DiceValue) {
            System.out.println(name + "이(가) 승리했습니다!");
            score++;
        } else if (player1DiceValue < player2DiceValue) {
            System.out.println(player2.name + "이(가) 승리했습니다!");
            player2.score++;
        } else {
            System.out.println("무승부입니다!");
        }
    }
}
