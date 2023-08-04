package review_Animal;

public class Bird extends Animal {
	
	boolean wings;
	String sings;
	
	Bird(String name, int age, boolean wings, String sings) {
		super(name, age);
		boolean wings = ;
		String sings = sings;
	}
	
//	수업 보충 내용	
	void songTo(String sings) {
		System.out.println(name + " 이(가) 다른 새와 함께 부릅니다 -> " + sing + this.song);
	}
	// 만약 함께부르는 새의 이름을 넣고 싶다면?
	void songToge(String name, String sings) {
		System.out.println(this.name + " 이(가) " + name + " 와 함께 부릅니다 -> " + sing + this.song);
	}
	
	void songTogether(String name, int age, boolean wings, String sings) {
		birdInfo(name, age, wings, sings);
		birdInfo(this.name, this.age, this.wings, this.sings);		
//		System.out.println("이름 : " + name + ", 나이 : " + age);
//		if(wings) {
//			System.out.println("저는 날 수 있습니다.");
//		} else {
//			System.out.println("저는 날 수 없습니다.");
//		}
//		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
//		if(this.wings) {
//			System.out.println("저는 날 수 있습니다.");
//		} else {
//			System.out.println("저는 날 수 없습니다.");
//		}
//		System.out.println("노래를 부르겠습니다. " + this.sings);
//		↓ 아래 birdInfo로 함수를 써서 간단하게 만들자
	}
	
	void songWith(Bird bird) {
		birdInfo(bird.name, bird.age, bird.wings, bird.sings);
		birdInfo(this.name, this.age, this.wings, this.sings);	
	}
	// ↓ 더 간단하게 줄여보자
	void birdInfo2(Bird bird) {
		birdInfo2(bird);
		birdInfo2(this);
		
	}
	
	void birdInfo(String name, int age, boolean wings, String sings) {
		System.out.println("이름 : " + name + ", 나이 : " + age);
		if(wings) {
			System.out.println("저는 날 수 있습니다.");
		} else {
			System.out.println("저는 날 수 없습니다.");
		}
	}

}
