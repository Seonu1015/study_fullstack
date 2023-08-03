package study_0803;

public class Dog extends Animal {

	String leash;
	
	Dog(String type) {
		super(type);
	}

	Dog(String type, String name, int age) {
		super(type, name, age);
	}
	
	Dog(String type, String name, int age, String leash) {
		super(type, name, age);
		this.leash = leash
	}

	void spk() {
		super.spk();
	}

	void wlk() {
		System.out.println(name + " 이(가) 꼬리를 흔들면 산책나갈 준비를 합니다.");
		System.out.println(this.leash + " 를 준비해주세요.");
	}

	void slp() {
		System.out.println(name + " 이(가) 배를 보이며 잠을 잡니다.");
	}

	void trt() {
		System.out.println(name + " 이(가) 개껌을 먹습니다.");
	}

}
