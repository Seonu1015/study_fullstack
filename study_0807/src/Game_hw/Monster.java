package Game_hw;

public class Monster extends Unit {

	private String type;
	
	Monster(String name, int health, int attack, String type) {
		super(name, health, attack);
		this.type = type;
	}
	
	String getType() {
		return this.type;
	}
	
	@Override
	void unitInfo() {
		System.out.println("-----------------------");
		System.out.println("몬스터명(" + this.type + ") : " + this.getName());
		System.out.println("체력 : " + this.getHealth());
		System.out.println("공격력 : " + this.getAttack());
	}
	
}
