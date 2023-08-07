package Food_reservation;

import java.util.Scanner;

public class Korean extends Restaurant {
	
	String name;
	String soju;
	private int seat;
	
	Scanner sc = new Scanner(System.in);

	Korean(String nation, String menu, String name, String soju) {
		super(nation, menu);
		this.name = name;
		this.soju = soju;
	}
	
	Korean(String nation, String menu, String name, String soju, int seat) {
		super(nation, menu);
		this.soju = soju;
		this.name = name;
		this.seat = seat;
	}
	
	@Override
	void printInfo() {
		super.printNation();
		System.out.println("어서오십시오. \"" + name + "\" 입니다.");
		System.out.println("저희의 메인 메뉴는 " + menu + "입니다.");
		System.out.println("음식과 어울리는 술로 " + soju + "을(를) 추천합니다.");
		return;
	}
	
	int getSeat() {
		return this.seat;
	}
	
	void reservation() {
		System.out.println();
		System.out.println("몇 명 예약하시겠습니까? 예약 가능한 좌석 수(" + this.getSeat() + ")");
		int peopleNumber = sc.nextInt();
		
		if(peopleNumber <= seat) {
			System.out.println("예약이 완료되었습니다.");
			return;
		} else {
			System.err.println("예약 가능한 인원을 초과하였습니다. 예약이 불가능합니다.");
			return;
		}
	}


}
