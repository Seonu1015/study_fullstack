package hw_CardGame;

public class Test01 {

	int[] useCard;
	
	Test01() {
		useCard = new int[4];
	}
	
	void cardList(int i) {
		for(i=0; i<4; i++) {
			useCard[i] = (int)(Math.random()*4);
			System.out.print("useCard : " + useCard[i]);
		}
		System.out.println();
	}
	

}
