package Food_reservation_hw;

import java.util.ArrayList;
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
	
	int getStartTime() {
		return this.startTime;
	}
	
	int getEndTime() {
		return this.endTime;
	}
	
	void setStartTime() {
		startTime = sc.nextInt();
	}
	
	void setEndTime() {
		endTime = sc.nextInt();
	}
	
	void reservationTime(Korean kor) {
		System.out.println();
		System.out.println(this.name + "님 몇 시를 예약하시겠습니까?");
		this.setStartTime();
		
		if(kor.timeTable[this.getStartTime()-6] == this.getStartTime()) {
			System.out.println("해당 시간은 예약이 불가능합니다. 다른 시간을 예약하시겠습니까?");
			String changeTime = sc.next();
			if(changeTime.equals("예")) {
				this.setStartTime();
			}
		}
	}
	
	void reservation(Korean kor) {
		System.out.println();
		System.out.println(this.name + "님 몇 명을 예약하시겠습니까? 예약 가능한 좌석 수(" + kor.getSeat() + ")");
		this.setPeopleNum();
		
		if(this.peopleNum <= kor.getSeat()) {
			System.out.println("예약이 완료되었습니다.");
			System.out.println("예약자 : " + this.name /* this.getName() */ + ", 인원 수 : " + this.peopleNum); // 같은 클래스 내이므로 this.name 으로 써도 무방
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
