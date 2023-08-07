package Game;

public class Game_main {
	public static void main(String[] args) {
		
		Character user1 = new Character("다리안", 100, 5);
		Monster mob1 = new Monster("고블린", 15, 1, "인간형");
		
		CharacterJob user2 = new CharacterJob("에리얼", 100, 5, "검사");
		
		user1.unitInfo();
		user2.unitInfo();
		
		mob1.unitInfo();
		user2.playGame(mob1);
		
	}
}
