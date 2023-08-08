package Game_hw;

public class Game_main {
	public static void main(String[] args) {


		Monster mob1 = new Monster("파이리", 40, 1, "불");
		Monster mob2 = new Monster("꼬부기", 20, 1, "물");
		Monster mob3 = new Monster("이상해씨", 30, 1, "풀");

		CharacterJob user1 = new CharacterJob("에리얼", 100, 5, "인어", "물보라", "물");

		user1.unitInfo();
		
//		System.out.println(mob3.getTypePower());
		
		user1.playRepeat(mob1);
		user1.playRepeat(mob2);
		user1.playRepeat(mob3);

	}
}
