package Test_CardGame;

public class Computer {
	
	String[] cards;
	int cardIndex;
	
	Computer() {
		cards = new String[] {"거지", "시민", "귀족", "왕"};
	}
	
	Computer(String[] cards) {
        this.drawCard();
        this.cards = new String[]{cards[cardIndex]};
    }

    void drawCard() {
        cardIndex = (int) (Math.random() * 4);
        
        int[] arr = new int[4];
        for(int k = 0; k < arr.length; k++) {
			if(arr[k] == cardIndex) {
				cardIndex = (int)(Math.random()*4+1);
				k = -1;
				continue;
			}
			else if(arr[k] == 0) {
				break;
			}
		}	// 중복으로 뽑히는 거 해결 못함.... ㅠㅠ	
    }
    
	void printCom() {
		System.out.println("컴퓨터가 뽑은 카드 : " + (cardIndex+1) + ". " + cards[cardIndex]);
	}
	
	// 승패 여부를 가리기 위해 숫자로 가져오기로 결정!
}
