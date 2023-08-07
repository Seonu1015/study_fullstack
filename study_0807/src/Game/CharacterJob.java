package Game;

public class CharacterJob extends Character {

	String job;
	
	CharacterJob(String name, int health, int attack) {
		super(name, health, attack+10); // 굳이 메서드를 하나 더 만들기 보다는 변수에 +10을 추가할 수 있다
	}
	
	CharacterJob(String name, int health, int attack, String job) {
		super(name, health, attack+10);
		this.job = job;
	}
	
	@Override
	void unitInfo() {
		System.out.println("-----------------------");
		System.out.println("캐릭터명(" + this.job + ") : " + this.getName());
		System.out.println("레벨 : " + this.getLevel());
		System.out.println("체력 : " + this.getHealth());
		System.out.println("공격력 : " + this.getAttack());
	}

}
