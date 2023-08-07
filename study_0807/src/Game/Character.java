package Game;

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
	
	void playGame(Unit unit) {
		System.out.println("-----------------------");		
		if(this.getAttack() < unit.getHealth()) {
			System.out.println(this.getAttack()+ "만큼의 데미지를 주었습니다.");
			
			//몬스터 최대 체력에서 캐릭터 공격력만큼 체력이 줄어들게끔
			//unit.getHealth() 
			
		} else if(this.getAttack() >= unit.getHealth()) {
			System.out.println(this.getName() + " 이(가) " + unit.getName() + " 을(를) 쓰러뜨렸습니다.");
			this.setExp();
		}
	}
	
	void setExp() {
		exp = (int) (Math.random()*90+10);
		
		if(exp >=100) {
			System.out.println("★" + this.getName() + " LEVEL UP ★");
			this.level++;
		} else {
			System.out.println(this.exp + "의 경험치를 획득하였습니다.");
			exp += exp;
		}
	}
}
