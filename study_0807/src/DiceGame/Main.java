package DiceGame;

public class Main {
	public static void main(String[] args) {

		Player player1 = new Player("대한");
		Player player2 = new Player("민국");
		Player player3 = new Player("만세");

		String winner = player1.play(player2);
		
//		while(winner.equals("무승부")) {
//			System.out.println("무승부입니다. 재경기합니다.");
//			winner = player1.play(player2);
//		}
//		
//		System.out.println("승자는 " + winner + "입니다. ");
		
		winner = player1.play3(player2, player3);
		System.out.println("세 명 중 승자는 " + winner + " 입니다.");

	}
}
