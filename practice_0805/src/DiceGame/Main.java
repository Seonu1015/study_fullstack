package DiceGame;

public class Main {
	public static void main(String[] args) {
		
		int playerCount = Player.inputPlayerCount();
		Player[] players = new Player[playerCount];
		
		for(int i=0; i<playerCount; i++) {
			Player player = new Player();
			System.out.print((i+1) + "번째 ");
			player.inputPlayerInfo();
			players[i] = player;
		}
		
		System.out.println("------ 게임에 참가한 플레이어 " + players.length + "명 ------");
		
		for(int i=0; i<playerCount; i++) {
			players[i].printPlayerInfo();
		}
		
		DicePlayer dicePlayerValues = new DicePlayer();
		dicePlayerValues.diceRound();		
		dicePlayerValues.playGame(playerCount);
		
		int maxIndex = dicePlayerValues.findMaxValueIndex(dicePlayerValues.dicePlayerValue);
		System.out.println(players[maxIndex].name + "이(가) 이겼습니다.");
	}
}

//부모클래스를 만들어서 해보자