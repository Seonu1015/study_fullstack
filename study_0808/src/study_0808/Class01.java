package study_0808;

public class Class01 {
	public static void main(String[] args) {

		System.out.println(Counter.count);
		
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		Counter counter3 = new Counter();
		
		System.out.println(counter1.count);
		System.out.println(counter2.count);
		System.out.println(counter3.count);
		
		int result = MathUtils.sun(5, 3);
		System.out.println(result);
		
		printCount();
		
		//Singleton counter = new Singleton(); <- 여기서는 만들 수 없다
		
		Singleton counter11 = Singleton.getInstance();
		Singleton counter22 = Singleton.getInstance();
		System.out.println(counter11 == counter22);
		
		
	}
	
	static void printCount() { // 같은 위치에서 끌고 와줘야 한다
		System.out.println("카운트는 ??");
	}
	
}

class Counter {
	static int count=0;
	
	Counter() {
		count++;
	}
	
	Counter(int count) { // 정보 은닉
		
	}
}

class Singleton {
	private static int count=0;
	private static Singleton singleton;
	
	private Singleton() {
		count++;
	}
	
	public static Singleton getInstance() { // 이 부분이 없다면 이 클래스는 사용할 방도가 없다
		if(count==0) {
			singleton = new Singleton();
		}
		return singleton;
	}
}

class MathUtils {
	static int sun(int a, int b) {
		return a+b;
	}
}

//정적 static
//메모리 직접 저장 <위치 공유>
//클래스 수준에서 공유된다.
//Monster mob = new Monster();
//mob.변수, mob.메서드()
//Monster.변수, Monster.메서드()
//인스턴스(객체) 생성 없이 직접 클래스 이름을 통해서 접근이 가능하다.
//손성(인스턴스 변수), 행동(메서드)

//정적 변수
//클래스 수준에서 공유된는 변수

//객체 생성 - 객체1, 객체2

//정적 메소드
//공통 동작

//싱글톤 Singleton
//정적 생성자

//1. 학생 - 23학번, 22학번, 21학번, 20학번 <- 학번