package Game_hw;

public class Character extends Unit {

	private int level;
	private int exp;

	Character(String name, int health, int attack) {
		super(name, health, attack);
		level = 1;
		exp = 0;
	}

	@Override
	void unitInfo() {
		System.out.println("-----------------------");
		System.out.println("캐릭터명 : " + this.getName());
		System.out.println("레벨 : " + this.getLevel());
		System.out.println("체력 : " + this.getHealth());
		System.out.println("공격력 : " + this.getAttack());
	}

	int getLevel() {
		return this.level;
	}

	int getExp() {
		return this.exp;
	}
	
	int setExp() {
		this.exp += (int) (Math.random() * 90);
		if (this.exp >= 100) {
			System.out.println("★ " + this.getName() + " LEVEL UP ★");
			System.out.println(this.getName() + "의 공격력이 상승합니다. (+3)");
			this.level++;
			this.exp -= 100;
			this.setAttack(3);
		} else {
			System.out.println(this.exp + "의 경험치를 획득하였습니다.");
		}
		return this.getExp();
	}

}
