package practice_Catering;

import java.util.Scanner;

public class JapaneseRes extends Restaurant {

	String[] sushiMenu;
	
	JapaneseRes (String type, String name, boolean openAlltime, String[] sushiMenu) {
		super(type, name, openAlltime);
		this.sushiMenu = sushiMenu;
	}
	
	void sushiSetting() {
		this.sushiMenu = new String[5];

		for (int i = 0; i < sushiMenu.length; i++) {
			sushiMenu[i] = "준비중";
		}
	}
	
	void printSushi() {
		System.out.print("메뉴 : ");
		for (int i = 0; i < sushiMenu.length; i++) {
			System.out.print(sushiMenu[i] + " ");
		}
		System.out.println();
	}
	
	void infoJres() {
		super.info();
		System.out.println();
	}
	
	void billJres() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("접시 개수만큼 계산됩니다. 총 접시는 몇 개인가요? ");
		int plateTotal = sc.nextInt();
		System.out.println(plateTotal*1000 + "원 계산하겠습니다.");
	}
	
	
	
}
