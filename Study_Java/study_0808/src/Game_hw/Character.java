package Game_hw;

public class Character extends Unit {

	private int level;
	private double exp;
	
	Character(Unit unit) {
		super(unit.getName(), unit.getHealth(), unit.getAttack());
		//super(unit); <- Unit 클래스에서 Unit을 자료형으로 가진 메서드를 만들어준다
		level = 1;
		exp = 0;
	}
	
	Character(String name) {
		super(name, 100, 10); // <- 미리 입력하는 식으로 이렇게 표현도 가능함
		level = 1;
		exp = 0;
	}
	
	Character(String name, int health, int attack) {
		super(name, health, attack);
		level = 1;
		exp = 0;
	}

	@Override
	void unitInfo() {
		System.out.println("-----------------------");
		System.out.println("┌ 캐릭터명 : " + this.getName());
		System.out.println("│ 레벨 : " + this.getLevel());
		System.out.println("│ 체력 : " + this.getHealth());
		System.out.println("└ 공격력 : " + this.getAttack());
	}

	int getLevel() {
		return this.level;
	}
	
	void playGame(Monster mob) {
		this.playGameCommon(mob);
	}
	
	void playGameCommon(Monster mob) {
		System.out.println(mob.getName() + " 와(과) 전투를 시작하였습니다.");
		
		if (this.getAttack() < mob.getHealth()) {
			System.out
					.println(this.getName() + " 이(가) " + mob.getName() + "에게 " + this.getAttack() + "만큼의 데미지를 주었습니다.");
			
			mob.setHealth(mob.getHealth() - this.getAttack());
			System.out.println(mob.getName() + "의 남은 체력 : " + mob.getHealth());

		} else if (this.getAttack() >= mob.getHealth()) {
			System.out
					.println(this.getName() + " 이(가) " + mob.getName() + " 에게 " + this.getAttack() + "만큼의 데미지를 주었습니다.");
			System.out.println(this.getName() + " 이(가) " + mob.getName() + " 을(를) 쓰러뜨렸습니다.");
			
			mob.setHealth(mob.getHealth() - this.getAttack());
			this.accumulateExp();
		}
	}
	
	void playRepeat(Monster mob) {
		System.out.println("-----------------------");
		for (int i = 0; i >= 0; i++) {
			if (mob.getHealth() <= 0) {
				break;
			}
			this.playGame(mob);
		}
	}
	
	double getExp() {		
		return this.exp;
	}
	
	double setExp() {
		exp = (double) (Math.random() * 90);
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		return this.getExp();
	}
	
	double accumulateExp() {
		this.exp += this.setExp();
		//System.out.println("누적 경험치 : " + this.getExp());
		if (this.exp >= 100) {
			System.out.println("★ " + this.getName() + " LEVEL UP ★");
			System.out.println(this.getName() + "의 공격력이 상승합니다. (+3)");
			this.level++;
			this.exp -= 100;
			this.setAttack(3);
		}
		return this.getExp();
	}

}
