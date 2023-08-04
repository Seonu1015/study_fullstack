package hw_Animal;

public class Dog extends Animal {

	String leash;
	int gardenDamage;
	
	Dog(String type) {
		super(type);
	}

	Dog(String type, String name, int age) {
		super(type, name, age);
	}
	
	Dog(String type, String name, int age, String leash) {
		super(type, name, age);
		this.leash = leash;
		this.gardenDamage = 0;
	}

//	void spk() { // <- 어차피 부모클래스인 Animal에 있는 메소드니까 굳이 또 써줄 필요가 없다
//		super.spk();
//	}

	void wlk() {
		System.out.println(name + " 이(가) 꼬리를 흔들면 산책나갈 준비를 합니다.");
		System.out.println(this.leash + " 을(를) 준비해주세요.");
	}

	void slp() {
		System.out.println(name + " 이(가) 배를 보이며 잠을 잡니다.");
	}

	void trt() {
		System.out.println(name + " 이(가) 개껌을 먹습니다.");
	}
	
	void digging(int digging) {
		System.out.println(name + " 이(가) 정원에서 신나게 땅을 파고 있습니다.");
		System.out.println("현재 정원의 손상도는 " + digging + "% 입니다.");
		gardenDamage(digging);
	}
	
	void gardenDamage(int gardenDamage) {
		this.gardenDamage += gardenDamage;
		if(this.gardenDamage >= 70) {
			System.out.println("!!비상!! 정원의 손상도가 70%를 넘어섰습니다. 정원을 수리하세요.");
			this.gardenDamage = 0;
		}
	}
}
