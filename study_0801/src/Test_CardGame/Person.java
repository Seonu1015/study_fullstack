package Test_CardGame;

import java.util.Scanner;

public class Person {

	int card;
		
	Person(int card) {
		this.card = card;
	}
	
	void chooseCard() {
		Scanner sc = new Scanner(System.in);
		System.out.println("카드 : 1.거지, 2.시민, 3.귀족, 4.왕");
		System.out.println("플레이어 차례 : ");
		this.card = sc.nextInt();		
	}
	
	void printPer() {
		System.out.println("플레이어가 뽑은 카드 : " + card);
	}
}
