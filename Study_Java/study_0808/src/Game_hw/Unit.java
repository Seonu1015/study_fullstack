package Game_hw;

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

	Unit(Unit unit) { // Unit을 자료형으로 가진 메서드
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
	
	int getHealth() { // 호출할 일이 없다면 불필요
		return this.health;
	}

	int getAttack() {
		return this.attack;
	}

	void setAttack(int attack) {
		this.attack += attack;
	}

	void setHealth(int health) {
		this.health = health;
	}

	void unitInfo() {
		System.out.println("-----------------------");
		System.out.println("┌ 유닛명 : " + this.getName()); // 같은 클래스 내에서 get을 쓰면 복잡해짐 없애도 무방!
		System.out.println("│ 체력 : " + this.getHealth());
		System.out.println("└ 공격력 : " + this.getAttack());
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Unit) {
//			Unit unit = (Unit) obj;
//			return this.name == obj.name && (this.level == unit.level);
//		}
//		return false;
//	}

}
