package practice_Catering;

import java.util.Scanner;

public class KidsCafe extends Cafe {

	String playSpace;
	
	KidsCafe(String type, String name, boolean takeout, String playSpace) {
		super(type, name, takeout);
		this.playSpace = playSpace;
	}
	
	void infoKidscafe() {
		super.info();
		System.out.println("놀이공간 : " + playSpace);
	}
	
	void reservation() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이가 몇명인가요? ");
		int kidsCount = sc.nextInt();
		if(kidsCount >= 5) {
			System.out.println("아이가 5명 이상인 경우 예약이 필요합니다.");
		} else {
			System.out.println("아이가 4명 이하라면 예약없이 바로 이용이 가능합니다.");
		}
	}

}
