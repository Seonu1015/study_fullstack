package practice_Catering;

import java.util.Scanner;

public class JapaneseRes extends Restaurant {

	String style;
	
	JapaneseRes (String type, String name, boolean openAlltime, String style) {
		super(type, name, openAlltime);
		this.style = "회전식";
	}
	
	void billJres() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 접시는 몇 개인가요? ");
		int plateTotal = sc.nextInt();
		System.out.println(plateTotal*1000 + "원 계산하겠습니다.");
	}
	
	
	
}
