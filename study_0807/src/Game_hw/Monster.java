package Game_hw;

public class Monster extends Unit {

	private String type;
	private int typePower;

	Monster(String name, int health, int attack, String type) {
		super(name, health, attack);
		this.type = type;
	}

	String getType() {
		return this.type;
	}
	
	int getTypePower() {
		this.changeTypeNum();
		return this.typePower;
	}
	
	void changeTypeNum() {
		if(this.type.equals("불")) {
			this.typePower = 1;
		} else if(this.type.equals("물")) {
			this.typePower = 2;
		} else if(this.type.equals("풀")) {
			this.typePower = 3;
		}
	}

	@Override
	void unitInfo() {
		System.out.println("-----------------------");
		System.out.println("몬스터명(" + this.type + "속성) : " + this.getName());
		System.out.println("체력 : " + this.getHealth());
		System.out.println("공격력 : " + this.getAttack());
	}

}
