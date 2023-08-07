package Food_reservation_hw;

import java.util.Scanner;

public class Customer {
	
	private String name;
	private int peopleNum;
	private int gonePeople;
	
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
	
	int getGonePeople() {
		return this.gonePeople;
	}
	
	void setGonePeople() {
		gonePeople = sc.nextInt();
	}
	
	void reservation(int seatNumber) {
		System.out.println();
		System.out.println(this.name + "님 몇 명을 예약하시겠습니까? 예약 가능한 좌석 수(" + seatNumber + ")");
		this.setPeopleNum();
		
		if(this.peopleNum <= seatNumber) {
			System.out.println("예약이 완료되었습니다.");
			System.out.println("예약자명 : " + this.getName() + ", 예약인원수 : " + this.peopleNum);
			System.out.println("현재 남은 좌석 수 : " + (seatNumber-this.peopleNum));			
			seatNumber -= this.peopleNum;
			return;
		} else {
			System.out.println("혹시 빠져나간 손님이 있습니까? [예, yes, y]");
			String gone = sc.next();
			if(gone.equals("예")||gone.equals("y") ||gone.equals("yes")) {
				System.out.println("몇 명이 빠졌습니까?");
				this.setGonePeople();
				seatNumber += this.gonePeople;
				System.out.println("현재 남은 좌석 수 : " + seatNumber);
				if(this.peopleNum <= seatNumber) {
					System.out.println("예약이 완료되었습니다.");
					System.out.println("예약자명 : " + this.getName() + ", 예약인원수 : " + this.peopleNum);
					System.out.println("현재 남은 좌석 수 : " + (seatNumber-this.peopleNum));			
					seatNumber -= this.peopleNum;
					return;
				} else {
					System.err.println("예약 가능한 인원을 초과하였습니다. 예약이 불가능합니다.");
					return;
				}
			} else {
				System.err.println("예약 가능한 인원을 초과하였습니다. 예약이 불가능합니다.");
				return;
			}
		}
	}
	

}
