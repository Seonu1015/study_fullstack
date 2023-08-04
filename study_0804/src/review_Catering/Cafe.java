package review_Catering;

import java.util.Scanner;

public class Cafe extends Catering {

	boolean takeout;
	
	Cafe(String type, String name, boolean takeout) {
		super(type, name);
		this.takeout = takeout;
	}
	
	void takeOut() {
		if(this.takeout) {
			System.out.println("드시고 가시겠습니까? (예, 아니오)");
			
			Scanner sc = new Scanner(System.in);
			String yesno = sc.next();
			
			if(yesno.equals("아니오")) {
				System.out.println("일회용 컵에 담아드리겠습니다.");
			}
		}
	}

}
