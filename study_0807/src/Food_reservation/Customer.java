package Food_reservation;

import java.util.Scanner;

public class Customer {

	private String name;
	private int peopleNum;

	Customer(String name) {
		this.name = name;
	}

	Scanner sc = new Scanner(System.in);

	String getName() {
		return this.name;
	}

	int getPeopleNum() {
		return peopleNum;
	}

	void setPeopleNum() {
		peopleNum = sc.nextInt();
	}

	void reservation(int seatNumber) {
		System.out.println();
		System.out.println(this.name + "님 몇 명을 예약하시겠습니까? 예약 가능한 좌석 수(" + seatNumber + ")");
		this.setPeopleNum();

		if (this.peopleNum <= seatNumber) {
			System.out.println("예약이 완료되었습니다.");
			System.out.println("예약자명 : " + this.getName() + ", 예약인원수 : " + this.peopleNum);
			System.out.println("현재 남은 좌석 수 : " + (seatNumber - this.peopleNum));
			seatNumber -= this.peopleNum;
			return;
		} else {
			System.err.println("예약 가능한 인원을 초과하였습니다. 예약이 불가능합니다.");
			return;
		}
	}
}
