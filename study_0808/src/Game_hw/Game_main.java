package Game_hw;

public class Game_main {
	public static void main(String[] args) {
		
		Unit user = new Unit("디아블로", 100, 10);
		Character user1 = new Character(user);

		Monster mob1 = new Monster("파이리", 40, 1, "불");
		Monster mob2 = new Monster("꼬부기", 20, 1, "물");
		Monster mob3 = new Monster("치코리타", 30, 1, "풀");

		CharacterJob user2 = new CharacterJob("에리얼", 100, 10, "인어", "물보라", "물");
		
//		System.out.println(mob3.getTypePower());
		
//		user1.unitInfo();
//		user1.playRepeat(mob1);
//		user1.playRepeat(mob2);
//		user1.playRepeat(mob3);
		
		user2.unitInfo();
		user2.playRepeat(mob1);
		user2.playRepeat(mob2);
		user2.playRepeat(mob3);

	}
}

//창의적으로 더 확장해보자!!
