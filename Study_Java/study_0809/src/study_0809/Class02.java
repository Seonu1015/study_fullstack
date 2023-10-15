package study_0809;

import Game_hw.Unit;

public class Class02 {
	public static void main(String[] args) {
		
		Unit user1 = new Unit("디아블로", 100, 10);
		user1.unitInfo();		
		System.out.println(user1); // toString이 없다면 객체의 주소만 출력된다
		
		Unit user2 = new Unit("디아블로", 100, 10);
		System.out.println(user1.equals(user2)); // equals를 바로 사용할 수도 있다
		
	}
}

class Unit {

	private String name;
	private int health;
	private int attack;

	Unit(String name, int health, int attack) {
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
	
	void unitInfo() {
		System.out.println("┌ 유닛명 : " + this.name);
		System.out.println("│ 체력 : " + this.health);
		System.out.println("└ 공격력 : " + this.attack);
	}
	
	public String toString() {
		return "유닛명 : " + this.name + ", 체력 : " + this.health + ", 공격력 : " + this.attack;		
	}
	
	public boolean equals(Unit unit) {
		return this.name == unit.name && this.attack == unit.attack;
	}
	
	
}



//모든 클래스가 상속받는 java.lang.Object

//toString() : 객체의 문자열을 생성하는 메소드
//equals(Object obj) : 두 객체의 동등성 여부를 나타내는 메소드

//clone() : 복제본을 리턴하는 메소드
//finalize() : 객체가 메모리에서 해제될 때 실행되는 메소드
//getClass() : 클래스의 정보를 얻는 메소드
//wait() : 객체가 바뀔 때까지 기다리는 메소드
//wait(long timeout) : 객체가 변경될 때까지 timeout 만큼 대기하는 메소드