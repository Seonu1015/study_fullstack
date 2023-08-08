package Food_reservation_hw;

import java.util.Scanner;

public class Customer {
	
	private String name;
	private int peopleNum;
	private int startTime;
	private int endTime;
	
	
	Customer(String name) {
		this.name = name;
	}
	
	Scanner sc = new Scanner(System.in);
	
	String getName() {
		return this.name;
	}
	
	int getPeopleNum() {
		return this.peopleNum;
	}
	
	void setPeopleNum() {
		peopleNum = sc.nextInt();
	}
	
	void setStartTime() {
		startTime = sc.nextInt();
	}
	
	void setEndTime() {
		endTime = sc.nextInt();
	}
	
	
	void reservation(Korean kor) {
		System.out.println();
		System.out.println(this.name + "님 몇 명을 예약하시겠습니까? 예약 가능한 좌석 수(" + kor.getSeat() + ")");
		this.setPeopleNum();
		
		if(this.peopleNum <= kor.getSeat()) {
			System.out.println("예약이 완료되었습니다.");
			System.out.println("예약자명 : " + this.getName() + ", 예약인원수 : " + this.peopleNum);
			System.out.println("현재 남은 좌석 수 : " + (kor.getSeat()-this.peopleNum));			
			kor.setSeat(peopleNum);
			return;
		} else {
			System.err.println("예약 가능한 인원을 초과하였습니다. 예약이 불가능합니다.");
			this.peopleNum =0;
		}
	}
	
	void exit(Korean kor) {
		System.out.println();
		System.out.println("이전 " + this.getName() + " 팀이 나갔습니다.");	
		kor.setSeat(-this.peopleNum);
		System.out.println("현재 남은 좌석 수 : " + kor.getSeat());
	}
	
	
	

}
