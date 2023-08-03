package study_0803;

public class Player {

	String name;
	int level;
	int experience;

//	Player() {
//		
//	} <- 기본 생성자 없어도 괜찮다
//	main 클래스에서 Player p1 = new Player(); 처럼 매개변수 없이 입력할 때 필요함

	Player(String name) {
		this.name = name;
		this.level = 1;
		this.experience = 0;
	}

	Player(String name, int level) {
		this.name = name;
		this.level = level;
		this.experience = 0;
	}

	Player(String name, int level, int experience) {
		this.name = name;
		this.level = level;
		this.experience = experience;
	}

	void infor() {
		System.out.println("캐릭터명 : " + name + ". level : " + level);
	}

	void fight() {
		System.out.println(name + "이(가) 전투를 시작했습니다.");
	}

	void clear(int exp) {
		System.out.println("전투를 성공적으로 클리어하였습니다.");
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		getExperience(exp);
	}

	void getExperience(int experience) {
		this.experience += experience;
		if (this.experience >= 100) {
			System.out.println(name + "의 레벨이 상승합니다.");
			// this.level++;
			System.out.println("현재 " + name + "의 레벨은 " + (++level) + "입니다.");
			this.experience -= 100;
		}
	}

	void avoid() {
		System.out.println("전투에서 도망쳤습니다. 나약한 녀석!!!");
	}

}
