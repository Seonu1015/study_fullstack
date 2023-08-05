package CardGame;

import java.util.Scanner;

public class Person {

	String card;
	
	void chooseCard() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("플레이어 차례 : ");
		this.card = sc.next();
	}
	
    String getPersonCard() {
        return card;
    }	
}
