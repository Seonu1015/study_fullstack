package Game_hw;

import java.util.Scanner;

public class CharacterJob extends Character {

	private String job;
	private String skill;
	private String skillType;
	private int typePower;
	private int criticalAttack;

	Scanner sc = new Scanner(System.in);

	CharacterJob(Unit unit) {
		super(new Unit(unit.getName(), unit.getHealth(),unit.getAttack() + 10));
		//Unit 자료형으로 가진 메서드
	}

	CharacterJob(String name, int health, int attack) {
		super(name, health, attack + 10); // 굳이 메서드를 하나 더 만들기 보다는 변수에 +10을 추가할 수 있다
	}

	CharacterJob(String name, int health, int attack, String job, String skill, String skillType) {
		super(name, health, attack + 10);
		this.job = job;
		this.skill = skill;
		this.skillType = skillType;
	}

	int changeTypeNum() {
		if (this.skillType.equals("불")) {
			typePower = 1;
		} else if (this.skillType.equals("물")) {
			typePower = 2;
		} else if (this.skillType.equals("풀")) {
			typePower = 3;
		}
		return typePower;
	}

	int criticalAttack(Monster mob) {
		System.out.println(this.getName() + " 이(가) 스킬 <" + this.skill + "> 을(를) 시전합니다.");
		if (mob.getTypePower() == 3 && this.changeTypeNum() == 1) {
			System.out.println("효과가 굉장합니다.");
			this.criticalAttack = 10;
		} else if (mob.getTypePower() < this.changeTypeNum()) {
			System.out.println("효과가 굉장합니다.");
			this.criticalAttack = 10;
		} else if (mob.getTypePower() == this.changeTypeNum()) {
			System.out.println("효과가 별로인 듯 합니다.");
			this.criticalAttack = 3;
		} else {
			System.out.println("효과가 없습니다.");
			this.criticalAttack = 0;
		}
		return this.criticalAttack;
	}

	@Override
	void playGame(Monster mob) {
		System.out.println(mob.getName() + " 와(과) 전투를 시작하였습니다.");
		System.out.println(this.skill + " 을(를) 사용하시겠습니까?");
		String useSkill = sc.next();

		if (useSkill.equals("예") || useSkill.equals("y")) {
			this.playGameSkill(mob);
		} else {
			this.playGameCommon(mob);
		}
	}
	
	void playGameSkill(Monster mob) {
		this.criticalAttack(mob);
		if ((this.getAttack() + this.criticalAttack) < mob.getHealth()) {
			System.out.println(this.getName() + "이 " + mob.getName() + "에게 "
					+ (this.getAttack() + this.criticalAttack) + "만큼의 데미지를 주었습니다.");

			mob.setHealth(mob.getHealth() - (this.getAttack() + this.criticalAttack));
			System.out.println(mob.getName() + "의 남은 체력 : " + mob.getHealth());

		} else if ((this.getAttack() + this.criticalAttack) >= mob.getHealth()) {
			System.out.println(this.getName() + "이 " + mob.getName() + "에게 "
					+ (this.getAttack() + this.criticalAttack) + "만큼의 데미지를 주었습니다.");
			System.out.println(this.getName() + " 이(가) " + mob.getName() + " 을(를) 쓰러뜨렸습니다.");

			mob.setHealth(mob.getHealth() - (this.getAttack() + this.criticalAttack));
			this.accumulateExp();
		}
	}

	@Override
	void playRepeat(Monster mob) {
		System.out.println("-----------------------");
		for (int i = 0; i >= 0; i++) {
			if (mob.getHealth() <= 0) {
				break;
			}
			this.playGame(mob);
		}
	}

	@Override
	void unitInfo() {
		System.out.println("-----------------------");
		System.out.println("┌ 캐릭터명(" + this.job + ") : " + this.getName());
		System.out.println("│ 레벨 : " + this.getLevel());
		System.out.println("│ 체력 : " + this.getHealth());
		System.out.println("│ 공격력 : " + this.getAttack() + " (" + this.getName() + " 은(는) 직업을 가졌기에 기본 공격력이 10 증가합니다.)");
		System.out.println("└ 보유 스킬 : " + this.skill + "(" + this.skillType + "속성)");
	}
}
