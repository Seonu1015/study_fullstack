package Game_hw;

public class Character extends Unit {

	private int level;

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

}
