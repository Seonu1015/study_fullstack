package Food_reservation_hw;

import java.util.Scanner;

public class OffCustomer extends Customer {
	
	private int offPeople;
	private int entranceTime;
	
	Scanner sc = new Scanner(System.in);
	
	OffCustomer(String name, int offPeople, int entranceTime) {
		super(name);
		this.offPeople = offPeople;
		this.entranceTime = entranceTime;
	}
	
	int getOffPeople() {
		return this.offPeople;
	}
	
	void entrance(Korean kor, Customer cus) {
		System.out.println(this.getName() + " 외 " + this.offPeople + "명이 방문하였습니다.");
		if(kor.getSeat() < (this.offPeople+1)) {
			System.out.println("자리가 충분하지 않습니다. 대기 시간은 ??분 입니다. 기다리시겠습니까?");
			String wait = sc.next();
			if(wait.equals("예")) {
				System.out.println("대기명단에 올려두겠습니다.");
			}
		} else {
			System.out.println("현재 남은 좌석 수 : " + (kor.getSeat()-(this.offPeople+1)));
			kor.setSeat(this.offPeople+1);
			return;
		}
	}
	
	@Override
	void exit(Korean kor) {
		System.out.println();
		System.out.println("이전 " + this.getName() + " 외 " + this.offPeople + "명이 나갔습니다.");	
		kor.setSeat(-this.offPeople);
		System.out.println("현재 남은 좌석 수 : " + kor.getSeat());
	}
	
}
