package Game_hw;

public class Game_main {
	public static void main(String[] args) {

		Monster mob1 = new Monster("자바", 30, 1, "프로그래밍언어");
		Monster mob2 = new Monster("파이썬", 20, 1, "프로그래밍언어");
		Monster mob3 = new Monster("C++", 25, 1, "프로그래밍언어");

		CharacterJob user1 = new CharacterJob("에리얼", 100, 5, "개발자");

		user1.unitInfo();

		user1.playGame(mob1);
		user1.playGame(mob1);

		user1.playGame(mob2);
		user1.playGame(mob2);

		user1.playGame(mob3);
		user1.playGame(mob3);

	}
}
