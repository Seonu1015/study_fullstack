package Test_CardGame;

public class Computer_memo {

	String[] cards;
	int cardIndex;

	Computer_memo() {
		cards = new String[] { "거지", "시민", "귀족", "왕" };
	}

	Computer_memo(String[] cards) {
		this.drawCard();
		this.cards = new String[] { cards[cardIndex] };
	}

	void drawCard() {
		

		int[] arr = new int[4];
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
		for(int i=0, j=0; i<arr.length; i++) {
			cardIndex = (int) (Math.random() * 4);
			int check = 0;
			for(int k=0)
		}
	}	
		
	void printCom() {
		System.out.println("컴퓨터가 뽑은 카드 : " + (cardIndex + 1) + ". " + cards[cardIndex]);
	}
	
}
