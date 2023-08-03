package hw_Animal;

public class Cat extends Animal {

	String catTower;
	int hairball;
	
	Cat(String type) {
		super(type);
	}

	Cat(String type, String name, int age) {
		super(type, name, age);
	}
	
	Cat(String type, String name, int age, String catTower) {
		super(type, name, age);
		this.catTower = catTower;
		this.hairball = 0;
	}

	void spk() {
		super.spk();
	}

	void wlk() {
		System.out.println(name + " 이(가) 산책이 나가기 싫어서 높은 곳으로 도망갑니다.");
	}

	void slp() {
		System.out.println(name + " 이(가) " + this.catTower + " 위로 올라가 웅크리고 잠을 잡니다.");
	}

	void trt() {
		System.out.println(name + " 이(가) 츄르를 먹습니다.");
	}
	
	void grooming(int grooming) {
		System.out.println(name + " 이(가) 털을 고르고 있습니다. 집 안에 털 뭉치가 굴러다니기 시작합니다.");
		System.out.println("현재 집 안의 털 뭉치가 " + grooming + "개 생겨났습니다.");
		hairball(grooming);
	}
	
	void hairball(int hairball) {
		this.hairball += hairball;
		if(this.hairball >= 10) {
			System.out.println("!!비상!! 집 안에 털 뭉치가 10개 이상이 굴러다니고 있습니다. 청소를 시작하세요.");
			this.hairball = 0;
		}
	}

}
