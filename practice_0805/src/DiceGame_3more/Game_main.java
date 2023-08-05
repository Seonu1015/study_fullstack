package DiceGame_3more;

public class Game_main {
	public static void main(String[] args) {

		int playerCount = Player.inputPlayerCount();

		DicePlayer diceGame = new DicePlayer();
		diceGame.playGame(playerCount);

	}
}
