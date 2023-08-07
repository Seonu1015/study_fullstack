package Game;

public class Unit {

	private String name;
	private int health;
	private int attack;

	
	Unit(String name, int health, int attack) {
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
	
	String getName() {
		return this.name;
	}
	
	int getHealth() {
		return this.health;
	}
	
	int getAttack() {
		return this.attack;
	}
	
	void setName() {
		return;
	}
	
	void setHealth() {
		return;
	}
	
	void setAttack() {
		return;
	}
	
	void unitInfo() {
		System.out.println("-----------------------");
		System.out.println("유닛명 : " + this.getName());
		System.out.println("체력 : " + this.getHealth());
		System.out.println("공격력 : " + this.getAttack());
	}
	
}
