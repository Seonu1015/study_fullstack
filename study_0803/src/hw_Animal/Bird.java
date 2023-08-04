package hw_Animal;

public class Bird extends Animal {

	String favorSeed;

	Bird(String type) {
		super(type);
	}

	Bird(String type, String name, int age) {
		super(type, name, age);
	}

	Bird(String type, String name, int age, String favorSeed) {
		super(type, name, age);
		this.favorSeed = favorSeed;
	}

//	void spk() {
//		super.spk();
//	}

	void wlk() {
		System.out.println(name + " 이(가) 종이를 뜯어 몸을 치장하며 딴청을 부립니다.");
	}

	void slp() {
		System.out.println(name + " 이(가) 횟대에서 잠을 잡니다.");
	}

	void trt() {
		System.out.println(name + " 이(가) " + this.favorSeed + " 를 먹습니다.");
	}

	void stealing() {
		int num = (int) (Math.random() * 2) + 1;
		if (num == 1) {
			System.out.println(name + " 이(가) 보석함을 뒤지다가 당신에게 걸렸습니다.");
			System.out.println("아무 일도 없었다는 듯이 뻔뻔하게 " + name + " 이(가) 새장으로 날아갑니다.");
		} else {
			System.out.println("!!비상!! " + name + " 이(가) 당신의 보석함에서 당신의 귀중품을 훔쳤습니다. 새장을 뒤져 귀중품을 되찾으세요.");
		}
	}
	

	
}
