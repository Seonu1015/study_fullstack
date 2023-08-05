package CardGame;

public class Computer {

	int card;
	
	Computer() {
		this.cardRandom();
		int card = 0;
	}
	
	void cardSelect() {
		for(int i=0; i<4; i++) {
			this.cardRandom();
			if(card == this.card) {
				i--;
			}
		}
		
		
	}
	
	void cardRandom() {
		card = (int) (Math.random()*4)+1;
		System.out.println("컴퓨터가 뽑은 카드 : " + card);
	}
	
}